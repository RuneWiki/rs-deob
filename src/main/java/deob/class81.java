package deob;

@ObfuscatedName("cm")
public class class81 {

    @ObfuscatedName("cm.d")
    public static int[] field1313 = new int[500];

    @ObfuscatedName("cm.c")
    public static int[] field1306 = new int[500];

    @ObfuscatedName("cm.n")
    public static int[] field1308 = new int[500];

    @ObfuscatedName("cm.q")
    public static int[] field1307 = new int[500];

    @ObfuscatedName("cm.t")
    public class87 field1310 = null;

    @ObfuscatedName("cm.p")
    public int field1311 = -1;

    @ObfuscatedName("cm.u")
    public int[] field1312;

    @ObfuscatedName("cm.z")
    public int[] field1309;

    @ObfuscatedName("cm.l")
    public int[] field1314;

    @ObfuscatedName("cm.v")
    public int[] field1315;

    @ObfuscatedName("cm.g")
    public boolean field1316 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1310 = arg1;
        class130 var3 = new class130(arg0);
        class130 var4 = new class130(arg0);
        var3.field1956 = 2;
        int var5 = var3.method2379();
        int var6 = -1;
        int var7 = 0;
        var4.field1956 = var3.field1956 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2379();
            if (var9 > 0) {
                if (this.field1310.field1457[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1310.field1457[var10] == 0) {
                            field1313[var7] = var10;
                            field1306[var7] = 0;
                            field1308[var7] = 0;
                            field1307[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1313[var7] = var8;
                short var11 = 0;
                if (this.field1310.field1457[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1306[var7] = var11;
                } else {
                    field1306[var7] = var4.method2241();
                }
                if ((var9 & 0x2) == 0) {
                    field1308[var7] = var11;
                } else {
                    field1308[var7] = var4.method2241();
                }
                if ((var9 & 0x4) == 0) {
                    field1307[var7] = var11;
                } else {
                    field1307[var7] = var4.method2241();
                }
                var6 = var8;
                var7++;
                if (this.field1310.field1457[var8] == 5) {
                    this.field1316 = true;
                }
            }
        }
        if (var4.field1956 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1311 = var7;
        this.field1312 = new int[var7];
        this.field1309 = new int[var7];
        this.field1314 = new int[var7];
        this.field1315 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1312[var12] = field1313[var12];
            this.field1309[var12] = field1306[var12];
            this.field1314[var12] = field1308[var12];
            this.field1315[var12] = field1307[var12];
        }
    }
}
