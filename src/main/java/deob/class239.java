package deob;

@ObfuscatedName("ji")
public class class239 {

    @ObfuscatedName("ji.ac")
    public static int[] field2526 = new int[500];

    @ObfuscatedName("ji.al")
    public static int[] field2517 = new int[500];

    @ObfuscatedName("ji.ak")
    public static int[] field2518 = new int[500];

    @ObfuscatedName("ji.ax")
    public static int[] field2519 = new int[500];

    @ObfuscatedName("ji.ao")
    public class244 field2520 = null;

    @ObfuscatedName("ji.ah")
    public int field2521 = -1;

    @ObfuscatedName("ji.ar")
    public int[] field2522;

    @ObfuscatedName("ji.ab")
    public int[] field2516;

    @ObfuscatedName("ji.am")
    public int[] field2523;

    @ObfuscatedName("ji.av")
    public int[] field2525;

    @ObfuscatedName("ji.ag")
    public boolean field2524 = false;

    public class239(byte[] arg0, class244 arg1) {
        this.field2520 = arg1;
        class530 var3 = new class530(arg0);
        class530 var4 = new class530(arg0);
        var3.field5140 = 2;
        int var5 = var3.method8365();
        int var6 = -1;
        int var7 = 0;
        var4.field5140 = var3.field5140 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8365();
            if (var9 > 0) {
                if (this.field2520.field2580[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2520.field2580[var10] == 0) {
                            field2526[var7] = var10;
                            field2517[var7] = 0;
                            field2518[var7] = 0;
                            field2519[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2526[var7] = var8;
                short var11 = 0;
                if (this.field2520.field2580[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2517[var7] = var11;
                } else {
                    field2517[var7] = var4.method8480();
                }
                if ((var9 & 0x2) == 0) {
                    field2518[var7] = var11;
                } else {
                    field2518[var7] = var4.method8480();
                }
                if ((var9 & 0x4) == 0) {
                    field2519[var7] = var11;
                } else {
                    field2519[var7] = var4.method8480();
                }
                var6 = var8;
                var7++;
                if (this.field2520.field2580[var8] == 5) {
                    this.field2524 = true;
                }
            }
        }
        if (var4.field5140 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2521 = var7;
        this.field2522 = new int[var7];
        this.field2516 = new int[var7];
        this.field2523 = new int[var7];
        this.field2525 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2522[var12] = field2526[var12];
            this.field2516[var12] = field2517[var12];
            this.field2523[var12] = field2518[var12];
            this.field2525[var12] = field2519[var12];
        }
    }
}
