package deob;

@ObfuscatedName("ez")
public class class154 extends class275 {

    @ObfuscatedName("ez.a")
    public final boolean field1962;

    public class154(boolean arg0) {
        this.field1962 = arg0;
    }

    @ObfuscatedName("ez.a(Ljx;Ljx;I)I")
    public int method3190(class279 arg0, class279 arg1) {
        if (client.field701 == arg0.field3597) {
            if (client.field701 != arg1.field3597) {
                return this.field1962 ? -1 : 1;
            }
        } else if (client.field701 == arg1.field3597) {
            return this.field1962 ? 1 : -1;
        }
        return this.method4741(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3190((class279) arg0, (class279) arg1);
    }
}
