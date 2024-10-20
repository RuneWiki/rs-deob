package deob;

@ObfuscatedName("fb")
public class class165 extends class286 {

    @ObfuscatedName("fb.f")
    public final boolean field2005;

    public class165(boolean arg0) {
        this.field2005 = arg0;
    }

    @ObfuscatedName("fb.f(Lkl;Lkl;I)I")
    public int method3233(class290 arg0, class290 arg1) {
        if (arg0.field3641 == 0 || arg1.field3641 == 0) {
            return this.method4793(arg0, arg1);
        } else if (this.field2005) {
            return arg0.field3642 - arg1.field3642;
        } else {
            return arg1.field3642 - arg0.field3642;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3233((class290) arg0, (class290) arg1);
    }
}
