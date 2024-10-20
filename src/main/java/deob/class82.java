package deob;

@ObfuscatedName("cs")
public class class82 {

    @ObfuscatedName("cs.g")
    public static int[] field1432 = new int[500];

    @ObfuscatedName("cs.j")
    public static int[] field1430 = new int[500];

    @ObfuscatedName("cs.z")
    public static int[] field1434 = new int[500];

    @ObfuscatedName("cs.b")
    public static int[] field1439 = new int[500];

    @ObfuscatedName("cs.k")
    public class96 field1433 = null;

    @ObfuscatedName("cs.c")
    public int field1429 = -1;

    @ObfuscatedName("cs.w")
    public int[] field1435;

    @ObfuscatedName("cs.l")
    public int[] field1436;

    @ObfuscatedName("cs.n")
    public int[] field1437;

    @ObfuscatedName("cs.d")
    public int[] field1438;

    @ObfuscatedName("cs.h")
    public boolean field1431 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1433 = arg1;
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        var3.field1824 = 2;
        int var5 = var3.method2083();
        int var6 = -1;
        int var7 = 0;
        var4.field1824 = var3.field1824 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2083();
            if (var9 > 0) {
                if (this.field1433.field1650[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1433.field1650[var10] == 0) {
                            field1432[var7] = var10;
                            field1430[var7] = 0;
                            field1434[var7] = 0;
                            field1439[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1432[var7] = var8;
                short var11 = 0;
                if (this.field1433.field1650[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1430[var7] = var11;
                } else {
                    field1430[var7] = var4.method2179();
                }
                if ((var9 & 0x2) == 0) {
                    field1434[var7] = var11;
                } else {
                    field1434[var7] = var4.method2179();
                }
                if ((var9 & 0x4) == 0) {
                    field1439[var7] = var11;
                } else {
                    field1439[var7] = var4.method2179();
                }
                var6 = var8;
                var7++;
                if (this.field1433.field1650[var8] == 5) {
                    this.field1431 = true;
                }
            }
        }
        if (var4.field1824 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1429 = var7;
        this.field1435 = new int[var7];
        this.field1436 = new int[var7];
        this.field1437 = new int[var7];
        this.field1438 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1435[var12] = field1432[var12];
            this.field1436[var12] = field1430[var12];
            this.field1437[var12] = field1434[var12];
            this.field1438[var12] = field1439[var12];
        }
    }
}
