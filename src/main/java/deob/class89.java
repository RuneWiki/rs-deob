package deob;

@ObfuscatedName("cj")
public class class89 {

    @ObfuscatedName("cj.b")
    public static int[] field1523 = new int[500];

    @ObfuscatedName("cj.g")
    public static int[] field1514 = new int[500];

    @ObfuscatedName("cj.j")
    public static int[] field1515 = new int[500];

    @ObfuscatedName("cj.d")
    public static int[] field1516 = new int[500];

    @ObfuscatedName("cj.x")
    public class103 field1517 = null;

    @ObfuscatedName("cj.y")
    public int field1518 = -1;

    @ObfuscatedName("cj.r")
    public int[] field1519;

    @ObfuscatedName("cj.c")
    public int[] field1522;

    @ObfuscatedName("cj.l")
    public int[] field1521;

    @ObfuscatedName("cj.u")
    public int[] field1520;

    @ObfuscatedName("cj.p")
    public boolean field1513 = false;

    public class89(byte[] arg0, class103 arg1) {
        this.field1517 = arg1;
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        var3.field1977 = 2;
        int var5 = var3.method2344();
        int var6 = -1;
        int var7 = 0;
        var4.field1977 = var3.field1977 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2344();
            if (var9 > 0) {
                if (this.field1517.field1745[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1517.field1745[var10] == 0) {
                            field1523[var7] = var10;
                            field1514[var7] = 0;
                            field1515[var7] = 0;
                            field1516[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1523[var7] = var8;
                short var11 = 0;
                if (this.field1517.field1745[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1514[var7] = var11;
                } else {
                    field1514[var7] = var4.method2519();
                }
                if ((var9 & 0x2) == 0) {
                    field1515[var7] = var11;
                } else {
                    field1515[var7] = var4.method2519();
                }
                if ((var9 & 0x4) == 0) {
                    field1516[var7] = var11;
                } else {
                    field1516[var7] = var4.method2519();
                }
                var6 = var8;
                var7++;
                if (this.field1517.field1745[var8] == 5) {
                    this.field1513 = true;
                }
            }
        }
        if (var4.field1977 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1518 = var7;
        this.field1519 = new int[var7];
        this.field1522 = new int[var7];
        this.field1521 = new int[var7];
        this.field1520 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1519[var12] = field1523[var12];
            this.field1522[var12] = field1514[var12];
            this.field1521[var12] = field1515[var12];
            this.field1520[var12] = field1516[var12];
        }
    }
}
