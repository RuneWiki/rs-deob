package deob;

@ObfuscatedName("ci")
public class class82 {

    @ObfuscatedName("ci.l")
    public static int[] field1426 = new int[500];

    @ObfuscatedName("ci.y")
    public static int[] field1420 = new int[500];

    @ObfuscatedName("ci.g")
    public static int[] field1421 = new int[500];

    @ObfuscatedName("ci.j")
    public static int[] field1422 = new int[500];

    @ObfuscatedName("ci.w")
    public class96 field1423 = null;

    @ObfuscatedName("ci.c")
    public int field1424 = -1;

    @ObfuscatedName("ci.x")
    public int[] field1425;

    @ObfuscatedName("ci.f")
    public int[] field1429;

    @ObfuscatedName("ci.t")
    public int[] field1427;

    @ObfuscatedName("ci.n")
    public int[] field1419;

    @ObfuscatedName("ci.p")
    public boolean field1428 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1423 = arg1;
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        var3.field1823 = 2;
        int var5 = var3.method2291();
        int var6 = -1;
        int var7 = 0;
        var4.field1823 = var3.field1823 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2291();
            if (var9 > 0) {
                if (this.field1423.field1644[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1423.field1644[var10] == 0) {
                            field1426[var7] = var10;
                            field1420[var7] = 0;
                            field1421[var7] = 0;
                            field1422[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1426[var7] = var8;
                short var11 = 0;
                if (this.field1423.field1644[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1420[var7] = var11;
                } else {
                    field1420[var7] = var4.method2172();
                }
                if ((var9 & 0x2) == 0) {
                    field1421[var7] = var11;
                } else {
                    field1421[var7] = var4.method2172();
                }
                if ((var9 & 0x4) == 0) {
                    field1422[var7] = var11;
                } else {
                    field1422[var7] = var4.method2172();
                }
                var6 = var8;
                var7++;
                if (this.field1423.field1644[var8] == 5) {
                    this.field1428 = true;
                }
            }
        }
        if (var4.field1823 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1424 = var7;
        this.field1425 = new int[var7];
        this.field1429 = new int[var7];
        this.field1427 = new int[var7];
        this.field1419 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1425[var12] = field1426[var12];
            this.field1429[var12] = field1420[var12];
            this.field1427[var12] = field1421[var12];
            this.field1419[var12] = field1422[var12];
        }
    }
}
