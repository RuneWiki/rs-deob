package deob;

@ObfuscatedName("ei")
public class class145 extends class286 {

    @ObfuscatedName("ei.y")
    public final boolean field1937;

    public class145(boolean arg0) {
        this.field1937 = arg0;
    }

    @ObfuscatedName("ei.y(Lkk;Lkk;I)I")
    public int method2922(class290 arg0, class290 arg1) {
        if (arg0.field3686 == 0) {
            if (arg1.field3686 != 0) {
                return this.field1937 ? 1 : -1;
            }
        } else if (arg1.field3686 == 0) {
            return this.field1937 ? -1 : 1;
        }
        return this.method4980(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2922((class290) arg0, (class290) arg1);
    }
}
