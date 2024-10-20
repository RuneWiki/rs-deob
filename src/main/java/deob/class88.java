package deob;

@ObfuscatedName("co")
public class class88 {

    @ObfuscatedName("co.j")
    public static int[] field1525 = new int[500];

    @ObfuscatedName("co.m")
    public static int[] field1522 = new int[500];

    @ObfuscatedName("co.f")
    public static int[] field1521 = new int[500];

    @ObfuscatedName("co.l")
    public static int[] field1524 = new int[500];

    @ObfuscatedName("co.u")
    public class102 field1531 = null;

    @ObfuscatedName("co.a")
    public int field1526 = -1;

    @ObfuscatedName("co.h")
    public int[] field1527;

    @ObfuscatedName("co.i")
    public int[] field1528;

    @ObfuscatedName("co.t")
    public int[] field1529;

    @ObfuscatedName("co.k")
    public int[] field1530;

    @ObfuscatedName("co.s")
    public boolean field1523 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1531 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1982 = 2;
        int var5 = var3.method2372();
        int var6 = -1;
        int var7 = 0;
        var4.field1982 = var3.field1982 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2372();
            if (var9 > 0) {
                if (this.field1531.field1743[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1531.field1743[var10] == 0) {
                            field1525[var7] = var10;
                            field1522[var7] = 0;
                            field1521[var7] = 0;
                            field1524[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1525[var7] = var8;
                short var11 = 0;
                if (this.field1531.field1743[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1522[var7] = var11;
                } else {
                    field1522[var7] = var4.method2502();
                }
                if ((var9 & 0x2) == 0) {
                    field1521[var7] = var11;
                } else {
                    field1521[var7] = var4.method2502();
                }
                if ((var9 & 0x4) == 0) {
                    field1524[var7] = var11;
                } else {
                    field1524[var7] = var4.method2502();
                }
                var6 = var8;
                var7++;
                if (this.field1531.field1743[var8] == 5) {
                    this.field1523 = true;
                }
            }
        }
        if (var4.field1982 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1526 = var7;
        this.field1527 = new int[var7];
        this.field1528 = new int[var7];
        this.field1529 = new int[var7];
        this.field1530 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1527[var12] = field1525[var12];
            this.field1528[var12] = field1522[var12];
            this.field1529[var12] = field1521[var12];
            this.field1530[var12] = field1524[var12];
        }
    }
}
