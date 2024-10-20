package deob;

@ObfuscatedName("cs")
public class class88 {

    @ObfuscatedName("cs.l")
    public static int[] field1523 = new int[500];

    @ObfuscatedName("cs.e")
    public static int[] field1518 = new int[500];

    @ObfuscatedName("cs.q")
    public static int[] field1517 = new int[500];

    @ObfuscatedName("cs.o")
    public static int[] field1520 = new int[500];

    @ObfuscatedName("cs.g")
    public class102 field1519 = null;

    @ObfuscatedName("cs.m")
    public int field1522 = -1;

    @ObfuscatedName("cs.b")
    public int[] field1521;

    @ObfuscatedName("cs.p")
    public int[] field1527;

    @ObfuscatedName("cs.t")
    public int[] field1525;

    @ObfuscatedName("cs.w")
    public int[] field1526;

    @ObfuscatedName("cs.x")
    public boolean field1524 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1519 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1988 = 2;
        int var5 = var3.method2388();
        int var6 = -1;
        int var7 = 0;
        var4.field1988 = var3.field1988 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2388();
            if (var9 > 0) {
                if (this.field1519.field1756[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1519.field1756[var10] == 0) {
                            field1523[var7] = var10;
                            field1518[var7] = 0;
                            field1517[var7] = 0;
                            field1520[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1523[var7] = var8;
                short var11 = 0;
                if (this.field1519.field1756[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1518[var7] = var11;
                } else {
                    field1518[var7] = var4.method2458();
                }
                if ((var9 & 0x2) == 0) {
                    field1517[var7] = var11;
                } else {
                    field1517[var7] = var4.method2458();
                }
                if ((var9 & 0x4) == 0) {
                    field1520[var7] = var11;
                } else {
                    field1520[var7] = var4.method2458();
                }
                var6 = var8;
                var7++;
                if (this.field1519.field1756[var8] == 5) {
                    this.field1524 = true;
                }
            }
        }
        if (var4.field1988 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1522 = var7;
        this.field1521 = new int[var7];
        this.field1527 = new int[var7];
        this.field1525 = new int[var7];
        this.field1526 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1521[var12] = field1523[var12];
            this.field1527[var12] = field1518[var12];
            this.field1525[var12] = field1517[var12];
            this.field1526[var12] = field1520[var12];
        }
    }
}
