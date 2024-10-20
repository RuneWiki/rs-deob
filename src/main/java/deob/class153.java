package deob;

@ObfuscatedName("ey")
public class class153 extends class275 {

    @ObfuscatedName("ey.a")
    public final boolean field1956;

    public class153(boolean arg0) {
        this.field1956 = arg0;
    }

    @ObfuscatedName("ey.a(Ljx;Ljx;B)I")
    public int method3179(class279 arg0, class279 arg1) {
        if (client.field701 == arg0.field3597 && client.field701 == arg1.field3597) {
            return this.field1956 ? arg0.method4737().method4860(arg1.method4737()) : arg1.method4737().method4860(arg0.method4737());
        } else {
            return this.method4741(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3179((class279) arg0, (class279) arg1);
    }
}
