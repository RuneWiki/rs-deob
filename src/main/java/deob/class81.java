package deob;

@ObfuscatedName("cc")
public class class81 {

    @ObfuscatedName("cc.s")
    public static int[] field1326 = new int[500];

    @ObfuscatedName("cc.c")
    public static int[] field1321 = new int[500];

    @ObfuscatedName("cc.f")
    public static int[] field1322 = new int[500];

    @ObfuscatedName("cc.h")
    public static int[] field1323 = new int[500];

    @ObfuscatedName("cc.a")
    public class87 field1324 = null;

    @ObfuscatedName("cc.g")
    public int field1325 = -1;

    @ObfuscatedName("cc.k")
    public int[] field1329;

    @ObfuscatedName("cc.u")
    public int[] field1327;

    @ObfuscatedName("cc.b")
    public int[] field1328;

    @ObfuscatedName("cc.x")
    public int[] field1320;

    @ObfuscatedName("cc.r")
    public boolean field1330 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1324 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2098 = 2;
        int var5 = var3.method2545();
        int var6 = -1;
        int var7 = 0;
        var4.field2098 = var3.field2098 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2545();
            if (var9 > 0) {
                if (this.field1324.field1470[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1324.field1470[var10] == 0) {
                            field1326[var7] = var10;
                            field1321[var7] = 0;
                            field1322[var7] = 0;
                            field1323[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1326[var7] = var8;
                short var11 = 0;
                if (this.field1324.field1470[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1321[var7] = var11;
                } else {
                    field1321[var7] = var4.method2695();
                }
                if ((var9 & 0x2) == 0) {
                    field1322[var7] = var11;
                } else {
                    field1322[var7] = var4.method2695();
                }
                if ((var9 & 0x4) == 0) {
                    field1323[var7] = var11;
                } else {
                    field1323[var7] = var4.method2695();
                }
                var6 = var8;
                var7++;
                if (this.field1324.field1470[var8] == 5) {
                    this.field1330 = true;
                }
            }
        }
        if (var4.field2098 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1325 = var7;
        this.field1329 = new int[var7];
        this.field1327 = new int[var7];
        this.field1328 = new int[var7];
        this.field1320 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1329[var12] = field1326[var12];
            this.field1327[var12] = field1321[var12];
            this.field1328[var12] = field1322[var12];
            this.field1320[var12] = field1323[var12];
        }
    }
}
