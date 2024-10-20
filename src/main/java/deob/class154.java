package deob;

@ObfuscatedName("em")
public class class154 extends class298 {

    @ObfuscatedName("em.g")
    public final boolean field2120;

    public class154(boolean arg0) {
        this.field2120 = arg0;
    }

    @ObfuscatedName("em.g(Lku;Lku;S)I")
    public int method2987(class302 arg0, class302 arg1) {
        if (arg0.field3854 == 0 || arg1.field3854 == 0) {
            return this.method4947(arg0, arg1);
        } else if (this.field2120) {
            return arg0.field3852 - arg1.field3852;
        } else {
            return arg1.field3852 - arg0.field3852;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2987((class302) arg0, (class302) arg1);
    }
}
