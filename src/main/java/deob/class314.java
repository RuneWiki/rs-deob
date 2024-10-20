package deob;

import java.util.Comparator;

@ObfuscatedName("la")
public class class314 implements Comparator {

    @ObfuscatedName("la.a")
    public final boolean field3808;

    public class314(boolean arg0) {
        this.field3808 = arg0;
    }

    @ObfuscatedName("la.a(Ljg;Ljg;B)I")
    public int method5476(class274 arg0, class274 arg1) {
        return this.field3808 ? arg0.method4715(arg1) : arg1.method4715(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5476((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
