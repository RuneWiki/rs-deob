package deob;

@ObfuscatedName("et")
public class class155 extends class275 {

    @ObfuscatedName("et.z")
    public final boolean field1959;

    public class155(boolean arg0) {
        this.field1959 = arg0;
    }

    @ObfuscatedName("et.z(Ljl;Ljl;I)I")
    public int method3068(class279 arg0, class279 arg1) {
        if (client.field856 == arg0.field3600 && client.field856 == arg1.field3600) {
            return this.field1959 ? arg0.field3598 - arg1.field3598 : arg1.field3598 - arg0.field3598;
        } else {
            return this.method4596(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3068((class279) arg0, (class279) arg1);
    }
}
