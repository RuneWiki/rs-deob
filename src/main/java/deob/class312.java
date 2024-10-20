package deob;

import java.util.Comparator;

@ObfuscatedName("kl")
public class class312 implements Comparator {

    @ObfuscatedName("kl.v")
    public final boolean field3777;

    public class312(boolean arg0) {
        this.field3777 = arg0;
    }

    @ObfuscatedName("kl.v(Ljx;Ljx;B)I")
    public int method5305(class285 arg0, class285 arg1) {
        return this.field3777 ? arg0.method4955(arg1) : arg1.method4955(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5305((class285) arg0, (class285) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
