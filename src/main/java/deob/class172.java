package deob;

@ObfuscatedName("ft")
public class class172 {

    @ObfuscatedName("ft.f")
    public static int[] field1870 = new int[500];

    @ObfuscatedName("ft.o")
    public static int[] field1864 = new int[500];

    @ObfuscatedName("ft.u")
    public static int[] field1869 = new int[500];

    @ObfuscatedName("ft.p")
    public static int[] field1863 = new int[500];

    @ObfuscatedName("ft.b")
    public class175 field1862 = null;

    @ObfuscatedName("ft.e")
    public int field1865 = -1;

    @ObfuscatedName("ft.k")
    public int[] field1866;

    @ObfuscatedName("ft.g")
    public int[] field1867;

    @ObfuscatedName("ft.h")
    public int[] field1868;

    @ObfuscatedName("ft.n")
    public int[] field1860;

    @ObfuscatedName("ft.l")
    public boolean field1861 = false;

    public class172(byte[] arg0, class175 arg1) {
        this.field1862 = arg1;
        class382 var3 = new class382(arg0);
        class382 var4 = new class382(arg0);
        var3.field4155 = 2;
        int var5 = var3.method5856();
        int var6 = -1;
        int var7 = 0;
        var4.field4155 = var3.field4155 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5856();
            if (var9 > 0) {
                if (this.field1862.field1926[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1862.field1926[var10] == 0) {
                            field1870[var7] = var10;
                            field1864[var7] = 0;
                            field1869[var7] = 0;
                            field1863[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1870[var7] = var8;
                short var11 = 0;
                if (this.field1862.field1926[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1864[var7] = var11;
                } else {
                    field1864[var7] = var4.method6063();
                }
                if ((var9 & 0x2) == 0) {
                    field1869[var7] = var11;
                } else {
                    field1869[var7] = var4.method6063();
                }
                if ((var9 & 0x4) == 0) {
                    field1863[var7] = var11;
                } else {
                    field1863[var7] = var4.method6063();
                }
                var6 = var8;
                var7++;
                if (this.field1862.field1926[var8] == 5) {
                    this.field1861 = true;
                }
            }
        }
        if (var4.field4155 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1865 = var7;
        this.field1866 = new int[var7];
        this.field1867 = new int[var7];
        this.field1868 = new int[var7];
        this.field1860 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1866[var12] = field1870[var12];
            this.field1867[var12] = field1864[var12];
            this.field1868[var12] = field1869[var12];
            this.field1860[var12] = field1863[var12];
        }
    }
}
