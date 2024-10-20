package deob;

@ObfuscatedName("ec")
public class class148 extends class275 {

    @ObfuscatedName("ec.f")
    public final boolean field1941;

    public class148(boolean arg0) {
        this.field1941 = arg0;
    }

    @ObfuscatedName("ec.f(Ljt;Ljt;I)I")
    public int method3051(class279 arg0, class279 arg1) {
        if (client.field829 == arg0.field3595) {
            if (client.field829 != arg1.field3595) {
                return this.field1941 ? -1 : 1;
            }
        } else if (client.field829 == arg1.field3595) {
            return this.field1941 ? 1 : -1;
        }
        return this.method4697(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3051((class279) arg0, (class279) arg1);
    }
}
