package deob;

@ObfuscatedName("iw")
public class class224 {

    @ObfuscatedName("iw.at")
    public static int[] field2491 = new int[500];

    @ObfuscatedName("iw.an")
    public static int[] field2483 = new int[500];

    @ObfuscatedName("iw.av")
    public static int[] field2484 = new int[500];

    @ObfuscatedName("iw.as")
    public static int[] field2485 = new int[500];

    @ObfuscatedName("iw.ax")
    public class229 field2486 = null;

    @ObfuscatedName("iw.ap")
    public int field2490 = -1;

    @ObfuscatedName("iw.ab")
    public int[] field2488;

    @ObfuscatedName("iw.ak")
    public int[] field2487;

    @ObfuscatedName("iw.ae")
    public int[] field2489;

    @ObfuscatedName("iw.af")
    public int[] field2482;

    @ObfuscatedName("iw.ao")
    public boolean field2492 = false;

    public class224(byte[] arg0, class229 arg1) {
        this.field2486 = arg1;
        class501 var3 = new class501(arg0);
        class501 var4 = new class501(arg0);
        var3.field5017 = 2;
        int var5 = var3.method8129();
        int var6 = -1;
        int var7 = 0;
        var4.field5017 = var3.field5017 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8129();
            if (var9 > 0) {
                if (this.field2486.field2537[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2486.field2537[var10] == 0) {
                            field2491[var7] = var10;
                            field2483[var7] = 0;
                            field2484[var7] = 0;
                            field2485[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2491[var7] = var8;
                short var11 = 0;
                if (this.field2486.field2537[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2483[var7] = var11;
                } else {
                    field2483[var7] = var4.method8143();
                }
                if ((var9 & 0x2) == 0) {
                    field2484[var7] = var11;
                } else {
                    field2484[var7] = var4.method8143();
                }
                if ((var9 & 0x4) == 0) {
                    field2485[var7] = var11;
                } else {
                    field2485[var7] = var4.method8143();
                }
                var6 = var8;
                var7++;
                if (this.field2486.field2537[var8] == 5) {
                    this.field2492 = true;
                }
            }
        }
        if (var4.field5017 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2490 = var7;
        this.field2488 = new int[var7];
        this.field2487 = new int[var7];
        this.field2489 = new int[var7];
        this.field2482 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2488[var12] = field2491[var12];
            this.field2487[var12] = field2483[var12];
            this.field2489[var12] = field2484[var12];
            this.field2482[var12] = field2485[var12];
        }
    }
}
