package com.crotroller;

import com.resposity.CaseRepository;
import com.struct.CaseDetailVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class caseDetailController {
    @Autowired
    CaseRepository caseRepository;
    @GetMapping("/hello")
    public void hello(){
        CaseDetailVO caseDetailVO= new CaseDetailVO();
        caseDetailVO.setData("jooq");
        caseRepository.insert(caseDetailVO);
    }
}
