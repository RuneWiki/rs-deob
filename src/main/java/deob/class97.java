package deob;

@ObfuscatedName("cv")
public class class97 {

    @ObfuscatedName("cv.g")
    public static int[] field1632 = new int[500];

    @ObfuscatedName("cv.m")
    public static int[] field1636 = new int[500];

    @ObfuscatedName("cv.v")
    public static int[] field1631 = new int[500];

    @ObfuscatedName("cv.r")
    public static int[] field1630 = new int[500];

    @ObfuscatedName("cv.n")
    public class105 field1627 = null;

    @ObfuscatedName("cv.i")
    public int field1633 = -1;

    @ObfuscatedName("cv.s")
    public int[] field1628;

    @ObfuscatedName("cv.w")
    public int[] field1634;

    @ObfuscatedName("cv.d")
    public int[] field1635;

    @ObfuscatedName("cv.t")
    public int[] field1629;

    @ObfuscatedName("cv.f")
    public boolean field1637 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1627 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2023 = 2;
        int var5 = var3.method2414();
        int var6 = -1;
        int var7 = 0;
        var4.field2023 = var3.field2023 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2414();
            if (var9 > 0) {
                if (this.field1627.field1785[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1627.field1785[var10] == 0) {
                            field1632[var7] = var10;
                            field1636[var7] = 0;
                            field1631[var7] = 0;
                            field1630[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1632[var7] = var8;
                short var11 = 0;
                if (this.field1627.field1785[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1636[var7] = var11;
                } else {
                    field1636[var7] = var4.method2426();
                }
                if ((var9 & 0x2) == 0) {
                    field1631[var7] = var11;
                } else {
                    field1631[var7] = var4.method2426();
                }
                if ((var9 & 0x4) == 0) {
                    field1630[var7] = var11;
                } else {
                    field1630[var7] = var4.method2426();
                }
                var6 = var8;
                var7++;
                if (this.field1627.field1785[var8] == 5) {
                    this.field1637 = true;
                }
            }
        }
        if (var4.field2023 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1633 = var7;
        this.field1628 = new int[var7];
        this.field1634 = new int[var7];
        this.field1635 = new int[var7];
        this.field1629 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1628[var12] = field1632[var12];
            this.field1634[var12] = field1636[var12];
            this.field1635[var12] = field1631[var12];
            this.field1629[var12] = field1630[var12];
        }
    }
}
