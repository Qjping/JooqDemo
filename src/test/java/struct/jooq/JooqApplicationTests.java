package struct.jooq;

import com.jooq.tables.CaseDetail;
import com.jooq.tables.records.CaseDetailRecord;
import com.resposity.CaseRepository;
import com.struct.CaseDetailVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JooqApplicationTests {
    @Autowired
    CaseRepository caseRepository;

    @Test
    void contextLoads() {
        CaseDetailVO caseDetailVO= new CaseDetailVO();
        caseDetailVO.setData("jooq");
        caseRepository.insert(caseDetailVO);
    }

}
