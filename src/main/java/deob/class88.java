package deob;

@ObfuscatedName("cv")
public class class88 {

    @ObfuscatedName("cv.f")
    public static int[] field1540 = new int[500];

    @ObfuscatedName("cv.s")
    public static int[] field1546 = new int[500];

    @ObfuscatedName("cv.q")
    public static int[] field1542 = new int[500];

    @ObfuscatedName("cv.g")
    public static int[] field1543 = new int[500];

    @ObfuscatedName("cv.m")
    public class102 field1544 = null;

    @ObfuscatedName("cv.t")
    public int field1545 = -1;

    @ObfuscatedName("cv.j")
    public int[] field1541;

    @ObfuscatedName("cv.n")
    public int[] field1547;

    @ObfuscatedName("cv.l")
    public int[] field1548;

    @ObfuscatedName("cv.i")
    public int[] field1549;

    @ObfuscatedName("cv.w")
    public boolean field1550 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1544 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1994 = 2;
        int var5 = var3.method2363();
        int var6 = -1;
        int var7 = 0;
        var4.field1994 = var3.field1994 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2363();
            if (var9 > 0) {
                if (this.field1544.field1758[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1544.field1758[var10] == 0) {
                            field1540[var7] = var10;
                            field1546[var7] = 0;
                            field1542[var7] = 0;
                            field1543[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1540[var7] = var8;
                short var11 = 0;
                if (this.field1544.field1758[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1546[var7] = var11;
                } else {
                    field1546[var7] = var4.method2375();
                }
                if ((var9 & 0x2) == 0) {
                    field1542[var7] = var11;
                } else {
                    field1542[var7] = var4.method2375();
                }
                if ((var9 & 0x4) == 0) {
                    field1543[var7] = var11;
                } else {
                    field1543[var7] = var4.method2375();
                }
                var6 = var8;
                var7++;
                if (this.field1544.field1758[var8] == 5) {
                    this.field1550 = true;
                }
            }
        }
        if (var4.field1994 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1545 = var7;
        this.field1541 = new int[var7];
        this.field1547 = new int[var7];
        this.field1548 = new int[var7];
        this.field1549 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1541[var12] = field1540[var12];
            this.field1547[var12] = field1546[var12];
            this.field1548[var12] = field1542[var12];
            this.field1549[var12] = field1543[var12];
        }
    }
}
