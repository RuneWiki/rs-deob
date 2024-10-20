package deob;

@ObfuscatedName("el")
public class class154 extends class275 {

    @ObfuscatedName("el.s")
    public final boolean field1961;

    public class154(boolean arg0) {
        this.field1961 = arg0;
    }

    @ObfuscatedName("el.s(Ljt;Ljt;S)I")
    public int method3122(class279 arg0, class279 arg1) {
        if (client.field872 == arg0.field3588) {
            if (client.field872 != arg1.field3588) {
                return this.field1961 ? -1 : 1;
            }
        } else if (client.field872 == arg1.field3588) {
            return this.field1961 ? 1 : -1;
        }
        return this.method4653(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3122((class279) arg0, (class279) arg1);
    }
}
