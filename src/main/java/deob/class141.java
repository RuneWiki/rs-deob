package deob;

@ObfuscatedName("cu")
public class class141 {

    @ObfuscatedName("cu.f")
    public int[] field2160;

    @ObfuscatedName("cu.d")
    public int field2157 = -1;

    @ObfuscatedName("cu.b")
    public static int[] field2159 = new int[500];

    @ObfuscatedName("cu.l")
    public int[] field2155;

    @ObfuscatedName("cu.j")
    public int[] field2161;

    @ObfuscatedName("cu.k")
    public static int[] field2154 = new int[500];

    @ObfuscatedName("cu.h")
    public static int[] field2156 = new int[500];

    @ObfuscatedName("cu.w")
    public static int[] field2152 = new int[500];

    @ObfuscatedName("cu.t")
    public class37 field2158 = null;

    @ObfuscatedName("cu.s")
    public int[] field2153;

    @ObfuscatedName("cu.x")
    public boolean field2162 = false;

    public class141(byte[] arg0, class37 arg1) {
        this.field2158 = arg1;
        class50 var3 = new class50(arg0);
        class50 var4 = new class50(arg0);
        var3.field540 = 2;
        int var5 = var3.method726();
        int var6 = -1;
        int var7 = 0;
        var4.field540 = var3.field540 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method726();
            if (var9 > 0) {
                if (this.field2158.field455[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2158.field455[var10] == 0) {
                            field2159[var7] = var10;
                            field2156[var7] = 0;
                            field2154[var7] = 0;
                            field2152[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2159[var7] = var8;
                short var11 = 0;
                if (this.field2158.field455[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2156[var7] = var11;
                } else {
                    field2156[var7] = var4.method692();
                }
                if ((var9 & 0x2) == 0) {
                    field2154[var7] = var11;
                } else {
                    field2154[var7] = var4.method692();
                }
                if ((var9 & 0x4) == 0) {
                    field2152[var7] = var11;
                } else {
                    field2152[var7] = var4.method692();
                }
                var6 = var8;
                var7++;
                if (this.field2158.field455[var8] == 5) {
                    this.field2162 = true;
                }
            }
        }
        if (var4.field540 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2157 = var7;
        this.field2155 = new int[var7];
        this.field2160 = new int[var7];
        this.field2153 = new int[var7];
        this.field2161 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2155[var12] = field2159[var12];
            this.field2160[var12] = field2156[var12];
            this.field2153[var12] = field2154[var12];
            this.field2161[var12] = field2152[var12];
        }
    }
}
