package deob;

@ObfuscatedName("gv")
public class class179 {

    @ObfuscatedName("gv.ab")
    public static int[] field1909 = new int[500];

    @ObfuscatedName("gv.ay")
    public static int[] field1904 = new int[500];

    @ObfuscatedName("gv.an")
    public static int[] field1905 = new int[500];

    @ObfuscatedName("gv.au")
    public static int[] field1906 = new int[500];

    @ObfuscatedName("gv.ax")
    public class185 field1907 = null;

    @ObfuscatedName("gv.ao")
    public int field1911 = -1;

    @ObfuscatedName("gv.am")
    public int[] field1908;

    @ObfuscatedName("gv.ac")
    public int[] field1910;

    @ObfuscatedName("gv.ae")
    public int[] field1912;

    @ObfuscatedName("gv.ad")
    public int[] field1903;

    @ObfuscatedName("gv.aq")
    public boolean field1913 = false;

    public class179(byte[] arg0, class185 arg1) {
        this.field1907 = arg1;
        class549 var3 = new class549(arg0);
        class549 var4 = new class549(arg0);
        var3.field5378 = 2;
        int var5 = var3.method9025();
        int var6 = -1;
        int var7 = 0;
        var4.field5378 = var3.field5378 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method9025();
            if (var9 > 0) {
                if (this.field1907.field1979[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1907.field1979[var10] == 0) {
                            field1909[var7] = var10;
                            field1904[var7] = 0;
                            field1905[var7] = 0;
                            field1906[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1909[var7] = var8;
                short var11 = 0;
                if (this.field1907.field1979[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1904[var7] = var11;
                } else {
                    field1904[var7] = var4.method8812();
                }
                if ((var9 & 0x2) == 0) {
                    field1905[var7] = var11;
                } else {
                    field1905[var7] = var4.method8812();
                }
                if ((var9 & 0x4) == 0) {
                    field1906[var7] = var11;
                } else {
                    field1906[var7] = var4.method8812();
                }
                var6 = var8;
                var7++;
                if (this.field1907.field1979[var8] == 5) {
                    this.field1913 = true;
                }
            }
        }
        if (var4.field5378 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1911 = var7;
        this.field1908 = new int[var7];
        this.field1910 = new int[var7];
        this.field1912 = new int[var7];
        this.field1903 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1908[var12] = field1909[var12];
            this.field1910[var12] = field1904[var12];
            this.field1912[var12] = field1905[var12];
            this.field1903[var12] = field1906[var12];
        }
    }
}
