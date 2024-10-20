package deob;

@ObfuscatedName("ef")
public class class145 extends class286 {

    @ObfuscatedName("ef.c")
    public final boolean field1941;

    public class145(boolean arg0) {
        this.field1941 = arg0;
    }

    @ObfuscatedName("ef.c(Lkx;Lkx;I)I")
    public int method2912(class290 arg0, class290 arg1) {
        if (arg0.field3679 == 0) {
            if (arg1.field3679 != 0) {
                return this.field1941 ? 1 : -1;
            }
        } else if (arg1.field3679 == 0) {
            return this.field1941 ? -1 : 1;
        }
        return this.method4951(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2912((class290) arg0, (class290) arg1);
    }
}
