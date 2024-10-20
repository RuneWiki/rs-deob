package deob;

@ObfuscatedName("er")
public class class152 extends class298 {

    @ObfuscatedName("er.d")
    public final boolean field2121;

    public class152(boolean arg0) {
        this.field2121 = arg0;
    }

    @ObfuscatedName("er.d(Lkz;Lkz;S)I")
    public int method2943(class302 arg0, class302 arg1) {
        if (client.field1084 == arg0.field3840) {
            if (client.field1084 != arg1.field3840) {
                return this.field2121 ? -1 : 1;
            }
        } else if (client.field1084 == arg1.field3840) {
            return this.field2121 ? 1 : -1;
        }
        return this.method4977(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2943((class302) arg0, (class302) arg1);
    }
}
