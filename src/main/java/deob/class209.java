package deob;

@ObfuscatedName("ht")
public class class209 {

    @ObfuscatedName("ht.n")
    public static int[] field2296 = new int[500];

    @ObfuscatedName("ht.c")
    public static int[] field2302 = new int[500];

    @ObfuscatedName("ht.m")
    public static int[] field2297 = new int[500];

    @ObfuscatedName("ht.k")
    public static int[] field2299 = new int[500];

    @ObfuscatedName("ht.o")
    public class212 field2298 = null;

    @ObfuscatedName("ht.g")
    public int field2301 = -1;

    @ObfuscatedName("ht.z")
    public int[] field2304;

    @ObfuscatedName("ht.a")
    public int[] field2303;

    @ObfuscatedName("ht.u")
    public int[] field2300;

    @ObfuscatedName("ht.e")
    public int[] field2305;

    @ObfuscatedName("ht.l")
    public boolean field2306 = false;

    public class209(byte[] arg0, class212 arg1) {
        this.field2298 = arg1;
        class400 var3 = new class400(arg0);
        class400 var4 = new class400(arg0);
        var3.field4272 = 2;
        int var5 = var3.method6217();
        int var6 = -1;
        int var7 = 0;
        var4.field4272 = var3.field4272 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method6217();
            if (var9 > 0) {
                if (this.field2298.field2358[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2298.field2358[var10] == 0) {
                            field2296[var7] = var10;
                            field2302[var7] = 0;
                            field2297[var7] = 0;
                            field2299[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2296[var7] = var8;
                short var11 = 0;
                if (this.field2298.field2358[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2302[var7] = var11;
                } else {
                    field2302[var7] = var4.method6230();
                }
                if ((var9 & 0x2) == 0) {
                    field2297[var7] = var11;
                } else {
                    field2297[var7] = var4.method6230();
                }
                if ((var9 & 0x4) == 0) {
                    field2299[var7] = var11;
                } else {
                    field2299[var7] = var4.method6230();
                }
                var6 = var8;
                var7++;
                if (this.field2298.field2358[var8] == 5) {
                    this.field2306 = true;
                }
            }
        }
        if (var4.field4272 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2301 = var7;
        this.field2304 = new int[var7];
        this.field2303 = new int[var7];
        this.field2300 = new int[var7];
        this.field2305 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2304[var12] = field2296[var12];
            this.field2303[var12] = field2302[var12];
            this.field2300[var12] = field2297[var12];
            this.field2305[var12] = field2299[var12];
        }
    }
}
