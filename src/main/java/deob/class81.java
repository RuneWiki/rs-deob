package deob;

@ObfuscatedName("cf")
public class class81 {

    @ObfuscatedName("cf.k")
    public static int[] field1320 = new int[500];

    @ObfuscatedName("cf.y")
    public static int[] field1318 = new int[500];

    @ObfuscatedName("cf.o")
    public static int[] field1319 = new int[500];

    @ObfuscatedName("cf.r")
    public static int[] field1317 = new int[500];

    @ObfuscatedName("cf.w")
    public class87 field1321 = null;

    @ObfuscatedName("cf.j")
    public int field1322 = -1;

    @ObfuscatedName("cf.q")
    public int[] field1327;

    @ObfuscatedName("cf.d")
    public int[] field1324;

    @ObfuscatedName("cf.n")
    public int[] field1325;

    @ObfuscatedName("cf.c")
    public int[] field1326;

    @ObfuscatedName("cf.s")
    public boolean field1323 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1321 = arg1;
        class161 var3 = new class161(arg0);
        class161 var4 = new class161(arg0);
        var3.field2267 = 2;
        int var5 = var3.method2733();
        int var6 = -1;
        int var7 = 0;
        var4.field2267 = var3.field2267 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2733();
            if (var9 > 0) {
                if (this.field1321.field1472[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1321.field1472[var10] == 0) {
                            field1320[var7] = var10;
                            field1318[var7] = 0;
                            field1319[var7] = 0;
                            field1317[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1320[var7] = var8;
                short var11 = 0;
                if (this.field1321.field1472[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1318[var7] = var11;
                } else {
                    field1318[var7] = var4.method2853();
                }
                if ((var9 & 0x2) == 0) {
                    field1319[var7] = var11;
                } else {
                    field1319[var7] = var4.method2853();
                }
                if ((var9 & 0x4) == 0) {
                    field1317[var7] = var11;
                } else {
                    field1317[var7] = var4.method2853();
                }
                var6 = var8;
                var7++;
                if (this.field1321.field1472[var8] == 5) {
                    this.field1323 = true;
                }
            }
        }
        if (var4.field2267 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1322 = var7;
        this.field1327 = new int[var7];
        this.field1324 = new int[var7];
        this.field1325 = new int[var7];
        this.field1326 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1327[var12] = field1320[var12];
            this.field1324[var12] = field1318[var12];
            this.field1325[var12] = field1319[var12];
            this.field1326[var12] = field1317[var12];
        }
    }
}
