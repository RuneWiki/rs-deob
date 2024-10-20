package deob;

@ObfuscatedName("cu")
public class class83 {

    @ObfuscatedName("cu.n")
    public static int[] field1469 = new int[500];

    @ObfuscatedName("cu.d")
    public static int[] field1464 = new int[500];

    @ObfuscatedName("cu.z")
    public static int[] field1465 = new int[500];

    @ObfuscatedName("cu.y")
    public static int[] field1472 = new int[500];

    @ObfuscatedName("cu.e")
    public class97 field1466 = null;

    @ObfuscatedName("cu.g")
    public int field1468 = -1;

    @ObfuscatedName("cu.f")
    public int[] field1463;

    @ObfuscatedName("cu.m")
    public int[] field1470;

    @ObfuscatedName("cu.a")
    public int[] field1467;

    @ObfuscatedName("cu.h")
    public int[] field1471;

    @ObfuscatedName("cu.l")
    public boolean field1473 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1466 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1889 = 2;
        int var5 = var3.method2228();
        int var6 = -1;
        int var7 = 0;
        var4.field1889 = var3.field1889 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2228();
            if (var9 > 0) {
                if (this.field1466.field1699[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1466.field1699[var10] == 0) {
                            field1469[var7] = var10;
                            field1464[var7] = 0;
                            field1465[var7] = 0;
                            field1472[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1469[var7] = var8;
                short var11 = 0;
                if (this.field1466.field1699[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1464[var7] = var11;
                } else {
                    field1464[var7] = var4.method2240();
                }
                if ((var9 & 0x2) == 0) {
                    field1465[var7] = var11;
                } else {
                    field1465[var7] = var4.method2240();
                }
                if ((var9 & 0x4) == 0) {
                    field1472[var7] = var11;
                } else {
                    field1472[var7] = var4.method2240();
                }
                var6 = var8;
                var7++;
                if (this.field1466.field1699[var8] == 5) {
                    this.field1473 = true;
                }
            }
        }
        if (var4.field1889 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1468 = var7;
        this.field1463 = new int[var7];
        this.field1470 = new int[var7];
        this.field1467 = new int[var7];
        this.field1471 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1463[var12] = field1469[var12];
            this.field1470[var12] = field1464[var12];
            this.field1467[var12] = field1465[var12];
            this.field1471[var12] = field1472[var12];
        }
    }
}
