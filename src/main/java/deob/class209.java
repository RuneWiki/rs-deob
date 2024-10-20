package deob;

@ObfuscatedName("he")
public class class209 {

    @ObfuscatedName("he.i")
    public static int[] field2318 = new int[500];

    @ObfuscatedName("he.w")
    public static int[] field2310 = new int[500];

    @ObfuscatedName("he.s")
    public static int[] field2315 = new int[500];

    @ObfuscatedName("he.a")
    public static int[] field2313 = new int[500];

    @ObfuscatedName("he.o")
    public class212 field2314 = null;

    @ObfuscatedName("he.g")
    public int field2311 = -1;

    @ObfuscatedName("he.e")
    public int[] field2316;

    @ObfuscatedName("he.p")
    public int[] field2317;

    @ObfuscatedName("he.j")
    public int[] field2312;

    @ObfuscatedName("he.b")
    public int[] field2319;

    @ObfuscatedName("he.x")
    public boolean field2320 = false;

    public class209(byte[] arg0, class212 arg1) {
        this.field2314 = arg1;
        class401 var3 = new class401(arg0);
        class401 var4 = new class401(arg0);
        var3.field4300 = 2;
        int var5 = var3.method6240();
        int var6 = -1;
        int var7 = 0;
        var4.field4300 = var3.field4300 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method6240();
            if (var9 > 0) {
                if (this.field2314.field2371[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2314.field2371[var10] == 0) {
                            field2318[var7] = var10;
                            field2310[var7] = 0;
                            field2315[var7] = 0;
                            field2313[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2318[var7] = var8;
                short var11 = 0;
                if (this.field2314.field2371[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2310[var7] = var11;
                } else {
                    field2310[var7] = var4.method6253();
                }
                if ((var9 & 0x2) == 0) {
                    field2315[var7] = var11;
                } else {
                    field2315[var7] = var4.method6253();
                }
                if ((var9 & 0x4) == 0) {
                    field2313[var7] = var11;
                } else {
                    field2313[var7] = var4.method6253();
                }
                var6 = var8;
                var7++;
                if (this.field2314.field2371[var8] == 5) {
                    this.field2320 = true;
                }
            }
        }
        if (var4.field4300 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2311 = var7;
        this.field2316 = new int[var7];
        this.field2317 = new int[var7];
        this.field2312 = new int[var7];
        this.field2319 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2316[var12] = field2318[var12];
            this.field2317[var12] = field2310[var12];
            this.field2312[var12] = field2315[var12];
            this.field2319[var12] = field2313[var12];
        }
    }
}
