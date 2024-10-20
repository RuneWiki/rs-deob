package deob;

@ObfuscatedName("ez")
public class class142 extends class286 {

    @ObfuscatedName("ez.c")
    public final boolean field1931;

    public class142(boolean arg0) {
        this.field1931 = arg0;
    }

    @ObfuscatedName("ez.c(Lkx;Lkx;B)I")
    public int method2878(class290 arg0, class290 arg1) {
        if (client.field738 == arg0.field3679) {
            if (client.field738 != arg1.field3679) {
                return this.field1931 ? -1 : 1;
            }
        } else if (client.field738 == arg1.field3679) {
            return this.field1931 ? 1 : -1;
        }
        return this.method4951(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2878((class290) arg0, (class290) arg1);
    }
}
