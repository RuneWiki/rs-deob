package deob;

@ObfuscatedName("ep")
public class class145 extends class286 {

    @ObfuscatedName("ep.f")
    public final boolean field1932;

    public class145(boolean arg0) {
        this.field1932 = arg0;
    }

    @ObfuscatedName("ep.f(Lkd;Lkd;I)I")
    public int method2963(class290 arg0, class290 arg1) {
        if (arg0.field3696 == 0) {
            if (arg1.field3696 != 0) {
                return this.field1932 ? 1 : -1;
            }
        } else if (arg1.field3696 == 0) {
            return this.field1932 ? -1 : 1;
        }
        return this.method4946(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2963((class290) arg0, (class290) arg1);
    }
}
