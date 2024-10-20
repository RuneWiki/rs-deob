package deob;

@ObfuscatedName("cm")
public class class90 extends class325 {

    @ObfuscatedName("cm.s")
    public final boolean field1234;

    public class90(boolean arg0) {
        this.field1234 = arg0;
    }

    @ObfuscatedName("cm.s(Llr;Llr;I)I")
    public int method2039(class328 arg0, class328 arg1) {
        if (client.field405 == arg0.field3865) {
            if (client.field405 != arg1.field3865) {
                return this.field1234 ? -1 : 1;
            }
        } else if (client.field405 == arg1.field3865) {
            return this.field1234 ? 1 : -1;
        }
        return this.method5216(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2039((class328) arg0, (class328) arg1);
    }
}
