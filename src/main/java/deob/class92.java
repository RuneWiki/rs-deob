package deob;

@ObfuscatedName("cf")
public class class92 {

    @ObfuscatedName("cf.x")
    public static int[] field1595 = new int[500];

    @ObfuscatedName("cf.r")
    public static int[] field1588 = new int[500];

    @ObfuscatedName("cf.j")
    public static int[] field1591 = new int[500];

    @ObfuscatedName("cf.z")
    public static int[] field1590 = new int[500];

    @ObfuscatedName("cf.i")
    public class106 field1587 = null;

    @ObfuscatedName("cf.b")
    public int field1597 = -1;

    @ObfuscatedName("cf.l")
    public int[] field1593;

    @ObfuscatedName("cf.m")
    public int[] field1594;

    @ObfuscatedName("cf.p")
    public int[] field1589;

    @ObfuscatedName("cf.f")
    public int[] field1596;

    @ObfuscatedName("cf.d")
    public boolean field1592 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1587 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2057 = 2;
        int var5 = var3.method2408();
        int var6 = -1;
        int var7 = 0;
        var4.field2057 = var3.field2057 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2408();
            if (var9 > 0) {
                if (this.field1587.field1822[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1587.field1822[var10] == 0) {
                            field1595[var7] = var10;
                            field1588[var7] = 0;
                            field1591[var7] = 0;
                            field1590[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1595[var7] = var8;
                short var11 = 0;
                if (this.field1587.field1822[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1588[var7] = var11;
                } else {
                    field1588[var7] = var4.method2420();
                }
                if ((var9 & 0x2) == 0) {
                    field1591[var7] = var11;
                } else {
                    field1591[var7] = var4.method2420();
                }
                if ((var9 & 0x4) == 0) {
                    field1590[var7] = var11;
                } else {
                    field1590[var7] = var4.method2420();
                }
                var6 = var8;
                var7++;
                if (this.field1587.field1822[var8] == 5) {
                    this.field1592 = true;
                }
            }
        }
        if (var4.field2057 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1597 = var7;
        this.field1593 = new int[var7];
        this.field1594 = new int[var7];
        this.field1589 = new int[var7];
        this.field1596 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1593[var12] = field1595[var12];
            this.field1594[var12] = field1588[var12];
            this.field1589[var12] = field1591[var12];
            this.field1596[var12] = field1590[var12];
        }
    }
}
