package deob;

@ObfuscatedName("ew")
public class class147 extends class286 {

    @ObfuscatedName("ew.v")
    public final boolean field1950;

    public class147(boolean arg0) {
        this.field1950 = arg0;
    }

    @ObfuscatedName("ew.v(Lkx;Lkx;I)I")
    public int method2939(class290 arg0, class290 arg1) {
        if (arg0.field3663 == arg1.field3663) {
            return this.method4967(arg0, arg1);
        } else if (this.field1950) {
            return arg0.field3663 - arg1.field3663;
        } else {
            return arg1.field3663 - arg0.field3663;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2939((class290) arg0, (class290) arg1);
    }
}
