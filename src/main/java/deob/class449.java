package deob;

import java.util.Comparator;

@ObfuscatedName("qf")
public class class449 implements Comparator {

    @ObfuscatedName("qf.s")
    public final boolean field4765;

    public class449(boolean arg0) {
        this.field4765 = arg0;
    }

    @ObfuscatedName("qf.s(Lnb;Lnb;B)I")
    public int method7210(class372 arg0, class372 arg1) {
        return this.field4765 ? arg0.method5970(arg1) : arg1.method5970(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7210((class372) arg0, (class372) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
