package Factory_Abstract.BANK;

public class HDFC implements Bank {
    private String BNAME = "";

    /**
     * constructor
     */
    public HDFC() {
        BNAME = "HDFC BANK";
    }

    /**
     * @return bank name
     */
    @Override
    public String getName() {
        return BNAME;
    }
}
