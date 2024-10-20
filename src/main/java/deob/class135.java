package deob;

@ObfuscatedName("eu")
public class class135 {

    @ObfuscatedName("eu.h")
    public static int[] field1658 = new int[500];

    @ObfuscatedName("eu.v")
    public static int[] field1652 = new int[500];

    @ObfuscatedName("eu.x")
    public static int[] field1653 = new int[500];

    @ObfuscatedName("eu.w")
    public static int[] field1660 = new int[500];

    @ObfuscatedName("eu.t")
    public class142 field1655 = null;

    @ObfuscatedName("eu.j")
    public int field1656 = -1;

    @ObfuscatedName("eu.n")
    public int[] field1657;

    @ObfuscatedName("eu.p")
    public int[] field1651;

    @ObfuscatedName("eu.l")
    public int[] field1659;

    @ObfuscatedName("eu.z")
    public int[] field1654;

    @ObfuscatedName("eu.u")
    public boolean field1661 = false;

    public class135(byte[] arg0, class142 arg1) {
        this.field1655 = arg1;
        class311 var3 = new class311(arg0);
        class311 var4 = new class311(arg0);
        var3.field3752 = 2;
        int var5 = var3.method5274();
        int var6 = -1;
        int var7 = 0;
        var4.field3752 = var3.field3752 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5274();
            if (var9 > 0) {
                if (this.field1655.field1819[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1655.field1819[var10] == 0) {
                            field1658[var7] = var10;
                            field1652[var7] = 0;
                            field1653[var7] = 0;
                            field1660[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1658[var7] = var8;
                short var11 = 0;
                if (this.field1655.field1819[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1652[var7] = var11;
                } else {
                    field1652[var7] = var4.method5128();
                }
                if ((var9 & 0x2) == 0) {
                    field1653[var7] = var11;
                } else {
                    field1653[var7] = var4.method5128();
                }
                if ((var9 & 0x4) == 0) {
                    field1660[var7] = var11;
                } else {
                    field1660[var7] = var4.method5128();
                }
                var6 = var8;
                var7++;
                if (this.field1655.field1819[var8] == 5) {
                    this.field1661 = true;
                }
            }
        }
        if (var4.field3752 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1656 = var7;
        this.field1657 = new int[var7];
        this.field1651 = new int[var7];
        this.field1659 = new int[var7];
        this.field1654 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1657[var12] = field1658[var12];
            this.field1651[var12] = field1652[var12];
            this.field1659[var12] = field1653[var12];
            this.field1654[var12] = field1660[var12];
        }
    }
}
