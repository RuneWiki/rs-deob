package deob;

@ObfuscatedName("el")
public class class156 extends class275 {

    @ObfuscatedName("el.a")
    public final boolean field1970;

    public class156(boolean arg0) {
        this.field1970 = arg0;
    }

    @ObfuscatedName("el.a(Ljx;Ljx;I)I")
    public int method3207(class279 arg0, class279 arg1) {
        if (arg0.field3597 == 0 || arg1.field3597 == 0) {
            return this.method4741(arg0, arg1);
        } else if (this.field1970) {
            return arg0.field3598 - arg1.field3598;
        } else {
            return arg1.field3598 - arg0.field3598;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3207((class279) arg0, (class279) arg1);
    }
}
