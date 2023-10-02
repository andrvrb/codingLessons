package org.domain.dict;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Dictionary {

    public static List<IdentityDocumentType> identityDocuments() {
        List<IdentityDocumentType> identityDocumentTypes = Stream.of(
                new IdentityDocumentType("01", "Паспорт гражданина СССР"),
                new IdentityDocumentType("03", "Свидетельство о рождении"),
                new IdentityDocumentType("05", "Справка об освобождении из места лишения свободы"),
                new IdentityDocumentType("07", "Военный билет"),
                new IdentityDocumentType("08", "Временное удостоверение, выданное взамен военного билета"),
                new IdentityDocumentType("10", "Паспорт иностранного гражданина"),
                new IdentityDocumentType("12", "Иные типы документов")
                        )
                .collect(Collectors.toList());
        return identityDocumentTypes;
    }
}
