package org.domain.document;

import org.core.domain.AbstractEntity;

import java.time.LocalDate;

public class PersonDoc extends AbstractEntity {
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

    private IdentityDocument identityDocument;


}
