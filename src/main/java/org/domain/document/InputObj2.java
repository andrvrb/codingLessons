package org.domain.document;

import org.core.domain.AbstractEntity;

public class InputObj2 extends AbstractEntity {
    String code;
    String field1;
    String field11;
    String field2;
    String field3;
    String field4;

    public InputObj2(String code, String field1, String field11, String field2, String field3, String field4) {
        this.code = code;
        this.field1 = field1;
        this.field11 = field11;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
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

    public String getField11() {
        return field11;
    }

    public void setField11(String field11) {
        this.field11 = field11;
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

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }
}
