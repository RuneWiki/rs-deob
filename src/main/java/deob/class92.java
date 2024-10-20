package deob;

@ObfuscatedName("ch")
public class class92 extends class325 {

    @ObfuscatedName("ch.s")
    public final boolean field1238;

    public class92(boolean arg0) {
        this.field1238 = arg0;
    }

    @ObfuscatedName("ch.s(Llr;Llr;I)I")
    public int method2051(class328 arg0, class328 arg1) {
        if (arg0.field3865 == 0) {
            if (arg1.field3865 != 0) {
                return this.field1238 ? 1 : -1;
            }
        } else if (arg1.field3865 == 0) {
            return this.field1238 ? -1 : 1;
        }
        return this.method5216(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2051((class328) arg0, (class328) arg1);
    }
}
