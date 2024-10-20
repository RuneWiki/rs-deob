package deob;

@ObfuscatedName("aj")
public class class174 extends class7 {

    @ObfuscatedName("aj.b")
    public int field2672;

    @ObfuscatedName("aj.c")
    public static class75 field2671 = new class75(64);

    @ObfuscatedName("aj.m")
    public int field2674;

    @ObfuscatedName("aj.i")
    public int field2673;

    @ObfuscatedName("aj.c(Ldv;I)V")
    public void method3146(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3147(arg0, var2);
        }
    }

    @ObfuscatedName("aj.b(Ldv;IB)V")
    public void method3147(class28 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2672 = arg0.method349();
            this.field2673 = arg0.method450();
            this.field2674 = arg0.method450();
        }
    }

    @ObfuscatedName("x.v(Lel;B)V")
    public static void method1510(class87 arg0) {
        Statics.field2670 = arg0;
    }

    @ObfuscatedName("ai.i(I)V")
    public static void method3144() {
        field2671.method1188();
    }
}
