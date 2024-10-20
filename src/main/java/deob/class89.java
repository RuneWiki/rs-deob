package deob;

@ObfuscatedName("cm")
public class class89 {

    @ObfuscatedName("cm.t")
    public static int[] field1552 = new int[500];

    @ObfuscatedName("cm.i")
    public static int[] field1549 = new int[500];

    @ObfuscatedName("cm.g")
    public static int[] field1550 = new int[500];

    @ObfuscatedName("cm.h")
    public static int[] field1551 = new int[500];

    @ObfuscatedName("cm.z")
    public class103 field1556 = null;

    @ObfuscatedName("cm.r")
    public int field1553 = -1;

    @ObfuscatedName("cm.f")
    public int[] field1557;

    @ObfuscatedName("cm.s")
    public int[] field1555;

    @ObfuscatedName("cm.d")
    public int[] field1554;

    @ObfuscatedName("cm.l")
    public int[] field1548;

    @ObfuscatedName("cm.y")
    public boolean field1558 = false;

    public class89(byte[] arg0, class103 arg1) {
        this.field1556 = arg1;
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        var3.field2001 = 2;
        int var5 = var3.method2334();
        int var6 = -1;
        int var7 = 0;
        var4.field2001 = var3.field2001 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2334();
            if (var9 > 0) {
                if (this.field1556.field1772[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1556.field1772[var10] == 0) {
                            field1552[var7] = var10;
                            field1549[var7] = 0;
                            field1550[var7] = 0;
                            field1551[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1552[var7] = var8;
                short var11 = 0;
                if (this.field1556.field1772[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1549[var7] = var11;
                } else {
                    field1549[var7] = var4.method2405();
                }
                if ((var9 & 0x2) == 0) {
                    field1550[var7] = var11;
                } else {
                    field1550[var7] = var4.method2405();
                }
                if ((var9 & 0x4) == 0) {
                    field1551[var7] = var11;
                } else {
                    field1551[var7] = var4.method2405();
                }
                var6 = var8;
                var7++;
                if (this.field1556.field1772[var8] == 5) {
                    this.field1558 = true;
                }
            }
        }
        if (var4.field2001 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1553 = var7;
        this.field1557 = new int[var7];
        this.field1555 = new int[var7];
        this.field1554 = new int[var7];
        this.field1548 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1557[var12] = field1552[var12];
            this.field1555[var12] = field1549[var12];
            this.field1554[var12] = field1550[var12];
            this.field1548[var12] = field1551[var12];
        }
    }
}
