package deob;

@ObfuscatedName("cu")
public class class97 {

    @ObfuscatedName("cu.a")
    public static int[] field1605 = new int[500];

    @ObfuscatedName("cu.r")
    public static int[] field1603 = new int[500];

    @ObfuscatedName("cu.u")
    public static int[] field1599 = new int[500];

    @ObfuscatedName("cu.t")
    public static int[] field1600 = new int[500];

    @ObfuscatedName("cu.k")
    public class105 field1598 = null;

    @ObfuscatedName("cu.x")
    public int field1602 = -1;

    @ObfuscatedName("cu.v")
    public int[] field1604;

    @ObfuscatedName("cu.g")
    public int[] field1607;

    @ObfuscatedName("cu.n")
    public int[] field1601;

    @ObfuscatedName("cu.q")
    public int[] field1606;

    @ObfuscatedName("cu.i")
    public boolean field1597 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1598 = arg1;
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        var3.field2016 = 2;
        int var5 = var3.method2481();
        int var6 = -1;
        int var7 = 0;
        var4.field2016 = var3.field2016 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2481();
            if (var9 > 0) {
                if (this.field1598.field1758[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1598.field1758[var10] == 0) {
                            field1605[var7] = var10;
                            field1603[var7] = 0;
                            field1599[var7] = 0;
                            field1600[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1605[var7] = var8;
                short var11 = 0;
                if (this.field1598.field1758[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1603[var7] = var11;
                } else {
                    field1603[var7] = var4.method2390();
                }
                if ((var9 & 0x2) == 0) {
                    field1599[var7] = var11;
                } else {
                    field1599[var7] = var4.method2390();
                }
                if ((var9 & 0x4) == 0) {
                    field1600[var7] = var11;
                } else {
                    field1600[var7] = var4.method2390();
                }
                var6 = var8;
                var7++;
                if (this.field1598.field1758[var8] == 5) {
                    this.field1597 = true;
                }
            }
        }
        if (var4.field2016 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1602 = var7;
        this.field1604 = new int[var7];
        this.field1607 = new int[var7];
        this.field1601 = new int[var7];
        this.field1606 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1604[var12] = field1605[var12];
            this.field1607[var12] = field1603[var12];
            this.field1601[var12] = field1599[var12];
            this.field1606[var12] = field1600[var12];
        }
    }
}
