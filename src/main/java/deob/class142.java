package deob;

@ObfuscatedName("ef")
public class class142 extends class286 {

    @ObfuscatedName("ef.f")
    public final boolean field1923;

    public class142(boolean arg0) {
        this.field1923 = arg0;
    }

    @ObfuscatedName("ef.f(Lkd;Lkd;I)I")
    public int method2936(class290 arg0, class290 arg1) {
        if (client.field610 == arg0.field3696) {
            if (client.field610 != arg1.field3696) {
                return this.field1923 ? -1 : 1;
            }
        } else if (client.field610 == arg1.field3696) {
            return this.field1923 ? 1 : -1;
        }
        return this.method4946(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2936((class290) arg0, (class290) arg1);
    }
}
