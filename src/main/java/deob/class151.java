package deob;

@ObfuscatedName("en")
public class class151 extends class298 {

    @ObfuscatedName("en.g")
    public final boolean field2113;

    public class151(boolean arg0) {
        this.field2113 = arg0;
    }

    @ObfuscatedName("en.g(Lku;Lku;I)I")
    public int method2966(class302 arg0, class302 arg1) {
        if (client.field994 == arg0.field3854 && client.field994 == arg1.field3854) {
            return this.field2113 ? arg0.method4928().method5062(arg1.method4928()) : arg1.method4928().method5062(arg0.method4928());
        } else {
            return this.method4947(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2966((class302) arg0, (class302) arg1);
    }
}
