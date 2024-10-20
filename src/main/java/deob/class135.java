package deob;

@ObfuscatedName("eg")
public class class135 {

    @ObfuscatedName("eg.n")
    public static int[] field1656 = new int[500];

    @ObfuscatedName("eg.v")
    public static int[] field1651 = new int[500];

    @ObfuscatedName("eg.d")
    public static int[] field1652 = new int[500];

    @ObfuscatedName("eg.c")
    public static int[] field1653 = new int[500];

    @ObfuscatedName("eg.y")
    public class142 field1654 = null;

    @ObfuscatedName("eg.h")
    public int field1658 = -1;

    @ObfuscatedName("eg.z")
    public int[] field1660;

    @ObfuscatedName("eg.e")
    public int[] field1657;

    @ObfuscatedName("eg.q")
    public int[] field1650;

    @ObfuscatedName("eg.l")
    public int[] field1659;

    @ObfuscatedName("eg.s")
    public boolean field1655 = false;

    public class135(byte[] arg0, class142 arg1) {
        this.field1654 = arg1;
        class311 var3 = new class311(arg0);
        class311 var4 = new class311(arg0);
        var3.field3747 = 2;
        int var5 = var3.method5310();
        int var6 = -1;
        int var7 = 0;
        var4.field3747 = var3.field3747 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5310();
            if (var9 > 0) {
                if (this.field1654.field1811[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1654.field1811[var10] == 0) {
                            field1656[var7] = var10;
                            field1651[var7] = 0;
                            field1652[var7] = 0;
                            field1653[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1656[var7] = var8;
                short var11 = 0;
                if (this.field1654.field1811[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1651[var7] = var11;
                } else {
                    field1651[var7] = var4.method5352();
                }
                if ((var9 & 0x2) == 0) {
                    field1652[var7] = var11;
                } else {
                    field1652[var7] = var4.method5352();
                }
                if ((var9 & 0x4) == 0) {
                    field1653[var7] = var11;
                } else {
                    field1653[var7] = var4.method5352();
                }
                var6 = var8;
                var7++;
                if (this.field1654.field1811[var8] == 5) {
                    this.field1655 = true;
                }
            }
        }
        if (var4.field3747 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1658 = var7;
        this.field1660 = new int[var7];
        this.field1657 = new int[var7];
        this.field1650 = new int[var7];
        this.field1659 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1660[var12] = field1656[var12];
            this.field1657[var12] = field1651[var12];
            this.field1650[var12] = field1652[var12];
            this.field1659[var12] = field1653[var12];
        }
    }
}
