package deob;

@ObfuscatedName("cr")
public class class96 {

    @ObfuscatedName("cr.p")
    public static int[] field1639 = new int[500];

    @ObfuscatedName("cr.j")
    public static int[] field1634 = new int[500];

    @ObfuscatedName("cr.w")
    public static int[] field1636 = new int[500];

    @ObfuscatedName("cr.h")
    public static int[] field1637 = new int[500];

    @ObfuscatedName("cr.v")
    public class104 field1638 = null;

    @ObfuscatedName("cr.k")
    public int field1640 = -1;

    @ObfuscatedName("cr.g")
    public int[] field1642;

    @ObfuscatedName("cr.n")
    public int[] field1641;

    @ObfuscatedName("cr.c")
    public int[] field1635;

    @ObfuscatedName("cr.o")
    public int[] field1643;

    @ObfuscatedName("cr.u")
    public boolean field1644 = false;

    public class96(byte[] arg0, class104 arg1) {
        this.field1638 = arg1;
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        var3.field2043 = 2;
        int var5 = var3.method2544();
        int var6 = -1;
        int var7 = 0;
        var4.field2043 = var3.field2043 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2544();
            if (var9 > 0) {
                if (this.field1638.field1793[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1638.field1793[var10] == 0) {
                            field1639[var7] = var10;
                            field1634[var7] = 0;
                            field1636[var7] = 0;
                            field1637[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1639[var7] = var8;
                short var11 = 0;
                if (this.field1638.field1793[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1634[var7] = var11;
                } else {
                    field1634[var7] = var4.method2361();
                }
                if ((var9 & 0x2) == 0) {
                    field1636[var7] = var11;
                } else {
                    field1636[var7] = var4.method2361();
                }
                if ((var9 & 0x4) == 0) {
                    field1637[var7] = var11;
                } else {
                    field1637[var7] = var4.method2361();
                }
                var6 = var8;
                var7++;
                if (this.field1638.field1793[var8] == 5) {
                    this.field1644 = true;
                }
            }
        }
        if (var4.field2043 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1640 = var7;
        this.field1642 = new int[var7];
        this.field1641 = new int[var7];
        this.field1635 = new int[var7];
        this.field1643 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1642[var12] = field1639[var12];
            this.field1641[var12] = field1634[var12];
            this.field1635[var12] = field1636[var12];
            this.field1643[var12] = field1637[var12];
        }
    }
}
