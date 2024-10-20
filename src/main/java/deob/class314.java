package deob;

import java.util.Comparator;

@ObfuscatedName("ld")
public class class314 implements Comparator {

    @ObfuscatedName("ld.c")
    public final boolean field3799;

    public class314(boolean arg0) {
        this.field3799 = arg0;
    }

    @ObfuscatedName("ld.c(Ljx;Ljx;I)I")
    public int method5302(class285 arg0, class285 arg1) {
        return this.field3799 ? arg0.method4937(arg1) : arg1.method4937(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5302((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
