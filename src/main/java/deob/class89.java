package deob;

@ObfuscatedName("cv")
public class class89 {

    @ObfuscatedName("cv.j")
    public static int[] field1527 = new int[500];

    @ObfuscatedName("cv.h")
    public static int[] field1520 = new int[500];

    @ObfuscatedName("cv.m")
    public static int[] field1521 = new int[500];

    @ObfuscatedName("cv.z")
    public static int[] field1522 = new int[500];

    @ObfuscatedName("cv.x")
    public class103 field1519 = null;

    @ObfuscatedName("cv.e")
    public int field1524 = -1;

    @ObfuscatedName("cv.i")
    public int[] field1525;

    @ObfuscatedName("cv.c")
    public int[] field1526;

    @ObfuscatedName("cv.n")
    public int[] field1528;

    @ObfuscatedName("cv.l")
    public int[] field1523;

    @ObfuscatedName("cv.u")
    public boolean field1529 = false;

    public class89(byte[] arg0, class103 arg1) {
        this.field1519 = arg1;
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        var3.field1972 = 2;
        int var5 = var3.method2361();
        int var6 = -1;
        int var7 = 0;
        var4.field1972 = var3.field1972 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2361();
            if (var9 > 0) {
                if (this.field1519.field1745[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1519.field1745[var10] == 0) {
                            field1527[var7] = var10;
                            field1520[var7] = 0;
                            field1521[var7] = 0;
                            field1522[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1527[var7] = var8;
                short var11 = 0;
                if (this.field1519.field1745[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1520[var7] = var11;
                } else {
                    field1520[var7] = var4.method2471();
                }
                if ((var9 & 0x2) == 0) {
                    field1521[var7] = var11;
                } else {
                    field1521[var7] = var4.method2471();
                }
                if ((var9 & 0x4) == 0) {
                    field1522[var7] = var11;
                } else {
                    field1522[var7] = var4.method2471();
                }
                var6 = var8;
                var7++;
                if (this.field1519.field1745[var8] == 5) {
                    this.field1529 = true;
                }
            }
        }
        if (var4.field1972 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1524 = var7;
        this.field1525 = new int[var7];
        this.field1526 = new int[var7];
        this.field1528 = new int[var7];
        this.field1523 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1525[var12] = field1527[var12];
            this.field1526[var12] = field1520[var12];
            this.field1528[var12] = field1521[var12];
            this.field1523[var12] = field1522[var12];
        }
    }
}
