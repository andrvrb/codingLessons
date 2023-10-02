package org.domain.document;

import org.core.domain.AbstractEntity;
import org.domain.dict.IdentityDocumentType;

import java.time.LocalDate;

public class IdentityDocument extends AbstractEntity {

    //Серия документа
    private String series;
    //Номер документа
    private String numeral;
    //Дата выдачи документа
    private LocalDate issueDate;
    //Реестровый номер
    private String reestrNumber;
    //Дата окончания действия
    private LocalDate expiredDate;
    //Место где выдан документ
    private String place;

    // тип документа удостоверяющего личность
    private IdentityDocumentType identityDocumentType;
}
