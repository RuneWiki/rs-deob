package deob;

@ObfuscatedName("fo")
public class class169 extends class285 {

    @ObfuscatedName("fo.m")
    public final boolean field2018;

    public class169(boolean arg0) {
        this.field2018 = arg0;
    }

    @ObfuscatedName("fo.m(Lkx;Lkx;S)I")
    public int method3237(class289 arg0, class289 arg1) {
        if (arg0.field3643 == 0 || arg1.field3643 == 0) {
            return this.method4799(arg0, arg1);
        } else if (this.field2018) {
            return arg0.method4796().method4927(arg1.method4796());
        } else {
            return arg1.method4796().method4927(arg0.method4796());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3237((class289) arg0, (class289) arg1);
    }
}
