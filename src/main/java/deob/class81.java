package deob;

@ObfuscatedName("cd")
public class class81 {

    @ObfuscatedName("cd.k")
    public static int[] field1439 = new int[500];

    @ObfuscatedName("cd.r")
    public static int[] field1434 = new int[500];

    @ObfuscatedName("cd.y")
    public static int[] field1435 = new int[500];

    @ObfuscatedName("cd.w")
    public static int[] field1436 = new int[500];

    @ObfuscatedName("cd.m")
    public class95 field1437 = null;

    @ObfuscatedName("cd.j")
    public int field1438 = -1;

    @ObfuscatedName("cd.g")
    public int[] field1433;

    @ObfuscatedName("cd.p")
    public int[] field1440;

    @ObfuscatedName("cd.o")
    public int[] field1441;

    @ObfuscatedName("cd.b")
    public int[] field1442;

    @ObfuscatedName("cd.x")
    public boolean field1443 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1437 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1863 = 2;
        int var5 = var3.method2111();
        int var6 = -1;
        int var7 = 0;
        var4.field1863 = var3.field1863 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2111();
            if (var9 > 0) {
                if (this.field1437.field1671[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1437.field1671[var10] == 0) {
                            field1439[var7] = var10;
                            field1434[var7] = 0;
                            field1435[var7] = 0;
                            field1436[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1439[var7] = var8;
                short var11 = 0;
                if (this.field1437.field1671[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1434[var7] = var11;
                } else {
                    field1434[var7] = var4.method2123();
                }
                if ((var9 & 0x2) == 0) {
                    field1435[var7] = var11;
                } else {
                    field1435[var7] = var4.method2123();
                }
                if ((var9 & 0x4) == 0) {
                    field1436[var7] = var11;
                } else {
                    field1436[var7] = var4.method2123();
                }
                var6 = var8;
                var7++;
                if (this.field1437.field1671[var8] == 5) {
                    this.field1443 = true;
                }
            }
        }
        if (var4.field1863 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1438 = var7;
        this.field1433 = new int[var7];
        this.field1440 = new int[var7];
        this.field1441 = new int[var7];
        this.field1442 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1433[var12] = field1439[var12];
            this.field1440[var12] = field1434[var12];
            this.field1441[var12] = field1435[var12];
            this.field1442[var12] = field1436[var12];
        }
    }
}
