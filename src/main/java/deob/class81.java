package deob;

@ObfuscatedName("cf")
public class class81 {

    @ObfuscatedName("cf.e")
    public static int[] field1438 = new int[500];

    @ObfuscatedName("cf.o")
    public static int[] field1439 = new int[500];

    @ObfuscatedName("cf.y")
    public static int[] field1432 = new int[500];

    @ObfuscatedName("cf.b")
    public static int[] field1433 = new int[500];

    @ObfuscatedName("cf.w")
    public class95 field1434 = null;

    @ObfuscatedName("cf.r")
    public int field1435 = -1;

    @ObfuscatedName("cf.l")
    public int[] field1436;

    @ObfuscatedName("cf.s")
    public int[] field1437;

    @ObfuscatedName("cf.f")
    public int[] field1430;

    @ObfuscatedName("cf.x")
    public int[] field1431;

    @ObfuscatedName("cf.h")
    public boolean field1440 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1434 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1841 = 2;
        int var5 = var3.method2123();
        int var6 = -1;
        int var7 = 0;
        var4.field1841 = var3.field1841 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2123();
            if (var9 > 0) {
                if (this.field1434.field1660[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1434.field1660[var10] == 0) {
                            field1438[var7] = var10;
                            field1439[var7] = 0;
                            field1432[var7] = 0;
                            field1433[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1438[var7] = var8;
                short var11 = 0;
                if (this.field1434.field1660[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1439[var7] = var11;
                } else {
                    field1439[var7] = var4.method2225();
                }
                if ((var9 & 0x2) == 0) {
                    field1432[var7] = var11;
                } else {
                    field1432[var7] = var4.method2225();
                }
                if ((var9 & 0x4) == 0) {
                    field1433[var7] = var11;
                } else {
                    field1433[var7] = var4.method2225();
                }
                var6 = var8;
                var7++;
                if (this.field1434.field1660[var8] == 5) {
                    this.field1440 = true;
                }
            }
        }
        if (var4.field1841 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1435 = var7;
        this.field1436 = new int[var7];
        this.field1437 = new int[var7];
        this.field1430 = new int[var7];
        this.field1431 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1436[var12] = field1438[var12];
            this.field1437[var12] = field1439[var12];
            this.field1430[var12] = field1432[var12];
            this.field1431[var12] = field1433[var12];
        }
    }
}
