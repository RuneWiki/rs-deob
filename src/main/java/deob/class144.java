package deob;

@ObfuscatedName("ee")
public class class144 extends class286 {

    @ObfuscatedName("ee.f")
    public final boolean field1937;

    public class144(boolean arg0) {
        this.field1937 = arg0;
    }

    @ObfuscatedName("ee.f(Lkj;Lkj;I)I")
    public int method2989(class290 arg0, class290 arg1) {
        if (arg0.field3703 == 0 || arg1.field3703 == 0) {
            return this.method5014(arg0, arg1);
        } else if (this.field1937) {
            return arg0.field3700 - arg1.field3700;
        } else {
            return arg1.field3700 - arg0.field3700;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2989((class290) arg0, (class290) arg1);
    }
}
