package deob;

@ObfuscatedName("ee")
public class class152 extends class298 {

    @ObfuscatedName("ee.o")
    public final boolean field2148;

    public class152(boolean arg0) {
        this.field2148 = arg0;
    }

    @ObfuscatedName("ee.o(Lkv;Lkv;I)I")
    public int method2874(class302 arg0, class302 arg1) {
        if (client.field871 == arg0.field3848) {
            if (client.field871 != arg1.field3848) {
                return this.field2148 ? -1 : 1;
            }
        } else if (client.field871 == arg1.field3848) {
            return this.field2148 ? 1 : -1;
        }
        return this.method4894(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2874((class302) arg0, (class302) arg1);
    }
}
