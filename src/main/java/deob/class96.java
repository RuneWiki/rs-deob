package deob;

@ObfuscatedName("cj")
public class class96 {

    @ObfuscatedName("cj.c")
    public static int[] field1600 = new int[500];

    @ObfuscatedName("cj.j")
    public static int[] field1598 = new int[500];

    @ObfuscatedName("cj.f")
    public static int[] field1607 = new int[500];

    @ObfuscatedName("cj.y")
    public static int[] field1606 = new int[500];

    @ObfuscatedName("cj.x")
    public class104 field1601 = null;

    @ObfuscatedName("cj.e")
    public int field1602 = -1;

    @ObfuscatedName("cj.m")
    public int[] field1603;

    @ObfuscatedName("cj.s")
    public int[] field1604;

    @ObfuscatedName("cj.p")
    public int[] field1605;

    @ObfuscatedName("cj.w")
    public int[] field1599;

    @ObfuscatedName("cj.r")
    public boolean field1597 = false;

    public class96(byte[] arg0, class104 arg1) {
        this.field1601 = arg1;
        class125 var3 = new class125(arg0);
        class125 var4 = new class125(arg0);
        var3.field2003 = 2;
        int var5 = var3.method2326();
        int var6 = -1;
        int var7 = 0;
        var4.field2003 = var3.field2003 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2326();
            if (var9 > 0) {
                if (this.field1601.field1765[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1601.field1765[var10] == 0) {
                            field1600[var7] = var10;
                            field1598[var7] = 0;
                            field1607[var7] = 0;
                            field1606[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1600[var7] = var8;
                short var11 = 0;
                if (this.field1601.field1765[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1598[var7] = var11;
                } else {
                    field1598[var7] = var4.method2338();
                }
                if ((var9 & 0x2) == 0) {
                    field1607[var7] = var11;
                } else {
                    field1607[var7] = var4.method2338();
                }
                if ((var9 & 0x4) == 0) {
                    field1606[var7] = var11;
                } else {
                    field1606[var7] = var4.method2338();
                }
                var6 = var8;
                var7++;
                if (this.field1601.field1765[var8] == 5) {
                    this.field1597 = true;
                }
            }
        }
        if (var4.field2003 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1602 = var7;
        this.field1603 = new int[var7];
        this.field1604 = new int[var7];
        this.field1605 = new int[var7];
        this.field1599 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1603[var12] = field1600[var12];
            this.field1604[var12] = field1598[var12];
            this.field1605[var12] = field1607[var12];
            this.field1599[var12] = field1606[var12];
        }
    }
}
