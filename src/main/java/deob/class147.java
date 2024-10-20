package deob;

@ObfuscatedName("en")
public class class147 extends class286 {

    @ObfuscatedName("en.c")
    public final boolean field1955;

    public class147(boolean arg0) {
        this.field1955 = arg0;
    }

    @ObfuscatedName("en.c(Lkx;Lkx;I)I")
    public int method2927(class290 arg0, class290 arg1) {
        if (arg0.field3677 == arg1.field3677) {
            return this.method4951(arg0, arg1);
        } else if (this.field1955) {
            return arg0.field3677 - arg1.field3677;
        } else {
            return arg1.field3677 - arg0.field3677;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2927((class290) arg0, (class290) arg1);
    }
}
