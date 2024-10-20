package deob;

@ObfuscatedName("cg")
public class class83 {

    @ObfuscatedName("cg.y")
    public static int[] field1461 = new int[500];

    @ObfuscatedName("cg.k")
    public static int[] field1469 = new int[500];

    @ObfuscatedName("cg.g")
    public static int[] field1462 = new int[500];

    @ObfuscatedName("cg.n")
    public static int[] field1467 = new int[500];

    @ObfuscatedName("cg.t")
    public class97 field1464 = null;

    @ObfuscatedName("cg.e")
    public int field1465 = -1;

    @ObfuscatedName("cg.q")
    public int[] field1466;

    @ObfuscatedName("cg.z")
    public int[] field1468;

    @ObfuscatedName("cg.v")
    public int[] field1463;

    @ObfuscatedName("cg.b")
    public int[] field1460;

    @ObfuscatedName("cg.f")
    public boolean field1470 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1464 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1902 = 2;
        int var5 = var3.method2205();
        int var6 = -1;
        int var7 = 0;
        var4.field1902 = var3.field1902 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2205();
            if (var9 > 0) {
                if (this.field1464.field1693[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1464.field1693[var10] == 0) {
                            field1461[var7] = var10;
                            field1469[var7] = 0;
                            field1462[var7] = 0;
                            field1467[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1461[var7] = var8;
                short var11 = 0;
                if (this.field1464.field1693[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1469[var7] = var11;
                } else {
                    field1469[var7] = var4.method2172();
                }
                if ((var9 & 0x2) == 0) {
                    field1462[var7] = var11;
                } else {
                    field1462[var7] = var4.method2172();
                }
                if ((var9 & 0x4) == 0) {
                    field1467[var7] = var11;
                } else {
                    field1467[var7] = var4.method2172();
                }
                var6 = var8;
                var7++;
                if (this.field1464.field1693[var8] == 5) {
                    this.field1470 = true;
                }
            }
        }
        if (var4.field1902 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1465 = var7;
        this.field1466 = new int[var7];
        this.field1468 = new int[var7];
        this.field1463 = new int[var7];
        this.field1460 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1466[var12] = field1461[var12];
            this.field1468[var12] = field1469[var12];
            this.field1463[var12] = field1462[var12];
            this.field1460[var12] = field1467[var12];
        }
    }
}
