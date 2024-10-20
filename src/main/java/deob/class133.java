package deob;

@ObfuscatedName("ev")
public class class133 {

    @ObfuscatedName("ev.j")
    public static int[] field1896 = new int[500];

    @ObfuscatedName("ev.h")
    public static int[] field1892 = new int[500];

    @ObfuscatedName("ev.f")
    public static int[] field1891 = new int[500];

    @ObfuscatedName("ev.p")
    public static int[] field1894 = new int[500];

    @ObfuscatedName("ev.x")
    public class140 field1893 = null;

    @ObfuscatedName("ev.g")
    public int field1895 = -1;

    @ObfuscatedName("ev.c")
    public int[] field1897;

    @ObfuscatedName("ev.l")
    public int[] field1898;

    @ObfuscatedName("ev.w")
    public int[] field1899;

    @ObfuscatedName("ev.b")
    public int[] field1900;

    @ObfuscatedName("ev.o")
    public boolean field1901 = false;

    public class133(byte[] arg0, class140 arg1) {
        this.field1893 = arg1;
        class175 var3 = new class175(arg0);
        class175 var4 = new class175(arg0);
        var3.field2394 = 2;
        int var5 = var3.method2903();
        int var6 = -1;
        int var7 = 0;
        var4.field2394 = var3.field2394 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2903();
            if (var9 > 0) {
                if (this.field1893.field2054[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1893.field2054[var10] == 0) {
                            field1896[var7] = var10;
                            field1892[var7] = 0;
                            field1891[var7] = 0;
                            field1894[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1896[var7] = var8;
                short var11 = 0;
                if (this.field1893.field2054[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1892[var7] = var11;
                } else {
                    field1892[var7] = var4.method2949();
                }
                if ((var9 & 0x2) == 0) {
                    field1891[var7] = var11;
                } else {
                    field1891[var7] = var4.method2949();
                }
                if ((var9 & 0x4) == 0) {
                    field1894[var7] = var11;
                } else {
                    field1894[var7] = var4.method2949();
                }
                var6 = var8;
                var7++;
                if (this.field1893.field2054[var8] == 5) {
                    this.field1901 = true;
                }
            }
        }
        if (var4.field2394 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1895 = var7;
        this.field1897 = new int[var7];
        this.field1898 = new int[var7];
        this.field1899 = new int[var7];
        this.field1900 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1897[var12] = field1896[var12];
            this.field1898[var12] = field1892[var12];
            this.field1899[var12] = field1891[var12];
            this.field1900[var12] = field1894[var12];
        }
    }
}
