package deob;

@ObfuscatedName("ak")
public class class48 extends class205 {

    @ObfuscatedName("ak.w")
    public static class194 field1074 = new class194(64);

    @ObfuscatedName("ak.d")
    public int field1075;

    @ObfuscatedName("ak.c")
    public int field1076;

    @ObfuscatedName("ak.y")
    public int field1077;

    @ObfuscatedName("h.a(Lft;S)V")
    public static void method252(class168 arg0) {
        Statics.field1908 = arg0;
    }

    @ObfuscatedName("ak.w(Ldx;I)V")
    public void method1049(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method1050(arg0, var2);
        }
    }

    @ObfuscatedName("ak.d(Ldx;IS)V")
    public void method1050(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1075 = arg0.method2464();
            this.field1076 = arg0.method2462();
            this.field1077 = arg0.method2462();
        }
    }
}
