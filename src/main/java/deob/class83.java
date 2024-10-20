package deob;

@ObfuscatedName("ci")
public class class83 {

    @ObfuscatedName("ci.e")
    public static int[] field1415 = new int[500];

    @ObfuscatedName("ci.a")
    public static int[] field1408 = new int[500];

    @ObfuscatedName("ci.l")
    public static int[] field1409 = new int[500];

    @ObfuscatedName("ci.c")
    public static int[] field1410 = new int[500];

    @ObfuscatedName("ci.u")
    public class97 field1411 = null;

    @ObfuscatedName("ci.w")
    public int field1414 = -1;

    @ObfuscatedName("ci.i")
    public int[] field1412;

    @ObfuscatedName("ci.r")
    public int[] field1407;

    @ObfuscatedName("ci.f")
    public int[] field1413;

    @ObfuscatedName("ci.g")
    public int[] field1416;

    @ObfuscatedName("ci.o")
    public boolean field1417 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1411 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1834 = 2;
        int var5 = var3.method2176();
        int var6 = -1;
        int var7 = 0;
        var4.field1834 = var3.field1834 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2176();
            if (var9 > 0) {
                if (this.field1411.field1643[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1411.field1643[var10] == 0) {
                            field1415[var7] = var10;
                            field1408[var7] = 0;
                            field1409[var7] = 0;
                            field1410[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1415[var7] = var8;
                short var11 = 0;
                if (this.field1411.field1643[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1408[var7] = var11;
                } else {
                    field1408[var7] = var4.method2332();
                }
                if ((var9 & 0x2) == 0) {
                    field1409[var7] = var11;
                } else {
                    field1409[var7] = var4.method2332();
                }
                if ((var9 & 0x4) == 0) {
                    field1410[var7] = var11;
                } else {
                    field1410[var7] = var4.method2332();
                }
                var6 = var8;
                var7++;
                if (this.field1411.field1643[var8] == 5) {
                    this.field1417 = true;
                }
            }
        }
        if (var4.field1834 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1414 = var7;
        this.field1412 = new int[var7];
        this.field1407 = new int[var7];
        this.field1413 = new int[var7];
        this.field1416 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1412[var12] = field1415[var12];
            this.field1407[var12] = field1408[var12];
            this.field1413[var12] = field1409[var12];
            this.field1416[var12] = field1410[var12];
        }
    }
}
