package org.domain.dict;

/**
 * ВИДЫ ДОКУМЕНТОВ, УДОСТОВЕРЯЮЩИХ ЛИЧНОСТЬ НАЛОГОПЛАТЕЛЬЩИКА
 * https://www.consultant.ru/document/cons_doc_LAW_283982/9ef6cf8ad5a3e982260724752a5307712d6b3d92/
 * */
public class IdentityDocumentType {
    String code;
    String name;

    public IdentityDocumentType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
