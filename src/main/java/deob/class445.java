package deob;

import java.util.Comparator;

@ObfuscatedName("qp")
public class class445 implements Comparator {

    @ObfuscatedName("qp.o")
    public final boolean field4738;

    public class445(boolean arg0) {
        this.field4738 = arg0;
    }

    @ObfuscatedName("qp.o(Lnb;Lnb;I)I")
    public int method7172(class372 arg0, class372 arg1) {
        return this.field4738 ? arg0.method5974(arg1) : arg1.method5974(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7172((class372) arg0, (class372) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
