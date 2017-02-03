class RomanNumber {

    private final char symbol;
    private final int value;

    RomanNumber(char symbol, int value) {
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RomanNumber that = (RomanNumber) o;

        return symbol == that.symbol && value == that.value;
    }

    @Override
    public int hashCode() {
        int result = (int) symbol;
        result = 31 * result + value;
        return result;
    }
}
