package deob;

@ObfuscatedName("gu")
public class class192 {

    @ObfuscatedName("gu.c")
    public static int[] field2224 = new int[500];

    @ObfuscatedName("gu.b")
    public static int[] field2221 = new int[500];

    @ObfuscatedName("gu.p")
    public static int[] field2225 = new int[500];

    @ObfuscatedName("gu.m")
    public static int[] field2220 = new int[500];

    @ObfuscatedName("gu.t")
    public class196 field2219 = null;

    @ObfuscatedName("gu.s")
    public int field2222 = -1;

    @ObfuscatedName("gu.j")
    public int[] field2223;

    @ObfuscatedName("gu.w")
    public int[] field2226;

    @ObfuscatedName("gu.n")
    public int[] field2217;

    @ObfuscatedName("gu.r")
    public int[] field2218;

    @ObfuscatedName("gu.o")
    public boolean field2227 = false;

    public class192(byte[] arg0, class196 arg1) {
        this.field2219 = arg1;
        class419 var3 = new class419(arg0);
        class419 var4 = new class419(arg0);
        var3.field4475 = 2;
        int var5 = var3.method6781();
        int var6 = -1;
        int var7 = 0;
        var4.field4475 = var3.field4475 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method6781();
            if (var9 > 0) {
                if (this.field2219.field2289[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2219.field2289[var10] == 0) {
                            field2224[var7] = var10;
                            field2221[var7] = 0;
                            field2225[var7] = 0;
                            field2220[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2224[var7] = var8;
                short var11 = 0;
                if (this.field2219.field2289[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2221[var7] = var11;
                } else {
                    field2221[var7] = var4.method6799();
                }
                if ((var9 & 0x2) == 0) {
                    field2225[var7] = var11;
                } else {
                    field2225[var7] = var4.method6799();
                }
                if ((var9 & 0x4) == 0) {
                    field2220[var7] = var11;
                } else {
                    field2220[var7] = var4.method6799();
                }
                var6 = var8;
                var7++;
                if (this.field2219.field2289[var8] == 5) {
                    this.field2227 = true;
                }
            }
        }
        if (var4.field4475 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2222 = var7;
        this.field2223 = new int[var7];
        this.field2226 = new int[var7];
        this.field2217 = new int[var7];
        this.field2218 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2223[var12] = field2224[var12];
            this.field2226[var12] = field2221[var12];
            this.field2217[var12] = field2225[var12];
            this.field2218[var12] = field2220[var12];
        }
    }
}
