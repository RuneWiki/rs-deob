package deob;

@ObfuscatedName("ei")
public class class152 extends class298 {

    @ObfuscatedName("ei.g")
    public final boolean field2116;

    public class152(boolean arg0) {
        this.field2116 = arg0;
    }

    @ObfuscatedName("ei.g(Lku;Lku;B)I")
    public int method2973(class302 arg0, class302 arg1) {
        if (client.field994 == arg0.field3854) {
            if (client.field994 != arg1.field3854) {
                return this.field2116 ? -1 : 1;
            }
        } else if (client.field994 == arg1.field3854) {
            return this.field2116 ? 1 : -1;
        }
        return this.method4947(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2973((class302) arg0, (class302) arg1);
    }
}
