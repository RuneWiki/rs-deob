package deob;

@ObfuscatedName("cp")
public class class147 {

    @ObfuscatedName("cp.g")
    public int[] field2208;

    @ObfuscatedName("cp.d")
    public int[] field2207;

    @ObfuscatedName("cp.b")
    public static int[] field2202 = new int[500];

    @ObfuscatedName("cp.c")
    public static int[] field2201 = new int[500];

    @ObfuscatedName("cp.m")
    public class44 field2204 = null;

    @ObfuscatedName("cp.j")
    public int[] field2209;

    @ObfuscatedName("cp.i")
    public static int[] field2206 = new int[500];

    @ObfuscatedName("cp.v")
    public static int[] field2203 = new int[500];

    @ObfuscatedName("cp.z")
    public int field2205 = -1;

    @ObfuscatedName("cp.y")
    public boolean field2210 = false;

    @ObfuscatedName("cp.x")
    public int[] field2200;

    public class147(byte[] arg0, class44 arg1) {
        this.field2204 = arg1;
        class28 var3 = new class28(arg0);
        class28 var4 = new class28(arg0);
        var3.field303 = 2;
        int var5 = var3.method450();
        int var6 = -1;
        int var7 = 0;
        var4.field303 = var3.field303 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method450();
            if (var9 > 0) {
                if (this.field2204.field511[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2204.field511[var10] == 0) {
                            field2203[var7] = var10;
                            field2201[var7] = 0;
                            field2202[var7] = 0;
                            field2206[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2203[var7] = var8;
                short var11 = 0;
                if (this.field2204.field511[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2201[var7] = var11;
                } else {
                    field2201[var7] = var4.method324();
                }
                if ((var9 & 0x2) == 0) {
                    field2202[var7] = var11;
                } else {
                    field2202[var7] = var4.method324();
                }
                if ((var9 & 0x4) == 0) {
                    field2206[var7] = var11;
                } else {
                    field2206[var7] = var4.method324();
                }
                var6 = var8;
                var7++;
                if (this.field2204.field511[var8] == 5) {
                    this.field2210 = true;
                }
            }
        }
        if (var4.field303 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2205 = var7;
        this.field2200 = new int[var7];
        this.field2207 = new int[var7];
        this.field2209 = new int[var7];
        this.field2208 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2200[var12] = field2203[var12];
            this.field2207[var12] = field2201[var12];
            this.field2209[var12] = field2202[var12];
            this.field2208[var12] = field2206[var12];
        }
    }
}
