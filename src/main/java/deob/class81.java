package deob;

@ObfuscatedName("cn")
public class class81 {

    @ObfuscatedName("cn.z")
    public static int[] field1413 = new int[500];

    @ObfuscatedName("cn.j")
    public static int[] field1404 = new int[500];

    @ObfuscatedName("cn.a")
    public static int[] field1407 = new int[500];

    @ObfuscatedName("cn.y")
    public static int[] field1403 = new int[500];

    @ObfuscatedName("cn.i")
    public class95 field1406 = null;

    @ObfuscatedName("cn.b")
    public int field1405 = -1;

    @ObfuscatedName("cn.s")
    public int[] field1409;

    @ObfuscatedName("cn.q")
    public int[] field1410;

    @ObfuscatedName("cn.p")
    public int[] field1411;

    @ObfuscatedName("cn.h")
    public int[] field1412;

    @ObfuscatedName("cn.r")
    public boolean field1408 = false;

    public class81(byte[] arg0, class95 arg1) {
        this.field1406 = arg1;
        class107 var3 = new class107(arg0);
        class107 var4 = new class107(arg0);
        var3.field1819 = 2;
        int var5 = var3.method2122();
        int var6 = -1;
        int var7 = 0;
        var4.field1819 = var3.field1819 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2122();
            if (var9 > 0) {
                if (this.field1406.field1639[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1406.field1639[var10] == 0) {
                            field1413[var7] = var10;
                            field1404[var7] = 0;
                            field1407[var7] = 0;
                            field1403[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1413[var7] = var8;
                short var11 = 0;
                if (this.field1406.field1639[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1404[var7] = var11;
                } else {
                    field1404[var7] = var4.method2134();
                }
                if ((var9 & 0x2) == 0) {
                    field1407[var7] = var11;
                } else {
                    field1407[var7] = var4.method2134();
                }
                if ((var9 & 0x4) == 0) {
                    field1403[var7] = var11;
                } else {
                    field1403[var7] = var4.method2134();
                }
                var6 = var8;
                var7++;
                if (this.field1406.field1639[var8] == 5) {
                    this.field1408 = true;
                }
            }
        }
        if (var4.field1819 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1405 = var7;
        this.field1409 = new int[var7];
        this.field1410 = new int[var7];
        this.field1411 = new int[var7];
        this.field1412 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1409[var12] = field1413[var12];
            this.field1410[var12] = field1404[var12];
            this.field1411[var12] = field1407[var12];
            this.field1412[var12] = field1403[var12];
        }
    }
}
