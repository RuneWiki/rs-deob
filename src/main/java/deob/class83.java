package deob;

@ObfuscatedName("cf")
public class class83 {

    @ObfuscatedName("cf.o")
    public static int[] field1457 = new int[500];

    @ObfuscatedName("cf.l")
    public static int[] field1451 = new int[500];

    @ObfuscatedName("cf.g")
    public static int[] field1452 = new int[500];

    @ObfuscatedName("cf.u")
    public static int[] field1450 = new int[500];

    @ObfuscatedName("cf.q")
    public class97 field1454 = null;

    @ObfuscatedName("cf.r")
    public int field1453 = -1;

    @ObfuscatedName("cf.v")
    public int[] field1456;

    @ObfuscatedName("cf.y")
    public int[] field1455;

    @ObfuscatedName("cf.k")
    public int[] field1458;

    @ObfuscatedName("cf.c")
    public int[] field1459;

    @ObfuscatedName("cf.j")
    public boolean field1460 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1454 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1861 = 2;
        int var5 = var3.method2219();
        int var6 = -1;
        int var7 = 0;
        var4.field1861 = var3.field1861 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2219();
            if (var9 > 0) {
                if (this.field1454.field1674[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1454.field1674[var10] == 0) {
                            field1457[var7] = var10;
                            field1451[var7] = 0;
                            field1452[var7] = 0;
                            field1450[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1457[var7] = var8;
                short var11 = 0;
                if (this.field1454.field1674[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1451[var7] = var11;
                } else {
                    field1451[var7] = var4.method2231();
                }
                if ((var9 & 0x2) == 0) {
                    field1452[var7] = var11;
                } else {
                    field1452[var7] = var4.method2231();
                }
                if ((var9 & 0x4) == 0) {
                    field1450[var7] = var11;
                } else {
                    field1450[var7] = var4.method2231();
                }
                var6 = var8;
                var7++;
                if (this.field1454.field1674[var8] == 5) {
                    this.field1460 = true;
                }
            }
        }
        if (var4.field1861 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1453 = var7;
        this.field1456 = new int[var7];
        this.field1455 = new int[var7];
        this.field1458 = new int[var7];
        this.field1459 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1456[var12] = field1457[var12];
            this.field1455[var12] = field1451[var12];
            this.field1458[var12] = field1452[var12];
            this.field1459[var12] = field1450[var12];
        }
    }
}
