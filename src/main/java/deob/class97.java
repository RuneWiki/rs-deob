package deob;

@ObfuscatedName("cz")
public class class97 {

    @ObfuscatedName("cz.q")
    public static int[] field1640 = new int[500];

    @ObfuscatedName("cz.c")
    public static int[] field1638 = new int[500];

    @ObfuscatedName("cz.p")
    public static int[] field1635 = new int[500];

    @ObfuscatedName("cz.z")
    public static int[] field1636 = new int[500];

    @ObfuscatedName("cz.m")
    public class105 field1637 = null;

    @ObfuscatedName("cz.k")
    public int field1633 = -1;

    @ObfuscatedName("cz.v")
    public int[] field1639;

    @ObfuscatedName("cz.y")
    public int[] field1641;

    @ObfuscatedName("cz.d")
    public int[] field1634;

    @ObfuscatedName("cz.l")
    public int[] field1642;

    @ObfuscatedName("cz.h")
    public boolean field1643 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1637 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2039 = 2;
        int var5 = var3.method2534();
        int var6 = -1;
        int var7 = 0;
        var4.field2039 = var3.field2039 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2534();
            if (var9 > 0) {
                if (this.field1637.field1791[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1637.field1791[var10] == 0) {
                            field1640[var7] = var10;
                            field1638[var7] = 0;
                            field1635[var7] = 0;
                            field1636[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1640[var7] = var8;
                short var11 = 0;
                if (this.field1637.field1791[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1638[var7] = var11;
                } else {
                    field1638[var7] = var4.method2437();
                }
                if ((var9 & 0x2) == 0) {
                    field1635[var7] = var11;
                } else {
                    field1635[var7] = var4.method2437();
                }
                if ((var9 & 0x4) == 0) {
                    field1636[var7] = var11;
                } else {
                    field1636[var7] = var4.method2437();
                }
                var6 = var8;
                var7++;
                if (this.field1637.field1791[var8] == 5) {
                    this.field1643 = true;
                }
            }
        }
        if (var4.field2039 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1633 = var7;
        this.field1639 = new int[var7];
        this.field1641 = new int[var7];
        this.field1634 = new int[var7];
        this.field1642 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1639[var12] = field1640[var12];
            this.field1641[var12] = field1638[var12];
            this.field1634[var12] = field1635[var12];
            this.field1642[var12] = field1636[var12];
        }
    }
}
