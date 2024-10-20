package deob;

@ObfuscatedName("fn")
public class class164 extends class286 {

    @ObfuscatedName("fn.n")
    public final boolean field1994;

    public class164(boolean arg0) {
        this.field1994 = arg0;
    }

    @ObfuscatedName("fn.n(Lky;Lky;I)I")
    public int method3301(class290 arg0, class290 arg1) {
        if (client.field844 == arg0.field3645 && client.field844 == arg1.field3645) {
            return this.field1994 ? arg0.field3647 - arg1.field3647 : arg1.field3647 - arg0.field3647;
        } else {
            return this.method4862(arg0, arg1);
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3301((class290) arg0, (class290) arg1);
    }
}
