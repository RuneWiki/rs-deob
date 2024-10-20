package deob;

@ObfuscatedName("cg")
public class class154 {

    @ObfuscatedName("cg.f")
    public int[] field2335;

    @ObfuscatedName("cg.g")
    public int[] field2334;

    @ObfuscatedName("cg.e")
    public int[] field2336;

    @ObfuscatedName("cg.n")
    public int[] field2332;

    @ObfuscatedName("cg.o")
    public static int[] field2329 = new int[500];

    @ObfuscatedName("cg.j")
    public static int[] field2327 = new int[500];

    @ObfuscatedName("cg.h")
    public class47 field2330 = null;

    @ObfuscatedName("cg.t")
    public static int[] field2333 = new int[500];

    @ObfuscatedName("cg.r")
    public int field2331 = -1;

    @ObfuscatedName("cg.p")
    public static int[] field2328 = new int[500];

    @ObfuscatedName("cg.x")
    public boolean field2326 = false;

    public class154(byte[] arg0, class47 arg1) {
        this.field2330 = arg1;
        class31 var3 = new class31(arg0);
        class31 var4 = new class31(arg0);
        var3.field172 = 2;
        int var5 = var3.method512();
        int var6 = -1;
        int var7 = 0;
        var4.field172 = var3.field172 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method512();
            if (var9 > 0) {
                if (this.field2330.field378[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2330.field378[var10] == 0) {
                            field2327[var7] = var10;
                            field2328[var7] = 0;
                            field2329[var7] = 0;
                            field2333[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2327[var7] = var8;
                short var11 = 0;
                if (this.field2330.field378[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2328[var7] = var11;
                } else {
                    field2328[var7] = var4.method421();
                }
                if ((var9 & 0x2) == 0) {
                    field2329[var7] = var11;
                } else {
                    field2329[var7] = var4.method421();
                }
                if ((var9 & 0x4) == 0) {
                    field2333[var7] = var11;
                } else {
                    field2333[var7] = var4.method421();
                }
                var6 = var8;
                var7++;
                if (this.field2330.field378[var8] == 5) {
                    this.field2326 = true;
                }
            }
        }
        if (var4.field172 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2331 = var7;
        this.field2332 = new int[var7];
        this.field2334 = new int[var7];
        this.field2336 = new int[var7];
        this.field2335 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2332[var12] = field2327[var12];
            this.field2334[var12] = field2328[var12];
            this.field2336[var12] = field2329[var12];
            this.field2335[var12] = field2333[var12];
        }
    }
}
