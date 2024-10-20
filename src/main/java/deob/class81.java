package deob;

@ObfuscatedName("cz")
public class class81 {

    @ObfuscatedName("cz.i")
    public static int[] field1327 = new int[500];

    @ObfuscatedName("cz.e")
    public static int[] field1320 = new int[500];

    @ObfuscatedName("cz.f")
    public static int[] field1321 = new int[500];

    @ObfuscatedName("cz.k")
    public static int[] field1323 = new int[500];

    @ObfuscatedName("cz.g")
    public class87 field1328 = null;

    @ObfuscatedName("cz.n")
    public int field1324 = -1;

    @ObfuscatedName("cz.a")
    public int[] field1325;

    @ObfuscatedName("cz.q")
    public int[] field1322;

    @ObfuscatedName("cz.w")
    public int[] field1319;

    @ObfuscatedName("cz.v")
    public int[] field1326;

    @ObfuscatedName("cz.h")
    public boolean field1329 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1328 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2091 = 2;
        int var5 = var3.method2573();
        int var6 = -1;
        int var7 = 0;
        var4.field2091 = var3.field2091 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2573();
            if (var9 > 0) {
                if (this.field1328.field1469[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1328.field1469[var10] == 0) {
                            field1327[var7] = var10;
                            field1320[var7] = 0;
                            field1321[var7] = 0;
                            field1323[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1327[var7] = var8;
                short var11 = 0;
                if (this.field1328.field1469[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1320[var7] = var11;
                } else {
                    field1320[var7] = var4.method2671();
                }
                if ((var9 & 0x2) == 0) {
                    field1321[var7] = var11;
                } else {
                    field1321[var7] = var4.method2671();
                }
                if ((var9 & 0x4) == 0) {
                    field1323[var7] = var11;
                } else {
                    field1323[var7] = var4.method2671();
                }
                var6 = var8;
                var7++;
                if (this.field1328.field1469[var8] == 5) {
                    this.field1329 = true;
                }
            }
        }
        if (var4.field2091 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1324 = var7;
        this.field1325 = new int[var7];
        this.field1322 = new int[var7];
        this.field1319 = new int[var7];
        this.field1326 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1325[var12] = field1327[var12];
            this.field1322[var12] = field1320[var12];
            this.field1319[var12] = field1321[var12];
            this.field1326[var12] = field1323[var12];
        }
    }
}
