package deob;

@ObfuscatedName("cd")
public class class82 {

    @ObfuscatedName("cd.c")
    public static int[] field1421 = new int[500];

    @ObfuscatedName("cd.j")
    public static int[] field1422 = new int[500];

    @ObfuscatedName("cd.y")
    public static int[] field1424 = new int[500];

    @ObfuscatedName("cd.r")
    public static int[] field1427 = new int[500];

    @ObfuscatedName("cd.f")
    public class96 field1425 = null;

    @ObfuscatedName("cd.l")
    public int field1426 = -1;

    @ObfuscatedName("cd.b")
    public int[] field1430;

    @ObfuscatedName("cd.k")
    public int[] field1428;

    @ObfuscatedName("cd.g")
    public int[] field1429;

    @ObfuscatedName("cd.v")
    public int[] field1423;

    @ObfuscatedName("cd.i")
    public boolean field1431 = false;

    public class82(byte[] arg0, class96 arg1) {
        this.field1425 = arg1;
        class108 var3 = new class108(arg0);
        class108 var4 = new class108(arg0);
        var3.field1826 = 2;
        int var5 = var3.method2134();
        int var6 = -1;
        int var7 = 0;
        var4.field1826 = var3.field1826 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2134();
            if (var9 > 0) {
                if (this.field1425.field1649[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1425.field1649[var10] == 0) {
                            field1421[var7] = var10;
                            field1422[var7] = 0;
                            field1424[var7] = 0;
                            field1427[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1421[var7] = var8;
                short var11 = 0;
                if (this.field1425.field1649[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1422[var7] = var11;
                } else {
                    field1422[var7] = var4.method2146();
                }
                if ((var9 & 0x2) == 0) {
                    field1424[var7] = var11;
                } else {
                    field1424[var7] = var4.method2146();
                }
                if ((var9 & 0x4) == 0) {
                    field1427[var7] = var11;
                } else {
                    field1427[var7] = var4.method2146();
                }
                var6 = var8;
                var7++;
                if (this.field1425.field1649[var8] == 5) {
                    this.field1431 = true;
                }
            }
        }
        if (var4.field1826 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1426 = var7;
        this.field1430 = new int[var7];
        this.field1428 = new int[var7];
        this.field1429 = new int[var7];
        this.field1423 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1430[var12] = field1421[var12];
            this.field1428[var12] = field1422[var12];
            this.field1429[var12] = field1424[var12];
            this.field1423[var12] = field1427[var12];
        }
    }
}
