package deob;

import java.util.Comparator;

@ObfuscatedName("ug")
public class class540 implements Comparator {

    @ObfuscatedName("ug.aq")
    public final boolean field5261;

    public class540(boolean arg0) {
        this.field5261 = arg0;
    }

    @ObfuscatedName("ug.aq(Lra;Lra;I)I")
    public int method8871(class452 arg0, class452 arg1) {
        return this.field5261 ? arg0.method7534(arg1) : arg1.method7534(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8871((class452) arg0, (class452) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
