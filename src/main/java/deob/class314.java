package deob;

import java.util.Comparator;

@ObfuscatedName("lf")
public class class314 implements Comparator {

    @ObfuscatedName("lf.s")
    public final boolean field3823;

    public class314(boolean arg0) {
        this.field3823 = arg0;
    }

    @ObfuscatedName("lf.s(Lju;Lju;I)I")
    public int method5390(class274 arg0, class274 arg1) {
        return this.field3823 ? arg0.method4637(arg1) : arg1.method4637(arg0);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5390((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
