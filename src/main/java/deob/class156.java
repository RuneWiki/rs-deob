package deob;

@ObfuscatedName("ev")
public class class156 extends class275 {

    @ObfuscatedName("ev.s")
    public final boolean field1963;

    public class156(boolean arg0) {
        this.field1963 = arg0;
    }

    @ObfuscatedName("ev.s(Ljt;Ljt;I)I")
    public int method3138(class279 arg0, class279 arg1) {
        if (arg0.field3588 == 0 || arg1.field3588 == 0) {
            return this.method4653(arg0, arg1);
        } else if (this.field1963) {
            return arg0.field3589 - arg1.field3589;
        } else {
            return arg1.field3589 - arg0.field3589;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3138((class279) arg0, (class279) arg1);
    }
}
