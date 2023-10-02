package org.domain.person;

public enum UserType {
    //admins group
    ADMIN     (true,    true, true),
    MAIN_MODERATOR (true   , true, true),
    MODERATOR (true   , true, false),

    //users group
    BUYER     (false,   false, false),
    SELLER    (false,   true, false);

    private boolean isEditUserComments;
    private boolean isEditModeratorComments;
    private boolean isAddProduct;

    UserType(boolean isEditUserComments, boolean isEditModeratorComments, boolean isAddProduct) {
        this.isEditUserComments = isEditUserComments;
        this.isEditModeratorComments = isEditModeratorComments;
        this.isAddProduct = isAddProduct;
    }

    public boolean isEditUserComments() {
        return isEditUserComments;
    }

    public boolean isEditModeratorComments() {
        return isEditModeratorComments;
    }

    public boolean isAddProduct() {
        return isAddProduct;
    }

}
