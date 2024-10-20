package deob;

@ObfuscatedName("co")
public class class83 {

    @ObfuscatedName("co.n")
    public static int[] field1487 = new int[500];

    @ObfuscatedName("co.g")
    public static int[] field1486 = new int[500];

    @ObfuscatedName("co.a")
    public static int[] field1485 = new int[500];

    @ObfuscatedName("co.m")
    public static int[] field1488 = new int[500];

    @ObfuscatedName("co.s")
    public class97 field1489 = null;

    @ObfuscatedName("co.j")
    public int field1490 = -1;

    @ObfuscatedName("co.f")
    public int[] field1491;

    @ObfuscatedName("co.b")
    public int[] field1492;

    @ObfuscatedName("co.t")
    public int[] field1493;

    @ObfuscatedName("co.i")
    public int[] field1494;

    @ObfuscatedName("co.c")
    public boolean field1495 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1489 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1896 = 2;
        int var5 = var3.method2211();
        int var6 = -1;
        int var7 = 0;
        var4.field1896 = var3.field1896 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2211();
            if (var9 > 0) {
                if (this.field1489.field1708[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1489.field1708[var10] == 0) {
                            field1487[var7] = var10;
                            field1486[var7] = 0;
                            field1485[var7] = 0;
                            field1488[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1487[var7] = var8;
                short var11 = 0;
                if (this.field1489.field1708[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1486[var7] = var11;
                } else {
                    field1486[var7] = var4.method2207();
                }
                if ((var9 & 0x2) == 0) {
                    field1485[var7] = var11;
                } else {
                    field1485[var7] = var4.method2207();
                }
                if ((var9 & 0x4) == 0) {
                    field1488[var7] = var11;
                } else {
                    field1488[var7] = var4.method2207();
                }
                var6 = var8;
                var7++;
                if (this.field1489.field1708[var8] == 5) {
                    this.field1495 = true;
                }
            }
        }
        if (var4.field1896 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1490 = var7;
        this.field1491 = new int[var7];
        this.field1492 = new int[var7];
        this.field1493 = new int[var7];
        this.field1494 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1491[var12] = field1487[var12];
            this.field1492[var12] = field1486[var12];
            this.field1493[var12] = field1485[var12];
            this.field1494[var12] = field1488[var12];
        }
    }
}
