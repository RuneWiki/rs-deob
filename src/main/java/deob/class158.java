package deob;

@ObfuscatedName("fg")
public class class158 extends class298 {

    @ObfuscatedName("fg.g")
    public final boolean field2134;

    public class158(boolean arg0) {
        this.field2134 = arg0;
    }

    @ObfuscatedName("fg.g(Lku;Lku;I)I")
    public int method3021(class302 arg0, class302 arg1) {
        if (arg0.field3854 == 0 || arg1.field3854 == 0) {
            return this.method4947(arg0, arg1);
        } else if (this.field2134) {
            return arg0.method4928().method5062(arg1.method4928());
        } else {
            return arg1.method4928().method5062(arg0.method4928());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3021((class302) arg0, (class302) arg1);
    }
}
