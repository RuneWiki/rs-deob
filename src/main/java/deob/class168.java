package deob;

@ObfuscatedName("fn")
public class class168 extends class285 {

    @ObfuscatedName("fn.m")
    public final boolean field2014;

    public class168(boolean arg0) {
        this.field2014 = arg0;
    }

    @ObfuscatedName("fn.m(Lkx;Lkx;I)I")
    public int method3230(class289 arg0, class289 arg1) {
        if (arg0.field3642 == arg1.field3642) {
            return this.method4799(arg0, arg1);
        } else if (this.field2014) {
            return arg0.field3642 - arg1.field3642;
        } else {
            return arg1.field3642 - arg0.field3642;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3230((class289) arg0, (class289) arg1);
    }
}
