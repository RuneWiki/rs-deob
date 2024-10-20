package deob;

import java.util.Comparator;

@ObfuscatedName("lv")
public class class315 implements Comparator {

    @ObfuscatedName("lv.f")
    public final boolean field3820;

    public class315(boolean arg0) {
        this.field3820 = arg0;
    }

    @ObfuscatedName("lv.f(Ljy;Ljy;I)I")
    public int method5459(class274 arg0, class274 arg1) {
        return this.field3820 ? arg0.method4678().method4825(arg1.method4678()) : arg1.method4678().method4825(arg0.method4678());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5459((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
