package deob;

@ObfuscatedName("eg")
public class class147 extends class275 {

    @ObfuscatedName("eg.f")
    public final boolean field1940;

    public class147(boolean arg0) {
        this.field1940 = arg0;
    }

    @ObfuscatedName("eg.f(Ljt;Ljt;I)I")
    public int method3047(class279 arg0, class279 arg1) {
        if (client.field829 == arg0.field3595 && client.field829 == arg1.field3595) {
            return this.field1940 ? arg0.method4678().method4825(arg1.method4678()) : arg1.method4678().method4825(arg0.method4678());
        } else {
            return this.method4697(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3047((class279) arg0, (class279) arg1);
    }
}
