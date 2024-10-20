package deob;

@ObfuscatedName("cs")
public class class88 {

    @ObfuscatedName("cs.k")
    public static int[] field1510 = new int[500];

    @ObfuscatedName("cs.h")
    public static int[] field1508 = new int[500];

    @ObfuscatedName("cs.o")
    public static int[] field1503 = new int[500];

    @ObfuscatedName("cs.z")
    public static int[] field1502 = new int[500];

    @ObfuscatedName("cs.c")
    public class102 field1505 = null;

    @ObfuscatedName("cs.d")
    public int field1506 = -1;

    @ObfuscatedName("cs.l")
    public int[] field1507;

    @ObfuscatedName("cs.b")
    public int[] field1509;

    @ObfuscatedName("cs.j")
    public int[] field1504;

    @ObfuscatedName("cs.f")
    public int[] field1501;

    @ObfuscatedName("cs.i")
    public boolean field1511 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1505 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1949 = 2;
        int var5 = var3.method2330();
        int var6 = -1;
        int var7 = 0;
        var4.field1949 = var3.field1949 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2330();
            if (var9 > 0) {
                if (this.field1505.field1729[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1505.field1729[var10] == 0) {
                            field1510[var7] = var10;
                            field1508[var7] = 0;
                            field1503[var7] = 0;
                            field1502[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1510[var7] = var8;
                short var11 = 0;
                if (this.field1505.field1729[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1508[var7] = var11;
                } else {
                    field1508[var7] = var4.method2341();
                }
                if ((var9 & 0x2) == 0) {
                    field1503[var7] = var11;
                } else {
                    field1503[var7] = var4.method2341();
                }
                if ((var9 & 0x4) == 0) {
                    field1502[var7] = var11;
                } else {
                    field1502[var7] = var4.method2341();
                }
                var6 = var8;
                var7++;
                if (this.field1505.field1729[var8] == 5) {
                    this.field1511 = true;
                }
            }
        }
        if (var4.field1949 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1506 = var7;
        this.field1507 = new int[var7];
        this.field1509 = new int[var7];
        this.field1504 = new int[var7];
        this.field1501 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1507[var12] = field1510[var12];
            this.field1509[var12] = field1508[var12];
            this.field1504[var12] = field1503[var12];
            this.field1501[var12] = field1502[var12];
        }
    }
}
