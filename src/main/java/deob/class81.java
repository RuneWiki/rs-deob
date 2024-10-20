package deob;

@ObfuscatedName("cg")
public class class81 {

    @ObfuscatedName("cg.n")
    public static int[] field1314 = new int[500];

    @ObfuscatedName("cg.d")
    public static int[] field1310 = new int[500];

    @ObfuscatedName("cg.m")
    public static int[] field1312 = new int[500];

    @ObfuscatedName("cg.h")
    public static int[] field1313 = new int[500];

    @ObfuscatedName("cg.w")
    public class87 field1316 = null;

    @ObfuscatedName("cg.r")
    public int field1315 = -1;

    @ObfuscatedName("cg.c")
    public int[] field1311;

    @ObfuscatedName("cg.p")
    public int[] field1317;

    @ObfuscatedName("cg.g")
    public int[] field1318;

    @ObfuscatedName("cg.z")
    public int[] field1319;

    @ObfuscatedName("cg.q")
    public boolean field1320 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1316 = arg1;
        class161 var3 = new class161(arg0);
        class161 var4 = new class161(arg0);
        var3.field2285 = 2;
        int var5 = var3.method2823();
        int var6 = -1;
        int var7 = 0;
        var4.field2285 = var3.field2285 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2823();
            if (var9 > 0) {
                if (this.field1316.field1468[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1316.field1468[var10] == 0) {
                            field1314[var7] = var10;
                            field1310[var7] = 0;
                            field1312[var7] = 0;
                            field1313[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1314[var7] = var8;
                short var11 = 0;
                if (this.field1316.field1468[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1310[var7] = var11;
                } else {
                    field1310[var7] = var4.method2792();
                }
                if ((var9 & 0x2) == 0) {
                    field1312[var7] = var11;
                } else {
                    field1312[var7] = var4.method2792();
                }
                if ((var9 & 0x4) == 0) {
                    field1313[var7] = var11;
                } else {
                    field1313[var7] = var4.method2792();
                }
                var6 = var8;
                var7++;
                if (this.field1316.field1468[var8] == 5) {
                    this.field1320 = true;
                }
            }
        }
        if (var4.field2285 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1315 = var7;
        this.field1311 = new int[var7];
        this.field1317 = new int[var7];
        this.field1318 = new int[var7];
        this.field1319 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1311[var12] = field1314[var12];
            this.field1317[var12] = field1310[var12];
            this.field1318[var12] = field1312[var12];
            this.field1319[var12] = field1313[var12];
        }
    }
}
