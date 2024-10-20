package deob;

@ObfuscatedName("eu")
public class class146 extends class286 {

    @ObfuscatedName("eu.f")
    public final boolean field1937;

    public class146(boolean arg0) {
        this.field1937 = arg0;
    }

    @ObfuscatedName("eu.f(Lkd;Lkd;I)I")
    public int method2977(class290 arg0, class290 arg1) {
        if (arg0.field3696 == arg1.field3696) {
            return this.method4946(arg0, arg1);
        } else if (this.field1937) {
            return arg0.field3696 - arg1.field3696;
        } else {
            return arg1.field3696 - arg0.field3696;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2977((class290) arg0, (class290) arg1);
    }
}
