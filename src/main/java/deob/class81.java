package deob;

@ObfuscatedName("co")
public class class81 {

    @ObfuscatedName("co.u")
    public static int[] field1317 = new int[500];

    @ObfuscatedName("co.x")
    public static int[] field1318 = new int[500];

    @ObfuscatedName("co.i")
    public static int[] field1319 = new int[500];

    @ObfuscatedName("co.a")
    public static int[] field1326 = new int[500];

    @ObfuscatedName("co.f")
    public class87 field1321 = null;

    @ObfuscatedName("co.c")
    public int field1322 = -1;

    @ObfuscatedName("co.d")
    public int[] field1323;

    @ObfuscatedName("co.l")
    public int[] field1324;

    @ObfuscatedName("co.g")
    public int[] field1325;

    @ObfuscatedName("co.z")
    public int[] field1327;

    @ObfuscatedName("co.t")
    public boolean field1320 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1321 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2073 = 2;
        int var5 = var3.method2708();
        int var6 = -1;
        int var7 = 0;
        var4.field2073 = var3.field2073 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2708();
            if (var9 > 0) {
                if (this.field1321.field1463[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1321.field1463[var10] == 0) {
                            field1317[var7] = var10;
                            field1318[var7] = 0;
                            field1319[var7] = 0;
                            field1326[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1317[var7] = var8;
                short var11 = 0;
                if (this.field1321.field1463[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1318[var7] = var11;
                } else {
                    field1318[var7] = var4.method2600();
                }
                if ((var9 & 0x2) == 0) {
                    field1319[var7] = var11;
                } else {
                    field1319[var7] = var4.method2600();
                }
                if ((var9 & 0x4) == 0) {
                    field1326[var7] = var11;
                } else {
                    field1326[var7] = var4.method2600();
                }
                var6 = var8;
                var7++;
                if (this.field1321.field1463[var8] == 5) {
                    this.field1320 = true;
                }
            }
        }
        if (var4.field2073 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1322 = var7;
        this.field1323 = new int[var7];
        this.field1324 = new int[var7];
        this.field1325 = new int[var7];
        this.field1327 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1323[var12] = field1317[var12];
            this.field1324[var12] = field1318[var12];
            this.field1325[var12] = field1319[var12];
            this.field1327[var12] = field1326[var12];
        }
    }
}
