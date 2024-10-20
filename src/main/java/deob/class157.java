package deob;

@ObfuscatedName("fh")
public class class157 extends class298 {

    @ObfuscatedName("fh.g")
    public final boolean field2133;

    public class157(boolean arg0) {
        this.field2133 = arg0;
    }

    @ObfuscatedName("fh.g(Lku;Lku;I)I")
    public int method3016(class302 arg0, class302 arg1) {
        if (arg0.field3855 == arg1.field3855) {
            return this.method4947(arg0, arg1);
        } else if (this.field2133) {
            return arg0.field3855 - arg1.field3855;
        } else {
            return arg1.field3855 - arg0.field3855;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3016((class302) arg0, (class302) arg1);
    }
}
