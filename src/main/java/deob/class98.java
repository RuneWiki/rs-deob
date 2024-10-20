package deob;

@ObfuscatedName("cp")
public class class98 {

    @ObfuscatedName("cp.i")
    public static int[] field1647 = new int[500];

    @ObfuscatedName("cp.b")
    public static int[] field1645 = new int[500];

    @ObfuscatedName("cp.r")
    public static int[] field1646 = new int[500];

    @ObfuscatedName("cp.l")
    public static int[] field1650 = new int[500];

    @ObfuscatedName("cp.s")
    public class106 field1651 = null;

    @ObfuscatedName("cp.d")
    public int field1649 = -1;

    @ObfuscatedName("cp.e")
    public int[] field1648;

    @ObfuscatedName("cp.u")
    public int[] field1644;

    @ObfuscatedName("cp.q")
    public int[] field1652;

    @ObfuscatedName("cp.o")
    public int[] field1653;

    @ObfuscatedName("cp.v")
    public boolean field1654 = false;

    public class98(byte[] arg0, class106 arg1) {
        this.field1651 = arg1;
        class128 var3 = new class128(arg0);
        class128 var4 = new class128(arg0);
        var3.field2048 = 2;
        int var5 = var3.method2531();
        int var6 = -1;
        int var7 = 0;
        var4.field2048 = var3.field2048 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2531();
            if (var9 > 0) {
                if (this.field1651.field1798[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1651.field1798[var10] == 0) {
                            field1647[var7] = var10;
                            field1645[var7] = 0;
                            field1646[var7] = 0;
                            field1650[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1647[var7] = var8;
                short var11 = 0;
                if (this.field1651.field1798[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1645[var7] = var11;
                } else {
                    field1645[var7] = var4.method2475();
                }
                if ((var9 & 0x2) == 0) {
                    field1646[var7] = var11;
                } else {
                    field1646[var7] = var4.method2475();
                }
                if ((var9 & 0x4) == 0) {
                    field1650[var7] = var11;
                } else {
                    field1650[var7] = var4.method2475();
                }
                var6 = var8;
                var7++;
                if (this.field1651.field1798[var8] == 5) {
                    this.field1654 = true;
                }
            }
        }
        if (var4.field2048 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1649 = var7;
        this.field1648 = new int[var7];
        this.field1644 = new int[var7];
        this.field1652 = new int[var7];
        this.field1653 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1648[var12] = field1647[var12];
            this.field1644[var12] = field1645[var12];
            this.field1652[var12] = field1646[var12];
            this.field1653[var12] = field1650[var12];
        }
    }
}
