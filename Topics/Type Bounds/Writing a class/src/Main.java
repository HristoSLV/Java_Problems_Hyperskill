class Shelf<T extends Book> {
    private T element;

    void setElement(T book) {
        element = book;
    }

    T getElement() {
        return element;
    }
}

