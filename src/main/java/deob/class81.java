package deob;

@ObfuscatedName("cg")
public class class81 {

    @ObfuscatedName("cg.p")
    public static int[] field1436 = new int[500];

    @ObfuscatedName("cg.g")
    public static int[] field1435 = new int[500];

    @ObfuscatedName("cg.x")
    public static int[] field1441 = new int[500];

    @ObfuscatedName("cg.c")
    public static int[] field1437 = new int[500];

    @ObfuscatedName("cg.n")
    public class95 field1438 = null;

    @ObfuscatedName("cg.s")
    public int field1439 = -1;

    @ObfuscatedName("cg.r")
    public int[] field1442;

    @ObfuscatedName("cg.w")
    public int[] field1443;

    @ObfuscatedName("cg.u")
    public int[] field1434;

    @ObfuscatedName("cg.d")
    public int[] field1440;

    @ObfuscatedName("cg.h")
    public boolean field1444 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1438 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1837 = 2;
        int var5 = var3.method2173();
        int var6 = -1;
        int var7 = 0;
        var4.field1837 = var3.field1837 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2173();
            if (var9 > 0) {
                if (this.field1438.field1664[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1438.field1664[var10] == 0) {
                            field1436[var7] = var10;
                            field1435[var7] = 0;
                            field1441[var7] = 0;
                            field1437[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1436[var7] = var8;
                short var11 = 0;
                if (this.field1438.field1664[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1435[var7] = var11;
                } else {
                    field1435[var7] = var4.method2197();
                }
                if ((var9 & 0x2) == 0) {
                    field1441[var7] = var11;
                } else {
                    field1441[var7] = var4.method2197();
                }
                if ((var9 & 0x4) == 0) {
                    field1437[var7] = var11;
                } else {
                    field1437[var7] = var4.method2197();
                }
                var6 = var8;
                var7++;
                if (this.field1438.field1664[var8] == 5) {
                    this.field1444 = true;
                }
            }
        }
        if (var4.field1837 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1439 = var7;
        this.field1442 = new int[var7];
        this.field1443 = new int[var7];
        this.field1434 = new int[var7];
        this.field1440 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1442[var12] = field1436[var12];
            this.field1443[var12] = field1435[var12];
            this.field1434[var12] = field1441[var12];
            this.field1440[var12] = field1437[var12];
        }
    }
}
