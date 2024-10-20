package deob;

@ObfuscatedName("ch")
public class class88 {

    @ObfuscatedName("ch.n")
    public static int[] field1536 = new int[500];

    @ObfuscatedName("ch.q")
    public static int[] field1527 = new int[500];

    @ObfuscatedName("ch.c")
    public static int[] field1528 = new int[500];

    @ObfuscatedName("ch.l")
    public static int[] field1529 = new int[500];

    @ObfuscatedName("ch.r")
    public class102 field1530 = null;

    @ObfuscatedName("ch.u")
    public int field1531 = -1;

    @ObfuscatedName("ch.j")
    public int[] field1532;

    @ObfuscatedName("ch.w")
    public int[] field1533;

    @ObfuscatedName("ch.y")
    public int[] field1526;

    @ObfuscatedName("ch.o")
    public int[] field1535;

    @ObfuscatedName("ch.h")
    public boolean field1534 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1530 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1982 = 2;
        int var5 = var3.method2360();
        int var6 = -1;
        int var7 = 0;
        var4.field1982 = var3.field1982 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2360();
            if (var9 > 0) {
                if (this.field1530.field1746[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1530.field1746[var10] == 0) {
                            field1536[var7] = var10;
                            field1527[var7] = 0;
                            field1528[var7] = 0;
                            field1529[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1536[var7] = var8;
                short var11 = 0;
                if (this.field1530.field1746[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1527[var7] = var11;
                } else {
                    field1527[var7] = var4.method2489();
                }
                if ((var9 & 0x2) == 0) {
                    field1528[var7] = var11;
                } else {
                    field1528[var7] = var4.method2489();
                }
                if ((var9 & 0x4) == 0) {
                    field1529[var7] = var11;
                } else {
                    field1529[var7] = var4.method2489();
                }
                var6 = var8;
                var7++;
                if (this.field1530.field1746[var8] == 5) {
                    this.field1534 = true;
                }
            }
        }
        if (var4.field1982 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1531 = var7;
        this.field1532 = new int[var7];
        this.field1533 = new int[var7];
        this.field1526 = new int[var7];
        this.field1535 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1532[var12] = field1536[var12];
            this.field1533[var12] = field1527[var12];
            this.field1526[var12] = field1528[var12];
            this.field1535[var12] = field1529[var12];
        }
    }
}
