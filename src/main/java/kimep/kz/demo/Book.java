package kimep.kz.demo;

public record Book(String title, int pages) {

    public boolean isLong() {
        return pages > 400;
    }
}