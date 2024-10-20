package deob;

@ObfuscatedName("cs")
public class class88 {

    @ObfuscatedName("cs.g")
    public static int[] field1535 = new int[500];

    @ObfuscatedName("cs.b")
    public static int[] field1529 = new int[500];

    @ObfuscatedName("cs.w")
    public static int[] field1530 = new int[500];

    @ObfuscatedName("cs.d")
    public static int[] field1531 = new int[500];

    @ObfuscatedName("cs.z")
    public class102 field1538 = null;

    @ObfuscatedName("cs.l")
    public int field1528 = -1;

    @ObfuscatedName("cs.m")
    public int[] field1532;

    @ObfuscatedName("cs.p")
    public int[] field1533;

    @ObfuscatedName("cs.u")
    public int[] field1536;

    @ObfuscatedName("cs.c")
    public int[] field1537;

    @ObfuscatedName("cs.v")
    public boolean field1534 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1538 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1977 = 2;
        int var5 = var3.method2362();
        int var6 = -1;
        int var7 = 0;
        var4.field1977 = var3.field1977 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2362();
            if (var9 > 0) {
                if (this.field1538.field1753[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1538.field1753[var10] == 0) {
                            field1535[var7] = var10;
                            field1529[var7] = 0;
                            field1530[var7] = 0;
                            field1531[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1535[var7] = var8;
                short var11 = 0;
                if (this.field1538.field1753[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1529[var7] = var11;
                } else {
                    field1529[var7] = var4.method2374();
                }
                if ((var9 & 0x2) == 0) {
                    field1530[var7] = var11;
                } else {
                    field1530[var7] = var4.method2374();
                }
                if ((var9 & 0x4) == 0) {
                    field1531[var7] = var11;
                } else {
                    field1531[var7] = var4.method2374();
                }
                var6 = var8;
                var7++;
                if (this.field1538.field1753[var8] == 5) {
                    this.field1534 = true;
                }
            }
        }
        if (var4.field1977 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1528 = var7;
        this.field1532 = new int[var7];
        this.field1533 = new int[var7];
        this.field1536 = new int[var7];
        this.field1537 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1532[var12] = field1535[var12];
            this.field1533[var12] = field1529[var12];
            this.field1536[var12] = field1530[var12];
            this.field1537[var12] = field1531[var12];
        }
    }
}
