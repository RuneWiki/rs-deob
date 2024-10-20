package deob;

@ObfuscatedName("cw")
public class class89 {

    @ObfuscatedName("cw.f")
    public static int[] field1556 = new int[500];

    @ObfuscatedName("cw.u")
    public static int[] field1555 = new int[500];

    @ObfuscatedName("cw.x")
    public static int[] field1549 = new int[500];

    @ObfuscatedName("cw.b")
    public static int[] field1550 = new int[500];

    @ObfuscatedName("cw.l")
    public class103 field1547 = null;

    @ObfuscatedName("cw.d")
    public int field1552 = -1;

    @ObfuscatedName("cw.n")
    public int[] field1553;

    @ObfuscatedName("cw.m")
    public int[] field1554;

    @ObfuscatedName("cw.g")
    public int[] field1548;

    @ObfuscatedName("cw.s")
    public int[] field1551;

    @ObfuscatedName("cw.r")
    public boolean field1557 = false;

    public class89(byte[] arg0, class103 arg1) {
        this.field1547 = arg1;
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        var3.field1999 = 2;
        int var5 = var3.method2385();
        int var6 = -1;
        int var7 = 0;
        var4.field1999 = var3.field1999 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2385();
            if (var9 > 0) {
                if (this.field1547.field1770[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1547.field1770[var10] == 0) {
                            field1556[var7] = var10;
                            field1555[var7] = 0;
                            field1549[var7] = 0;
                            field1550[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1556[var7] = var8;
                short var11 = 0;
                if (this.field1547.field1770[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1555[var7] = var11;
                } else {
                    field1555[var7] = var4.method2397();
                }
                if ((var9 & 0x2) == 0) {
                    field1549[var7] = var11;
                } else {
                    field1549[var7] = var4.method2397();
                }
                if ((var9 & 0x4) == 0) {
                    field1550[var7] = var11;
                } else {
                    field1550[var7] = var4.method2397();
                }
                var6 = var8;
                var7++;
                if (this.field1547.field1770[var8] == 5) {
                    this.field1557 = true;
                }
            }
        }
        if (var4.field1999 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1552 = var7;
        this.field1553 = new int[var7];
        this.field1554 = new int[var7];
        this.field1548 = new int[var7];
        this.field1551 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1553[var12] = field1556[var12];
            this.field1554[var12] = field1555[var12];
            this.field1548[var12] = field1549[var12];
            this.field1551[var12] = field1550[var12];
        }
    }
}
