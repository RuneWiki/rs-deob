package deob;

@ObfuscatedName("ch")
public class class82 {

    @ObfuscatedName("ch.f")
    public static int[] field1456 = new int[500];

    @ObfuscatedName("ch.k")
    public static int[] field1448 = new int[500];

    @ObfuscatedName("ch.y")
    public static int[] field1447 = new int[500];

    @ObfuscatedName("ch.e")
    public static int[] field1449 = new int[500];

    @ObfuscatedName("ch.r")
    public class96 field1450 = null;

    @ObfuscatedName("ch.a")
    public int field1451 = -1;

    @ObfuscatedName("ch.n")
    public int[] field1452;

    @ObfuscatedName("ch.x")
    public int[] field1455;

    @ObfuscatedName("ch.g")
    public int[] field1454;

    @ObfuscatedName("ch.o")
    public int[] field1446;

    @ObfuscatedName("ch.p")
    public boolean field1453 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1450 = arg1;
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        var3.field1859 = 2;
        int var5 = var3.method2158();
        int var6 = -1;
        int var7 = 0;
        var4.field1859 = var3.field1859 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2158();
            if (var9 > 0) {
                if (this.field1450.field1676[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1450.field1676[var10] == 0) {
                            field1456[var7] = var10;
                            field1448[var7] = 0;
                            field1447[var7] = 0;
                            field1449[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1456[var7] = var8;
                short var11 = 0;
                if (this.field1450.field1676[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1448[var7] = var11;
                } else {
                    field1448[var7] = var4.method2285();
                }
                if ((var9 & 0x2) == 0) {
                    field1447[var7] = var11;
                } else {
                    field1447[var7] = var4.method2285();
                }
                if ((var9 & 0x4) == 0) {
                    field1449[var7] = var11;
                } else {
                    field1449[var7] = var4.method2285();
                }
                var6 = var8;
                var7++;
                if (this.field1450.field1676[var8] == 5) {
                    this.field1453 = true;
                }
            }
        }
        if (var4.field1859 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1451 = var7;
        this.field1452 = new int[var7];
        this.field1455 = new int[var7];
        this.field1454 = new int[var7];
        this.field1446 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1452[var12] = field1456[var12];
            this.field1455[var12] = field1448[var12];
            this.field1454[var12] = field1447[var12];
            this.field1446[var12] = field1449[var12];
        }
    }
}
