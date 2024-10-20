package deob;

@ObfuscatedName("ek")
public class class151 extends class298 {

    @ObfuscatedName("ek.d")
    public final boolean field2116;

    public class151(boolean arg0) {
        this.field2116 = arg0;
    }

    @ObfuscatedName("ek.d(Lkz;Lkz;I)I")
    public int method2936(class302 arg0, class302 arg1) {
        if (client.field1084 == arg0.field3840 && client.field1084 == arg1.field3840) {
            return this.field2116 ? arg0.method4975().method5099(arg1.method4975()) : arg1.method4975().method5099(arg0.method4975());
        } else {
            return this.method4977(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2936((class302) arg0, (class302) arg1);
    }
}
