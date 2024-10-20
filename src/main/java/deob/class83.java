package deob;

@ObfuscatedName("ca")
public class class83 {

    @ObfuscatedName("ca.p")
    public static int[] field1469 = new int[500];

    @ObfuscatedName("ca.k")
    public static int[] field1470 = new int[500];

    @ObfuscatedName("ca.e")
    public static int[] field1471 = new int[500];

    @ObfuscatedName("ca.f")
    public static int[] field1477 = new int[500];

    @ObfuscatedName("ca.w")
    public class97 field1473 = null;

    @ObfuscatedName("ca.t")
    public int field1474 = -1;

    @ObfuscatedName("ca.s")
    public int[] field1475;

    @ObfuscatedName("ca.c")
    public int[] field1476;

    @ObfuscatedName("ca.d")
    public int[] field1478;

    @ObfuscatedName("ca.v")
    public int[] field1472;

    @ObfuscatedName("ca.m")
    public boolean field1479 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1473 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1885 = 2;
        int var5 = var3.method2314();
        int var6 = -1;
        int var7 = 0;
        var4.field1885 = var3.field1885 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2314();
            if (var9 > 0) {
                if (this.field1473.field1698[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1473.field1698[var10] == 0) {
                            field1469[var7] = var10;
                            field1470[var7] = 0;
                            field1471[var7] = 0;
                            field1477[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1469[var7] = var8;
                short var11 = 0;
                if (this.field1473.field1698[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1470[var7] = var11;
                } else {
                    field1470[var7] = var4.method2183();
                }
                if ((var9 & 0x2) == 0) {
                    field1471[var7] = var11;
                } else {
                    field1471[var7] = var4.method2183();
                }
                if ((var9 & 0x4) == 0) {
                    field1477[var7] = var11;
                } else {
                    field1477[var7] = var4.method2183();
                }
                var6 = var8;
                var7++;
                if (this.field1473.field1698[var8] == 5) {
                    this.field1479 = true;
                }
            }
        }
        if (var4.field1885 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1474 = var7;
        this.field1475 = new int[var7];
        this.field1476 = new int[var7];
        this.field1478 = new int[var7];
        this.field1472 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1475[var12] = field1469[var12];
            this.field1476[var12] = field1470[var12];
            this.field1478[var12] = field1471[var12];
            this.field1472[var12] = field1477[var12];
        }
    }
}
