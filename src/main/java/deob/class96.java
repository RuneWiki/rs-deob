package deob;

@ObfuscatedName("cb")
public class class96 {

    @ObfuscatedName("cb.u")
    public static int[] field1601 = new int[500];

    @ObfuscatedName("cb.k")
    public static int[] field1610 = new int[500];

    @ObfuscatedName("cb.x")
    public static int[] field1602 = new int[500];

    @ObfuscatedName("cb.m")
    public static int[] field1603 = new int[500];

    @ObfuscatedName("cb.n")
    public class104 field1604 = null;

    @ObfuscatedName("cb.q")
    public int field1605 = -1;

    @ObfuscatedName("cb.a")
    public int[] field1606;

    @ObfuscatedName("cb.g")
    public int[] field1607;

    @ObfuscatedName("cb.j")
    public int[] field1608;

    @ObfuscatedName("cb.l")
    public int[] field1609;

    @ObfuscatedName("cb.w")
    public boolean field1600 = false;

    public class96(byte[] arg0, class104 arg1) {
        this.field1604 = arg1;
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        var3.field2024 = 2;
        int var5 = var3.method2559();
        int var6 = -1;
        int var7 = 0;
        var4.field2024 = var3.field2024 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2559();
            if (var9 > 0) {
                if (this.field1604.field1765[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1604.field1765[var10] == 0) {
                            field1601[var7] = var10;
                            field1610[var7] = 0;
                            field1602[var7] = 0;
                            field1603[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1601[var7] = var8;
                short var11 = 0;
                if (this.field1604.field1765[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1610[var7] = var11;
                } else {
                    field1610[var7] = var4.method2506();
                }
                if ((var9 & 0x2) == 0) {
                    field1602[var7] = var11;
                } else {
                    field1602[var7] = var4.method2506();
                }
                if ((var9 & 0x4) == 0) {
                    field1603[var7] = var11;
                } else {
                    field1603[var7] = var4.method2506();
                }
                var6 = var8;
                var7++;
                if (this.field1604.field1765[var8] == 5) {
                    this.field1600 = true;
                }
            }
        }
        if (var4.field2024 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1605 = var7;
        this.field1606 = new int[var7];
        this.field1607 = new int[var7];
        this.field1608 = new int[var7];
        this.field1609 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1606[var12] = field1601[var12];
            this.field1607[var12] = field1610[var12];
            this.field1608[var12] = field1602[var12];
            this.field1609[var12] = field1603[var12];
        }
    }
}
