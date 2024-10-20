package deob;

@ObfuscatedName("cw")
public class class97 {

    @ObfuscatedName("cw.f")
    public static int[] field1629 = new int[500];

    @ObfuscatedName("cw.t")
    public static int[] field1620 = new int[500];

    @ObfuscatedName("cw.n")
    public static int[] field1626 = new int[500];

    @ObfuscatedName("cw.e")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("cw.l")
    public class105 field1623 = null;

    @ObfuscatedName("cw.d")
    public int field1624 = -1;

    @ObfuscatedName("cw.r")
    public int[] field1625;

    @ObfuscatedName("cw.k")
    public int[] field1621;

    @ObfuscatedName("cw.u")
    public int[] field1627;

    @ObfuscatedName("cw.o")
    public int[] field1628;

    @ObfuscatedName("cw.g")
    public boolean field1622 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1623 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2033 = 2;
        int var5 = var3.method2458();
        int var6 = -1;
        int var7 = 0;
        var4.field2033 = var3.field2033 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2458();
            if (var9 > 0) {
                if (this.field1623.field1779[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1623.field1779[var10] == 0) {
                            field1629[var7] = var10;
                            field1620[var7] = 0;
                            field1626[var7] = 0;
                            field1619[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1629[var7] = var8;
                short var11 = 0;
                if (this.field1623.field1779[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1620[var7] = var11;
                } else {
                    field1620[var7] = var4.method2521();
                }
                if ((var9 & 0x2) == 0) {
                    field1626[var7] = var11;
                } else {
                    field1626[var7] = var4.method2521();
                }
                if ((var9 & 0x4) == 0) {
                    field1619[var7] = var11;
                } else {
                    field1619[var7] = var4.method2521();
                }
                var6 = var8;
                var7++;
                if (this.field1623.field1779[var8] == 5) {
                    this.field1622 = true;
                }
            }
        }
        if (var4.field2033 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1624 = var7;
        this.field1625 = new int[var7];
        this.field1621 = new int[var7];
        this.field1627 = new int[var7];
        this.field1628 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1625[var12] = field1629[var12];
            this.field1621[var12] = field1620[var12];
            this.field1627[var12] = field1626[var12];
            this.field1628[var12] = field1619[var12];
        }
    }
}
