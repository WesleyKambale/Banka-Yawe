package must.ac.ug.csce.wesleykambale.ModeClass;

public class TransactionModelClass {

    Integer ivMain;
    String tvType,tvPrice;

    public TransactionModelClass(Integer ivMain, String tvType, String tvPrice) {
        this.ivMain = ivMain;
        this.tvType = tvType;
        this.tvPrice = tvPrice;
    }

    public Integer getIvMain() {
        return ivMain;
    }

    public void setIvMain(Integer ivMain) {
        this.ivMain = ivMain;
    }

    public String getTvType() {
        return tvType;
    }

    public void setTvType(String tvType) {
        this.tvType = tvType;
    }

    public String getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(String tvPrice) {
        this.tvPrice = tvPrice;
    }
}
