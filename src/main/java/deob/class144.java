package deob;

@ObfuscatedName("ev")
public class class144 extends class286 {

    @ObfuscatedName("ev.c")
    public final boolean field1939;

    public class144(boolean arg0) {
        this.field1939 = arg0;
    }

    @ObfuscatedName("ev.c(Lkx;Lkx;I)I")
    public int method2894(class290 arg0, class290 arg1) {
        if (arg0.field3679 == 0 || arg1.field3679 == 0) {
            return this.method4951(arg0, arg1);
        } else if (this.field1939) {
            return arg0.field3678 - arg1.field3678;
        } else {
            return arg1.field3678 - arg0.field3678;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2894((class290) arg0, (class290) arg1);
    }
}
