package deob;

import java.util.Comparator;

@ObfuscatedName("uw")
public class class536 implements Comparator {

    @ObfuscatedName("uw.ac")
    public final boolean field5202;

    public class536(boolean arg0) {
        this.field5202 = arg0;
    }

    @ObfuscatedName("uw.ac(Lrp;Lrp;I)I")
    public int method8672(class448 arg0, class448 arg1) {
        return this.field5202 ? arg0.method7303(arg1) : arg1.method7303(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8672((class448) arg0, (class448) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
