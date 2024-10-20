package deob;

@ObfuscatedName("co")
public class class81 {

    @ObfuscatedName("co.p")
    public static int[] field1319 = new int[500];

    @ObfuscatedName("co.g")
    public static int[] field1323 = new int[500];

    @ObfuscatedName("co.x")
    public static int[] field1318 = new int[500];

    @ObfuscatedName("co.q")
    public static int[] field1322 = new int[500];

    @ObfuscatedName("co.d")
    public class87 field1320 = null;

    @ObfuscatedName("co.k")
    public int field1321 = -1;

    @ObfuscatedName("co.j")
    public int[] field1317;

    @ObfuscatedName("co.s")
    public int[] field1316;

    @ObfuscatedName("co.o")
    public int[] field1324;

    @ObfuscatedName("co.a")
    public int[] field1325;

    @ObfuscatedName("co.c")
    public boolean field1326 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1320 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2098 = 2;
        int var5 = var3.method2593();
        int var6 = -1;
        int var7 = 0;
        var4.field2098 = var3.field2098 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2593();
            if (var9 > 0) {
                if (this.field1320.field1470[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1320.field1470[var10] == 0) {
                            field1319[var7] = var10;
                            field1323[var7] = 0;
                            field1318[var7] = 0;
                            field1322[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1319[var7] = var8;
                short var11 = 0;
                if (this.field1320.field1470[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1323[var7] = var11;
                } else {
                    field1323[var7] = var4.method2607();
                }
                if ((var9 & 0x2) == 0) {
                    field1318[var7] = var11;
                } else {
                    field1318[var7] = var4.method2607();
                }
                if ((var9 & 0x4) == 0) {
                    field1322[var7] = var11;
                } else {
                    field1322[var7] = var4.method2607();
                }
                var6 = var8;
                var7++;
                if (this.field1320.field1470[var8] == 5) {
                    this.field1326 = true;
                }
            }
        }
        if (var4.field2098 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1321 = var7;
        this.field1317 = new int[var7];
        this.field1316 = new int[var7];
        this.field1324 = new int[var7];
        this.field1325 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1317[var12] = field1319[var12];
            this.field1316[var12] = field1323[var12];
            this.field1324[var12] = field1318[var12];
            this.field1325[var12] = field1322[var12];
        }
    }
}
