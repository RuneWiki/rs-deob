package deob;

@ObfuscatedName("fx")
public class class169 extends class285 {

    @ObfuscatedName("fx.x")
    public final boolean field2005;

    public class169(boolean arg0) {
        this.field2005 = arg0;
    }

    @ObfuscatedName("fx.x(Lke;Lke;I)I")
    public int method3239(class289 arg0, class289 arg1) {
        if (arg0.field3611 == 0 || arg1.field3611 == 0) {
            return this.method4715(arg0, arg1);
        } else if (this.field2005) {
            return arg0.method4696().method4847(arg1.method4696());
        } else {
            return arg1.method4696().method4847(arg0.method4696());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3239((class289) arg0, (class289) arg1);
    }
}
