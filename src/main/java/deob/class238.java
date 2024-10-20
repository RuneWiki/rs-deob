package deob;

@ObfuscatedName("jg")
public class class238 {

    @ObfuscatedName("jg.ap")
    public static int[] field2554 = new int[500];

    @ObfuscatedName("jg.aw")
    public static int[] field2557 = new int[500];

    @ObfuscatedName("jg.ak")
    public static int[] field2559 = new int[500];

    @ObfuscatedName("jg.aj")
    public static int[] field2555 = new int[500];

    @ObfuscatedName("jg.ai")
    public class244 field2553 = null;

    @ObfuscatedName("jg.ay")
    public int field2552 = -1;

    @ObfuscatedName("jg.as")
    public int[] field2558;

    @ObfuscatedName("jg.ae")
    public int[] field2556;

    @ObfuscatedName("jg.am")
    public int[] field2560;

    @ObfuscatedName("jg.at")
    public int[] field2561;

    @ObfuscatedName("jg.au")
    public boolean field2562 = false;

    public class238(byte[] arg0, class244 arg1) {
        this.field2553 = arg1;
        class558 var3 = new class558(arg0);
        class558 var4 = new class558(arg0);
        var3.field5462 = 2;
        int var5 = var3.method9258();
        int var6 = -1;
        int var7 = 0;
        var4.field5462 = var3.field5462 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method9258();
            if (var9 > 0) {
                if (this.field2553.field2633[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2553.field2633[var10] == 0) {
                            field2554[var7] = var10;
                            field2557[var7] = 0;
                            field2559[var7] = 0;
                            field2555[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2554[var7] = var8;
                short var11 = 0;
                if (this.field2553.field2633[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2557[var7] = var11;
                } else {
                    field2557[var7] = var4.method9273();
                }
                if ((var9 & 0x2) == 0) {
                    field2559[var7] = var11;
                } else {
                    field2559[var7] = var4.method9273();
                }
                if ((var9 & 0x4) == 0) {
                    field2555[var7] = var11;
                } else {
                    field2555[var7] = var4.method9273();
                }
                var6 = var8;
                var7++;
                if (this.field2553.field2633[var8] == 5) {
                    this.field2562 = true;
                }
            }
        }
        if (var4.field5462 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2552 = var7;
        this.field2558 = new int[var7];
        this.field2556 = new int[var7];
        this.field2560 = new int[var7];
        this.field2561 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2558[var12] = field2554[var12];
            this.field2556[var12] = field2557[var12];
            this.field2560[var12] = field2559[var12];
            this.field2561[var12] = field2555[var12];
        }
    }
}
