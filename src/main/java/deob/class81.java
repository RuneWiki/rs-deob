package deob;

@ObfuscatedName("cn")
public class class81 {

    @ObfuscatedName("cn.k")
    public static int[] field1441 = new int[500];

    @ObfuscatedName("cn.b")
    public static int[] field1444 = new int[500];

    @ObfuscatedName("cn.e")
    public static int[] field1436 = new int[500];

    @ObfuscatedName("cn.i")
    public static int[] field1437 = new int[500];

    @ObfuscatedName("cn.t")
    public class95 field1435 = null;

    @ObfuscatedName("cn.z")
    public int field1439 = -1;

    @ObfuscatedName("cn.g")
    public int[] field1440;

    @ObfuscatedName("cn.c")
    public int[] field1442;

    @ObfuscatedName("cn.o")
    public int[] field1443;

    @ObfuscatedName("cn.q")
    public int[] field1438;

    @ObfuscatedName("cn.w")
    public boolean field1434 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1435 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1862 = 2;
        int var5 = var3.method2115();
        int var6 = -1;
        int var7 = 0;
        var4.field1862 = var3.field1862 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2115();
            if (var9 > 0) {
                if (this.field1435.field1669[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1435.field1669[var10] == 0) {
                            field1441[var7] = var10;
                            field1444[var7] = 0;
                            field1436[var7] = 0;
                            field1437[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1441[var7] = var8;
                short var11 = 0;
                if (this.field1435.field1669[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1444[var7] = var11;
                } else {
                    field1444[var7] = var4.method2127();
                }
                if ((var9 & 0x2) == 0) {
                    field1436[var7] = var11;
                } else {
                    field1436[var7] = var4.method2127();
                }
                if ((var9 & 0x4) == 0) {
                    field1437[var7] = var11;
                } else {
                    field1437[var7] = var4.method2127();
                }
                var6 = var8;
                var7++;
                if (this.field1435.field1669[var8] == 5) {
                    this.field1434 = true;
                }
            }
        }
        if (var4.field1862 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1439 = var7;
        this.field1440 = new int[var7];
        this.field1442 = new int[var7];
        this.field1443 = new int[var7];
        this.field1438 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1440[var12] = field1441[var12];
            this.field1442[var12] = field1444[var12];
            this.field1443[var12] = field1436[var12];
            this.field1438[var12] = field1437[var12];
        }
    }
}
