package deob;

@ObfuscatedName("ig")
public class class218 {

    @ObfuscatedName("ig.aj")
    public static int[] field2437 = new int[500];

    @ObfuscatedName("ig.al")
    public static int[] field2433 = new int[500];

    @ObfuscatedName("ig.ac")
    public static int[] field2434 = new int[500];

    @ObfuscatedName("ig.ab")
    public static int[] field2435 = new int[500];

    @ObfuscatedName("ig.an")
    public class222 field2436 = null;

    @ObfuscatedName("ig.ao")
    public int field2441 = -1;

    @ObfuscatedName("ig.av")
    public int[] field2438;

    @ObfuscatedName("ig.aq")
    public int[] field2432;

    @ObfuscatedName("ig.ap")
    public int[] field2440;

    @ObfuscatedName("ig.ar")
    public int[] field2439;

    @ObfuscatedName("ig.ak")
    public boolean field2442 = false;

    public class218(byte[] arg0, class222 arg1) {
        this.field2436 = arg1;
        class478 var3 = new class478(arg0);
        class478 var4 = new class478(arg0);
        var3.field4904 = 2;
        int var5 = var3.method7909();
        int var6 = -1;
        int var7 = 0;
        var4.field4904 = var3.field4904 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method7909();
            if (var9 > 0) {
                if (this.field2436.field2504[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2436.field2504[var10] == 0) {
                            field2437[var7] = var10;
                            field2433[var7] = 0;
                            field2434[var7] = 0;
                            field2435[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2437[var7] = var8;
                short var11 = 0;
                if (this.field2436.field2504[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2433[var7] = var11;
                } else {
                    field2433[var7] = var4.method7917();
                }
                if ((var9 & 0x2) == 0) {
                    field2434[var7] = var11;
                } else {
                    field2434[var7] = var4.method7917();
                }
                if ((var9 & 0x4) == 0) {
                    field2435[var7] = var11;
                } else {
                    field2435[var7] = var4.method7917();
                }
                var6 = var8;
                var7++;
                if (this.field2436.field2504[var8] == 5) {
                    this.field2442 = true;
                }
            }
        }
        if (var4.field4904 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2441 = var7;
        this.field2438 = new int[var7];
        this.field2432 = new int[var7];
        this.field2440 = new int[var7];
        this.field2439 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2438[var12] = field2437[var12];
            this.field2432[var12] = field2433[var12];
            this.field2440[var12] = field2434[var12];
            this.field2439[var12] = field2435[var12];
        }
    }
}
