package deob;

@ObfuscatedName("ca")
public class class81 {

    @ObfuscatedName("ca.o")
    public static int[] field1322 = new int[500];

    @ObfuscatedName("ca.m")
    public static int[] field1314 = new int[500];

    @ObfuscatedName("ca.b")
    public static int[] field1323 = new int[500];

    @ObfuscatedName("ca.g")
    public static int[] field1316 = new int[500];

    @ObfuscatedName("ca.h")
    public class87 field1317 = null;

    @ObfuscatedName("ca.v")
    public int field1315 = -1;

    @ObfuscatedName("ca.l")
    public int[] field1319;

    @ObfuscatedName("ca.c")
    public int[] field1320;

    @ObfuscatedName("ca.u")
    public int[] field1318;

    @ObfuscatedName("ca.k")
    public int[] field1321;

    @ObfuscatedName("ca.z")
    public boolean field1313 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1317 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2105 = 2;
        int var5 = var3.method2552();
        int var6 = -1;
        int var7 = 0;
        var4.field2105 = var3.field2105 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2552();
            if (var9 > 0) {
                if (this.field1317.field1457[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1317.field1457[var10] == 0) {
                            field1322[var7] = var10;
                            field1314[var7] = 0;
                            field1323[var7] = 0;
                            field1316[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1322[var7] = var8;
                short var11 = 0;
                if (this.field1317.field1457[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1314[var7] = var11;
                } else {
                    field1314[var7] = var4.method2564();
                }
                if ((var9 & 0x2) == 0) {
                    field1323[var7] = var11;
                } else {
                    field1323[var7] = var4.method2564();
                }
                if ((var9 & 0x4) == 0) {
                    field1316[var7] = var11;
                } else {
                    field1316[var7] = var4.method2564();
                }
                var6 = var8;
                var7++;
                if (this.field1317.field1457[var8] == 5) {
                    this.field1313 = true;
                }
            }
        }
        if (var4.field2105 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1315 = var7;
        this.field1319 = new int[var7];
        this.field1320 = new int[var7];
        this.field1318 = new int[var7];
        this.field1321 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1319[var12] = field1322[var12];
            this.field1320[var12] = field1314[var12];
            this.field1318[var12] = field1323[var12];
            this.field1321[var12] = field1316[var12];
        }
    }
}
