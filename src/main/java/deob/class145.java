package deob;

@ObfuscatedName("ed")
public class class145 extends class286 {

    @ObfuscatedName("ed.g")
    public final boolean field1947;

    public class145(boolean arg0) {
        this.field1947 = arg0;
    }

    @ObfuscatedName("ed.g(Lkv;Lkv;B)I")
    public int method3111(class290 arg0, class290 arg1) {
        if (arg0.field3709 == 0) {
            if (arg1.field3709 != 0) {
                return this.field1947 ? 1 : -1;
            }
        } else if (arg1.field3709 == 0) {
            return this.field1947 ? -1 : 1;
        }
        return this.method5152(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3111((class290) arg0, (class290) arg1);
    }
}
