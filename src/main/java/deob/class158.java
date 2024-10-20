package deob;

@ObfuscatedName("fe")
public class class158 extends class275 {

    @ObfuscatedName("fe.a")
    public final boolean field1975;

    public class158(boolean arg0) {
        this.field1975 = arg0;
    }

    @ObfuscatedName("fe.a(Ljx;Ljx;B)I")
    public int method3222(class279 arg0, class279 arg1) {
        if (arg0.field3597 == arg1.field3597) {
            return this.method4741(arg0, arg1);
        } else if (this.field1975) {
            return arg0.field3597 - arg1.field3597;
        } else {
            return arg1.field3597 - arg0.field3597;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3222((class279) arg0, (class279) arg1);
    }
}
