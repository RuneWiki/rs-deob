package deob;

@ObfuscatedName("hm")
public class class201 extends class457 {

    @ObfuscatedName("hm.an")
    public static class287 field2096 = new class287(64);

    @ObfuscatedName("hm.av")
    public int field2100;

    @ObfuscatedName("hm.as")
    public int field2099;

    @ObfuscatedName("hm.ax")
    public int field2098;

    @ObfuscatedName("hm.ap")
    public static final int[] field2101 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2101[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("hm.at(Ltz;I)V")
    public void method3483(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3490(arg0, var2);
        }
    }

    @ObfuscatedName("hm.an(Ltz;IB)V")
    public void method3490(class501 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2100 = arg0.method8195();
            this.field2099 = arg0.method8129();
            this.field2098 = arg0.method8129();
        }
    }

    @ObfuscatedName("dt.av(B)V")
    public static void method2113() {
        field2096.method5124();
    }
}
