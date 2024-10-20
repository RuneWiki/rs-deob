package deob;

@ObfuscatedName("cb")
public class class81 {

    @ObfuscatedName("cb.e")
    public static int[] field1433 = new int[500];

    @ObfuscatedName("cb.v")
    public static int[] field1428 = new int[500];

    @ObfuscatedName("cb.i")
    public static int[] field1430 = new int[500];

    @ObfuscatedName("cb.g")
    public static int[] field1431 = new int[500];

    @ObfuscatedName("cb.x")
    public class95 field1432 = null;

    @ObfuscatedName("cb.b")
    public int field1429 = -1;

    @ObfuscatedName("cb.q")
    public int[] field1434;

    @ObfuscatedName("cb.l")
    public int[] field1435;

    @ObfuscatedName("cb.m")
    public int[] field1436;

    @ObfuscatedName("cb.u")
    public int[] field1437;

    @ObfuscatedName("cb.s")
    public boolean field1438 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1432 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1844 = 2;
        int var5 = var3.method2226();
        int var6 = -1;
        int var7 = 0;
        var4.field1844 = var3.field1844 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2226();
            if (var9 > 0) {
                if (this.field1432.field1664[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1432.field1664[var10] == 0) {
                            field1433[var7] = var10;
                            field1428[var7] = 0;
                            field1430[var7] = 0;
                            field1431[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1433[var7] = var8;
                short var11 = 0;
                if (this.field1432.field1664[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1428[var7] = var11;
                } else {
                    field1428[var7] = var4.method2128();
                }
                if ((var9 & 0x2) == 0) {
                    field1430[var7] = var11;
                } else {
                    field1430[var7] = var4.method2128();
                }
                if ((var9 & 0x4) == 0) {
                    field1431[var7] = var11;
                } else {
                    field1431[var7] = var4.method2128();
                }
                var6 = var8;
                var7++;
                if (this.field1432.field1664[var8] == 5) {
                    this.field1438 = true;
                }
            }
        }
        if (var4.field1844 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1429 = var7;
        this.field1434 = new int[var7];
        this.field1435 = new int[var7];
        this.field1436 = new int[var7];
        this.field1437 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1434[var12] = field1433[var12];
            this.field1435[var12] = field1428[var12];
            this.field1436[var12] = field1430[var12];
            this.field1437[var12] = field1431[var12];
        }
    }
}
