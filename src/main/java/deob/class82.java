package deob;

@ObfuscatedName("cq")
public class class82 {

    @ObfuscatedName("cq.p")
    public static int[] field1434 = new int[500];

    @ObfuscatedName("cq.y")
    public static int[] field1427 = new int[500];

    @ObfuscatedName("cq.d")
    public static int[] field1428 = new int[500];

    @ObfuscatedName("cq.c")
    public static int[] field1429 = new int[500];

    @ObfuscatedName("cq.r")
    public class96 field1430 = null;

    @ObfuscatedName("cq.f")
    public int field1431 = -1;

    @ObfuscatedName("cq.z")
    public int[] field1433;

    @ObfuscatedName("cq.o")
    public int[] field1426;

    @ObfuscatedName("cq.k")
    public int[] field1432;

    @ObfuscatedName("cq.s")
    public int[] field1435;

    @ObfuscatedName("cq.h")
    public boolean field1436 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1430 = arg1;
        class110 var3 = new class110(arg0);
        class110 var4 = new class110(arg0);
        var3.field1842 = 2;
        int var5 = var3.method2309();
        int var6 = -1;
        int var7 = 0;
        var4.field1842 = var3.field1842 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2309();
            if (var9 > 0) {
                if (this.field1430.field1656[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1430.field1656[var10] == 0) {
                            field1434[var7] = var10;
                            field1427[var7] = 0;
                            field1428[var7] = 0;
                            field1429[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1434[var7] = var8;
                short var11 = 0;
                if (this.field1430.field1656[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1427[var7] = var11;
                } else {
                    field1427[var7] = var4.method2192();
                }
                if ((var9 & 0x2) == 0) {
                    field1428[var7] = var11;
                } else {
                    field1428[var7] = var4.method2192();
                }
                if ((var9 & 0x4) == 0) {
                    field1429[var7] = var11;
                } else {
                    field1429[var7] = var4.method2192();
                }
                var6 = var8;
                var7++;
                if (this.field1430.field1656[var8] == 5) {
                    this.field1436 = true;
                }
            }
        }
        if (var4.field1842 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1431 = var7;
        this.field1433 = new int[var7];
        this.field1426 = new int[var7];
        this.field1432 = new int[var7];
        this.field1435 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1433[var12] = field1434[var12];
            this.field1426[var12] = field1427[var12];
            this.field1432[var12] = field1428[var12];
            this.field1435[var12] = field1429[var12];
        }
    }
}
