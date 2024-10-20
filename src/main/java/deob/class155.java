package deob;

@ObfuscatedName("ez")
public class class155 extends class287 {

    @ObfuscatedName("ez.m")
    public final boolean field1959;

    public class155(boolean arg0) {
        this.field1959 = arg0;
    }

    @ObfuscatedName("ez.m(Lke;Lke;I)I")
    public int method3076(class291 arg0, class291 arg1) {
        if (arg0.field3703 == 0 || arg1.field3703 == 0) {
            return this.method5011(arg0, arg1);
        } else if (this.field1959) {
            return arg0.field3701 - arg1.field3701;
        } else {
            return arg1.field3701 - arg0.field3701;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3076((class291) arg0, (class291) arg1);
    }
}
