package deob;

@ObfuscatedName("el")
public class class156 extends class298 {

    @ObfuscatedName("el.g")
    public final boolean field2126;

    public class156(boolean arg0) {
        this.field2126 = arg0;
    }

    @ObfuscatedName("el.g(Lku;Lku;I)I")
    public int method3006(class302 arg0, class302 arg1) {
        if (arg0.field3854 == arg1.field3854) {
            return this.method4947(arg0, arg1);
        } else if (this.field2126) {
            return arg0.field3854 - arg1.field3854;
        } else {
            return arg1.field3854 - arg0.field3854;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3006((class302) arg0, (class302) arg1);
    }
}
