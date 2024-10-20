package deob;

import java.util.Comparator;

@ObfuscatedName("lq")
public class class315 implements Comparator {

    @ObfuscatedName("lq.a")
    public final boolean field3809;

    public class315(boolean arg0) {
        this.field3809 = arg0;
    }

    @ObfuscatedName("lq.a(Ljg;Ljg;B)I")
    public int method5484(class274 arg0, class274 arg1) {
        return this.field3809 ? arg0.method4737().method4860(arg1.method4737()) : arg1.method4737().method4860(arg0.method4737());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5484((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
