package deob;

@ObfuscatedName("ci")
public class class97 {

    @ObfuscatedName("ci.p")
    public static int[] field1637 = new int[500];

    @ObfuscatedName("ci.e")
    public static int[] field1633 = new int[500];

    @ObfuscatedName("ci.a")
    public static int[] field1634 = new int[500];

    @ObfuscatedName("ci.h")
    public static int[] field1641 = new int[500];

    @ObfuscatedName("ci.y")
    public class105 field1640 = null;

    @ObfuscatedName("ci.j")
    public int field1635 = -1;

    @ObfuscatedName("ci.l")
    public int[] field1638;

    @ObfuscatedName("ci.f")
    public int[] field1639;

    @ObfuscatedName("ci.n")
    public int[] field1632;

    @ObfuscatedName("ci.k")
    public int[] field1642;

    @ObfuscatedName("ci.q")
    public boolean field1636 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1640 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2029 = 2;
        int var5 = var3.method2494();
        int var6 = -1;
        int var7 = 0;
        var4.field2029 = var3.field2029 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2494();
            if (var9 > 0) {
                if (this.field1640.field1785[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1640.field1785[var10] == 0) {
                            field1637[var7] = var10;
                            field1633[var7] = 0;
                            field1634[var7] = 0;
                            field1641[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1637[var7] = var8;
                short var11 = 0;
                if (this.field1640.field1785[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1633[var7] = var11;
                } else {
                    field1633[var7] = var4.method2625();
                }
                if ((var9 & 0x2) == 0) {
                    field1634[var7] = var11;
                } else {
                    field1634[var7] = var4.method2625();
                }
                if ((var9 & 0x4) == 0) {
                    field1641[var7] = var11;
                } else {
                    field1641[var7] = var4.method2625();
                }
                var6 = var8;
                var7++;
                if (this.field1640.field1785[var8] == 5) {
                    this.field1636 = true;
                }
            }
        }
        if (var4.field2029 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1635 = var7;
        this.field1638 = new int[var7];
        this.field1639 = new int[var7];
        this.field1632 = new int[var7];
        this.field1642 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1638[var12] = field1637[var12];
            this.field1639[var12] = field1633[var12];
            this.field1632[var12] = field1634[var12];
            this.field1642[var12] = field1641[var12];
        }
    }
}
