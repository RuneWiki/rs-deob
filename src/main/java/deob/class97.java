package deob;

@ObfuscatedName("ch")
public class class97 {

    @ObfuscatedName("ch.t")
    public static int[] field1665 = new int[500];

    @ObfuscatedName("ch.l")
    public static int[] field1670 = new int[500];

    @ObfuscatedName("ch.c")
    public static int[] field1667 = new int[500];

    @ObfuscatedName("ch.d")
    public static int[] field1666 = new int[500];

    @ObfuscatedName("ch.b")
    public class105 field1664 = null;

    @ObfuscatedName("ch.i")
    public int field1668 = -1;

    @ObfuscatedName("ch.p")
    public int[] field1669;

    @ObfuscatedName("ch.y")
    public int[] field1671;

    @ObfuscatedName("ch.u")
    public int[] field1663;

    @ObfuscatedName("ch.z")
    public int[] field1672;

    @ObfuscatedName("ch.j")
    public boolean field1673 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1664 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2059 = 2;
        int var5 = var3.method2438();
        int var6 = -1;
        int var7 = 0;
        var4.field2059 = var3.field2059 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2438();
            if (var9 > 0) {
                if (this.field1664.field1819[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1664.field1819[var10] == 0) {
                            field1665[var7] = var10;
                            field1670[var7] = 0;
                            field1667[var7] = 0;
                            field1666[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1665[var7] = var8;
                short var11 = 0;
                if (this.field1664.field1819[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1670[var7] = var11;
                } else {
                    field1670[var7] = var4.method2628();
                }
                if ((var9 & 0x2) == 0) {
                    field1667[var7] = var11;
                } else {
                    field1667[var7] = var4.method2628();
                }
                if ((var9 & 0x4) == 0) {
                    field1666[var7] = var11;
                } else {
                    field1666[var7] = var4.method2628();
                }
                var6 = var8;
                var7++;
                if (this.field1664.field1819[var8] == 5) {
                    this.field1673 = true;
                }
            }
        }
        if (var4.field2059 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1668 = var7;
        this.field1669 = new int[var7];
        this.field1671 = new int[var7];
        this.field1663 = new int[var7];
        this.field1672 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1669[var12] = field1665[var12];
            this.field1671[var12] = field1670[var12];
            this.field1663[var12] = field1667[var12];
            this.field1672[var12] = field1666[var12];
        }
    }
}
