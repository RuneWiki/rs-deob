package deob;

@ObfuscatedName("cp")
public class class81 {

    @ObfuscatedName("cp.k")
    public static int[] field1411 = new int[500];

    @ObfuscatedName("cp.y")
    public static int[] field1410 = new int[500];

    @ObfuscatedName("cp.s")
    public static int[] field1418 = new int[500];

    @ObfuscatedName("cp.g")
    public static int[] field1412 = new int[500];

    @ObfuscatedName("cp.h")
    public class95 field1413 = null;

    @ObfuscatedName("cp.l")
    public int field1414 = -1;

    @ObfuscatedName("cp.e")
    public int[] field1415;

    @ObfuscatedName("cp.u")
    public int[] field1417;

    @ObfuscatedName("cp.j")
    public int[] field1409;

    @ObfuscatedName("cp.c")
    public int[] field1416;

    @ObfuscatedName("cp.d")
    public boolean field1419 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1413 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1838 = 2;
        int var5 = var3.method2138();
        int var6 = -1;
        int var7 = 0;
        var4.field1838 = var3.field1838 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2138();
            if (var9 > 0) {
                if (this.field1413.field1642[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1413.field1642[var10] == 0) {
                            field1411[var7] = var10;
                            field1410[var7] = 0;
                            field1418[var7] = 0;
                            field1412[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1411[var7] = var8;
                short var11 = 0;
                if (this.field1413.field1642[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1410[var7] = var11;
                } else {
                    field1410[var7] = var4.method2307();
                }
                if ((var9 & 0x2) == 0) {
                    field1418[var7] = var11;
                } else {
                    field1418[var7] = var4.method2307();
                }
                if ((var9 & 0x4) == 0) {
                    field1412[var7] = var11;
                } else {
                    field1412[var7] = var4.method2307();
                }
                var6 = var8;
                var7++;
                if (this.field1413.field1642[var8] == 5) {
                    this.field1419 = true;
                }
            }
        }
        if (var4.field1838 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1414 = var7;
        this.field1415 = new int[var7];
        this.field1417 = new int[var7];
        this.field1409 = new int[var7];
        this.field1416 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1415[var12] = field1411[var12];
            this.field1417[var12] = field1410[var12];
            this.field1409[var12] = field1418[var12];
            this.field1416[var12] = field1412[var12];
        }
    }
}
