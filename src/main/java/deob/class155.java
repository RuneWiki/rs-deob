package deob;

@ObfuscatedName("ew")
public class class155 extends class275 {

    @ObfuscatedName("ew.c")
    public final boolean field1950;

    public class155(boolean arg0) {
        this.field1950 = arg0;
    }

    @ObfuscatedName("ew.c(Lje;Lje;I)I")
    public int method3128(class279 arg0, class279 arg1) {
        if (client.field624 == arg0.field3582 && client.field624 == arg1.field3582) {
            return this.field1950 ? arg0.field3581 - arg1.field3581 : arg1.field3581 - arg0.field3581;
        } else {
            return this.method4697(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3128((class279) arg0, (class279) arg1);
    }
}
