package deob;

@ObfuscatedName("cl")
public class class97 {

    @ObfuscatedName("cl.y")
    public static int[] field1623 = new int[500];

    @ObfuscatedName("cl.m")
    public static int[] field1620 = new int[500];

    @ObfuscatedName("cl.d")
    public static int[] field1621 = new int[500];

    @ObfuscatedName("cl.k")
    public static int[] field1622 = new int[500];

    @ObfuscatedName("cl.n")
    public class105 field1619 = null;

    @ObfuscatedName("cl.s")
    public int field1628 = -1;

    @ObfuscatedName("cl.x")
    public int[] field1625;

    @ObfuscatedName("cl.b")
    public int[] field1626;

    @ObfuscatedName("cl.j")
    public int[] field1627;

    @ObfuscatedName("cl.p")
    public int[] field1624;

    @ObfuscatedName("cl.l")
    public boolean field1629 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1619 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2036 = 2;
        int var5 = var3.method2534();
        int var6 = -1;
        int var7 = 0;
        var4.field2036 = var3.field2036 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2534();
            if (var9 > 0) {
                if (this.field1619.field1774[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1619.field1774[var10] == 0) {
                            field1623[var7] = var10;
                            field1620[var7] = 0;
                            field1621[var7] = 0;
                            field1622[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1623[var7] = var8;
                short var11 = 0;
                if (this.field1619.field1774[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1620[var7] = var11;
                } else {
                    field1620[var7] = var4.method2470();
                }
                if ((var9 & 0x2) == 0) {
                    field1621[var7] = var11;
                } else {
                    field1621[var7] = var4.method2470();
                }
                if ((var9 & 0x4) == 0) {
                    field1622[var7] = var11;
                } else {
                    field1622[var7] = var4.method2470();
                }
                var6 = var8;
                var7++;
                if (this.field1619.field1774[var8] == 5) {
                    this.field1629 = true;
                }
            }
        }
        if (var4.field2036 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1628 = var7;
        this.field1625 = new int[var7];
        this.field1626 = new int[var7];
        this.field1627 = new int[var7];
        this.field1624 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1625[var12] = field1623[var12];
            this.field1626[var12] = field1620[var12];
            this.field1627[var12] = field1621[var12];
            this.field1624[var12] = field1622[var12];
        }
    }
}
