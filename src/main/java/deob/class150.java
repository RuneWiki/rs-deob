package deob;

@ObfuscatedName("ee")
public class class150 extends class347 {

    @ObfuscatedName("ee.n")
    public static class221 field1704 = new class221(64);

    @ObfuscatedName("ee.f")
    public int field1705;

    @ObfuscatedName("ee.y")
    public int field1707;

    @ObfuscatedName("ee.p")
    public int field1706;

    @ObfuscatedName("ee.j")
    public static final int[] field1703 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1703[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("du.v(Ljv;I)V")
    public static void method2253(class275 arg0) {
        Statics.field1708 = arg0;
    }

    @ObfuscatedName("mv.n(II)Lee;")
    public static class150 method5733(int arg0) {
        class150 var1 = (class150) field1704.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1708.method4468(14, arg0);
        class150 var3 = new class150();
        if (var2 != null) {
            var3.method2600(new class383(var2));
        }
        field1704.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ee.f(Lnd;I)V")
    public void method2600(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2610(arg0, var2);
        }
    }

    @ObfuscatedName("ee.y(Lnd;II)V")
    public void method2610(class383 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1705 = arg0.method5967();
            this.field1707 = arg0.method5965();
            this.field1706 = arg0.method5965();
        }
    }

    @ObfuscatedName("cx.p(S)V")
    public static void method1996() {
        field1704.method3957();
    }
}
