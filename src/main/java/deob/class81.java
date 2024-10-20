package deob;

@ObfuscatedName("cr")
public class class81 {

    @ObfuscatedName("cr.y")
    public static int[] field1428 = new int[500];

    @ObfuscatedName("cr.u")
    public static int[] field1420 = new int[500];

    @ObfuscatedName("cr.k")
    public static int[] field1421 = new int[500];

    @ObfuscatedName("cr.v")
    public static int[] field1419 = new int[500];

    @ObfuscatedName("cr.l")
    public class95 field1423 = null;

    @ObfuscatedName("cr.g")
    public int field1424 = -1;

    @ObfuscatedName("cr.a")
    public int[] field1422;

    @ObfuscatedName("cr.x")
    public int[] field1426;

    @ObfuscatedName("cr.r")
    public int[] field1429;

    @ObfuscatedName("cr.w")
    public int[] field1425;

    @ObfuscatedName("cr.c")
    public boolean field1427 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1423 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1854 = 2;
        int var5 = var3.method2109();
        int var6 = -1;
        int var7 = 0;
        var4.field1854 = var3.field1854 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2109();
            if (var9 > 0) {
                if (this.field1423.field1658[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1423.field1658[var10] == 0) {
                            field1428[var7] = var10;
                            field1420[var7] = 0;
                            field1421[var7] = 0;
                            field1419[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1428[var7] = var8;
                short var11 = 0;
                if (this.field1423.field1658[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1420[var7] = var11;
                } else {
                    field1420[var7] = var4.method2187();
                }
                if ((var9 & 0x2) == 0) {
                    field1421[var7] = var11;
                } else {
                    field1421[var7] = var4.method2187();
                }
                if ((var9 & 0x4) == 0) {
                    field1419[var7] = var11;
                } else {
                    field1419[var7] = var4.method2187();
                }
                var6 = var8;
                var7++;
                if (this.field1423.field1658[var8] == 5) {
                    this.field1427 = true;
                }
            }
        }
        if (var4.field1854 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1424 = var7;
        this.field1422 = new int[var7];
        this.field1426 = new int[var7];
        this.field1429 = new int[var7];
        this.field1425 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1422[var12] = field1428[var12];
            this.field1426[var12] = field1420[var12];
            this.field1429[var12] = field1421[var12];
            this.field1425[var12] = field1419[var12];
        }
    }
}
