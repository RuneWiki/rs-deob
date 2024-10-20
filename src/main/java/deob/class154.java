package deob;

@ObfuscatedName("ea")
public class class154 extends class275 {

    @ObfuscatedName("ea.z")
    public final boolean field1952;

    public class154(boolean arg0) {
        this.field1952 = arg0;
    }

    @ObfuscatedName("ea.z(Ljl;Ljl;I)I")
    public int method3060(class279 arg0, class279 arg1) {
        if (client.field856 == arg0.field3600) {
            if (client.field856 != arg1.field3600) {
                return this.field1952 ? -1 : 1;
            }
        } else if (client.field856 == arg1.field3600) {
            return this.field1952 ? 1 : -1;
        }
        return this.method4596(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3060((class279) arg0, (class279) arg1);
    }
}
