package deob;

@ObfuscatedName("cq")
public class class88 {

    @ObfuscatedName("cq.i")
    public static int[] field1534 = new int[500];

    @ObfuscatedName("cq.v")
    public static int[] field1537 = new int[500];

    @ObfuscatedName("cq.f")
    public static int[] field1532 = new int[500];

    @ObfuscatedName("cq.h")
    public static int[] field1535 = new int[500];

    @ObfuscatedName("cq.a")
    public class102 field1536 = null;

    @ObfuscatedName("cq.s")
    public int field1533 = -1;

    @ObfuscatedName("cq.p")
    public int[] field1538;

    @ObfuscatedName("cq.r")
    public int[] field1539;

    @ObfuscatedName("cq.k")
    public int[] field1540;

    @ObfuscatedName("cq.d")
    public int[] field1541;

    @ObfuscatedName("cq.n")
    public boolean field1542 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1536 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1984 = 2;
        int var5 = var3.method2310();
        int var6 = -1;
        int var7 = 0;
        var4.field1984 = var3.field1984 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2310();
            if (var9 > 0) {
                if (this.field1536.field1756[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1536.field1756[var10] == 0) {
                            field1534[var7] = var10;
                            field1537[var7] = 0;
                            field1532[var7] = 0;
                            field1535[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1534[var7] = var8;
                short var11 = 0;
                if (this.field1536.field1756[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1537[var7] = var11;
                } else {
                    field1537[var7] = var4.method2322();
                }
                if ((var9 & 0x2) == 0) {
                    field1532[var7] = var11;
                } else {
                    field1532[var7] = var4.method2322();
                }
                if ((var9 & 0x4) == 0) {
                    field1535[var7] = var11;
                } else {
                    field1535[var7] = var4.method2322();
                }
                var6 = var8;
                var7++;
                if (this.field1536.field1756[var8] == 5) {
                    this.field1542 = true;
                }
            }
        }
        if (var4.field1984 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1533 = var7;
        this.field1538 = new int[var7];
        this.field1539 = new int[var7];
        this.field1540 = new int[var7];
        this.field1541 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1538[var12] = field1534[var12];
            this.field1539[var12] = field1537[var12];
            this.field1540[var12] = field1532[var12];
            this.field1541[var12] = field1535[var12];
        }
    }
}
