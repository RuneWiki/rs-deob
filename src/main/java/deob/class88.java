package deob;

@ObfuscatedName("cm")
public class class88 {

    @ObfuscatedName("cm.m")
    public static int[] field1484 = new int[500];

    @ObfuscatedName("cm.l")
    public static int[] field1485 = new int[500];

    @ObfuscatedName("cm.y")
    public static int[] field1486 = new int[500];

    @ObfuscatedName("cm.u")
    public static int[] field1490 = new int[500];

    @ObfuscatedName("cm.k")
    public class102 field1487 = null;

    @ObfuscatedName("cm.j")
    public int field1489 = -1;

    @ObfuscatedName("cm.i")
    public int[] field1492;

    @ObfuscatedName("cm.x")
    public int[] field1491;

    @ObfuscatedName("cm.g")
    public int[] field1494;

    @ObfuscatedName("cm.e")
    public int[] field1493;

    @ObfuscatedName("cm.p")
    public boolean field1488 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1487 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1955 = 2;
        int var5 = var3.method2562();
        int var6 = -1;
        int var7 = 0;
        var4.field1955 = var3.field1955 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2562();
            if (var9 > 0) {
                if (this.field1487.field1714[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1487.field1714[var10] == 0) {
                            field1484[var7] = var10;
                            field1485[var7] = 0;
                            field1486[var7] = 0;
                            field1490[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1484[var7] = var8;
                short var11 = 0;
                if (this.field1487.field1714[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1485[var7] = var11;
                } else {
                    field1485[var7] = var4.method2393();
                }
                if ((var9 & 0x2) == 0) {
                    field1486[var7] = var11;
                } else {
                    field1486[var7] = var4.method2393();
                }
                if ((var9 & 0x4) == 0) {
                    field1490[var7] = var11;
                } else {
                    field1490[var7] = var4.method2393();
                }
                var6 = var8;
                var7++;
                if (this.field1487.field1714[var8] == 5) {
                    this.field1488 = true;
                }
            }
        }
        if (var4.field1955 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1489 = var7;
        this.field1492 = new int[var7];
        this.field1491 = new int[var7];
        this.field1494 = new int[var7];
        this.field1493 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1492[var12] = field1484[var12];
            this.field1491[var12] = field1485[var12];
            this.field1494[var12] = field1486[var12];
            this.field1493[var12] = field1490[var12];
        }
    }
}
