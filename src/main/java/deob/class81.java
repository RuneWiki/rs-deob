package deob;

@ObfuscatedName("cx")
public class class81 {

    @ObfuscatedName("cx.t")
    public static int[] field1424 = new int[500];

    @ObfuscatedName("cx.s")
    public static int[] field1430 = new int[500];

    @ObfuscatedName("cx.f")
    public static int[] field1429 = new int[500];

    @ObfuscatedName("cx.e")
    public static int[] field1423 = new int[500];

    @ObfuscatedName("cx.d")
    public class95 field1426 = null;

    @ObfuscatedName("cx.n")
    public int field1425 = -1;

    @ObfuscatedName("cx.v")
    public int[] field1421;

    @ObfuscatedName("cx.z")
    public int[] field1427;

    @ObfuscatedName("cx.j")
    public int[] field1428;

    @ObfuscatedName("cx.u")
    public int[] field1420;

    @ObfuscatedName("cx.g")
    public boolean field1422 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1426 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1830 = 2;
        int var5 = var3.method2101();
        int var6 = -1;
        int var7 = 0;
        var4.field1830 = var3.field1830 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2101();
            if (var9 > 0) {
                if (this.field1426.field1648[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1426.field1648[var10] == 0) {
                            field1424[var7] = var10;
                            field1430[var7] = 0;
                            field1429[var7] = 0;
                            field1423[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1424[var7] = var8;
                short var11 = 0;
                if (this.field1426.field1648[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1430[var7] = var11;
                } else {
                    field1430[var7] = var4.method2213();
                }
                if ((var9 & 0x2) == 0) {
                    field1429[var7] = var11;
                } else {
                    field1429[var7] = var4.method2213();
                }
                if ((var9 & 0x4) == 0) {
                    field1423[var7] = var11;
                } else {
                    field1423[var7] = var4.method2213();
                }
                var6 = var8;
                var7++;
                if (this.field1426.field1648[var8] == 5) {
                    this.field1422 = true;
                }
            }
        }
        if (var4.field1830 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1425 = var7;
        this.field1421 = new int[var7];
        this.field1427 = new int[var7];
        this.field1428 = new int[var7];
        this.field1420 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1421[var12] = field1424[var12];
            this.field1427[var12] = field1430[var12];
            this.field1428[var12] = field1429[var12];
            this.field1420[var12] = field1423[var12];
        }
    }
}
