package deob;

@ObfuscatedName("cq")
public class class82 {

    @ObfuscatedName("cq.a")
    public static int[] field1440 = new int[500];

    @ObfuscatedName("cq.v")
    public static int[] field1433 = new int[500];

    @ObfuscatedName("cq.i")
    public static int[] field1434 = new int[500];

    @ObfuscatedName("cq.b")
    public static int[] field1435 = new int[500];

    @ObfuscatedName("cq.l")
    public class96 field1441 = null;

    @ObfuscatedName("cq.m")
    public int field1437 = -1;

    @ObfuscatedName("cq.w")
    public int[] field1432;

    @ObfuscatedName("cq.e")
    public int[] field1439;

    @ObfuscatedName("cq.n")
    public int[] field1438;

    @ObfuscatedName("cq.s")
    public int[] field1436;

    @ObfuscatedName("cq.k")
    public boolean field1442 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1441 = arg1;
        class110 var3 = new class110(arg0);
        class110 var4 = new class110(arg0);
        var3.field1861 = 2;
        int var5 = var3.method2199();
        int var6 = -1;
        int var7 = 0;
        var4.field1861 = var3.field1861 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2199();
            if (var9 > 0) {
                if (this.field1441.field1665[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1441.field1665[var10] == 0) {
                            field1440[var7] = var10;
                            field1433[var7] = 0;
                            field1434[var7] = 0;
                            field1435[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1440[var7] = var8;
                short var11 = 0;
                if (this.field1441.field1665[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1433[var7] = var11;
                } else {
                    field1433[var7] = var4.method2231();
                }
                if ((var9 & 0x2) == 0) {
                    field1434[var7] = var11;
                } else {
                    field1434[var7] = var4.method2231();
                }
                if ((var9 & 0x4) == 0) {
                    field1435[var7] = var11;
                } else {
                    field1435[var7] = var4.method2231();
                }
                var6 = var8;
                var7++;
                if (this.field1441.field1665[var8] == 5) {
                    this.field1442 = true;
                }
            }
        }
        if (var4.field1861 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1437 = var7;
        this.field1432 = new int[var7];
        this.field1439 = new int[var7];
        this.field1438 = new int[var7];
        this.field1436 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1432[var12] = field1440[var12];
            this.field1439[var12] = field1433[var12];
            this.field1438[var12] = field1434[var12];
            this.field1436[var12] = field1435[var12];
        }
    }
}
