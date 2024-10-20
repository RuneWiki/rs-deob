package deob;

@ObfuscatedName("cs")
public class class82 {

    @ObfuscatedName("cs.e")
    public static int[] field1454 = new int[500];

    @ObfuscatedName("cs.v")
    public static int[] field1450 = new int[500];

    @ObfuscatedName("cs.k")
    public static int[] field1457 = new int[500];

    @ObfuscatedName("cs.g")
    public static int[] field1452 = new int[500];

    @ObfuscatedName("cs.q")
    public class96 field1451 = null;

    @ObfuscatedName("cs.l")
    public int field1453 = -1;

    @ObfuscatedName("cs.a")
    public int[] field1455;

    @ObfuscatedName("cs.b")
    public int[] field1456;

    @ObfuscatedName("cs.z")
    public int[] field1449;

    @ObfuscatedName("cs.w")
    public int[] field1458;

    @ObfuscatedName("cs.j")
    public boolean field1459 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1451 = arg1;
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        var3.field1841 = 2;
        int var5 = var3.method2122();
        int var6 = -1;
        int var7 = 0;
        var4.field1841 = var3.field1841 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2122();
            if (var9 > 0) {
                if (this.field1451.field1670[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1451.field1670[var10] == 0) {
                            field1454[var7] = var10;
                            field1450[var7] = 0;
                            field1457[var7] = 0;
                            field1452[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1454[var7] = var8;
                short var11 = 0;
                if (this.field1451.field1670[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1450[var7] = var11;
                } else {
                    field1450[var7] = var4.method2210();
                }
                if ((var9 & 0x2) == 0) {
                    field1457[var7] = var11;
                } else {
                    field1457[var7] = var4.method2210();
                }
                if ((var9 & 0x4) == 0) {
                    field1452[var7] = var11;
                } else {
                    field1452[var7] = var4.method2210();
                }
                var6 = var8;
                var7++;
                if (this.field1451.field1670[var8] == 5) {
                    this.field1459 = true;
                }
            }
        }
        if (var4.field1841 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1453 = var7;
        this.field1455 = new int[var7];
        this.field1456 = new int[var7];
        this.field1449 = new int[var7];
        this.field1458 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1455[var12] = field1454[var12];
            this.field1456[var12] = field1450[var12];
            this.field1449[var12] = field1457[var12];
            this.field1458[var12] = field1452[var12];
        }
    }
}
