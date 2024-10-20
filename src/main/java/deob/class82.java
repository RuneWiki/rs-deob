package deob;

@ObfuscatedName("ct")
public class class82 {

    @ObfuscatedName("ct.b")
    public static int[] field1439 = new int[500];

    @ObfuscatedName("ct.e")
    public static int[] field1435 = new int[500];

    @ObfuscatedName("ct.i")
    public static int[] field1437 = new int[500];

    @ObfuscatedName("ct.k")
    public static int[] field1438 = new int[500];

    @ObfuscatedName("ct.h")
    public class96 field1440 = null;

    @ObfuscatedName("ct.p")
    public int field1436 = -1;

    @ObfuscatedName("ct.n")
    public int[] field1441;

    @ObfuscatedName("ct.o")
    public int[] field1442;

    @ObfuscatedName("ct.g")
    public int[] field1443;

    @ObfuscatedName("ct.z")
    public int[] field1444;

    @ObfuscatedName("ct.t")
    public boolean field1445 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1440 = arg1;
        class110 var3 = new class110(arg0);
        class110 var4 = new class110(arg0);
        var3.field1855 = 2;
        int var5 = var3.method2142();
        int var6 = -1;
        int var7 = 0;
        var4.field1855 = var3.field1855 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2142();
            if (var9 > 0) {
                if (this.field1440.field1657[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1440.field1657[var10] == 0) {
                            field1439[var7] = var10;
                            field1435[var7] = 0;
                            field1437[var7] = 0;
                            field1438[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1439[var7] = var8;
                short var11 = 0;
                if (this.field1440.field1657[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1435[var7] = var11;
                } else {
                    field1435[var7] = var4.method2154();
                }
                if ((var9 & 0x2) == 0) {
                    field1437[var7] = var11;
                } else {
                    field1437[var7] = var4.method2154();
                }
                if ((var9 & 0x4) == 0) {
                    field1438[var7] = var11;
                } else {
                    field1438[var7] = var4.method2154();
                }
                var6 = var8;
                var7++;
                if (this.field1440.field1657[var8] == 5) {
                    this.field1445 = true;
                }
            }
        }
        if (var4.field1855 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1436 = var7;
        this.field1441 = new int[var7];
        this.field1442 = new int[var7];
        this.field1443 = new int[var7];
        this.field1444 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1441[var12] = field1439[var12];
            this.field1442[var12] = field1435[var12];
            this.field1443[var12] = field1437[var12];
            this.field1444[var12] = field1438[var12];
        }
    }
}
