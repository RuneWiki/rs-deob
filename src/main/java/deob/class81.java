package deob;

@ObfuscatedName("cq")
public class class81 {

    @ObfuscatedName("cq.e")
    public static int[] field1432 = new int[500];

    @ObfuscatedName("cq.p")
    public static int[] field1423 = new int[500];

    @ObfuscatedName("cq.a")
    public static int[] field1430 = new int[500];

    @ObfuscatedName("cq.g")
    public static int[] field1425 = new int[500];

    @ObfuscatedName("cq.u")
    public class95 field1426 = null;

    @ObfuscatedName("cq.k")
    public int field1427 = -1;

    @ObfuscatedName("cq.m")
    public int[] field1422;

    @ObfuscatedName("cq.t")
    public int[] field1429;

    @ObfuscatedName("cq.l")
    public int[] field1428;

    @ObfuscatedName("cq.f")
    public int[] field1431;

    @ObfuscatedName("cq.c")
    public boolean field1424 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1426 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1841 = 2;
        int var5 = var3.method2125();
        int var6 = -1;
        int var7 = 0;
        var4.field1841 = var3.field1841 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2125();
            if (var9 > 0) {
                if (this.field1426.field1647[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1426.field1647[var10] == 0) {
                            field1432[var7] = var10;
                            field1423[var7] = 0;
                            field1430[var7] = 0;
                            field1425[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1432[var7] = var8;
                short var11 = 0;
                if (this.field1426.field1647[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1423[var7] = var11;
                } else {
                    field1423[var7] = var4.method2153();
                }
                if ((var9 & 0x2) == 0) {
                    field1430[var7] = var11;
                } else {
                    field1430[var7] = var4.method2153();
                }
                if ((var9 & 0x4) == 0) {
                    field1425[var7] = var11;
                } else {
                    field1425[var7] = var4.method2153();
                }
                var6 = var8;
                var7++;
                if (this.field1426.field1647[var8] == 5) {
                    this.field1424 = true;
                }
            }
        }
        if (var4.field1841 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1427 = var7;
        this.field1422 = new int[var7];
        this.field1429 = new int[var7];
        this.field1428 = new int[var7];
        this.field1431 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1422[var12] = field1432[var12];
            this.field1429[var12] = field1423[var12];
            this.field1428[var12] = field1430[var12];
            this.field1431[var12] = field1425[var12];
        }
    }
}
