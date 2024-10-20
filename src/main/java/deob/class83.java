package deob;

@ObfuscatedName("cr")
public class class83 {

    @ObfuscatedName("cr.b")
    public static int[] field1469 = new int[500];

    @ObfuscatedName("cr.e")
    public static int[] field1470 = new int[500];

    @ObfuscatedName("cr.a")
    public static int[] field1463 = new int[500];

    @ObfuscatedName("cr.k")
    public static int[] field1464 = new int[500];

    @ObfuscatedName("cr.p")
    public class97 field1461 = null;

    @ObfuscatedName("cr.l")
    public int field1466 = -1;

    @ObfuscatedName("cr.u")
    public int[] field1467;

    @ObfuscatedName("cr.o")
    public int[] field1468;

    @ObfuscatedName("cr.m")
    public int[] field1462;

    @ObfuscatedName("cr.q")
    public int[] field1465;

    @ObfuscatedName("cr.v")
    public boolean field1471 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1461 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1894 = 2;
        int var5 = var3.method2127();
        int var6 = -1;
        int var7 = 0;
        var4.field1894 = var3.field1894 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2127();
            if (var9 > 0) {
                if (this.field1461.field1700[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1461.field1700[var10] == 0) {
                            field1469[var7] = var10;
                            field1470[var7] = 0;
                            field1463[var7] = 0;
                            field1464[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1469[var7] = var8;
                short var11 = 0;
                if (this.field1461.field1700[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1470[var7] = var11;
                } else {
                    field1470[var7] = var4.method2139();
                }
                if ((var9 & 0x2) == 0) {
                    field1463[var7] = var11;
                } else {
                    field1463[var7] = var4.method2139();
                }
                if ((var9 & 0x4) == 0) {
                    field1464[var7] = var11;
                } else {
                    field1464[var7] = var4.method2139();
                }
                var6 = var8;
                var7++;
                if (this.field1461.field1700[var8] == 5) {
                    this.field1471 = true;
                }
            }
        }
        if (var4.field1894 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1466 = var7;
        this.field1467 = new int[var7];
        this.field1468 = new int[var7];
        this.field1462 = new int[var7];
        this.field1465 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1467[var12] = field1469[var12];
            this.field1468[var12] = field1470[var12];
            this.field1462[var12] = field1463[var12];
            this.field1465[var12] = field1464[var12];
        }
    }
}
