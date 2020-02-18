package Factory_Abstract.BANK;

public class SBI implements Bank {
    private String BNAME;

    public SBI(){
        BNAME = "SBI BANK";
    }

    @Override
    public String getName() {
        return BNAME;
    }
}
