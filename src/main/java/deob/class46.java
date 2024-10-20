package deob;

@ObfuscatedName("as")
public class class46 {

    @ObfuscatedName("as.t")
    public static int[] field645 = new int[500];

    @ObfuscatedName("as.n")
    public static int[] field642 = new int[500];

    @ObfuscatedName("as.q")
    public static int[] field644 = new int[500];

    @ObfuscatedName("as.h")
    public static int[] field648 = new int[500];

    @ObfuscatedName("as.k")
    public class134 field646 = null;

    @ObfuscatedName("as.r")
    public int field643 = -1;

    @ObfuscatedName("as.l")
    public int[] field647;

    @ObfuscatedName("as.i")
    public int[] field649;

    @ObfuscatedName("as.e")
    public int[] field650;

    @ObfuscatedName("as.a")
    public int[] field651;

    @ObfuscatedName("as.g")
    public boolean field652 = false;

    public class46(byte[] arg0, class134 arg1) {
        this.field646 = arg1;
        class135 var3 = new class135(arg0);
        class135 var4 = new class135(arg0);
        var3.field1722 = 2;
        int var5 = var3.method1571();
        int var6 = -1;
        int var7 = 0;
        var4.field1722 = var3.field1722 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method1571();
            if (var9 > 0) {
                if (this.field646.field1719[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field646.field1719[var10] == 0) {
                            field645[var7] = var10;
                            field642[var7] = 0;
                            field644[var7] = 0;
                            field648[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field645[var7] = var8;
                short var11 = 0;
                if (this.field646.field1719[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field642[var7] = var11;
                } else {
                    field642[var7] = var4.method1583();
                }
                if ((var9 & 0x2) == 0) {
                    field644[var7] = var11;
                } else {
                    field644[var7] = var4.method1583();
                }
                if ((var9 & 0x4) == 0) {
                    field648[var7] = var11;
                } else {
                    field648[var7] = var4.method1583();
                }
                var6 = var8;
                var7++;
                if (this.field646.field1719[var8] == 5) {
                    this.field652 = true;
                }
            }
        }
        if (var4.field1722 != arg0.length) {
            throw new RuntimeException();
        }
        this.field643 = var7;
        this.field647 = new int[var7];
        this.field649 = new int[var7];
        this.field650 = new int[var7];
        this.field651 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field647[var12] = field645[var12];
            this.field649[var12] = field642[var12];
            this.field650[var12] = field644[var12];
            this.field651[var12] = field648[var12];
        }
    }
}
