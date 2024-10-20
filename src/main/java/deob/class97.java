package deob;

@ObfuscatedName("cz")
public class class97 {

    @ObfuscatedName("cz.d")
    public static int[] field1622 = new int[500];

    @ObfuscatedName("cz.g")
    public static int[] field1624 = new int[500];

    @ObfuscatedName("cz.a")
    public static int[] field1626 = new int[500];

    @ObfuscatedName("cz.t")
    public static int[] field1623 = new int[500];

    @ObfuscatedName("cz.f")
    public class105 field1620 = null;

    @ObfuscatedName("cz.c")
    public int field1621 = -1;

    @ObfuscatedName("cz.p")
    public int[] field1625;

    @ObfuscatedName("cz.s")
    public int[] field1627;

    @ObfuscatedName("cz.k")
    public int[] field1628;

    @ObfuscatedName("cz.m")
    public int[] field1629;

    @ObfuscatedName("cz.y")
    public boolean field1630 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1620 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2042 = 2;
        int var5 = var3.method2509();
        int var6 = -1;
        int var7 = 0;
        var4.field2042 = var3.field2042 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2509();
            if (var9 > 0) {
                if (this.field1620.field1780[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1620.field1780[var10] == 0) {
                            field1622[var7] = var10;
                            field1624[var7] = 0;
                            field1626[var7] = 0;
                            field1623[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1622[var7] = var8;
                short var11 = 0;
                if (this.field1620.field1780[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1624[var7] = var11;
                } else {
                    field1624[var7] = var4.method2412();
                }
                if ((var9 & 0x2) == 0) {
                    field1626[var7] = var11;
                } else {
                    field1626[var7] = var4.method2412();
                }
                if ((var9 & 0x4) == 0) {
                    field1623[var7] = var11;
                } else {
                    field1623[var7] = var4.method2412();
                }
                var6 = var8;
                var7++;
                if (this.field1620.field1780[var8] == 5) {
                    this.field1630 = true;
                }
            }
        }
        if (var4.field2042 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1621 = var7;
        this.field1625 = new int[var7];
        this.field1627 = new int[var7];
        this.field1628 = new int[var7];
        this.field1629 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1625[var12] = field1622[var12];
            this.field1627[var12] = field1624[var12];
            this.field1628[var12] = field1626[var12];
            this.field1629[var12] = field1623[var12];
        }
    }
}
