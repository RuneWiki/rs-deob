package deob;

import java.util.Comparator;

@ObfuscatedName("lq")
public class class315 implements Comparator {

    @ObfuscatedName("lq.u")
    public final boolean field3823;

    public class315(boolean arg0) {
        this.field3823 = arg0;
    }

    @ObfuscatedName("lq.u(Ljr;Ljr;I)I")
    public int method5513(class274 arg0, class274 arg1) {
        return this.field3823 ? arg0.method4716().method4848(arg1.method4716()) : arg1.method4716().method4848(arg0.method4716());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5513((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
