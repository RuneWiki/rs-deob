package deob;

@ObfuscatedName("cw")
public class class81 {

    @ObfuscatedName("cw.b")
    public static int[] field1435 = new int[500];

    @ObfuscatedName("cw.u")
    public static int[] field1429 = new int[500];

    @ObfuscatedName("cw.x")
    public static int[] field1430 = new int[500];

    @ObfuscatedName("cw.j")
    public static int[] field1432 = new int[500];

    @ObfuscatedName("cw.o")
    public class95 field1436 = null;

    @ObfuscatedName("cw.n")
    public int field1433 = -1;

    @ObfuscatedName("cw.y")
    public int[] field1434;

    @ObfuscatedName("cw.f")
    public int[] field1438;

    @ObfuscatedName("cw.p")
    public int[] field1428;

    @ObfuscatedName("cw.l")
    public int[] field1437;

    @ObfuscatedName("cw.k")
    public boolean field1431 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1436 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1845 = 2;
        int var5 = var3.method2134();
        int var6 = -1;
        int var7 = 0;
        var4.field1845 = var3.field1845 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2134();
            if (var9 > 0) {
                if (this.field1436.field1658[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1436.field1658[var10] == 0) {
                            field1435[var7] = var10;
                            field1429[var7] = 0;
                            field1430[var7] = 0;
                            field1432[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1435[var7] = var8;
                short var11 = 0;
                if (this.field1436.field1658[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1429[var7] = var11;
                } else {
                    field1429[var7] = var4.method2184();
                }
                if ((var9 & 0x2) == 0) {
                    field1430[var7] = var11;
                } else {
                    field1430[var7] = var4.method2184();
                }
                if ((var9 & 0x4) == 0) {
                    field1432[var7] = var11;
                } else {
                    field1432[var7] = var4.method2184();
                }
                var6 = var8;
                var7++;
                if (this.field1436.field1658[var8] == 5) {
                    this.field1431 = true;
                }
            }
        }
        if (var4.field1845 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1433 = var7;
        this.field1434 = new int[var7];
        this.field1438 = new int[var7];
        this.field1428 = new int[var7];
        this.field1437 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1434[var12] = field1435[var12];
            this.field1438[var12] = field1429[var12];
            this.field1428[var12] = field1430[var12];
            this.field1437[var12] = field1432[var12];
        }
    }
}
