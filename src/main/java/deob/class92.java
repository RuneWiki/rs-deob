package deob;

@ObfuscatedName("ca")
public class class92 {

    @ObfuscatedName("ca.a")
    public static int[] field1632 = new int[500];

    @ObfuscatedName("ca.d")
    public static int[] field1633 = new int[500];

    @ObfuscatedName("ca.v")
    public static int[] field1626 = new int[500];

    @ObfuscatedName("ca.r")
    public static int[] field1627 = new int[500];

    @ObfuscatedName("ca.z")
    public class106 field1628 = null;

    @ObfuscatedName("ca.t")
    public int field1629 = -1;

    @ObfuscatedName("ca.n")
    public int[] field1630;

    @ObfuscatedName("ca.i")
    public int[] field1624;

    @ObfuscatedName("ca.g")
    public int[] field1625;

    @ObfuscatedName("ca.m")
    public int[] field1631;

    @ObfuscatedName("ca.k")
    public boolean field1634 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1628 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2071 = 2;
        int var5 = var3.method2395();
        int var6 = -1;
        int var7 = 0;
        var4.field2071 = var3.field2071 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2395();
            if (var9 > 0) {
                if (this.field1628.field1848[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1628.field1848[var10] == 0) {
                            field1632[var7] = var10;
                            field1633[var7] = 0;
                            field1626[var7] = 0;
                            field1627[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1632[var7] = var8;
                short var11 = 0;
                if (this.field1628.field1848[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1633[var7] = var11;
                } else {
                    field1633[var7] = var4.method2407();
                }
                if ((var9 & 0x2) == 0) {
                    field1626[var7] = var11;
                } else {
                    field1626[var7] = var4.method2407();
                }
                if ((var9 & 0x4) == 0) {
                    field1627[var7] = var11;
                } else {
                    field1627[var7] = var4.method2407();
                }
                var6 = var8;
                var7++;
                if (this.field1628.field1848[var8] == 5) {
                    this.field1634 = true;
                }
            }
        }
        if (var4.field2071 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1629 = var7;
        this.field1630 = new int[var7];
        this.field1624 = new int[var7];
        this.field1625 = new int[var7];
        this.field1631 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1630[var12] = field1632[var12];
            this.field1624[var12] = field1633[var12];
            this.field1625[var12] = field1626[var12];
            this.field1631[var12] = field1627[var12];
        }
    }
}
