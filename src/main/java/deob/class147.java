package deob;

@ObfuscatedName("ev")
public class class147 extends class286 {

    @ObfuscatedName("ev.f")
    public final boolean field1956;

    public class147(boolean arg0) {
        this.field1956 = arg0;
    }

    @ObfuscatedName("ev.f(Lkj;Lkj;I)I")
    public int method3010(class290 arg0, class290 arg1) {
        if (arg0.field3699 == arg1.field3699) {
            return this.method5014(arg0, arg1);
        } else if (this.field1956) {
            return arg0.field3699 - arg1.field3699;
        } else {
            return arg1.field3699 - arg0.field3699;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3010((class290) arg0, (class290) arg1);
    }
}
