package org.domain.person;

import org.domain.document.PersonDoc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;

public class Worker {

    private Integer id;
    private String personRegId;
    private String fullName;
    private String shortName;
    private LocalDate birthDate;
    private String birthPlace;
    private String description;
    private String gender;
    private Boolean deleted = false;

    EnumSet<Profession> professions = EnumSet.noneOf(Profession.class);

    private Collection<PersonDoc> personDocs = new ArrayList<>();
}
