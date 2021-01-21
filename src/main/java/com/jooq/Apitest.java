/*
 * This file is generated by jOOQ.
 */
package com.jooq;


import com.jooq.tables.ApiConfig;
import com.jooq.tables.CaseDetail;
import com.jooq.tables.CaseGroup;
import com.jooq.tables.TestConfig;
import com.jooq.tables.UserDefineParam;
import com.jooq.tables.UserInfo;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Apitest extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>apitest</code>
     */
    public static final Apitest APITEST = new Apitest();

    /**
     * The table <code>apitest.api_config</code>.
     */
    public final ApiConfig API_CONFIG = ApiConfig.API_CONFIG;

    /**
     * The table <code>apitest.case_detail</code>.
     */
    public final CaseDetail CASE_DETAIL = CaseDetail.CASE_DETAIL;

    /**
     * The table <code>apitest.case_group</code>.
     */
    public final CaseGroup CASE_GROUP = CaseGroup.CASE_GROUP;

    /**
     * The table <code>apitest.test_config</code>.
     */
    public final TestConfig TEST_CONFIG = TestConfig.TEST_CONFIG;

    /**
     * The table <code>apitest.user_define_param</code>.
     */
    public final UserDefineParam USER_DEFINE_PARAM = UserDefineParam.USER_DEFINE_PARAM;

    /**
     * The table <code>apitest.user_info</code>.
     */
    public final UserInfo USER_INFO = UserInfo.USER_INFO;

    /**
     * No further instances allowed
     */
    private Apitest() {
        super("apitest", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            ApiConfig.API_CONFIG,
            CaseDetail.CASE_DETAIL,
            CaseGroup.CASE_GROUP,
            TestConfig.TEST_CONFIG,
            UserDefineParam.USER_DEFINE_PARAM,
            UserInfo.USER_INFO);
    }
}
