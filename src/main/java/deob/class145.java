package deob;

@ObfuscatedName("es")
public class class145 extends class286 {

    @ObfuscatedName("es.v")
    public final boolean field1943;

    public class145(boolean arg0) {
        this.field1943 = arg0;
    }

    @ObfuscatedName("es.v(Lkx;Lkx;I)I")
    public int method2925(class290 arg0, class290 arg1) {
        if (arg0.field3664 == 0) {
            if (arg1.field3664 != 0) {
                return this.field1943 ? 1 : -1;
            }
        } else if (arg1.field3664 == 0) {
            return this.field1943 ? -1 : 1;
        }
        return this.method4967(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2925((class290) arg0, (class290) arg1);
    }
}
