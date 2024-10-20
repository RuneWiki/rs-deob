package deob;

@ObfuscatedName("jb")
public class class241 {

    @ObfuscatedName("jb.az")
    public static int[] field2583 = new int[500];

    @ObfuscatedName("jb.ah")
    public static int[] field2574 = new int[500];

    @ObfuscatedName("jb.af")
    public static int[] field2575 = new int[500];

    @ObfuscatedName("jb.at")
    public static int[] field2577 = new int[500];

    @ObfuscatedName("jb.an")
    public class246 field2582 = null;

    @ObfuscatedName("jb.ao")
    public int field2576 = -1;

    @ObfuscatedName("jb.ab")
    public int[] field2579;

    @ObfuscatedName("jb.aw")
    public int[] field2580;

    @ObfuscatedName("jb.ad")
    public int[] field2581;

    @ObfuscatedName("jb.al")
    public int[] field2578;

    @ObfuscatedName("jb.as")
    public boolean field2573 = false;

    public class241(byte[] arg0, class246 arg1) {
        this.field2582 = arg1;
        class535 var3 = new class535(arg0);
        class535 var4 = new class535(arg0);
        var3.field5233 = 2;
        int var5 = var3.method8462();
        int var6 = -1;
        int var7 = 0;
        var4.field5233 = var3.field5233 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8462();
            if (var9 > 0) {
                if (this.field2582.field2630[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2582.field2630[var10] == 0) {
                            field2583[var7] = var10;
                            field2574[var7] = 0;
                            field2575[var7] = 0;
                            field2577[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2583[var7] = var8;
                short var11 = 0;
                if (this.field2582.field2630[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2574[var7] = var11;
                } else {
                    field2574[var7] = var4.method8477();
                }
                if ((var9 & 0x2) == 0) {
                    field2575[var7] = var11;
                } else {
                    field2575[var7] = var4.method8477();
                }
                if ((var9 & 0x4) == 0) {
                    field2577[var7] = var11;
                } else {
                    field2577[var7] = var4.method8477();
                }
                var6 = var8;
                var7++;
                if (this.field2582.field2630[var8] == 5) {
                    this.field2573 = true;
                }
            }
        }
        if (var4.field5233 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2576 = var7;
        this.field2579 = new int[var7];
        this.field2580 = new int[var7];
        this.field2581 = new int[var7];
        this.field2578 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2579[var12] = field2583[var12];
            this.field2580[var12] = field2574[var12];
            this.field2581[var12] = field2575[var12];
            this.field2578[var12] = field2577[var12];
        }
    }
}
