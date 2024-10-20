package deob;

@ObfuscatedName("ct")
public class class91 extends class325 {

    @ObfuscatedName("ct.s")
    public final boolean field1236;

    public class91(boolean arg0) {
        this.field1236 = arg0;
    }

    @ObfuscatedName("ct.s(Llr;Llr;I)I")
    public int method2047(class328 arg0, class328 arg1) {
        if (arg0.field3865 == 0 || arg1.field3865 == 0) {
            return this.method5216(arg0, arg1);
        } else if (this.field1236) {
            return arg0.field3869 - arg1.field3869;
        } else {
            return arg1.field3869 - arg0.field3869;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2047((class328) arg0, (class328) arg1);
    }
}
