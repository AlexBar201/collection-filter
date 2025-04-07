public interface Filter {
    default int[] apply(int[] o) {
        return new int[0];
    }
}
