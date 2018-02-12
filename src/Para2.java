public class Para2 <T,S>{
    private T first;
    private S secont;

    public Para2(T first, S secont) {
        this.first = first;
        this.secont = secont;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecont() {
        return secont;
    }

    public void setSecont(S secont) {
        this.secont = secont;
    }

}