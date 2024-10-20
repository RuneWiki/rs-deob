package deob;

@ObfuscatedName("hf")
public class class229 {

    @ObfuscatedName("hf.v")
    public static int[] field2516 = new int[500];

    @ObfuscatedName("hf.c")
    public static int[] field2518 = new int[500];

    @ObfuscatedName("hf.i")
    public static int[] field2517 = new int[500];

    @ObfuscatedName("hf.f")
    public static int[] field2524 = new int[500];

    @ObfuscatedName("hf.b")
    public class233 field2515 = null;

    @ObfuscatedName("hf.n")
    public int field2520 = -1;

    @ObfuscatedName("hf.s")
    public int[] field2521;

    @ObfuscatedName("hf.l")
    public int[] field2522;

    @ObfuscatedName("hf.q")
    public int[] field2523;

    @ObfuscatedName("hf.o")
    public int[] field2519;

    @ObfuscatedName("hf.r")
    public boolean field2525 = false;

    public class229(byte[] arg0, class233 arg1) {
        this.field2515 = arg1;
        class438 var3 = new class438(arg0);
        class438 var4 = new class438(arg0);
        var3.field4621 = 2;
        int var5 = var3.method6971();
        int var6 = -1;
        int var7 = 0;
        var4.field4621 = var3.field4621 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method6971();
            if (var9 > 0) {
                if (this.field2515.field2583[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2515.field2583[var10] == 0) {
                            field2516[var7] = var10;
                            field2518[var7] = 0;
                            field2517[var7] = 0;
                            field2524[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2516[var7] = var8;
                short var11 = 0;
                if (this.field2515.field2583[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2518[var7] = var11;
                } else {
                    field2518[var7] = var4.method7024();
                }
                if ((var9 & 0x2) == 0) {
                    field2517[var7] = var11;
                } else {
                    field2517[var7] = var4.method7024();
                }
                if ((var9 & 0x4) == 0) {
                    field2524[var7] = var11;
                } else {
                    field2524[var7] = var4.method7024();
                }
                var6 = var8;
                var7++;
                if (this.field2515.field2583[var8] == 5) {
                    this.field2525 = true;
                }
            }
        }
        if (var4.field4621 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2520 = var7;
        this.field2521 = new int[var7];
        this.field2522 = new int[var7];
        this.field2523 = new int[var7];
        this.field2519 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2521[var12] = field2516[var12];
            this.field2522[var12] = field2518[var12];
            this.field2523[var12] = field2517[var12];
            this.field2519[var12] = field2524[var12];
        }
    }
}
