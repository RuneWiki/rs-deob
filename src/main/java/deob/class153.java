package deob;

@ObfuscatedName("eo")
public class class153 extends class298 {

    @ObfuscatedName("eo.g")
    public final boolean field2117;

    public class153(boolean arg0) {
        this.field2117 = arg0;
    }

    @ObfuscatedName("eo.g(Lku;Lku;I)I")
    public int method2980(class302 arg0, class302 arg1) {
        if (client.field994 == arg0.field3854 && client.field994 == arg1.field3854) {
            return this.field2117 ? arg0.field3852 - arg1.field3852 : arg1.field3852 - arg0.field3852;
        } else {
            return this.method4947(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2980((class302) arg0, (class302) arg1);
    }
}
