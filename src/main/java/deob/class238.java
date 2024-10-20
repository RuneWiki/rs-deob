package deob;

@ObfuscatedName("jt")
public class class238 {

    @ObfuscatedName("jt.ac")
    public static int[] field2559 = new int[500];

    @ObfuscatedName("jt.ae")
    public static int[] field2551 = new int[500];

    @ObfuscatedName("jt.ag")
    public static int[] field2560 = new int[500];

    @ObfuscatedName("jt.am")
    public static int[] field2553 = new int[500];

    @ObfuscatedName("jt.ax")
    public class244 field2552 = null;

    @ObfuscatedName("jt.aq")
    public int field2550 = -1;

    @ObfuscatedName("jt.af")
    public int[] field2556;

    @ObfuscatedName("jt.at")
    public int[] field2557;

    @ObfuscatedName("jt.au")
    public int[] field2558;

    @ObfuscatedName("jt.ar")
    public int[] field2554;

    @ObfuscatedName("jt.al")
    public boolean field2555 = false;

    public class238(byte[] arg0, class244 arg1) {
        this.field2552 = arg1;
        class551 var3 = new class551(arg0);
        class551 var4 = new class551(arg0);
        var3.field5415 = 2;
        int var5 = var3.method8955();
        int var6 = -1;
        int var7 = 0;
        var4.field5415 = var3.field5415 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8955();
            if (var9 > 0) {
                if (this.field2552.field2627[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2552.field2627[var10] == 0) {
                            field2559[var7] = var10;
                            field2551[var7] = 0;
                            field2560[var7] = 0;
                            field2553[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2559[var7] = var8;
                short var11 = 0;
                if (this.field2552.field2627[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2551[var7] = var11;
                } else {
                    field2551[var7] = var4.method8957();
                }
                if ((var9 & 0x2) == 0) {
                    field2560[var7] = var11;
                } else {
                    field2560[var7] = var4.method8957();
                }
                if ((var9 & 0x4) == 0) {
                    field2553[var7] = var11;
                } else {
                    field2553[var7] = var4.method8957();
                }
                var6 = var8;
                var7++;
                if (this.field2552.field2627[var8] == 5) {
                    this.field2555 = true;
                }
            }
        }
        if (var4.field5415 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2550 = var7;
        this.field2556 = new int[var7];
        this.field2557 = new int[var7];
        this.field2558 = new int[var7];
        this.field2554 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2556[var12] = field2559[var12];
            this.field2557[var12] = field2551[var12];
            this.field2558[var12] = field2560[var12];
            this.field2554[var12] = field2553[var12];
        }
    }
}
