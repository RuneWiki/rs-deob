package deob;

@ObfuscatedName("ct")
public class class81 {

    @ObfuscatedName("ct.g")
    public static int[] field1433 = new int[500];

    @ObfuscatedName("ct.v")
    public static int[] field1430 = new int[500];

    @ObfuscatedName("ct.z")
    public static int[] field1431 = new int[500];

    @ObfuscatedName("ct.h")
    public static int[] field1437 = new int[500];

    @ObfuscatedName("ct.k")
    public class95 field1432 = null;

    @ObfuscatedName("ct.l")
    public int field1434 = -1;

    @ObfuscatedName("ct.e")
    public int[] field1435;

    @ObfuscatedName("ct.j")
    public int[] field1429;

    @ObfuscatedName("ct.n")
    public int[] field1436;

    @ObfuscatedName("ct.f")
    public int[] field1438;

    @ObfuscatedName("ct.a")
    public boolean field1439 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1432 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1839 = 2;
        int var5 = var3.method2139();
        int var6 = -1;
        int var7 = 0;
        var4.field1839 = var3.field1839 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2139();
            if (var9 > 0) {
                if (this.field1432.field1657[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1432.field1657[var10] == 0) {
                            field1433[var7] = var10;
                            field1430[var7] = 0;
                            field1431[var7] = 0;
                            field1437[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1433[var7] = var8;
                short var11 = 0;
                if (this.field1432.field1657[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1430[var7] = var11;
                } else {
                    field1430[var7] = var4.method2167();
                }
                if ((var9 & 0x2) == 0) {
                    field1431[var7] = var11;
                } else {
                    field1431[var7] = var4.method2167();
                }
                if ((var9 & 0x4) == 0) {
                    field1437[var7] = var11;
                } else {
                    field1437[var7] = var4.method2167();
                }
                var6 = var8;
                var7++;
                if (this.field1432.field1657[var8] == 5) {
                    this.field1439 = true;
                }
            }
        }
        if (var4.field1839 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1434 = var7;
        this.field1435 = new int[var7];
        this.field1429 = new int[var7];
        this.field1436 = new int[var7];
        this.field1438 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1435[var12] = field1433[var12];
            this.field1429[var12] = field1430[var12];
            this.field1436[var12] = field1431[var12];
            this.field1438[var12] = field1437[var12];
        }
    }
}
