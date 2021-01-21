package com.resposity;

import com.jooq.tables.CaseDetail;
import com.struct.CaseDetailVO;

import org.jooq.DSLContext;

import org.springframework.stereotype.Repository;


/**
 * @author napuping
 * @date 2020-11-23 下午1:12
 * @description
 */
@Repository
public class CaseRepository {

    private final DSLContext create;

    private CaseDetail caseDetail = CaseDetail.CASE_DETAIL;


    public CaseRepository(DSLContext create) {
        this.create = create;
    }

    public int insert(CaseDetailVO caseDetailVo) {
        return create.newRecord(caseDetail, caseDetailVo).store();
    }

//    public int update(CaseDetailVo CaseDetailVo) {
//        return create.update(bill)
//                .set(bill.PRINT_COUNT, bill.PRINT_COUNT.add(1))
//                .set(bill.UPDATED_BY, CaseDetailVo.getUpdatedBy())
//                .set(bill.UPDATED_AT, CaseDetailVo.getUpdatedAt())
//                .where(bill.MAKER_ID.eq(CaseDetailVo.getMakerId()))
//                .and(bill.BILL_NUMBER.eq(CaseDetailVo.getBillNumber()))
//                .execute();
//
//
//    }
//
//    public List<CountBillPrintVO> selectTotalPrintCount(Collection<String> billNumbers) {
//        return create.select(
//                DSL.sum(bill.PRINT_COUNT).as("total_count"),
//                bill.BILL_NUMBER
//        )
//                .from(bill)
//                .where(bill.BILL_NUMBER.in(billNumbers))
//                .groupBy(bill.BILL_NUMBER)
//                .fetchInto(CountBillPrintVO.class);
//    }

//    public PageResultVO<BillVO> selectByExample(BillQueryVO queryVO) {
//        List<Condition> conditions = new ArrayList<>();
//        if (!StringUtils.isEmpty(queryVO.getWarehouseId())) {
//            conditions.add(bill.WAREHOUSE_ID.eq(queryVO.getWarehouseId()));
//        }
//        if (!StringUtils.isEmpty(queryVO.getMakerName())) {
//            conditions.add(bill.MAKER_NAME.like(SqlUtil.like(queryVO.getMakerName())));
//        }
//        if (!StringUtils.isEmpty(queryVO.getBillNumber())) {
//            conditions.add(bill.BILL_NUMBER.like(SqlUtil.like(queryVO.getBillNumber())));
//        }
//        if (queryVO.getType() != null) {
//            conditions.add(bill.TYPE.eq(queryVO.getType()));
//        }
//        return new PageResultVO<>(
//                create.select()
//                        .from(bill)
//                        .where(conditions)
//                        .offset((queryVO.getPage() - 1) * queryVO.getLimit())
//                        .limit(queryVO.getLimit())
//                        .fetchInto(BillVO.class),
//                create.selectCount()
//                        .from(bill)
//                        .where(conditions)
//                        .fetchOne()
//                        .value1()
//        );
//    }

}
