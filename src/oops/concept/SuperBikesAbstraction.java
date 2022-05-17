package oops.concept;

public abstract class SuperBikesAbstraction {
    private Long cNo;
    private Integer pCapacity;

    public Long getcNo() {
        return cNo;
    }

    public void setcNo(Long cNo) {
        this.cNo = cNo;
    }

    public Integer getpCapacity() {
        return pCapacity;
    }

    public void setpCapacity(Integer pCapacity) {
        this.pCapacity = pCapacity;
    }
    abstract long engcap();
    abstract String sylinder();
}
