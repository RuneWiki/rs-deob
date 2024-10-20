package deob;

@ObfuscatedName("fd")
public class class157 extends class298 {

    @ObfuscatedName("fd.d")
    public final boolean field2135;

    public class157(boolean arg0) {
        this.field2135 = arg0;
    }

    @ObfuscatedName("fd.d(Lkz;Lkz;I)I")
    public int method2976(class302 arg0, class302 arg1) {
        if (arg0.field3839 == arg1.field3839) {
            return this.method4977(arg0, arg1);
        } else if (this.field2135) {
            return arg0.field3839 - arg1.field3839;
        } else {
            return arg1.field3839 - arg0.field3839;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2976((class302) arg0, (class302) arg1);
    }
}
