package deob;

@ObfuscatedName("fx")
public class class169 extends class286 {

    @ObfuscatedName("fx.h")
    public final boolean field2015;

    public class169(boolean arg0) {
        this.field2015 = arg0;
    }

    @ObfuscatedName("fx.h(Lkz;Lkz;I)I")
    public int method3249(class290 arg0, class290 arg1) {
        if (arg0.field3651 == 0 || arg1.field3651 == 0) {
            return this.method4712(arg0, arg1);
        } else if (this.field2015) {
            return arg0.method4699().method4830(arg1.method4699());
        } else {
            return arg1.method4699().method4830(arg0.method4699());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3249((class290) arg0, (class290) arg1);
    }
}
