package deob;

@ObfuscatedName("cq")
public class class81 {

    @ObfuscatedName("cq.g")
    public static int[] field1439 = new int[500];

    @ObfuscatedName("cq.s")
    public static int[] field1433 = new int[500];

    @ObfuscatedName("cq.h")
    public static int[] field1434 = new int[500];

    @ObfuscatedName("cq.m")
    public static int[] field1432 = new int[500];

    @ObfuscatedName("cq.u")
    public class95 field1436 = null;

    @ObfuscatedName("cq.j")
    public int field1437 = -1;

    @ObfuscatedName("cq.b")
    public int[] field1438;

    @ObfuscatedName("cq.v")
    public int[] field1440;

    @ObfuscatedName("cq.y")
    public int[] field1435;

    @ObfuscatedName("cq.w")
    public int[] field1441;

    @ObfuscatedName("cq.x")
    public boolean field1442 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1436 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1835 = 2;
        int var5 = var3.method2101();
        int var6 = -1;
        int var7 = 0;
        var4.field1835 = var3.field1835 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2101();
            if (var9 > 0) {
                if (this.field1436.field1657[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1436.field1657[var10] == 0) {
                            field1439[var7] = var10;
                            field1433[var7] = 0;
                            field1434[var7] = 0;
                            field1432[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1439[var7] = var8;
                short var11 = 0;
                if (this.field1436.field1657[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1433[var7] = var11;
                } else {
                    field1433[var7] = var4.method2113();
                }
                if ((var9 & 0x2) == 0) {
                    field1434[var7] = var11;
                } else {
                    field1434[var7] = var4.method2113();
                }
                if ((var9 & 0x4) == 0) {
                    field1432[var7] = var11;
                } else {
                    field1432[var7] = var4.method2113();
                }
                var6 = var8;
                var7++;
                if (this.field1436.field1657[var8] == 5) {
                    this.field1442 = true;
                }
            }
        }
        if (var4.field1835 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1437 = var7;
        this.field1438 = new int[var7];
        this.field1440 = new int[var7];
        this.field1435 = new int[var7];
        this.field1441 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1438[var12] = field1439[var12];
            this.field1440[var12] = field1433[var12];
            this.field1435[var12] = field1434[var12];
            this.field1441[var12] = field1432[var12];
        }
    }
}
