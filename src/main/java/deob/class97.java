package deob;

@ObfuscatedName("cf")
public class class97 {

    @ObfuscatedName("cf.x")
    public static int[] field1610 = new int[500];

    @ObfuscatedName("cf.p")
    public static int[] field1603 = new int[500];

    @ObfuscatedName("cf.k")
    public static int[] field1605 = new int[500];

    @ObfuscatedName("cf.a")
    public static int[] field1602 = new int[500];

    @ObfuscatedName("cf.q")
    public class105 field1606 = null;

    @ObfuscatedName("cf.j")
    public int field1607 = -1;

    @ObfuscatedName("cf.v")
    public int[] field1608;

    @ObfuscatedName("cf.w")
    public int[] field1609;

    @ObfuscatedName("cf.l")
    public int[] field1611;

    @ObfuscatedName("cf.s")
    public int[] field1612;

    @ObfuscatedName("cf.n")
    public boolean field1604 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1606 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2008 = 2;
        int var5 = var3.method2484();
        int var6 = -1;
        int var7 = 0;
        var4.field2008 = var3.field2008 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2484();
            if (var9 > 0) {
                if (this.field1606.field1756[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1606.field1756[var10] == 0) {
                            field1610[var7] = var10;
                            field1603[var7] = 0;
                            field1605[var7] = 0;
                            field1602[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1610[var7] = var8;
                short var11 = 0;
                if (this.field1606.field1756[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1603[var7] = var11;
                } else {
                    field1603[var7] = var4.method2565();
                }
                if ((var9 & 0x2) == 0) {
                    field1605[var7] = var11;
                } else {
                    field1605[var7] = var4.method2565();
                }
                if ((var9 & 0x4) == 0) {
                    field1602[var7] = var11;
                } else {
                    field1602[var7] = var4.method2565();
                }
                var6 = var8;
                var7++;
                if (this.field1606.field1756[var8] == 5) {
                    this.field1604 = true;
                }
            }
        }
        if (var4.field2008 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1607 = var7;
        this.field1608 = new int[var7];
        this.field1609 = new int[var7];
        this.field1611 = new int[var7];
        this.field1612 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1608[var12] = field1610[var12];
            this.field1609[var12] = field1603[var12];
            this.field1611[var12] = field1605[var12];
            this.field1612[var12] = field1602[var12];
        }
    }
}
