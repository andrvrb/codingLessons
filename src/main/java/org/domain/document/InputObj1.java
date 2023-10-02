package org.domain.document;

import org.core.domain.AbstractEntity;

public class InputObj1 extends AbstractEntity {
    String code;
    String field1;
    String field2;
    String field3;

    public InputObj1(String code, String field1, String field2, String field3) {
        this.code = code;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }
}
