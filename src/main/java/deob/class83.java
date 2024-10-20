package deob;

@ObfuscatedName("cv")
public class class83 {

    @ObfuscatedName("cv.n")
    public static int[] field1471 = new int[500];

    @ObfuscatedName("cv.o")
    public static int[] field1468 = new int[500];

    @ObfuscatedName("cv.a")
    public static int[] field1476 = new int[500];

    @ObfuscatedName("cv.w")
    public static int[] field1467 = new int[500];

    @ObfuscatedName("cv.m")
    public class97 field1469 = null;

    @ObfuscatedName("cv.h")
    public int field1470 = -1;

    @ObfuscatedName("cv.i")
    public int[] field1473;

    @ObfuscatedName("cv.r")
    public int[] field1474;

    @ObfuscatedName("cv.l")
    public int[] field1475;

    @ObfuscatedName("cv.f")
    public int[] field1477;

    @ObfuscatedName("cv.e")
    public boolean field1472 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1469 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1890 = 2;
        int var5 = var3.method2234();
        int var6 = -1;
        int var7 = 0;
        var4.field1890 = var3.field1890 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2234();
            if (var9 > 0) {
                if (this.field1469.field1692[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1469.field1692[var10] == 0) {
                            field1471[var7] = var10;
                            field1468[var7] = 0;
                            field1476[var7] = 0;
                            field1467[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1471[var7] = var8;
                short var11 = 0;
                if (this.field1469.field1692[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1468[var7] = var11;
                } else {
                    field1468[var7] = var4.method2246();
                }
                if ((var9 & 0x2) == 0) {
                    field1476[var7] = var11;
                } else {
                    field1476[var7] = var4.method2246();
                }
                if ((var9 & 0x4) == 0) {
                    field1467[var7] = var11;
                } else {
                    field1467[var7] = var4.method2246();
                }
                var6 = var8;
                var7++;
                if (this.field1469.field1692[var8] == 5) {
                    this.field1472 = true;
                }
            }
        }
        if (var4.field1890 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1470 = var7;
        this.field1473 = new int[var7];
        this.field1474 = new int[var7];
        this.field1475 = new int[var7];
        this.field1477 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1473[var12] = field1471[var12];
            this.field1474[var12] = field1468[var12];
            this.field1475[var12] = field1476[var12];
            this.field1477[var12] = field1467[var12];
        }
    }
}
