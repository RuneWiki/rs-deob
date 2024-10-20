package deob;

@ObfuscatedName("fz")
public class class160 extends class276 {

    @ObfuscatedName("fz.q")
    public final boolean field1998;

    public class160(boolean arg0) {
        this.field1998 = arg0;
    }

    @ObfuscatedName("fz.q(Ljz;Ljz;I)I")
    public int method3153(class280 arg0, class280 arg1) {
        if (arg0.field3637 == 0 || arg1.field3637 == 0) {
            return this.method4676(arg0, arg1);
        } else if (this.field1998) {
            return arg0.method4656().method4791(arg1.method4656());
        } else {
            return arg1.method4656().method4791(arg0.method4656());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3153((class280) arg0, (class280) arg1);
    }
}
