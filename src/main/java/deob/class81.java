package deob;

@ObfuscatedName("cf")
public class class81 {

    @ObfuscatedName("cf.b")
    public static int[] field1322 = new int[500];

    @ObfuscatedName("cf.e")
    public static int[] field1323 = new int[500];

    @ObfuscatedName("cf.c")
    public static int[] field1330 = new int[500];

    @ObfuscatedName("cf.l")
    public static int[] field1325 = new int[500];

    @ObfuscatedName("cf.y")
    public class87 field1328 = null;

    @ObfuscatedName("cf.j")
    public int field1327 = -1;

    @ObfuscatedName("cf.g")
    public int[] field1324;

    @ObfuscatedName("cf.s")
    public int[] field1329;

    @ObfuscatedName("cf.r")
    public int[] field1326;

    @ObfuscatedName("cf.t")
    public int[] field1331;

    @ObfuscatedName("cf.k")
    public boolean field1332 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1328 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2079 = 2;
        int var5 = var3.method2669();
        int var6 = -1;
        int var7 = 0;
        var4.field2079 = var3.field2079 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2669();
            if (var9 > 0) {
                if (this.field1328.field1474[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1328.field1474[var10] == 0) {
                            field1322[var7] = var10;
                            field1323[var7] = 0;
                            field1330[var7] = 0;
                            field1325[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1322[var7] = var8;
                short var11 = 0;
                if (this.field1328.field1474[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1323[var7] = var11;
                } else {
                    field1323[var7] = var4.method2819();
                }
                if ((var9 & 0x2) == 0) {
                    field1330[var7] = var11;
                } else {
                    field1330[var7] = var4.method2819();
                }
                if ((var9 & 0x4) == 0) {
                    field1325[var7] = var11;
                } else {
                    field1325[var7] = var4.method2819();
                }
                var6 = var8;
                var7++;
                if (this.field1328.field1474[var8] == 5) {
                    this.field1332 = true;
                }
            }
        }
        if (var4.field2079 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1327 = var7;
        this.field1324 = new int[var7];
        this.field1329 = new int[var7];
        this.field1326 = new int[var7];
        this.field1331 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1324[var12] = field1322[var12];
            this.field1329[var12] = field1323[var12];
            this.field1326[var12] = field1330[var12];
            this.field1331[var12] = field1325[var12];
        }
    }
}
