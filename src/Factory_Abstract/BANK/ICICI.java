package Factory_Abstract.BANK;

public class ICICI implements Bank {
    private String BNAME;

    /**
     * constructor
     */
    public ICICI(){
        BNAME = "ICICI BANK";
    }

    @Override
    public String getName() {
        return BNAME;
    }
}
