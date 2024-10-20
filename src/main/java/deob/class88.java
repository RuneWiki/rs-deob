package deob;

@ObfuscatedName("cu")
public class class88 {

    @ObfuscatedName("cu.y")
    public static int[] field1535 = new int[500];

    @ObfuscatedName("cu.d")
    public static int[] field1537 = new int[500];

    @ObfuscatedName("cu.g")
    public static int[] field1531 = new int[500];

    @ObfuscatedName("cu.w")
    public static int[] field1532 = new int[500];

    @ObfuscatedName("cu.e")
    public class102 field1533 = null;

    @ObfuscatedName("cu.c")
    public int field1534 = -1;

    @ObfuscatedName("cu.a")
    public int[] field1536;

    @ObfuscatedName("cu.q")
    public int[] field1538;

    @ObfuscatedName("cu.m")
    public int[] field1530;

    @ObfuscatedName("cu.n")
    public int[] field1529;

    @ObfuscatedName("cu.k")
    public boolean field1539 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1533 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1973 = 2;
        int var5 = var3.method2326();
        int var6 = -1;
        int var7 = 0;
        var4.field1973 = var3.field1973 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2326();
            if (var9 > 0) {
                if (this.field1533.field1748[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1533.field1748[var10] == 0) {
                            field1535[var7] = var10;
                            field1537[var7] = 0;
                            field1531[var7] = 0;
                            field1532[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1535[var7] = var8;
                short var11 = 0;
                if (this.field1533.field1748[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1537[var7] = var11;
                } else {
                    field1537[var7] = var4.method2338();
                }
                if ((var9 & 0x2) == 0) {
                    field1531[var7] = var11;
                } else {
                    field1531[var7] = var4.method2338();
                }
                if ((var9 & 0x4) == 0) {
                    field1532[var7] = var11;
                } else {
                    field1532[var7] = var4.method2338();
                }
                var6 = var8;
                var7++;
                if (this.field1533.field1748[var8] == 5) {
                    this.field1539 = true;
                }
            }
        }
        if (var4.field1973 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1534 = var7;
        this.field1536 = new int[var7];
        this.field1538 = new int[var7];
        this.field1530 = new int[var7];
        this.field1529 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1536[var12] = field1535[var12];
            this.field1538[var12] = field1537[var12];
            this.field1530[var12] = field1531[var12];
            this.field1529[var12] = field1532[var12];
        }
    }
}
