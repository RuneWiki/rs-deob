package deob;

@ObfuscatedName("cd")
public class class81 {

    @ObfuscatedName("cd.g")
    public static int[] field1437 = new int[500];

    @ObfuscatedName("cd.s")
    public static int[] field1438 = new int[500];

    @ObfuscatedName("cd.v")
    public static int[] field1436 = new int[500];

    @ObfuscatedName("cd.o")
    public static int[] field1435 = new int[500];

    @ObfuscatedName("cd.k")
    public class95 field1434 = null;

    @ObfuscatedName("cd.m")
    public int field1439 = -1;

    @ObfuscatedName("cd.i")
    public int[] field1440;

    @ObfuscatedName("cd.t")
    public int[] field1441;

    @ObfuscatedName("cd.l")
    public int[] field1442;

    @ObfuscatedName("cd.p")
    public int[] field1443;

    @ObfuscatedName("cd.r")
    public boolean field1444 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1434 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1851 = 2;
        int var5 = var3.method2116();
        int var6 = -1;
        int var7 = 0;
        var4.field1851 = var3.field1851 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2116();
            if (var9 > 0) {
                if (this.field1434.field1676[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1434.field1676[var10] == 0) {
                            field1437[var7] = var10;
                            field1438[var7] = 0;
                            field1436[var7] = 0;
                            field1435[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1437[var7] = var8;
                short var11 = 0;
                if (this.field1434.field1676[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1438[var7] = var11;
                } else {
                    field1438[var7] = var4.method2236();
                }
                if ((var9 & 0x2) == 0) {
                    field1436[var7] = var11;
                } else {
                    field1436[var7] = var4.method2236();
                }
                if ((var9 & 0x4) == 0) {
                    field1435[var7] = var11;
                } else {
                    field1435[var7] = var4.method2236();
                }
                var6 = var8;
                var7++;
                if (this.field1434.field1676[var8] == 5) {
                    this.field1444 = true;
                }
            }
        }
        if (var4.field1851 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1439 = var7;
        this.field1440 = new int[var7];
        this.field1441 = new int[var7];
        this.field1442 = new int[var7];
        this.field1443 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1440[var12] = field1437[var12];
            this.field1441[var12] = field1438[var12];
            this.field1442[var12] = field1436[var12];
            this.field1443[var12] = field1435[var12];
        }
    }
}
