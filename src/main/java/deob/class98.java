package deob;

@ObfuscatedName("cj")
public class class98 {

    @ObfuscatedName("cj.e")
    public static int[] field1633 = new int[500];

    @ObfuscatedName("cj.i")
    public static int[] field1624 = new int[500];

    @ObfuscatedName("cj.k")
    public static int[] field1630 = new int[500];

    @ObfuscatedName("cj.q")
    public static int[] field1625 = new int[500];

    @ObfuscatedName("cj.j")
    public class106 field1627 = null;

    @ObfuscatedName("cj.z")
    public int field1628 = -1;

    @ObfuscatedName("cj.m")
    public int[] field1629;

    @ObfuscatedName("cj.w")
    public int[] field1632;

    @ObfuscatedName("cj.a")
    public int[] field1631;

    @ObfuscatedName("cj.d")
    public int[] field1623;

    @ObfuscatedName("cj.u")
    public boolean field1626 = false;

    public class98(byte[] arg0, class106 arg1) {
        this.field1627 = arg1;
        class128 var3 = new class128(arg0);
        class128 var4 = new class128(arg0);
        var3.field2045 = 2;
        int var5 = var3.method2548();
        int var6 = -1;
        int var7 = 0;
        var4.field2045 = var3.field2045 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2548();
            if (var9 > 0) {
                if (this.field1627.field1780[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1627.field1780[var10] == 0) {
                            field1633[var7] = var10;
                            field1624[var7] = 0;
                            field1630[var7] = 0;
                            field1625[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1633[var7] = var8;
                short var11 = 0;
                if (this.field1627.field1780[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1624[var7] = var11;
                } else {
                    field1624[var7] = var4.method2478();
                }
                if ((var9 & 0x2) == 0) {
                    field1630[var7] = var11;
                } else {
                    field1630[var7] = var4.method2478();
                }
                if ((var9 & 0x4) == 0) {
                    field1625[var7] = var11;
                } else {
                    field1625[var7] = var4.method2478();
                }
                var6 = var8;
                var7++;
                if (this.field1627.field1780[var8] == 5) {
                    this.field1626 = true;
                }
            }
        }
        if (var4.field2045 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1628 = var7;
        this.field1629 = new int[var7];
        this.field1632 = new int[var7];
        this.field1631 = new int[var7];
        this.field1623 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1629[var12] = field1633[var12];
            this.field1632[var12] = field1624[var12];
            this.field1631[var12] = field1630[var12];
            this.field1623[var12] = field1625[var12];
        }
    }
}
