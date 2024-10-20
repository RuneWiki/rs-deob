package deob;

@ObfuscatedName("ho")
public class class209 {

    @ObfuscatedName("ho.a")
    public static int[] field2382 = new int[500];

    @ObfuscatedName("ho.f")
    public static int[] field2380 = new int[500];

    @ObfuscatedName("ho.c")
    public static int[] field2378 = new int[500];

    @ObfuscatedName("ho.x")
    public static int[] field2379 = new int[500];

    @ObfuscatedName("ho.h")
    public class213 field2377 = null;

    @ObfuscatedName("ho.j")
    public int field2381 = -1;

    @ObfuscatedName("ho.y")
    public int[] field2385;

    @ObfuscatedName("ho.d")
    public int[] field2383;

    @ObfuscatedName("ho.n")
    public int[] field2384;

    @ObfuscatedName("ho.r")
    public int[] field2376;

    @ObfuscatedName("ho.l")
    public boolean field2386 = false;

    public class209(byte[] arg0, class213 arg1) {
        this.field2377 = arg1;
        class464 var3 = new class464(arg0);
        class464 var4 = new class464(arg0);
        var3.field4864 = 2;
        int var5 = var3.method7735();
        int var6 = -1;
        int var7 = 0;
        var4.field4864 = var3.field4864 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method7735();
            if (var9 > 0) {
                if (this.field2377.field2450[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2377.field2450[var10] == 0) {
                            field2382[var7] = var10;
                            field2380[var7] = 0;
                            field2378[var7] = 0;
                            field2379[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2382[var7] = var8;
                short var11 = 0;
                if (this.field2377.field2450[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2380[var7] = var11;
                } else {
                    field2380[var7] = var4.method7813();
                }
                if ((var9 & 0x2) == 0) {
                    field2378[var7] = var11;
                } else {
                    field2378[var7] = var4.method7813();
                }
                if ((var9 & 0x4) == 0) {
                    field2379[var7] = var11;
                } else {
                    field2379[var7] = var4.method7813();
                }
                var6 = var8;
                var7++;
                if (this.field2377.field2450[var8] == 5) {
                    this.field2386 = true;
                }
            }
        }
        if (var4.field4864 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2381 = var7;
        this.field2385 = new int[var7];
        this.field2383 = new int[var7];
        this.field2384 = new int[var7];
        this.field2376 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2385[var12] = field2382[var12];
            this.field2383[var12] = field2380[var12];
            this.field2384[var12] = field2378[var12];
            this.field2376[var12] = field2379[var12];
        }
    }
}
