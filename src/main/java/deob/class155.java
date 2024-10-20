package deob;

@ObfuscatedName("ej")
public class class155 extends class275 {

    @ObfuscatedName("ej.a")
    public final boolean field1969;

    public class155(boolean arg0) {
        this.field1969 = arg0;
    }

    @ObfuscatedName("ej.a(Ljx;Ljx;I)I")
    public int method3201(class279 arg0, class279 arg1) {
        if (client.field701 == arg0.field3597 && client.field701 == arg1.field3597) {
            return this.field1969 ? arg0.field3598 - arg1.field3598 : arg1.field3598 - arg0.field3598;
        } else {
            return this.method4741(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3201((class279) arg0, (class279) arg1);
    }
}
