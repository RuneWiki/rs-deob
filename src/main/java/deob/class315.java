package deob;

import java.util.Comparator;

@ObfuscatedName("ld")
public class class315 implements Comparator {

    @ObfuscatedName("ld.z")
    public final boolean field3822;

    public class315(boolean arg0) {
        this.field3822 = arg0;
    }

    @ObfuscatedName("ld.z(Ljh;Ljh;I)I")
    public int method5352(class274 arg0, class274 arg1) {
        return this.field3822 ? arg0.method4570().method4700(arg1.method4570()) : arg1.method4570().method4700(arg0.method4570());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5352((class274) arg0, (class274) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
