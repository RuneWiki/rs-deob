package deob;

@ObfuscatedName("ch")
public class class88 {

    @ObfuscatedName("ch.o")
    public static int[] field1525 = new int[500];

    @ObfuscatedName("ch.f")
    public static int[] field1528 = new int[500];

    @ObfuscatedName("ch.i")
    public static int[] field1524 = new int[500];

    @ObfuscatedName("ch.h")
    public static int[] field1530 = new int[500];

    @ObfuscatedName("ch.q")
    public class102 field1526 = null;

    @ObfuscatedName("ch.u")
    public int field1527 = -1;

    @ObfuscatedName("ch.m")
    public int[] field1522;

    @ObfuscatedName("ch.y")
    public int[] field1529;

    @ObfuscatedName("ch.p")
    public int[] field1523;

    @ObfuscatedName("ch.t")
    public int[] field1531;

    @ObfuscatedName("ch.g")
    public boolean field1532 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1526 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1984 = 2;
        int var5 = var3.method2290();
        int var6 = -1;
        int var7 = 0;
        var4.field1984 = var3.field1984 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2290();
            if (var9 > 0) {
                if (this.field1526.field1761[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1526.field1761[var10] == 0) {
                            field1525[var7] = var10;
                            field1528[var7] = 0;
                            field1524[var7] = 0;
                            field1530[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1525[var7] = var8;
                short var11 = 0;
                if (this.field1526.field1761[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1528[var7] = var11;
                } else {
                    field1528[var7] = var4.method2302();
                }
                if ((var9 & 0x2) == 0) {
                    field1524[var7] = var11;
                } else {
                    field1524[var7] = var4.method2302();
                }
                if ((var9 & 0x4) == 0) {
                    field1530[var7] = var11;
                } else {
                    field1530[var7] = var4.method2302();
                }
                var6 = var8;
                var7++;
                if (this.field1526.field1761[var8] == 5) {
                    this.field1532 = true;
                }
            }
        }
        if (var4.field1984 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1527 = var7;
        this.field1522 = new int[var7];
        this.field1529 = new int[var7];
        this.field1523 = new int[var7];
        this.field1531 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1522[var12] = field1525[var12];
            this.field1529[var12] = field1528[var12];
            this.field1523[var12] = field1524[var12];
            this.field1531[var12] = field1530[var12];
        }
    }
}
