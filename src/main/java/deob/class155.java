package deob;

@ObfuscatedName("ew")
public class class155 extends class275 {

    @ObfuscatedName("ew.s")
    public final boolean field1962;

    public class155(boolean arg0) {
        this.field1962 = arg0;
    }

    @ObfuscatedName("ew.s(Ljt;Ljt;B)I")
    public int method3128(class279 arg0, class279 arg1) {
        if (client.field872 == arg0.field3588 && client.field872 == arg1.field3588) {
            return this.field1962 ? arg0.field3589 - arg1.field3589 : arg1.field3589 - arg0.field3589;
        } else {
            return this.method4653(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3128((class279) arg0, (class279) arg1);
    }
}
