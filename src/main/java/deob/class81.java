package deob;

@ObfuscatedName("ct")
public class class81 {

    @ObfuscatedName("ct.g")
    public static int[] field1438 = new int[500];

    @ObfuscatedName("ct.i")
    public static int[] field1439 = new int[500];

    @ObfuscatedName("ct.k")
    public static int[] field1440 = new int[500];

    @ObfuscatedName("ct.e")
    public static int[] field1441 = new int[500];

    @ObfuscatedName("ct.w")
    public class95 field1443 = null;

    @ObfuscatedName("ct.m")
    public int field1448 = -1;

    @ObfuscatedName("ct.u")
    public int[] field1444;

    @ObfuscatedName("ct.j")
    public int[] field1445;

    @ObfuscatedName("ct.o")
    public int[] field1446;

    @ObfuscatedName("ct.h")
    public int[] field1447;

    @ObfuscatedName("ct.b")
    public boolean field1442 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1443 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1844 = 2;
        int var5 = var3.method2092();
        int var6 = -1;
        int var7 = 0;
        var4.field1844 = var3.field1844 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2092();
            if (var9 > 0) {
                if (this.field1443.field1661[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1443.field1661[var10] == 0) {
                            field1438[var7] = var10;
                            field1439[var7] = 0;
                            field1440[var7] = 0;
                            field1441[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1438[var7] = var8;
                short var11 = 0;
                if (this.field1443.field1661[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1439[var7] = var11;
                } else {
                    field1439[var7] = var4.method2104();
                }
                if ((var9 & 0x2) == 0) {
                    field1440[var7] = var11;
                } else {
                    field1440[var7] = var4.method2104();
                }
                if ((var9 & 0x4) == 0) {
                    field1441[var7] = var11;
                } else {
                    field1441[var7] = var4.method2104();
                }
                var6 = var8;
                var7++;
                if (this.field1443.field1661[var8] == 5) {
                    this.field1442 = true;
                }
            }
        }
        if (var4.field1844 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1448 = var7;
        this.field1444 = new int[var7];
        this.field1445 = new int[var7];
        this.field1446 = new int[var7];
        this.field1447 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1444[var12] = field1438[var12];
            this.field1445[var12] = field1439[var12];
            this.field1446[var12] = field1440[var12];
            this.field1447[var12] = field1441[var12];
        }
    }
}
