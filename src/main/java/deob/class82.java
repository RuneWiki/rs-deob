package deob;

@ObfuscatedName("co")
public class class82 {

    @ObfuscatedName("co.v")
    public static int[] field1439 = new int[500];

    @ObfuscatedName("co.t")
    public static int[] field1442 = new int[500];

    @ObfuscatedName("co.f")
    public static int[] field1436 = new int[500];

    @ObfuscatedName("co.j")
    public static int[] field1437 = new int[500];

    @ObfuscatedName("co.l")
    public class96 field1435 = null;

    @ObfuscatedName("co.g")
    public int field1438 = -1;

    @ObfuscatedName("co.k")
    public int[] field1444;

    @ObfuscatedName("co.p")
    public int[] field1441;

    @ObfuscatedName("co.y")
    public int[] field1440;

    @ObfuscatedName("co.m")
    public int[] field1443;

    @ObfuscatedName("co.o")
    public boolean field1434 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1435 = arg1;
        class110 var3 = new class110(arg0);
        class110 var4 = new class110(arg0);
        var3.field1847 = 2;
        int var5 = var3.method2257();
        int var6 = -1;
        int var7 = 0;
        var4.field1847 = var3.field1847 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2257();
            if (var9 > 0) {
                if (this.field1435.field1664[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1435.field1664[var10] == 0) {
                            field1439[var7] = var10;
                            field1442[var7] = 0;
                            field1436[var7] = 0;
                            field1437[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1439[var7] = var8;
                short var11 = 0;
                if (this.field1435.field1664[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1442[var7] = var11;
                } else {
                    field1442[var7] = var4.method2151();
                }
                if ((var9 & 0x2) == 0) {
                    field1436[var7] = var11;
                } else {
                    field1436[var7] = var4.method2151();
                }
                if ((var9 & 0x4) == 0) {
                    field1437[var7] = var11;
                } else {
                    field1437[var7] = var4.method2151();
                }
                var6 = var8;
                var7++;
                if (this.field1435.field1664[var8] == 5) {
                    this.field1434 = true;
                }
            }
        }
        if (var4.field1847 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1438 = var7;
        this.field1444 = new int[var7];
        this.field1441 = new int[var7];
        this.field1440 = new int[var7];
        this.field1443 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1444[var12] = field1439[var12];
            this.field1441[var12] = field1442[var12];
            this.field1440[var12] = field1436[var12];
            this.field1443[var12] = field1437[var12];
        }
    }
}
