package deob;

@ObfuscatedName("ct")
public class class88 {

    @ObfuscatedName("ct.h")
    public static int[] field1544 = new int[500];

    @ObfuscatedName("ct.m")
    public static int[] field1537 = new int[500];

    @ObfuscatedName("ct.i")
    public static int[] field1538 = new int[500];

    @ObfuscatedName("ct.q")
    public static int[] field1536 = new int[500];

    @ObfuscatedName("ct.p")
    public class102 field1540 = null;

    @ObfuscatedName("ct.c")
    public int field1541 = -1;

    @ObfuscatedName("ct.f")
    public int[] field1542;

    @ObfuscatedName("ct.y")
    public int[] field1543;

    @ObfuscatedName("ct.w")
    public int[] field1539;

    @ObfuscatedName("ct.l")
    public int[] field1546;

    @ObfuscatedName("ct.v")
    public boolean field1545 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1540 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1988 = 2;
        int var5 = var3.method2320();
        int var6 = -1;
        int var7 = 0;
        var4.field1988 = var3.field1988 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2320();
            if (var9 > 0) {
                if (this.field1540.field1761[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1540.field1761[var10] == 0) {
                            field1544[var7] = var10;
                            field1537[var7] = 0;
                            field1538[var7] = 0;
                            field1536[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1544[var7] = var8;
                short var11 = 0;
                if (this.field1540.field1761[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1537[var7] = var11;
                } else {
                    field1537[var7] = var4.method2331();
                }
                if ((var9 & 0x2) == 0) {
                    field1538[var7] = var11;
                } else {
                    field1538[var7] = var4.method2331();
                }
                if ((var9 & 0x4) == 0) {
                    field1536[var7] = var11;
                } else {
                    field1536[var7] = var4.method2331();
                }
                var6 = var8;
                var7++;
                if (this.field1540.field1761[var8] == 5) {
                    this.field1545 = true;
                }
            }
        }
        if (var4.field1988 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1541 = var7;
        this.field1542 = new int[var7];
        this.field1543 = new int[var7];
        this.field1539 = new int[var7];
        this.field1546 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1542[var12] = field1544[var12];
            this.field1543[var12] = field1537[var12];
            this.field1539[var12] = field1538[var12];
            this.field1546[var12] = field1536[var12];
        }
    }
}
