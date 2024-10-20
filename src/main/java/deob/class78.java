package deob;

@ObfuscatedName("bn")
public class class78 {

    @ObfuscatedName("bn.m")
    public static int[] field1402 = new int[500];

    @ObfuscatedName("bn.k")
    public static int[] field1398 = new int[500];

    @ObfuscatedName("bn.y")
    public static int[] field1400 = new int[500];

    @ObfuscatedName("bn.g")
    public static int[] field1401 = new int[500];

    @ObfuscatedName("bn.r")
    public class92 field1407 = null;

    @ObfuscatedName("bn.i")
    public int field1403 = -1;

    @ObfuscatedName("bn.f")
    public int[] field1404;

    @ObfuscatedName("bn.a")
    public int[] field1405;

    @ObfuscatedName("bn.w")
    public int[] field1408;

    @ObfuscatedName("bn.u")
    public int[] field1399;

    @ObfuscatedName("bn.d")
    public boolean field1406 = false;

    public class78(byte[] arg0, class92 arg1) {
        this.field1407 = arg1;
        class104 var3 = new class104(arg0);
        class104 var4 = new class104(arg0);
        var3.field1806 = 2;
        int var5 = var3.method2190();
        int var6 = -1;
        int var7 = 0;
        var4.field1806 = var3.field1806 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2190();
            if (var9 > 0) {
                if (this.field1407.field1628[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1407.field1628[var10] == 0) {
                            field1402[var7] = var10;
                            field1398[var7] = 0;
                            field1400[var7] = 0;
                            field1401[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1402[var7] = var8;
                short var11 = 0;
                if (this.field1407.field1628[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1398[var7] = var11;
                } else {
                    field1398[var7] = var4.method2142();
                }
                if ((var9 & 0x2) == 0) {
                    field1400[var7] = var11;
                } else {
                    field1400[var7] = var4.method2142();
                }
                if ((var9 & 0x4) == 0) {
                    field1401[var7] = var11;
                } else {
                    field1401[var7] = var4.method2142();
                }
                var6 = var8;
                var7++;
                if (this.field1407.field1628[var8] == 5) {
                    this.field1406 = true;
                }
            }
        }
        if (var4.field1806 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1403 = var7;
        this.field1404 = new int[var7];
        this.field1405 = new int[var7];
        this.field1408 = new int[var7];
        this.field1399 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1404[var12] = field1402[var12];
            this.field1405[var12] = field1398[var12];
            this.field1408[var12] = field1400[var12];
            this.field1399[var12] = field1401[var12];
        }
    }
}
