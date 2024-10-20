package deob;

import java.util.Comparator;

@ObfuscatedName("qc")
public class class451 implements Comparator {

    @ObfuscatedName("qc.c")
    public final boolean field4795;

    public class451(boolean arg0) {
        this.field4795 = arg0;
    }

    @ObfuscatedName("qc.c(Lnc;Lnc;B)I")
    public int method7471(class373 arg0, class373 arg1) {
        return this.field4795 ? arg0.method6224().method7777(arg1.method6224()) : arg1.method6224().method7777(arg0.method6224());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7471((class373) arg0, (class373) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
