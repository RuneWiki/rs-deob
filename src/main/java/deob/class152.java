package deob;

@ObfuscatedName("eb")
public class class152 extends class298 {

    @ObfuscatedName("eb.c")
    public final boolean field2127;

    public class152(boolean arg0) {
        this.field2127 = arg0;
    }

    @ObfuscatedName("eb.c(Lke;Lke;B)I")
    public int method2905(class302 arg0, class302 arg1) {
        if (client.field858 == arg0.field3841) {
            if (client.field858 != arg1.field3841) {
                return this.field2127 ? -1 : 1;
            }
        } else if (client.field858 == arg1.field3841) {
            return this.field2127 ? 1 : -1;
        }
        return this.method4912(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2905((class302) arg0, (class302) arg1);
    }
}
