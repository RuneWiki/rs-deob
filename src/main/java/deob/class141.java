package deob;

@ObfuscatedName("ej")
public class class141 extends class286 {

    @ObfuscatedName("ej.c")
    public final boolean field1929;

    public class141(boolean arg0) {
        this.field1929 = arg0;
    }

    @ObfuscatedName("ej.c(Lkx;Lkx;I)I")
    public int method2865(class290 arg0, class290 arg1) {
        if (client.field738 == arg0.field3679 && client.field738 == arg1.field3679) {
            return this.field1929 ? arg0.method4943().method5077(arg1.method4943()) : arg1.method4943().method5077(arg0.method4943());
        } else {
            return this.method4951(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2865((class290) arg0, (class290) arg1);
    }
}
