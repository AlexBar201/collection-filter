public interface Filter {
    default Object apply(Object o) {
        return null;
    }
}
