package deob;

@ObfuscatedName("ez")
public class class152 extends class275 {

    @ObfuscatedName("ez.f")
    public final boolean field1957;

    public class152(boolean arg0) {
        this.field1957 = arg0;
    }

    @ObfuscatedName("ez.f(Ljt;Ljt;S)I")
    public int method3081(class279 arg0, class279 arg1) {
        if (arg0.field3595 == arg1.field3595) {
            return this.method4697(arg0, arg1);
        } else if (this.field1957) {
            return arg0.field3595 - arg1.field3595;
        } else {
            return arg1.field3595 - arg0.field3595;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3081((class279) arg0, (class279) arg1);
    }
}
