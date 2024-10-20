package deob;

@ObfuscatedName("fw")
public class class158 extends class287 {

    @ObfuscatedName("fw.m")
    public final boolean field1970;

    public class158(boolean arg0) {
        this.field1970 = arg0;
    }

    @ObfuscatedName("fw.m(Lke;Lke;I)I")
    public int method3099(class291 arg0, class291 arg1) {
        if (arg0.field3700 == arg1.field3700) {
            return this.method5011(arg0, arg1);
        } else if (this.field1970) {
            return arg0.field3700 - arg1.field3700;
        } else {
            return arg1.field3700 - arg0.field3700;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3099((class291) arg0, (class291) arg1);
    }
}
