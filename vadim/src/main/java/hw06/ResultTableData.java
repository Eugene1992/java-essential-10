package hw06;


class ResultTableData {
    private DataStructure addEL = new DataStructure();
    private DataStructure removeEl = new DataStructure();
    private DataStructure updateEl = new DataStructure();
    private DataStructure getEl = new DataStructure();

    DataStructure getAddEL() {
        return addEL;
    }

    void setAddEL(DataStructure addEL) {
        this.addEL = addEL;
    }

    DataStructure getRemoveEl() {
        return removeEl;
    }

    void setRemoveEl(DataStructure removeEl) {
        this.removeEl = removeEl;
    }

    DataStructure getUpdateEl() {
        return updateEl;
    }

    void setUpdateEl(DataStructure updateEl) {
        this.updateEl = updateEl;
    }

    DataStructure getGetEl() {
        return getEl;
    }

    void setGetEl(DataStructure getEl) {
        this.getEl = getEl;
    }
}
