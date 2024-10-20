package deob;

@ObfuscatedName("er")
public class class154 extends class298 {

    @ObfuscatedName("er.t")
    public final boolean field2113;

    public class154(boolean arg0) {
        this.field2113 = arg0;
    }

    @ObfuscatedName("er.t(Lkp;Lkp;S)I")
    public int method2895(class302 arg0, class302 arg1) {
        if (arg0.field3845 == 0 || arg1.field3845 == 0) {
            return this.method4883(arg0, arg1);
        } else if (this.field2113) {
            return arg0.field3843 - arg1.field3843;
        } else {
            return arg1.field3843 - arg0.field3843;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2895((class302) arg0, (class302) arg1);
    }
}
