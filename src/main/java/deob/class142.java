package deob;

@ObfuscatedName("eu")
public class class142 extends class286 {

    @ObfuscatedName("eu.f")
    public final boolean field1934;

    public class142(boolean arg0) {
        this.field1934 = arg0;
    }

    @ObfuscatedName("eu.f(Lkj;Lkj;B)I")
    public int method2976(class290 arg0, class290 arg1) {
        if (client.field683 == arg0.field3703) {
            if (client.field683 != arg1.field3703) {
                return this.field1934 ? -1 : 1;
            }
        } else if (client.field683 == arg1.field3703) {
            return this.field1934 ? 1 : -1;
        }
        return this.method5014(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2976((class290) arg0, (class290) arg1);
    }
}
