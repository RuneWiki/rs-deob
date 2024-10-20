package deob;

@ObfuscatedName("cs")
public class class83 {

    @ObfuscatedName("cs.q")
    public static int[] field1434 = new int[500];

    @ObfuscatedName("cs.s")
    public static int[] field1433 = new int[500];

    @ObfuscatedName("cs.h")
    public static int[] field1440 = new int[500];

    @ObfuscatedName("cs.e")
    public static int[] field1436 = new int[500];

    @ObfuscatedName("cs.n")
    public class97 field1438 = null;

    @ObfuscatedName("cs.t")
    public int field1435 = -1;

    @ObfuscatedName("cs.l")
    public int[] field1439;

    @ObfuscatedName("cs.m")
    public int[] field1437;

    @ObfuscatedName("cs.o")
    public int[] field1441;

    @ObfuscatedName("cs.k")
    public int[] field1442;

    @ObfuscatedName("cs.p")
    public boolean field1443 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1438 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1852 = 2;
        int var5 = var3.method2231();
        int var6 = -1;
        int var7 = 0;
        var4.field1852 = var3.field1852 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2231();
            if (var9 > 0) {
                if (this.field1438.field1652[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1438.field1652[var10] == 0) {
                            field1434[var7] = var10;
                            field1433[var7] = 0;
                            field1440[var7] = 0;
                            field1436[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1434[var7] = var8;
                short var11 = 0;
                if (this.field1438.field1652[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1433[var7] = var11;
                } else {
                    field1433[var7] = var4.method2327();
                }
                if ((var9 & 0x2) == 0) {
                    field1440[var7] = var11;
                } else {
                    field1440[var7] = var4.method2327();
                }
                if ((var9 & 0x4) == 0) {
                    field1436[var7] = var11;
                } else {
                    field1436[var7] = var4.method2327();
                }
                var6 = var8;
                var7++;
                if (this.field1438.field1652[var8] == 5) {
                    this.field1443 = true;
                }
            }
        }
        if (var4.field1852 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1435 = var7;
        this.field1439 = new int[var7];
        this.field1437 = new int[var7];
        this.field1441 = new int[var7];
        this.field1442 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1439[var12] = field1434[var12];
            this.field1437[var12] = field1433[var12];
            this.field1441[var12] = field1440[var12];
            this.field1442[var12] = field1436[var12];
        }
    }
}
