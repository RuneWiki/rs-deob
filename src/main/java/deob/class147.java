package deob;

@ObfuscatedName("ea")
public class class147 extends class290 {

    @ObfuscatedName("ea.a")
    public final boolean field1954;

    public class147(boolean arg0) {
        this.field1954 = arg0;
    }

    @ObfuscatedName("ea.a(Lkl;Lkl;I)I")
    public int method3125(class294 arg0, class294 arg1) {
        if (client.field650 == arg0.field3713) {
            if (client.field650 != arg1.field3713) {
                return this.field1954 ? -1 : 1;
            }
        } else if (client.field650 == arg1.field3713) {
            return this.field1954 ? 1 : -1;
        }
        return this.method5117(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3125((class294) arg0, (class294) arg1);
    }
}
