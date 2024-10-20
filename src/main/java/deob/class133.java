package deob;

@ObfuscatedName("ez")
public class class133 {

    @ObfuscatedName("ez.e")
    public static int[] field1879 = new int[500];

    @ObfuscatedName("ez.n")
    public static int[] field1877 = new int[500];

    @ObfuscatedName("ez.g")
    public static int[] field1878 = new int[500];

    @ObfuscatedName("ez.y")
    public static int[] field1882 = new int[500];

    @ObfuscatedName("ez.w")
    public class140 field1876 = null;

    @ObfuscatedName("ez.k")
    public int field1881 = -1;

    @ObfuscatedName("ez.v")
    public int[] field1880;

    @ObfuscatedName("ez.z")
    public int[] field1883;

    @ObfuscatedName("ez.r")
    public int[] field1884;

    @ObfuscatedName("ez.u")
    public int[] field1885;

    @ObfuscatedName("ez.d")
    public boolean field1886 = false;

    public class133(byte[] arg0, class140 arg1) {
        this.field1876 = arg1;
        class175 var3 = new class175(arg0);
        class175 var4 = new class175(arg0);
        var3.field2381 = 2;
        int var5 = var3.method2928();
        int var6 = -1;
        int var7 = 0;
        var4.field2381 = var3.field2381 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2928();
            if (var9 > 0) {
                if (this.field1876.field2041[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1876.field2041[var10] == 0) {
                            field1879[var7] = var10;
                            field1877[var7] = 0;
                            field1878[var7] = 0;
                            field1882[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1879[var7] = var8;
                short var11 = 0;
                if (this.field1876.field2041[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1877[var7] = var11;
                } else {
                    field1877[var7] = var4.method2940();
                }
                if ((var9 & 0x2) == 0) {
                    field1878[var7] = var11;
                } else {
                    field1878[var7] = var4.method2940();
                }
                if ((var9 & 0x4) == 0) {
                    field1882[var7] = var11;
                } else {
                    field1882[var7] = var4.method2940();
                }
                var6 = var8;
                var7++;
                if (this.field1876.field2041[var8] == 5) {
                    this.field1886 = true;
                }
            }
        }
        if (var4.field2381 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1881 = var7;
        this.field1880 = new int[var7];
        this.field1883 = new int[var7];
        this.field1884 = new int[var7];
        this.field1885 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1880[var12] = field1879[var12];
            this.field1883[var12] = field1877[var12];
            this.field1884[var12] = field1878[var12];
            this.field1885[var12] = field1882[var12];
        }
    }
}
