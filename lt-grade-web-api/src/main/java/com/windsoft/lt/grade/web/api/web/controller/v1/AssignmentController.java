package com.windsoft.lt.grade.web.api.web.controller.v1;

import com.windsoft.lt.grade.commons.dto.BaseResult;
import com.windsoft.lt.grade.domain.Assignment;
import com.windsoft.lt.grade.web.api.service.AssignmentService;
import com.windsoft.lt.grade.web.api.web.dto.AssignmentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AssignmentController
 * @Description
 * @Author Ricost
 * @Date 2019/12/19 19:03
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "${api.path.v1}/assignments")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @RequestMapping(value = "getAll/{id}", method = RequestMethod.GET)
    public BaseResult getAll(@PathVariable(value = "id")
                                         Long id){
        BaseResult result = assignmentService.getAll(id);

        if (result.getStatus() == BaseResult.STATUS_SUCCESS){
            List<AssignmentDTO> assignmentDTOS = new ArrayList<AssignmentDTO>();
            List<Assignment> assignments = (List<Assignment>) result.getData();

            for(Assignment item : assignments){
                AssignmentDTO assignmentDTO = new AssignmentDTO();
                BeanUtils.copyProperties(item,assignmentDTO);
                BeanUtils.copyProperties(item.getOrganization(),assignmentDTO);
                assignmentDTOS.add(assignmentDTO);
            }

            result.setData(assignmentDTOS);
        }

        return result;
    }

}