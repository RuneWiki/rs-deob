package deob;

@ObfuscatedName("aj")
public class class47 extends class185 {

    @ObfuscatedName("aj.m")
    public static class174 field1074 = new class174(64);

    @ObfuscatedName("aj.e")
    public int field1078 = 0;

    @ObfuscatedName("a.x(Ley;I)V")
    public static void method535(class149 arg0) {
        Statics.field1073 = arg0;
        Statics.field699 = Statics.field1073.method2741(16);
    }

    @ObfuscatedName("aj.v(Ldm;I)V")
    public void method914(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method924(arg0, var2);
        }
    }

    @ObfuscatedName("aj.m(Ldm;II)V")
    public void method924(class108 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1078 = arg0.method2129();
        }
    }
}
