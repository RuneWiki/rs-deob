package deob;

@ObfuscatedName("eq")
public class class146 extends class286 {

    @ObfuscatedName("eq.f")
    public final boolean field1953;

    public class146(boolean arg0) {
        this.field1953 = arg0;
    }

    @ObfuscatedName("eq.f(Lkj;Lkj;I)I")
    public int method3003(class290 arg0, class290 arg1) {
        if (arg0.field3703 == arg1.field3703) {
            return this.method5014(arg0, arg1);
        } else if (this.field1953) {
            return arg0.field3703 - arg1.field3703;
        } else {
            return arg1.field3703 - arg0.field3703;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3003((class290) arg0, (class290) arg1);
    }
}
