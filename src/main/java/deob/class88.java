package deob;

@ObfuscatedName("cf")
public class class88 {

    @ObfuscatedName("cf.d")
    public static int[] field1533 = new int[500];

    @ObfuscatedName("cf.p")
    public static int[] field1526 = new int[500];

    @ObfuscatedName("cf.v")
    public static int[] field1528 = new int[500];

    @ObfuscatedName("cf.l")
    public static int[] field1529 = new int[500];

    @ObfuscatedName("cf.y")
    public class102 field1530 = null;

    @ObfuscatedName("cf.w")
    public int field1531 = -1;

    @ObfuscatedName("cf.u")
    public int[] field1532;

    @ObfuscatedName("cf.a")
    public int[] field1527;

    @ObfuscatedName("cf.e")
    public int[] field1534;

    @ObfuscatedName("cf.b")
    public int[] field1535;

    @ObfuscatedName("cf.o")
    public boolean field1536 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1530 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1966 = 2;
        int var5 = var3.method2357();
        int var6 = -1;
        int var7 = 0;
        var4.field1966 = var3.field1966 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2357();
            if (var9 > 0) {
                if (this.field1530.field1748[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1530.field1748[var10] == 0) {
                            field1533[var7] = var10;
                            field1526[var7] = 0;
                            field1528[var7] = 0;
                            field1529[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1533[var7] = var8;
                short var11 = 0;
                if (this.field1530.field1748[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1526[var7] = var11;
                } else {
                    field1526[var7] = var4.method2391();
                }
                if ((var9 & 0x2) == 0) {
                    field1528[var7] = var11;
                } else {
                    field1528[var7] = var4.method2391();
                }
                if ((var9 & 0x4) == 0) {
                    field1529[var7] = var11;
                } else {
                    field1529[var7] = var4.method2391();
                }
                var6 = var8;
                var7++;
                if (this.field1530.field1748[var8] == 5) {
                    this.field1536 = true;
                }
            }
        }
        if (var4.field1966 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1531 = var7;
        this.field1532 = new int[var7];
        this.field1527 = new int[var7];
        this.field1534 = new int[var7];
        this.field1535 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1532[var12] = field1533[var12];
            this.field1527[var12] = field1526[var12];
            this.field1534[var12] = field1528[var12];
            this.field1535[var12] = field1529[var12];
        }
    }
}
