package deob;

@ObfuscatedName("fk")
public class class167 extends class286 {

    @ObfuscatedName("fk.f")
    public final boolean field2018;

    public class167(boolean arg0) {
        this.field2018 = arg0;
    }

    @ObfuscatedName("fk.f(Lkl;Lkl;I)I")
    public int method3246(class290 arg0, class290 arg1) {
        if (arg0.field3641 == arg1.field3641) {
            return this.method4793(arg0, arg1);
        } else if (this.field2018) {
            return arg0.field3641 - arg1.field3641;
        } else {
            return arg1.field3641 - arg0.field3641;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3246((class290) arg0, (class290) arg1);
    }
}
