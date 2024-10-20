package deob;

@ObfuscatedName("cl")
public class class97 {

    @ObfuscatedName("cl.c")
    public static int[] field1650 = new int[500];

    @ObfuscatedName("cl.q")
    public static int[] field1656 = new int[500];

    @ObfuscatedName("cl.y")
    public static int[] field1648 = new int[500];

    @ObfuscatedName("cl.v")
    public static int[] field1649 = new int[500];

    @ObfuscatedName("cl.g")
    public class105 field1646 = null;

    @ObfuscatedName("cl.x")
    public int field1651 = -1;

    @ObfuscatedName("cl.u")
    public int[] field1652;

    @ObfuscatedName("cl.l")
    public int[] field1653;

    @ObfuscatedName("cl.a")
    public int[] field1654;

    @ObfuscatedName("cl.h")
    public int[] field1655;

    @ObfuscatedName("cl.t")
    public boolean field1647 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1646 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2052 = 2;
        int var5 = var3.method2383();
        int var6 = -1;
        int var7 = 0;
        var4.field2052 = var3.field2052 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2383();
            if (var9 > 0) {
                if (this.field1646.field1791[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1646.field1791[var10] == 0) {
                            field1650[var7] = var10;
                            field1656[var7] = 0;
                            field1648[var7] = 0;
                            field1649[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1650[var7] = var8;
                short var11 = 0;
                if (this.field1646.field1791[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1656[var7] = var11;
                } else {
                    field1656[var7] = var4.method2412();
                }
                if ((var9 & 0x2) == 0) {
                    field1648[var7] = var11;
                } else {
                    field1648[var7] = var4.method2412();
                }
                if ((var9 & 0x4) == 0) {
                    field1649[var7] = var11;
                } else {
                    field1649[var7] = var4.method2412();
                }
                var6 = var8;
                var7++;
                if (this.field1646.field1791[var8] == 5) {
                    this.field1647 = true;
                }
            }
        }
        if (var4.field2052 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1651 = var7;
        this.field1652 = new int[var7];
        this.field1653 = new int[var7];
        this.field1654 = new int[var7];
        this.field1655 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1652[var12] = field1650[var12];
            this.field1653[var12] = field1656[var12];
            this.field1654[var12] = field1648[var12];
            this.field1655[var12] = field1649[var12];
        }
    }
}
