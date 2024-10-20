package deob;

@ObfuscatedName("et")
public class class145 extends class284 {

    @ObfuscatedName("et.w")
    public final boolean field1918;

    public class145(boolean arg0) {
        this.field1918 = arg0;
    }

    @ObfuscatedName("et.w(Lkd;Lkd;I)I")
    public int method2956(class288 arg0, class288 arg1) {
        if (arg0.field3648 == arg1.field3648) {
            return this.method4931(arg0, arg1);
        } else if (this.field1918) {
            return arg0.field3648 - arg1.field3648;
        } else {
            return arg1.field3648 - arg0.field3648;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2956((class288) arg0, (class288) arg1);
    }
}
