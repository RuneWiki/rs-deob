package deob;

@ObfuscatedName("ax")
public class class51 extends class204 {

    @ObfuscatedName("ax.d")
    public static class193 field1100 = new class193(64);

    @ObfuscatedName("ax.g")
    public int field1099 = 0;

    @ObfuscatedName("an.y(Lfu;I)V")
    public static void method882(class167 arg0) {
        Statics.field1106 = arg0;
    }

    @ObfuscatedName("ax.d(Ldd;I)V")
    public void method983(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method984(arg0, var2);
        }
    }

    @ObfuscatedName("ax.g(Ldd;II)V")
    public void method984(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1099 = arg0.method2525();
        }
    }
}
