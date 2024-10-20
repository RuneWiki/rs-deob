package deob;

@ObfuscatedName("ct")
public class class97 {

    @ObfuscatedName("ct.p")
    public static int[] field1638 = new int[500];

    @ObfuscatedName("ct.i")
    public static int[] field1636 = new int[500];

    @ObfuscatedName("ct.o")
    public static int[] field1635 = new int[500];

    @ObfuscatedName("ct.n")
    public static int[] field1637 = new int[500];

    @ObfuscatedName("ct.l")
    public class105 field1639 = null;

    @ObfuscatedName("ct.v")
    public int field1640 = -1;

    @ObfuscatedName("ct.g")
    public int[] field1641;

    @ObfuscatedName("ct.x")
    public int[] field1642;

    @ObfuscatedName("ct.c")
    public int[] field1643;

    @ObfuscatedName("ct.f")
    public int[] field1644;

    @ObfuscatedName("ct.r")
    public boolean field1645 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1639 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2038 = 2;
        int var5 = var3.method2659();
        int var6 = -1;
        int var7 = 0;
        var4.field2038 = var3.field2038 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2659();
            if (var9 > 0) {
                if (this.field1639.field1792[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1639.field1792[var10] == 0) {
                            field1638[var7] = var10;
                            field1636[var7] = 0;
                            field1635[var7] = 0;
                            field1637[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1638[var7] = var8;
                short var11 = 0;
                if (this.field1639.field1792[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1636[var7] = var11;
                } else {
                    field1636[var7] = var4.method2563();
                }
                if ((var9 & 0x2) == 0) {
                    field1635[var7] = var11;
                } else {
                    field1635[var7] = var4.method2563();
                }
                if ((var9 & 0x4) == 0) {
                    field1637[var7] = var11;
                } else {
                    field1637[var7] = var4.method2563();
                }
                var6 = var8;
                var7++;
                if (this.field1639.field1792[var8] == 5) {
                    this.field1645 = true;
                }
            }
        }
        if (var4.field2038 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1640 = var7;
        this.field1641 = new int[var7];
        this.field1642 = new int[var7];
        this.field1643 = new int[var7];
        this.field1644 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1641[var12] = field1638[var12];
            this.field1642[var12] = field1636[var12];
            this.field1643[var12] = field1635[var12];
            this.field1644[var12] = field1637[var12];
        }
    }
}
