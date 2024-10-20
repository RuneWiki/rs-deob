package deob;

import java.util.Comparator;

@ObfuscatedName("lf")
public class class314 implements Comparator {

    @ObfuscatedName("lf.f")
    public final boolean field3819;

    public class314(boolean arg0) {
        this.field3819 = arg0;
    }

    @ObfuscatedName("lf.f(Ljy;Ljy;B)I")
    public int method5456(class274 arg0, class274 arg1) {
        return this.field3819 ? arg0.method4686(arg1) : arg1.method4686(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5456((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
