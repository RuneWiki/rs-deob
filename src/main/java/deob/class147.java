package deob;

@ObfuscatedName("eh")
public class class147 extends class286 {

    @ObfuscatedName("eh.f")
    public final boolean field1944;

    public class147(boolean arg0) {
        this.field1944 = arg0;
    }

    @ObfuscatedName("eh.f(Lkd;Lkd;B)I")
    public int method2986(class290 arg0, class290 arg1) {
        if (arg0.field3695 == arg1.field3695) {
            return this.method4946(arg0, arg1);
        } else if (this.field1944) {
            return arg0.field3695 - arg1.field3695;
        } else {
            return arg1.field3695 - arg0.field3695;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2986((class290) arg0, (class290) arg1);
    }
}
