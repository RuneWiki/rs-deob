package deob;

import java.util.Comparator;

@ObfuscatedName("lu")
public class class314 implements Comparator {

    @ObfuscatedName("lu.u")
    public final boolean field3820;

    public class314(boolean arg0) {
        this.field3820 = arg0;
    }

    @ObfuscatedName("lu.u(Ljr;Ljr;I)I")
    public int method5501(class274 arg0, class274 arg1) {
        return this.field3820 ? arg0.method4709(arg1) : arg1.method4709(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5501((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
