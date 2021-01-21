/*
 * This file is generated by jOOQ.
 */
package com.jooq.tables;


import com.jooq.Apitest;
import com.jooq.Keys;
import com.jooq.tables.records.CaseGroupRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CaseGroup extends TableImpl<CaseGroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>apitest.case_group</code>
     */
    public static final CaseGroup CASE_GROUP = new CaseGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CaseGroupRecord> getRecordType() {
        return CaseGroupRecord.class;
    }

    /**
     * The column <code>apitest.case_group.id</code>.
     */
    public final TableField<CaseGroupRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>apitest.case_group.description</code>.
     */
    public final TableField<CaseGroupRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>apitest.case_group.create_time</code>. 创建时间
     */
    public final TableField<CaseGroupRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * The column <code>apitest.case_group.update_time</code>. 修改时间
     */
    public final TableField<CaseGroupRecord, LocalDateTime> UPDATE_TIME = createField(DSL.name("update_time"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "修改时间");

    private CaseGroup(Name alias, Table<CaseGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private CaseGroup(Name alias, Table<CaseGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>apitest.case_group</code> table reference
     */
    public CaseGroup(String alias) {
        this(DSL.name(alias), CASE_GROUP);
    }

    /**
     * Create an aliased <code>apitest.case_group</code> table reference
     */
    public CaseGroup(Name alias) {
        this(alias, CASE_GROUP);
    }

    /**
     * Create a <code>apitest.case_group</code> table reference
     */
    public CaseGroup() {
        this(DSL.name("case_group"), null);
    }

    public <O extends Record> CaseGroup(Table<O> child, ForeignKey<O, CaseGroupRecord> key) {
        super(child, key, CASE_GROUP);
    }

    @Override
    public Schema getSchema() {
        return Apitest.APITEST;
    }

    @Override
    public UniqueKey<CaseGroupRecord> getPrimaryKey() {
        return Keys.KEY_CASE_GROUP_PRIMARY;
    }

    @Override
    public List<UniqueKey<CaseGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<CaseGroupRecord>>asList(Keys.KEY_CASE_GROUP_PRIMARY);
    }

    @Override
    public CaseGroup as(String alias) {
        return new CaseGroup(DSL.name(alias), this);
    }

    @Override
    public CaseGroup as(Name alias) {
        return new CaseGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CaseGroup rename(String name) {
        return new CaseGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CaseGroup rename(Name name) {
        return new CaseGroup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}