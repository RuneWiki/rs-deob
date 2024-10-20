package deob;

@ObfuscatedName("cn")
public class class97 {

    @ObfuscatedName("cn.b")
    public static int[] field1655 = new int[500];

    @ObfuscatedName("cn.c")
    public static int[] field1657 = new int[500];

    @ObfuscatedName("cn.j")
    public static int[] field1656 = new int[500];

    @ObfuscatedName("cn.i")
    public static int[] field1663 = new int[500];

    @ObfuscatedName("cn.k")
    public class105 field1658 = null;

    @ObfuscatedName("cn.q")
    public int field1659 = -1;

    @ObfuscatedName("cn.t")
    public int[] field1654;

    @ObfuscatedName("cn.v")
    public int[] field1660;

    @ObfuscatedName("cn.y")
    public int[] field1662;

    @ObfuscatedName("cn.w")
    public int[] field1661;

    @ObfuscatedName("cn.g")
    public boolean field1664 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1658 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2051 = 2;
        int var5 = var3.method2416();
        int var6 = -1;
        int var7 = 0;
        var4.field2051 = var3.field2051 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2416();
            if (var9 > 0) {
                if (this.field1658.field1804[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1658.field1804[var10] == 0) {
                            field1655[var7] = var10;
                            field1657[var7] = 0;
                            field1656[var7] = 0;
                            field1663[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1655[var7] = var8;
                short var11 = 0;
                if (this.field1658.field1804[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1657[var7] = var11;
                } else {
                    field1657[var7] = var4.method2408();
                }
                if ((var9 & 0x2) == 0) {
                    field1656[var7] = var11;
                } else {
                    field1656[var7] = var4.method2408();
                }
                if ((var9 & 0x4) == 0) {
                    field1663[var7] = var11;
                } else {
                    field1663[var7] = var4.method2408();
                }
                var6 = var8;
                var7++;
                if (this.field1658.field1804[var8] == 5) {
                    this.field1664 = true;
                }
            }
        }
        if (var4.field2051 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1659 = var7;
        this.field1654 = new int[var7];
        this.field1660 = new int[var7];
        this.field1662 = new int[var7];
        this.field1661 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1654[var12] = field1655[var12];
            this.field1660[var12] = field1657[var12];
            this.field1662[var12] = field1656[var12];
            this.field1661[var12] = field1663[var12];
        }
    }
}
