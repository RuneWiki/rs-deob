package deob;

@ObfuscatedName("ct")
public class class89 {

    @ObfuscatedName("ct.s")
    public static int[] field1551 = new int[500];

    @ObfuscatedName("ct.j")
    public static int[] field1553 = new int[500];

    @ObfuscatedName("ct.p")
    public static int[] field1547 = new int[500];

    @ObfuscatedName("ct.x")
    public static int[] field1550 = new int[500];

    @ObfuscatedName("ct.d")
    public class103 field1549 = null;

    @ObfuscatedName("ct.u")
    public int field1548 = -1;

    @ObfuscatedName("ct.o")
    public int[] field1546;

    @ObfuscatedName("ct.b")
    public int[] field1552;

    @ObfuscatedName("ct.k")
    public int[] field1545;

    @ObfuscatedName("ct.c")
    public int[] field1554;

    @ObfuscatedName("ct.l")
    public boolean field1555 = false;

    public class89(byte[] arg0, class103 arg1) {
        this.field1549 = arg1;
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        var3.field2006 = 2;
        int var5 = var3.method2338();
        int var6 = -1;
        int var7 = 0;
        var4.field2006 = var3.field2006 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2338();
            if (var9 > 0) {
                if (this.field1549.field1774[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1549.field1774[var10] == 0) {
                            field1551[var7] = var10;
                            field1553[var7] = 0;
                            field1547[var7] = 0;
                            field1550[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1551[var7] = var8;
                short var11 = 0;
                if (this.field1549.field1774[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1553[var7] = var11;
                } else {
                    field1553[var7] = var4.method2431();
                }
                if ((var9 & 0x2) == 0) {
                    field1547[var7] = var11;
                } else {
                    field1547[var7] = var4.method2431();
                }
                if ((var9 & 0x4) == 0) {
                    field1550[var7] = var11;
                } else {
                    field1550[var7] = var4.method2431();
                }
                var6 = var8;
                var7++;
                if (this.field1549.field1774[var8] == 5) {
                    this.field1555 = true;
                }
            }
        }
        if (var4.field2006 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1548 = var7;
        this.field1546 = new int[var7];
        this.field1552 = new int[var7];
        this.field1545 = new int[var7];
        this.field1554 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1546[var12] = field1551[var12];
            this.field1552[var12] = field1553[var12];
            this.field1545[var12] = field1547[var12];
            this.field1554[var12] = field1550[var12];
        }
    }
}
