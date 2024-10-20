package deob;

@ObfuscatedName("ck")
public class class92 {

    @ObfuscatedName("ck.f")
    public static int[] field1597 = new int[500];

    @ObfuscatedName("ck.e")
    public static int[] field1606 = new int[500];

    @ObfuscatedName("ck.n")
    public static int[] field1598 = new int[500];

    @ObfuscatedName("ck.t")
    public static int[] field1599 = new int[500];

    @ObfuscatedName("ck.v")
    public class106 field1600 = null;

    @ObfuscatedName("ck.b")
    public int field1601 = -1;

    @ObfuscatedName("ck.m")
    public int[] field1604;

    @ObfuscatedName("ck.k")
    public int[] field1603;

    @ObfuscatedName("ck.c")
    public int[] field1602;

    @ObfuscatedName("ck.w")
    public int[] field1605;

    @ObfuscatedName("ck.l")
    public boolean field1596 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1600 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2052 = 2;
        int var5 = var3.method2522();
        int var6 = -1;
        int var7 = 0;
        var4.field2052 = var3.field2052 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2522();
            if (var9 > 0) {
                if (this.field1600.field1824[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1600.field1824[var10] == 0) {
                            field1597[var7] = var10;
                            field1606[var7] = 0;
                            field1598[var7] = 0;
                            field1599[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1597[var7] = var8;
                short var11 = 0;
                if (this.field1600.field1824[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1606[var7] = var11;
                } else {
                    field1606[var7] = var4.method2415();
                }
                if ((var9 & 0x2) == 0) {
                    field1598[var7] = var11;
                } else {
                    field1598[var7] = var4.method2415();
                }
                if ((var9 & 0x4) == 0) {
                    field1599[var7] = var11;
                } else {
                    field1599[var7] = var4.method2415();
                }
                var6 = var8;
                var7++;
                if (this.field1600.field1824[var8] == 5) {
                    this.field1596 = true;
                }
            }
        }
        if (var4.field2052 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1601 = var7;
        this.field1604 = new int[var7];
        this.field1603 = new int[var7];
        this.field1602 = new int[var7];
        this.field1605 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1604[var12] = field1597[var12];
            this.field1603[var12] = field1606[var12];
            this.field1602[var12] = field1598[var12];
            this.field1605[var12] = field1599[var12];
        }
    }
}
