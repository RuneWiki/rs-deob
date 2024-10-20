package deob;

@ObfuscatedName("gp")
public class class196 {

    @ObfuscatedName("gp.s")
    public static int[] field2221 = new int[500];

    @ObfuscatedName("gp.t")
    public static int[] field2213 = new int[500];

    @ObfuscatedName("gp.v")
    public static int[] field2214 = new int[500];

    @ObfuscatedName("gp.j")
    public static int[] field2215 = new int[500];

    @ObfuscatedName("gp.l")
    public class199 field2216 = null;

    @ObfuscatedName("gp.n")
    public int field2212 = -1;

    @ObfuscatedName("gp.w")
    public int[] field2218;

    @ObfuscatedName("gp.f")
    public int[] field2217;

    @ObfuscatedName("gp.o")
    public int[] field2220;

    @ObfuscatedName("gp.x")
    public int[] field2219;

    @ObfuscatedName("gp.r")
    public boolean field2222 = false;

    public class196(byte[] arg0, class199 arg1) {
        this.field2216 = arg1;
        class385 var3 = new class385(arg0);
        class385 var4 = new class385(arg0);
        var3.field4182 = 2;
        int var5 = var3.method5958();
        int var6 = -1;
        int var7 = 0;
        var4.field4182 = var3.field4182 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5958();
            if (var9 > 0) {
                if (this.field2216.field2274[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2216.field2274[var10] == 0) {
                            field2221[var7] = var10;
                            field2213[var7] = 0;
                            field2214[var7] = 0;
                            field2215[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2221[var7] = var8;
                short var11 = 0;
                if (this.field2216.field2274[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2213[var7] = var11;
                } else {
                    field2213[var7] = var4.method5971();
                }
                if ((var9 & 0x2) == 0) {
                    field2214[var7] = var11;
                } else {
                    field2214[var7] = var4.method5971();
                }
                if ((var9 & 0x4) == 0) {
                    field2215[var7] = var11;
                } else {
                    field2215[var7] = var4.method5971();
                }
                var6 = var8;
                var7++;
                if (this.field2216.field2274[var8] == 5) {
                    this.field2222 = true;
                }
            }
        }
        if (var4.field4182 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2212 = var7;
        this.field2218 = new int[var7];
        this.field2217 = new int[var7];
        this.field2220 = new int[var7];
        this.field2219 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2218[var12] = field2221[var12];
            this.field2217[var12] = field2213[var12];
            this.field2220[var12] = field2214[var12];
            this.field2219[var12] = field2215[var12];
        }
    }
}
