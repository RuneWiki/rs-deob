package deob;

@ObfuscatedName("gv")
public class class184 extends class407 {

    @ObfuscatedName("gv.p")
    public static class257 field2021 = new class257(64);

    @ObfuscatedName("gv.f")
    public int field2022;

    @ObfuscatedName("gv.n")
    public int field2023;

    @ObfuscatedName("gv.k")
    public int field2024;

    @ObfuscatedName("gv.w")
    public static final int[] field2025 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2025[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("gv.c(Lqq;S)V")
    public void method3338(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3339(arg0, var2);
        }
    }

    @ObfuscatedName("gv.p(Lqq;IB)V")
    public void method3339(class445 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2022 = arg0.method7198();
            this.field2023 = arg0.method7196();
            this.field2024 = arg0.method7196();
        }
    }
}
