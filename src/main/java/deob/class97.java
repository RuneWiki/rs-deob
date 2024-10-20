package deob;

@ObfuscatedName("cf")
public class class97 {

    @ObfuscatedName("cf.i")
    public static int[] field1632 = new int[500];

    @ObfuscatedName("cf.w")
    public static int[] field1639 = new int[500];

    @ObfuscatedName("cf.f")
    public static int[] field1636 = new int[500];

    @ObfuscatedName("cf.e")
    public static int[] field1633 = new int[500];

    @ObfuscatedName("cf.t")
    public class105 field1634 = null;

    @ObfuscatedName("cf.d")
    public int field1635 = -1;

    @ObfuscatedName("cf.p")
    public int[] field1630;

    @ObfuscatedName("cf.k")
    public int[] field1637;

    @ObfuscatedName("cf.r")
    public int[] field1638;

    @ObfuscatedName("cf.l")
    public int[] field1631;

    @ObfuscatedName("cf.a")
    public boolean field1640 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1634 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2045 = 2;
        int var5 = var3.method2472();
        int var6 = -1;
        int var7 = 0;
        var4.field2045 = var3.field2045 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2472();
            if (var9 > 0) {
                if (this.field1634.field1790[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1634.field1790[var10] == 0) {
                            field1632[var7] = var10;
                            field1639[var7] = 0;
                            field1636[var7] = 0;
                            field1633[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1632[var7] = var8;
                short var11 = 0;
                if (this.field1634.field1790[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1639[var7] = var11;
                } else {
                    field1639[var7] = var4.method2464();
                }
                if ((var9 & 0x2) == 0) {
                    field1636[var7] = var11;
                } else {
                    field1636[var7] = var4.method2464();
                }
                if ((var9 & 0x4) == 0) {
                    field1633[var7] = var11;
                } else {
                    field1633[var7] = var4.method2464();
                }
                var6 = var8;
                var7++;
                if (this.field1634.field1790[var8] == 5) {
                    this.field1640 = true;
                }
            }
        }
        if (var4.field2045 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1635 = var7;
        this.field1630 = new int[var7];
        this.field1637 = new int[var7];
        this.field1638 = new int[var7];
        this.field1631 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1630[var12] = field1632[var12];
            this.field1637[var12] = field1639[var12];
            this.field1638[var12] = field1636[var12];
            this.field1631[var12] = field1633[var12];
        }
    }
}
