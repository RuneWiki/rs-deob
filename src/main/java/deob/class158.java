package deob;

@ObfuscatedName("fd")
public class class158 extends class275 {

    @ObfuscatedName("fd.s")
    public final boolean field1975;

    public class158(boolean arg0) {
        this.field1975 = arg0;
    }

    @ObfuscatedName("fd.s(Ljt;Ljt;I)I")
    public int method3152(class279 arg0, class279 arg1) {
        if (arg0.field3588 == arg1.field3588) {
            return this.method4653(arg0, arg1);
        } else if (this.field1975) {
            return arg0.field3588 - arg1.field3588;
        } else {
            return arg1.field3588 - arg0.field3588;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3152((class279) arg0, (class279) arg1);
    }
}
