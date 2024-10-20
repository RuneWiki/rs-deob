package deob;

@ObfuscatedName("ay")
public class class43 extends class185 {

    @ObfuscatedName("ay.j")
    public static class174 field978 = new class174(64);

    @ObfuscatedName("ay.y")
    public int field979;

    @ObfuscatedName("ay.r")
    public int field984;

    @ObfuscatedName("ay.f")
    public int field981;

    @ObfuscatedName("y.c(Ler;B)V")
    public static void method21(class149 arg0) {
        Statics.field983 = arg0;
    }

    @ObfuscatedName("ay.j(Ldx;B)V")
    public void method804(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method800(arg0, var2);
        }
    }

    @ObfuscatedName("ay.y(Ldx;IB)V")
    public void method800(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field979 = arg0.method2136();
            this.field984 = arg0.method2134();
            this.field981 = arg0.method2134();
        }
    }
}
