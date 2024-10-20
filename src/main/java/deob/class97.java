package deob;

@ObfuscatedName("ck")
public class class97 {

    @ObfuscatedName("ck.i")
    public static int[] field1639 = new int[500];

    @ObfuscatedName("ck.v")
    public static int[] field1633 = new int[500];

    @ObfuscatedName("ck.m")
    public static int[] field1634 = new int[500];

    @ObfuscatedName("ck.j")
    public static int[] field1635 = new int[500];

    @ObfuscatedName("ck.o")
    public class105 field1636 = null;

    @ObfuscatedName("ck.l")
    public int field1637 = -1;

    @ObfuscatedName("ck.g")
    public int[] field1640;

    @ObfuscatedName("ck.w")
    public int[] field1632;

    @ObfuscatedName("ck.c")
    public int[] field1642;

    @ObfuscatedName("ck.z")
    public int[] field1641;

    @ObfuscatedName("ck.f")
    public boolean field1638 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1636 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2039 = 2;
        int var5 = var3.method2491();
        int var6 = -1;
        int var7 = 0;
        var4.field2039 = var3.field2039 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2491();
            if (var9 > 0) {
                if (this.field1636.field1791[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1636.field1791[var10] == 0) {
                            field1639[var7] = var10;
                            field1633[var7] = 0;
                            field1634[var7] = 0;
                            field1635[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1639[var7] = var8;
                short var11 = 0;
                if (this.field1636.field1791[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1633[var7] = var11;
                } else {
                    field1633[var7] = var4.method2502();
                }
                if ((var9 & 0x2) == 0) {
                    field1634[var7] = var11;
                } else {
                    field1634[var7] = var4.method2502();
                }
                if ((var9 & 0x4) == 0) {
                    field1635[var7] = var11;
                } else {
                    field1635[var7] = var4.method2502();
                }
                var6 = var8;
                var7++;
                if (this.field1636.field1791[var8] == 5) {
                    this.field1638 = true;
                }
            }
        }
        if (var4.field2039 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1637 = var7;
        this.field1640 = new int[var7];
        this.field1632 = new int[var7];
        this.field1642 = new int[var7];
        this.field1641 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1640[var12] = field1639[var12];
            this.field1632[var12] = field1633[var12];
            this.field1642[var12] = field1634[var12];
            this.field1641[var12] = field1635[var12];
        }
    }
}
