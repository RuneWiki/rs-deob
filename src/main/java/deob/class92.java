package deob;

@ObfuscatedName("cq")
public class class92 {

    @ObfuscatedName("cq.k")
    public static int[] field1606 = new int[500];

    @ObfuscatedName("cq.q")
    public static int[] field1599 = new int[500];

    @ObfuscatedName("cq.f")
    public static int[] field1608 = new int[500];

    @ObfuscatedName("cq.c")
    public static int[] field1598 = new int[500];

    @ObfuscatedName("cq.v")
    public class106 field1602 = null;

    @ObfuscatedName("cq.j")
    public int field1601 = -1;

    @ObfuscatedName("cq.m")
    public int[] field1604;

    @ObfuscatedName("cq.y")
    public int[] field1605;

    @ObfuscatedName("cq.u")
    public int[] field1600;

    @ObfuscatedName("cq.h")
    public int[] field1607;

    @ObfuscatedName("cq.l")
    public boolean field1603 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1602 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2060 = 2;
        int var5 = var3.method2427();
        int var6 = -1;
        int var7 = 0;
        var4.field2060 = var3.field2060 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2427();
            if (var9 > 0) {
                if (this.field1602.field1826[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1602.field1826[var10] == 0) {
                            field1606[var7] = var10;
                            field1599[var7] = 0;
                            field1608[var7] = 0;
                            field1598[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1606[var7] = var8;
                short var11 = 0;
                if (this.field1602.field1826[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1599[var7] = var11;
                } else {
                    field1599[var7] = var4.method2439();
                }
                if ((var9 & 0x2) == 0) {
                    field1608[var7] = var11;
                } else {
                    field1608[var7] = var4.method2439();
                }
                if ((var9 & 0x4) == 0) {
                    field1598[var7] = var11;
                } else {
                    field1598[var7] = var4.method2439();
                }
                var6 = var8;
                var7++;
                if (this.field1602.field1826[var8] == 5) {
                    this.field1603 = true;
                }
            }
        }
        if (var4.field2060 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1601 = var7;
        this.field1604 = new int[var7];
        this.field1605 = new int[var7];
        this.field1600 = new int[var7];
        this.field1607 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1604[var12] = field1606[var12];
            this.field1605[var12] = field1599[var12];
            this.field1600[var12] = field1608[var12];
            this.field1607[var12] = field1598[var12];
        }
    }
}
