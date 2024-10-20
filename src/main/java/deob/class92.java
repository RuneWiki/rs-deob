package deob;

@ObfuscatedName("ci")
public class class92 {

    @ObfuscatedName("ci.l")
    public static int[] field1618 = new int[500];

    @ObfuscatedName("ci.g")
    public static int[] field1623 = new int[500];

    @ObfuscatedName("ci.r")
    public static int[] field1626 = new int[500];

    @ObfuscatedName("ci.e")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("ci.h")
    public class106 field1620 = null;

    @ObfuscatedName("ci.s")
    public int field1621 = -1;

    @ObfuscatedName("ci.k")
    public int[] field1622;

    @ObfuscatedName("ci.u")
    public int[] field1624;

    @ObfuscatedName("ci.n")
    public int[] field1616;

    @ObfuscatedName("ci.b")
    public int[] field1625;

    @ObfuscatedName("ci.m")
    public boolean field1617 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1620 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2051 = 2;
        int var5 = var3.method2490();
        int var6 = -1;
        int var7 = 0;
        var4.field2051 = var3.field2051 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2490();
            if (var9 > 0) {
                if (this.field1620.field1837[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1620.field1837[var10] == 0) {
                            field1618[var7] = var10;
                            field1623[var7] = 0;
                            field1626[var7] = 0;
                            field1619[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1618[var7] = var8;
                short var11 = 0;
                if (this.field1620.field1837[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1623[var7] = var11;
                } else {
                    field1623[var7] = var4.method2502();
                }
                if ((var9 & 0x2) == 0) {
                    field1626[var7] = var11;
                } else {
                    field1626[var7] = var4.method2502();
                }
                if ((var9 & 0x4) == 0) {
                    field1619[var7] = var11;
                } else {
                    field1619[var7] = var4.method2502();
                }
                var6 = var8;
                var7++;
                if (this.field1620.field1837[var8] == 5) {
                    this.field1617 = true;
                }
            }
        }
        if (var4.field2051 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1621 = var7;
        this.field1622 = new int[var7];
        this.field1624 = new int[var7];
        this.field1616 = new int[var7];
        this.field1625 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1622[var12] = field1618[var12];
            this.field1624[var12] = field1623[var12];
            this.field1616[var12] = field1626[var12];
            this.field1625[var12] = field1619[var12];
        }
    }
}
