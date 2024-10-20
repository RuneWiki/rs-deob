package deob;

@ObfuscatedName("cd")
public class class88 {

    @ObfuscatedName("cd.z")
    public static int[] field1530 = new int[500];

    @ObfuscatedName("cd.q")
    public static int[] field1529 = new int[500];

    @ObfuscatedName("cd.k")
    public static int[] field1533 = new int[500];

    @ObfuscatedName("cd.f")
    public static int[] field1531 = new int[500];

    @ObfuscatedName("cd.d")
    public class102 field1532 = null;

    @ObfuscatedName("cd.l")
    public int field1535 = -1;

    @ObfuscatedName("cd.r")
    public int[] field1534;

    @ObfuscatedName("cd.g")
    public int[] field1528;

    @ObfuscatedName("cd.h")
    public int[] field1536;

    @ObfuscatedName("cd.n")
    public int[] field1537;

    @ObfuscatedName("cd.j")
    public boolean field1538 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1532 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1986 = 2;
        int var5 = var3.method2457();
        int var6 = -1;
        int var7 = 0;
        var4.field1986 = var3.field1986 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2457();
            if (var9 > 0) {
                if (this.field1532.field1752[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1532.field1752[var10] == 0) {
                            field1530[var7] = var10;
                            field1529[var7] = 0;
                            field1533[var7] = 0;
                            field1531[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1530[var7] = var8;
                short var11 = 0;
                if (this.field1532.field1752[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1529[var7] = var11;
                } else {
                    field1529[var7] = var4.method2390();
                }
                if ((var9 & 0x2) == 0) {
                    field1533[var7] = var11;
                } else {
                    field1533[var7] = var4.method2390();
                }
                if ((var9 & 0x4) == 0) {
                    field1531[var7] = var11;
                } else {
                    field1531[var7] = var4.method2390();
                }
                var6 = var8;
                var7++;
                if (this.field1532.field1752[var8] == 5) {
                    this.field1538 = true;
                }
            }
        }
        if (var4.field1986 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1535 = var7;
        this.field1534 = new int[var7];
        this.field1528 = new int[var7];
        this.field1536 = new int[var7];
        this.field1537 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1534[var12] = field1530[var12];
            this.field1528[var12] = field1529[var12];
            this.field1536[var12] = field1533[var12];
            this.field1537[var12] = field1531[var12];
        }
    }
}
