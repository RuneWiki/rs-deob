package deob;

@ObfuscatedName("ey")
public class class154 extends class275 {

    @ObfuscatedName("ey.f")
    public final boolean field1969;

    public class154(boolean arg0) {
        this.field1969 = arg0;
    }

    @ObfuscatedName("ey.f(Ljt;Ljt;I)I")
    public int method3093(class279 arg0, class279 arg1) {
        if (arg0.field3595 == 0 || arg1.field3595 == 0) {
            return this.method4697(arg0, arg1);
        } else if (this.field1969) {
            return arg0.method4678().method4825(arg1.method4678());
        } else {
            return arg1.method4678().method4825(arg0.method4678());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3093((class279) arg0, (class279) arg1);
    }
}
