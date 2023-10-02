package org.domain.dict;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Справочники
 * */
class DictionaryTest {

    @DisplayName("Проверка количества записей в справочнике документов удостоверяющих личность")
    @Test
    void checkSize_IdentityDocument_Test() {
        List<IdentityDocumentType> identityDocumentTypes = Dictionary.identityDocuments();
        Assertions.assertEquals(7, identityDocumentTypes.size());
    }

    @DisplayName("Проверка соответствия кода 03 справочника и его значения (value)")
    @Test
    void checkElementByCode03_IdentityDocument_Test() {
        List<IdentityDocumentType> identityDocumentTypes = Dictionary.identityDocuments();
        Map<String, IdentityDocumentType> mapIdentityDocuments = identityDocumentTypes.stream().collect(Collectors.toMap(IdentityDocumentType::getCode, item->item));
        Assertions.assertEquals("Свидетельство о рождении" , mapIdentityDocuments.get("03").name);
    }

    @DisplayName("Проверка соответствия кода 05 справочника и его значения (value)")
    @Test
    void checkElementByCode05_IdentityDocument_Test() {
        List<IdentityDocumentType> identityDocumentTypes = Dictionary.identityDocuments();
        Map<String, IdentityDocumentType> mapIdentityDocuments = new HashMap<>();
        for (IdentityDocumentType item : identityDocumentTypes) {
            mapIdentityDocuments.put(item.code, item);
        }
        Assertions.assertEquals("Справка об освобождении из места лишения свободы" , mapIdentityDocuments.get("05").name);
    }

}