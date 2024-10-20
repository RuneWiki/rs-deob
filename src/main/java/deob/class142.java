package deob;

@ObfuscatedName("eg")
public class class142 extends class286 {

    @ObfuscatedName("eg.y")
    public final boolean field1925;

    public class142(boolean arg0) {
        this.field1925 = arg0;
    }

    @ObfuscatedName("eg.y(Lkk;Lkk;B)I")
    public int method2904(class290 arg0, class290 arg1) {
        if (client.field627 == arg0.field3686) {
            if (client.field627 != arg1.field3686) {
                return this.field1925 ? -1 : 1;
            }
        } else if (client.field627 == arg1.field3686) {
            return this.field1925 ? 1 : -1;
        }
        return this.method4980(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2904((class290) arg0, (class290) arg1);
    }
}
