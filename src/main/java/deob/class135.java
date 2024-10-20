package deob;

@ObfuscatedName("er")
public class class135 {

    @ObfuscatedName("er.f")
    public static int[] field1663 = new int[500];

    @ObfuscatedName("er.b")
    public static int[] field1662 = new int[500];

    @ObfuscatedName("er.l")
    public static int[] field1670 = new int[500];

    @ObfuscatedName("er.m")
    public static int[] field1664 = new int[500];

    @ObfuscatedName("er.z")
    public class142 field1665 = null;

    @ObfuscatedName("er.q")
    public int field1661 = -1;

    @ObfuscatedName("er.k")
    public int[] field1667;

    @ObfuscatedName("er.c")
    public int[] field1668;

    @ObfuscatedName("er.u")
    public int[] field1666;

    @ObfuscatedName("er.t")
    public int[] field1669;

    @ObfuscatedName("er.e")
    public boolean field1671 = false;

    public class135(byte[] arg0, class142 arg1) {
        this.field1665 = arg1;
        class311 var3 = new class311(arg0);
        class311 var4 = new class311(arg0);
        var3.field3741 = 2;
        int var5 = var3.method5276();
        int var6 = -1;
        int var7 = 0;
        var4.field3741 = var3.field3741 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5276();
            if (var9 > 0) {
                if (this.field1665.field1827[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1665.field1827[var10] == 0) {
                            field1663[var7] = var10;
                            field1662[var7] = 0;
                            field1670[var7] = 0;
                            field1664[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1663[var7] = var8;
                short var11 = 0;
                if (this.field1665.field1827[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1662[var7] = var11;
                } else {
                    field1662[var7] = var4.method5390();
                }
                if ((var9 & 0x2) == 0) {
                    field1670[var7] = var11;
                } else {
                    field1670[var7] = var4.method5390();
                }
                if ((var9 & 0x4) == 0) {
                    field1664[var7] = var11;
                } else {
                    field1664[var7] = var4.method5390();
                }
                var6 = var8;
                var7++;
                if (this.field1665.field1827[var8] == 5) {
                    this.field1671 = true;
                }
            }
        }
        if (var4.field3741 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1661 = var7;
        this.field1667 = new int[var7];
        this.field1668 = new int[var7];
        this.field1666 = new int[var7];
        this.field1669 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1667[var12] = field1663[var12];
            this.field1668[var12] = field1662[var12];
            this.field1666[var12] = field1670[var12];
            this.field1669[var12] = field1664[var12];
        }
    }
}
