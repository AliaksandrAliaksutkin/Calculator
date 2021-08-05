class Number {
    private int value;
    private RomanArabicNumber type;

    Number(int value, RomanArabicNumber type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    RomanArabicNumber getType() {
        return type;
    }
}
