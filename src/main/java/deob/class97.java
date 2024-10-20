package deob;

@ObfuscatedName("ck")
public class class97 {

    @ObfuscatedName("ck.j")
    public static int[] field1612 = new int[500];

    @ObfuscatedName("ck.r")
    public static int[] field1618 = new int[500];

    @ObfuscatedName("ck.v")
    public static int[] field1613 = new int[500];

    @ObfuscatedName("ck.p")
    public static int[] field1616 = new int[500];

    @ObfuscatedName("ck.e")
    public class105 field1615 = null;

    @ObfuscatedName("ck.d")
    public int field1614 = -1;

    @ObfuscatedName("ck.y")
    public int[] field1617;

    @ObfuscatedName("ck.x")
    public int[] field1611;

    @ObfuscatedName("ck.t")
    public int[] field1619;

    @ObfuscatedName("ck.i")
    public int[] field1620;

    @ObfuscatedName("ck.z")
    public boolean field1621 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1615 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2022 = 2;
        int var5 = var3.method2441();
        int var6 = -1;
        int var7 = 0;
        var4.field2022 = var3.field2022 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2441();
            if (var9 > 0) {
                if (this.field1615.field1771[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1615.field1771[var10] == 0) {
                            field1612[var7] = var10;
                            field1618[var7] = 0;
                            field1613[var7] = 0;
                            field1616[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1612[var7] = var8;
                short var11 = 0;
                if (this.field1615.field1771[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1618[var7] = var11;
                } else {
                    field1618[var7] = var4.method2508();
                }
                if ((var9 & 0x2) == 0) {
                    field1613[var7] = var11;
                } else {
                    field1613[var7] = var4.method2508();
                }
                if ((var9 & 0x4) == 0) {
                    field1616[var7] = var11;
                } else {
                    field1616[var7] = var4.method2508();
                }
                var6 = var8;
                var7++;
                if (this.field1615.field1771[var8] == 5) {
                    this.field1621 = true;
                }
            }
        }
        if (var4.field2022 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1614 = var7;
        this.field1617 = new int[var7];
        this.field1611 = new int[var7];
        this.field1619 = new int[var7];
        this.field1620 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1617[var12] = field1612[var12];
            this.field1611[var12] = field1618[var12];
            this.field1619[var12] = field1613[var12];
            this.field1620[var12] = field1616[var12];
        }
    }
}
