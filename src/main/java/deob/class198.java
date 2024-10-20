package deob;

@ObfuscatedName("hq")
public class class198 extends class439 {

    @ObfuscatedName("hq.al")
    public static class276 field2075 = new class276(64);

    @ObfuscatedName("hq.ac")
    public int field2078;

    @ObfuscatedName("hq.ab")
    public int field2077;

    @ObfuscatedName("hq.an")
    public int field2074;

    @ObfuscatedName("hq.ao")
    public static final int[] field2079 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2079[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("hq.al(Lsy;B)V")
    public void method3437(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3435(arg0, var2);
        }
    }

    @ObfuscatedName("hq.ac(Lsy;II)V")
    public void method3435(class478 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2078 = arg0.method7905();
            this.field2077 = arg0.method7909();
            this.field2074 = arg0.method7909();
        }
    }

    @ObfuscatedName("gz.ab(I)V")
    public static void method3082() {
        field2075.method4930();
    }
}
