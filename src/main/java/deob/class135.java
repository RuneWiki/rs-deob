package deob;

@ObfuscatedName("eh")
public class class135 {

    @ObfuscatedName("eh.x")
    public static int[] field1652 = new int[500];

    @ObfuscatedName("eh.m")
    public static int[] field1656 = new int[500];

    @ObfuscatedName("eh.k")
    public static int[] field1651 = new int[500];

    @ObfuscatedName("eh.d")
    public static int[] field1655 = new int[500];

    @ObfuscatedName("eh.w")
    public class142 field1653 = null;

    @ObfuscatedName("eh.v")
    public int field1654 = -1;

    @ObfuscatedName("eh.q")
    public int[] field1650;

    @ObfuscatedName("eh.z")
    public int[] field1649;

    @ObfuscatedName("eh.t")
    public int[] field1657;

    @ObfuscatedName("eh.e")
    public int[] field1658;

    @ObfuscatedName("eh.s")
    public boolean field1659 = false;

    public class135(byte[] arg0, class142 arg1) {
        this.field1653 = arg1;
        class310 var3 = new class310(arg0);
        class310 var4 = new class310(arg0);
        var3.field3711 = 2;
        int var5 = var3.method5137();
        int var6 = -1;
        int var7 = 0;
        var4.field3711 = var3.field3711 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5137();
            if (var9 > 0) {
                if (this.field1653.field1810[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1653.field1810[var10] == 0) {
                            field1652[var7] = var10;
                            field1656[var7] = 0;
                            field1651[var7] = 0;
                            field1655[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1652[var7] = var8;
                short var11 = 0;
                if (this.field1653.field1810[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1656[var7] = var11;
                } else {
                    field1656[var7] = var4.method5218();
                }
                if ((var9 & 0x2) == 0) {
                    field1651[var7] = var11;
                } else {
                    field1651[var7] = var4.method5218();
                }
                if ((var9 & 0x4) == 0) {
                    field1655[var7] = var11;
                } else {
                    field1655[var7] = var4.method5218();
                }
                var6 = var8;
                var7++;
                if (this.field1653.field1810[var8] == 5) {
                    this.field1659 = true;
                }
            }
        }
        if (var4.field3711 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1654 = var7;
        this.field1650 = new int[var7];
        this.field1649 = new int[var7];
        this.field1657 = new int[var7];
        this.field1658 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1650[var12] = field1652[var12];
            this.field1649[var12] = field1656[var12];
            this.field1657[var12] = field1651[var12];
            this.field1658[var12] = field1655[var12];
        }
    }
}
