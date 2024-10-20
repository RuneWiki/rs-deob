package deob;

@ObfuscatedName("eo")
public class class143 extends class286 {

    @ObfuscatedName("eo.c")
    public final boolean field1933;

    public class143(boolean arg0) {
        this.field1933 = arg0;
    }

    @ObfuscatedName("eo.c(Lkx;Lkx;I)I")
    public int method2893(class290 arg0, class290 arg1) {
        if (client.field738 == arg0.field3679 && client.field738 == arg1.field3679) {
            return this.field1933 ? arg0.field3678 - arg1.field3678 : arg1.field3678 - arg0.field3678;
        } else {
            return this.method4951(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2893((class290) arg0, (class290) arg1);
    }
}
