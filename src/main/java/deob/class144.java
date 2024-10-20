package deob;

@ObfuscatedName("ex")
public class class144 extends class286 {

    @ObfuscatedName("ex.f")
    public final boolean field1929;

    public class144(boolean arg0) {
        this.field1929 = arg0;
    }

    @ObfuscatedName("ex.f(Lkd;Lkd;I)I")
    public int method2951(class290 arg0, class290 arg1) {
        if (arg0.field3696 == 0 || arg1.field3696 == 0) {
            return this.method4946(arg0, arg1);
        } else if (this.field1929) {
            return arg0.field3694 - arg1.field3694;
        } else {
            return arg1.field3694 - arg0.field3694;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2951((class290) arg0, (class290) arg1);
    }
}
