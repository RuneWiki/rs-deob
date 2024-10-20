package deob;

@ObfuscatedName("gu")
public class class194 {

    @ObfuscatedName("gu.v")
    public static int[] field2230 = new int[500];

    @ObfuscatedName("gu.n")
    public static int[] field2226 = new int[500];

    @ObfuscatedName("gu.f")
    public static int[] field2227 = new int[500];

    @ObfuscatedName("gu.y")
    public static int[] field2225 = new int[500];

    @ObfuscatedName("gu.p")
    public class197 field2228 = null;

    @ObfuscatedName("gu.j")
    public int field2231 = -1;

    @ObfuscatedName("gu.r")
    public int[] field2229;

    @ObfuscatedName("gu.b")
    public int[] field2232;

    @ObfuscatedName("gu.d")
    public int[] field2233;

    @ObfuscatedName("gu.s")
    public int[] field2234;

    @ObfuscatedName("gu.u")
    public boolean field2235 = false;

    public class194(byte[] arg0, class197 arg1) {
        this.field2228 = arg1;
        class383 var3 = new class383(arg0);
        class383 var4 = new class383(arg0);
        var3.field4158 = 2;
        int var5 = var3.method5965();
        int var6 = -1;
        int var7 = 0;
        var4.field4158 = var3.field4158 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5965();
            if (var9 > 0) {
                if (this.field2228.field2289[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2228.field2289[var10] == 0) {
                            field2230[var7] = var10;
                            field2226[var7] = 0;
                            field2227[var7] = 0;
                            field2225[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2230[var7] = var8;
                short var11 = 0;
                if (this.field2228.field2289[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2226[var7] = var11;
                } else {
                    field2226[var7] = var4.method5978();
                }
                if ((var9 & 0x2) == 0) {
                    field2227[var7] = var11;
                } else {
                    field2227[var7] = var4.method5978();
                }
                if ((var9 & 0x4) == 0) {
                    field2225[var7] = var11;
                } else {
                    field2225[var7] = var4.method5978();
                }
                var6 = var8;
                var7++;
                if (this.field2228.field2289[var8] == 5) {
                    this.field2235 = true;
                }
            }
        }
        if (var4.field4158 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2231 = var7;
        this.field2229 = new int[var7];
        this.field2232 = new int[var7];
        this.field2233 = new int[var7];
        this.field2234 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2229[var12] = field2230[var12];
            this.field2232[var12] = field2226[var12];
            this.field2233[var12] = field2227[var12];
            this.field2234[var12] = field2225[var12];
        }
    }
}
