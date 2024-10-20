package deob;

@ObfuscatedName("kb")
public class class270 {

    @ObfuscatedName("kb.aq")
    public static int[] field2786 = new int[500];

    @ObfuscatedName("kb.aw")
    public static int[] field2783 = new int[500];

    @ObfuscatedName("kb.al")
    public static int[] field2784 = new int[500];

    @ObfuscatedName("kb.ai")
    public static int[] field2785 = new int[500];

    @ObfuscatedName("kb.ar")
    public class275 field2791 = null;

    @ObfuscatedName("kb.as")
    public int field2790 = -1;

    @ObfuscatedName("kb.aa")
    public int[] field2788;

    @ObfuscatedName("kb.az")
    public int[] field2789;

    @ObfuscatedName("kb.ao")
    public int[] field2782;

    @ObfuscatedName("kb.au")
    public int[] field2787;

    @ObfuscatedName("kb.ak")
    public boolean field2792 = false;

    public class270(byte[] arg0, class275 arg1) {
        this.field2791 = arg1;
        class534 var3 = new class534(arg0);
        class534 var4 = new class534(arg0);
        var3.field5200 = 2;
        int var5 = var3.method8591();
        int var6 = -1;
        int var7 = 0;
        var4.field5200 = var3.field5200 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8591();
            if (var9 > 0) {
                if (this.field2791.field2843[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2791.field2843[var10] == 0) {
                            field2786[var7] = var10;
                            field2783[var7] = 0;
                            field2784[var7] = 0;
                            field2785[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2786[var7] = var8;
                short var11 = 0;
                if (this.field2791.field2843[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2783[var7] = var11;
                } else {
                    field2783[var7] = var4.method8606();
                }
                if ((var9 & 0x2) == 0) {
                    field2784[var7] = var11;
                } else {
                    field2784[var7] = var4.method8606();
                }
                if ((var9 & 0x4) == 0) {
                    field2785[var7] = var11;
                } else {
                    field2785[var7] = var4.method8606();
                }
                var6 = var8;
                var7++;
                if (this.field2791.field2843[var8] == 5) {
                    this.field2792 = true;
                }
            }
        }
        if (var4.field5200 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2790 = var7;
        this.field2788 = new int[var7];
        this.field2789 = new int[var7];
        this.field2782 = new int[var7];
        this.field2787 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2788[var12] = field2786[var12];
            this.field2789[var12] = field2783[var12];
            this.field2782[var12] = field2784[var12];
            this.field2787[var12] = field2785[var12];
        }
    }
}
