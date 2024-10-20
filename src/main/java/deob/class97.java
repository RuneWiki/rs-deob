package deob;

@ObfuscatedName("cs")
public class class97 {

    @ObfuscatedName("cs.p")
    public static int[] field1628 = new int[500];

    @ObfuscatedName("cs.l")
    public static int[] field1623 = new int[500];

    @ObfuscatedName("cs.d")
    public static int[] field1624 = new int[500];

    @ObfuscatedName("cs.x")
    public static int[] field1625 = new int[500];

    @ObfuscatedName("cs.o")
    public class105 field1626 = null;

    @ObfuscatedName("cs.a")
    public int field1627 = -1;

    @ObfuscatedName("cs.w")
    public int[] field1622;

    @ObfuscatedName("cs.i")
    public int[] field1629;

    @ObfuscatedName("cs.y")
    public int[] field1632;

    @ObfuscatedName("cs.m")
    public int[] field1631;

    @ObfuscatedName("cs.u")
    public boolean field1630 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1626 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2030 = 2;
        int var5 = var3.method2498();
        int var6 = -1;
        int var7 = 0;
        var4.field2030 = var3.field2030 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2498();
            if (var9 > 0) {
                if (this.field1626.field1783[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1626.field1783[var10] == 0) {
                            field1628[var7] = var10;
                            field1623[var7] = 0;
                            field1624[var7] = 0;
                            field1625[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1628[var7] = var8;
                short var11 = 0;
                if (this.field1626.field1783[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1623[var7] = var11;
                } else {
                    field1623[var7] = var4.method2529();
                }
                if ((var9 & 0x2) == 0) {
                    field1624[var7] = var11;
                } else {
                    field1624[var7] = var4.method2529();
                }
                if ((var9 & 0x4) == 0) {
                    field1625[var7] = var11;
                } else {
                    field1625[var7] = var4.method2529();
                }
                var6 = var8;
                var7++;
                if (this.field1626.field1783[var8] == 5) {
                    this.field1630 = true;
                }
            }
        }
        if (var4.field2030 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1627 = var7;
        this.field1622 = new int[var7];
        this.field1629 = new int[var7];
        this.field1632 = new int[var7];
        this.field1631 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1622[var12] = field1628[var12];
            this.field1629[var12] = field1623[var12];
            this.field1632[var12] = field1624[var12];
            this.field1631[var12] = field1625[var12];
        }
    }
}
