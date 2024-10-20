package deob;

@ObfuscatedName("cx")
public class class81 {

    @ObfuscatedName("cx.f")
    public static int[] field1345 = new int[500];

    @ObfuscatedName("cx.i")
    public static int[] field1340 = new int[500];

    @ObfuscatedName("cx.u")
    public static int[] field1341 = new int[500];

    @ObfuscatedName("cx.h")
    public static int[] field1339 = new int[500];

    @ObfuscatedName("cx.r")
    public class87 field1343 = null;

    @ObfuscatedName("cx.o")
    public int field1344 = -1;

    @ObfuscatedName("cx.l")
    public int[] field1342;

    @ObfuscatedName("cx.n")
    public int[] field1346;

    @ObfuscatedName("cx.m")
    public int[] field1347;

    @ObfuscatedName("cx.w")
    public int[] field1348;

    @ObfuscatedName("cx.j")
    public boolean field1349 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1343 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2111 = 2;
        int var5 = var3.method2666();
        int var6 = -1;
        int var7 = 0;
        var4.field2111 = var3.field2111 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2666();
            if (var9 > 0) {
                if (this.field1343.field1490[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1343.field1490[var10] == 0) {
                            field1345[var7] = var10;
                            field1340[var7] = 0;
                            field1341[var7] = 0;
                            field1339[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1345[var7] = var8;
                short var11 = 0;
                if (this.field1343.field1490[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1340[var7] = var11;
                } else {
                    field1340[var7] = var4.method2719();
                }
                if ((var9 & 0x2) == 0) {
                    field1341[var7] = var11;
                } else {
                    field1341[var7] = var4.method2719();
                }
                if ((var9 & 0x4) == 0) {
                    field1339[var7] = var11;
                } else {
                    field1339[var7] = var4.method2719();
                }
                var6 = var8;
                var7++;
                if (this.field1343.field1490[var8] == 5) {
                    this.field1349 = true;
                }
            }
        }
        if (var4.field2111 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1344 = var7;
        this.field1342 = new int[var7];
        this.field1346 = new int[var7];
        this.field1347 = new int[var7];
        this.field1348 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1342[var12] = field1345[var12];
            this.field1346[var12] = field1340[var12];
            this.field1347[var12] = field1341[var12];
            this.field1348[var12] = field1339[var12];
        }
    }
}
