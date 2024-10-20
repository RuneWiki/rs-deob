package deob;

@ObfuscatedName("em")
public class class148 extends class286 {

    @ObfuscatedName("em.v")
    public final boolean field1951;

    public class148(boolean arg0) {
        this.field1951 = arg0;
    }

    @ObfuscatedName("em.v(Lkx;Lkx;B)I")
    public int method2950(class290 arg0, class290 arg1) {
        if (arg0.field3664 == 0 || arg1.field3664 == 0) {
            return this.method4967(arg0, arg1);
        } else if (this.field1951) {
            return arg0.method4951().method5086(arg1.method4951());
        } else {
            return arg1.method4951().method5086(arg0.method4951());
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2950((class290) arg0, (class290) arg1);
    }
}
