package deob;

@ObfuscatedName("eb")
public class class156 extends class275 {

    @ObfuscatedName("eb.z")
    public final boolean field1962;

    public class156(boolean arg0) {
        this.field1962 = arg0;
    }

    @ObfuscatedName("eb.z(Ljl;Ljl;I)I")
    public int method3073(class279 arg0, class279 arg1) {
        if (arg0.field3600 == 0 || arg1.field3600 == 0) {
            return this.method4596(arg0, arg1);
        } else if (this.field1962) {
            return arg0.field3598 - arg1.field3598;
        } else {
            return arg1.field3598 - arg0.field3598;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3073((class279) arg0, (class279) arg1);
    }
}
