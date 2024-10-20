package deob;

@ObfuscatedName("cz")
public class class92 {

    @ObfuscatedName("cz.e")
    public static int[] field1608 = new int[500];

    @ObfuscatedName("cz.l")
    public static int[] field1607 = new int[500];

    @ObfuscatedName("cz.c")
    public static int[] field1609 = new int[500];

    @ObfuscatedName("cz.h")
    public static int[] field1611 = new int[500];

    @ObfuscatedName("cz.r")
    public class106 field1610 = null;

    @ObfuscatedName("cz.a")
    public int field1612 = -1;

    @ObfuscatedName("cz.b")
    public int[] field1606;

    @ObfuscatedName("cz.u")
    public int[] field1613;

    @ObfuscatedName("cz.o")
    public int[] field1614;

    @ObfuscatedName("cz.p")
    public int[] field1615;

    @ObfuscatedName("cz.i")
    public boolean field1616 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1610 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2062 = 2;
        int var5 = var3.method2464();
        int var6 = -1;
        int var7 = 0;
        var4.field2062 = var3.field2062 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2464();
            if (var9 > 0) {
                if (this.field1610.field1844[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1610.field1844[var10] == 0) {
                            field1608[var7] = var10;
                            field1607[var7] = 0;
                            field1609[var7] = 0;
                            field1611[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1608[var7] = var8;
                short var11 = 0;
                if (this.field1610.field1844[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1607[var7] = var11;
                } else {
                    field1607[var7] = var4.method2556();
                }
                if ((var9 & 0x2) == 0) {
                    field1609[var7] = var11;
                } else {
                    field1609[var7] = var4.method2556();
                }
                if ((var9 & 0x4) == 0) {
                    field1611[var7] = var11;
                } else {
                    field1611[var7] = var4.method2556();
                }
                var6 = var8;
                var7++;
                if (this.field1610.field1844[var8] == 5) {
                    this.field1616 = true;
                }
            }
        }
        if (var4.field2062 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1612 = var7;
        this.field1606 = new int[var7];
        this.field1613 = new int[var7];
        this.field1614 = new int[var7];
        this.field1615 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1606[var12] = field1608[var12];
            this.field1613[var12] = field1607[var12];
            this.field1614[var12] = field1609[var12];
            this.field1615[var12] = field1611[var12];
        }
    }
}
