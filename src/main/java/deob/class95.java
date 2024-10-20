package deob;

@ObfuscatedName("cs")
public class class95 extends class325 {

    @ObfuscatedName("cs.s")
    public final boolean field1251;

    public class95(boolean arg0) {
        this.field1251 = arg0;
    }

    @ObfuscatedName("cs.s(Llr;Llr;I)I")
    public int method2075(class328 arg0, class328 arg1) {
        if (client.field405 == arg0.field3865 && client.field405 == arg1.field3865) {
            return this.field1251 ? arg0.field3869 - arg1.field3869 : arg1.field3869 - arg0.field3869;
        } else {
            return this.method5216(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2075((class328) arg0, (class328) arg1);
    }
}
