package deob;

@ObfuscatedName("cm")
public class class82 {

    @ObfuscatedName("cm.x")
    public static int[] field1435 = new int[500];

    @ObfuscatedName("cm.v")
    public static int[] field1441 = new int[500];

    @ObfuscatedName("cm.m")
    public static int[] field1438 = new int[500];

    @ObfuscatedName("cm.e")
    public static int[] field1436 = new int[500];

    @ObfuscatedName("cm.h")
    public class96 field1437 = null;

    @ObfuscatedName("cm.p")
    public int field1440 = -1;

    @ObfuscatedName("cm.j")
    public int[] field1439;

    @ObfuscatedName("cm.i")
    public int[] field1434;

    @ObfuscatedName("cm.u")
    public int[] field1433;

    @ObfuscatedName("cm.l")
    public int[] field1442;

    @ObfuscatedName("cm.k")
    public boolean field1443 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1437 = arg1;
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        var3.field1841 = 2;
        int var5 = var3.method2299();
        int var6 = -1;
        int var7 = 0;
        var4.field1841 = var3.field1841 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2299();
            if (var9 > 0) {
                if (this.field1437.field1666[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1437.field1666[var10] == 0) {
                            field1435[var7] = var10;
                            field1441[var7] = 0;
                            field1438[var7] = 0;
                            field1436[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1435[var7] = var8;
                short var11 = 0;
                if (this.field1437.field1666[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1441[var7] = var11;
                } else {
                    field1441[var7] = var4.method2139();
                }
                if ((var9 & 0x2) == 0) {
                    field1438[var7] = var11;
                } else {
                    field1438[var7] = var4.method2139();
                }
                if ((var9 & 0x4) == 0) {
                    field1436[var7] = var11;
                } else {
                    field1436[var7] = var4.method2139();
                }
                var6 = var8;
                var7++;
                if (this.field1437.field1666[var8] == 5) {
                    this.field1443 = true;
                }
            }
        }
        if (var4.field1841 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1440 = var7;
        this.field1439 = new int[var7];
        this.field1434 = new int[var7];
        this.field1433 = new int[var7];
        this.field1442 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1439[var12] = field1435[var12];
            this.field1434[var12] = field1441[var12];
            this.field1433[var12] = field1438[var12];
            this.field1442[var12] = field1436[var12];
        }
    }
}
