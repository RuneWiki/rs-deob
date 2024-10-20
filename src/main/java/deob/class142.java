package deob;

@ObfuscatedName("ev")
public class class142 extends class286 {

    @ObfuscatedName("ev.v")
    public final boolean field1931;

    public class142(boolean arg0) {
        this.field1931 = arg0;
    }

    @ObfuscatedName("ev.v(Lkx;Lkx;B)I")
    public int method2904(class290 arg0, class290 arg1) {
        if (client.field711 == arg0.field3664) {
            if (client.field711 != arg1.field3664) {
                return this.field1931 ? -1 : 1;
            }
        } else if (client.field711 == arg1.field3664) {
            return this.field1931 ? 1 : -1;
        }
        return this.method4967(arg0, arg1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method2904((class290) arg0, (class290) arg1);
    }
}
