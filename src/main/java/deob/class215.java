package deob;

@ObfuscatedName("hm")
public class class215 {

    @ObfuscatedName("hm.f")
    public static int[] field2464 = new int[500];

    @ObfuscatedName("hm.w")
    public static int[] field2457 = new int[500];

    @ObfuscatedName("hm.v")
    public static int[] field2462 = new int[500];

    @ObfuscatedName("hm.s")
    public static int[] field2458 = new int[500];

    @ObfuscatedName("hm.z")
    public class219 field2456 = null;

    @ObfuscatedName("hm.j")
    public int field2461 = -1;

    @ObfuscatedName("hm.i")
    public int[] field2459;

    @ObfuscatedName("hm.n")
    public int[] field2463;

    @ObfuscatedName("hm.l")
    public int[] field2460;

    @ObfuscatedName("hm.k")
    public int[] field2465;

    @ObfuscatedName("hm.c")
    public boolean field2466 = false;

    public class215(byte[] arg0, class219 arg1) {
        this.field2456 = arg1;
        class474 var3 = new class474(arg0);
        class474 var4 = new class474(arg0);
        var3.field4939 = 2;
        int var5 = var3.method7964();
        int var6 = -1;
        int var7 = 0;
        var4.field4939 = var3.field4939 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method7964();
            if (var9 > 0) {
                if (this.field2456.field2527[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2456.field2527[var10] == 0) {
                            field2464[var7] = var10;
                            field2457[var7] = 0;
                            field2462[var7] = 0;
                            field2458[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2464[var7] = var8;
                short var11 = 0;
                if (this.field2456.field2527[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2457[var7] = var11;
                } else {
                    field2457[var7] = var4.method7978();
                }
                if ((var9 & 0x2) == 0) {
                    field2462[var7] = var11;
                } else {
                    field2462[var7] = var4.method7978();
                }
                if ((var9 & 0x4) == 0) {
                    field2458[var7] = var11;
                } else {
                    field2458[var7] = var4.method7978();
                }
                var6 = var8;
                var7++;
                if (this.field2456.field2527[var8] == 5) {
                    this.field2466 = true;
                }
            }
        }
        if (var4.field4939 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2461 = var7;
        this.field2459 = new int[var7];
        this.field2463 = new int[var7];
        this.field2460 = new int[var7];
        this.field2465 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2459[var12] = field2464[var12];
            this.field2463[var12] = field2457[var12];
            this.field2460[var12] = field2462[var12];
            this.field2465[var12] = field2458[var12];
        }
    }
}
