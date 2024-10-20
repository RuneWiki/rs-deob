package deob;

@ObfuscatedName("eb")
public class class146 extends class286 {

    @ObfuscatedName("eb.c")
    public final boolean field1949;

    public class146(boolean arg0) {
        this.field1949 = arg0;
    }

    @ObfuscatedName("eb.c(Lkx;Lkx;S)I")
    public int method2916(class290 arg0, class290 arg1) {
        if (arg0.field3679 == arg1.field3679) {
            return this.method4951(arg0, arg1);
        } else if (this.field1949) {
            return arg0.field3679 - arg1.field3679;
        } else {
            return arg1.field3679 - arg0.field3679;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2916((class290) arg0, (class290) arg1);
    }
}
