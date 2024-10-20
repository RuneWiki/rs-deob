package deob;

@ObfuscatedName("cm")
public class class81 {

    @ObfuscatedName("cm.n")
    public static int[] field1421 = new int[500];

    @ObfuscatedName("cm.x")
    public static int[] field1419 = new int[500];

    @ObfuscatedName("cm.k")
    public static int[] field1426 = new int[500];

    @ObfuscatedName("cm.i")
    public static int[] field1418 = new int[500];

    @ObfuscatedName("cm.d")
    public class95 field1420 = null;

    @ObfuscatedName("cm.q")
    public int field1423 = -1;

    @ObfuscatedName("cm.m")
    public int[] field1424;

    @ObfuscatedName("cm.a")
    public int[] field1422;

    @ObfuscatedName("cm.w")
    public int[] field1425;

    @ObfuscatedName("cm.e")
    public int[] field1427;

    @ObfuscatedName("cm.o")
    public boolean field1428 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1420 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1826 = 2;
        int var5 = var3.method2148();
        int var6 = -1;
        int var7 = 0;
        var4.field1826 = var3.field1826 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2148();
            if (var9 > 0) {
                if (this.field1420.field1638[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1420.field1638[var10] == 0) {
                            field1421[var7] = var10;
                            field1419[var7] = 0;
                            field1426[var7] = 0;
                            field1418[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1421[var7] = var8;
                short var11 = 0;
                if (this.field1420.field1638[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1419[var7] = var11;
                } else {
                    field1419[var7] = var4.method2150();
                }
                if ((var9 & 0x2) == 0) {
                    field1426[var7] = var11;
                } else {
                    field1426[var7] = var4.method2150();
                }
                if ((var9 & 0x4) == 0) {
                    field1418[var7] = var11;
                } else {
                    field1418[var7] = var4.method2150();
                }
                var6 = var8;
                var7++;
                if (this.field1420.field1638[var8] == 5) {
                    this.field1428 = true;
                }
            }
        }
        if (var4.field1826 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1423 = var7;
        this.field1424 = new int[var7];
        this.field1422 = new int[var7];
        this.field1425 = new int[var7];
        this.field1427 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1424[var12] = field1421[var12];
            this.field1422[var12] = field1419[var12];
            this.field1425[var12] = field1426[var12];
            this.field1427[var12] = field1418[var12];
        }
    }
}
