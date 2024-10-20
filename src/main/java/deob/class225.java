package deob;

@ObfuscatedName("ia")
public class class225 {

    @ObfuscatedName("ia.au")
    public static int[] field2503 = new int[500];

    @ObfuscatedName("ia.ae")
    public static int[] field2497 = new int[500];

    @ObfuscatedName("ia.ao")
    public static int[] field2499 = new int[500];

    @ObfuscatedName("ia.at")
    public static int[] field2502 = new int[500];

    @ObfuscatedName("ia.ac")
    public class230 field2498 = null;

    @ObfuscatedName("ia.ai")
    public int field2501 = -1;

    @ObfuscatedName("ia.az")
    public int[] field2500;

    @ObfuscatedName("ia.ap")
    public int[] field2504;

    @ObfuscatedName("ia.aa")
    public int[] field2505;

    @ObfuscatedName("ia.af")
    public int[] field2506;

    @ObfuscatedName("ia.ad")
    public boolean field2507 = false;

    public class225(byte[] arg0, class230 arg1) {
        this.field2498 = arg1;
        class515 var3 = new class515(arg0);
        class515 var4 = new class515(arg0);
        var3.field5111 = 2;
        int var5 = var3.method8300();
        int var6 = -1;
        int var7 = 0;
        var4.field5111 = var3.field5111 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8300();
            if (var9 > 0) {
                if (this.field2498.field2559[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2498.field2559[var10] == 0) {
                            field2503[var7] = var10;
                            field2497[var7] = 0;
                            field2499[var7] = 0;
                            field2502[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2503[var7] = var8;
                short var11 = 0;
                if (this.field2498.field2559[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2497[var7] = var11;
                } else {
                    field2497[var7] = var4.method8315();
                }
                if ((var9 & 0x2) == 0) {
                    field2499[var7] = var11;
                } else {
                    field2499[var7] = var4.method8315();
                }
                if ((var9 & 0x4) == 0) {
                    field2502[var7] = var11;
                } else {
                    field2502[var7] = var4.method8315();
                }
                var6 = var8;
                var7++;
                if (this.field2498.field2559[var8] == 5) {
                    this.field2507 = true;
                }
            }
        }
        if (var4.field5111 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2501 = var7;
        this.field2500 = new int[var7];
        this.field2504 = new int[var7];
        this.field2505 = new int[var7];
        this.field2506 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2500[var12] = field2503[var12];
            this.field2504[var12] = field2497[var12];
            this.field2505[var12] = field2499[var12];
            this.field2506[var12] = field2502[var12];
        }
    }
}
