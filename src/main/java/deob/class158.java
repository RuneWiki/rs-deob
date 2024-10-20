package deob;

@ObfuscatedName("fe")
public class class158 extends class275 {

    @ObfuscatedName("fe.z")
    public final boolean field1971;

    public class158(boolean arg0) {
        this.field1971 = arg0;
    }

    @ObfuscatedName("fe.z(Ljl;Ljl;I)I")
    public int method3088(class279 arg0, class279 arg1) {
        if (arg0.field3600 == arg1.field3600) {
            return this.method4596(arg0, arg1);
        } else if (this.field1971) {
            return arg0.field3600 - arg1.field3600;
        } else {
            return arg1.field3600 - arg0.field3600;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3088((class279) arg0, (class279) arg1);
    }
}
