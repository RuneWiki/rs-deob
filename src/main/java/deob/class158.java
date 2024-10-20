package deob;

@ObfuscatedName("fp")
public class class158 extends class298 {

    @ObfuscatedName("fp.t")
    public final boolean field2122;

    public class158(boolean arg0) {
        this.field2122 = arg0;
    }

    @ObfuscatedName("fp.t(Lkp;Lkp;I)I")
    public int method2927(class302 arg0, class302 arg1) {
        if (arg0.field3845 == 0 || arg1.field3845 == 0) {
            return this.method4883(arg0, arg1);
        } else if (this.field2122) {
            return arg0.method4856().method5007(arg1.method4856());
        } else {
            return arg1.method4856().method5007(arg0.method4856());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2927((class302) arg0, (class302) arg1);
    }
}
