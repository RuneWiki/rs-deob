package deob;

@ObfuscatedName("cq")
public class class92 {

    @ObfuscatedName("cq.i")
    public static int[] field1599 = new int[500];

    @ObfuscatedName("cq.h")
    public static int[] field1593 = new int[500];

    @ObfuscatedName("cq.e")
    public static int[] field1592 = new int[500];

    @ObfuscatedName("cq.g")
    public static int[] field1591 = new int[500];

    @ObfuscatedName("cq.n")
    public class106 field1594 = null;

    @ObfuscatedName("cq.u")
    public int field1595 = -1;

    @ObfuscatedName("cq.d")
    public int[] field1596;

    @ObfuscatedName("cq.l")
    public int[] field1597;

    @ObfuscatedName("cq.m")
    public int[] field1598;

    @ObfuscatedName("cq.j")
    public int[] field1590;

    @ObfuscatedName("cq.y")
    public boolean field1600 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1594 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2046 = 2;
        int var5 = var3.method2404();
        int var6 = -1;
        int var7 = 0;
        var4.field2046 = var3.field2046 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2404();
            if (var9 > 0) {
                if (this.field1594.field1819[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1594.field1819[var10] == 0) {
                            field1599[var7] = var10;
                            field1593[var7] = 0;
                            field1592[var7] = 0;
                            field1591[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1599[var7] = var8;
                short var11 = 0;
                if (this.field1594.field1819[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1593[var7] = var11;
                } else {
                    field1593[var7] = var4.method2416();
                }
                if ((var9 & 0x2) == 0) {
                    field1592[var7] = var11;
                } else {
                    field1592[var7] = var4.method2416();
                }
                if ((var9 & 0x4) == 0) {
                    field1591[var7] = var11;
                } else {
                    field1591[var7] = var4.method2416();
                }
                var6 = var8;
                var7++;
                if (this.field1594.field1819[var8] == 5) {
                    this.field1600 = true;
                }
            }
        }
        if (var4.field2046 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1595 = var7;
        this.field1596 = new int[var7];
        this.field1597 = new int[var7];
        this.field1598 = new int[var7];
        this.field1590 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1596[var12] = field1599[var12];
            this.field1597[var12] = field1593[var12];
            this.field1598[var12] = field1592[var12];
            this.field1590[var12] = field1591[var12];
        }
    }
}
