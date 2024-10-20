package deob;

@ObfuscatedName("ck")
public class class81 {

    @ObfuscatedName("ck.b")
    public static int[] field1310 = new int[500];

    @ObfuscatedName("ck.l")
    public static int[] field1303 = new int[500];

    @ObfuscatedName("ck.i")
    public static int[] field1307 = new int[500];

    @ObfuscatedName("ck.t")
    public static int[] field1305 = new int[500];

    @ObfuscatedName("ck.k")
    public class87 field1306 = null;

    @ObfuscatedName("ck.h")
    public int field1302 = -1;

    @ObfuscatedName("ck.n")
    public int[] field1308;

    @ObfuscatedName("ck.f")
    public int[] field1312;

    @ObfuscatedName("ck.a")
    public int[] field1304;

    @ObfuscatedName("ck.r")
    public int[] field1311;

    @ObfuscatedName("ck.x")
    public boolean field1309 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1306 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2085 = 2;
        int var5 = var3.method2678();
        int var6 = -1;
        int var7 = 0;
        var4.field2085 = var3.field2085 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2678();
            if (var9 > 0) {
                if (this.field1306.field1457[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1306.field1457[var10] == 0) {
                            field1310[var7] = var10;
                            field1303[var7] = 0;
                            field1307[var7] = 0;
                            field1305[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1310[var7] = var8;
                short var11 = 0;
                if (this.field1306.field1457[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1303[var7] = var11;
                } else {
                    field1303[var7] = var4.method2690();
                }
                if ((var9 & 0x2) == 0) {
                    field1307[var7] = var11;
                } else {
                    field1307[var7] = var4.method2690();
                }
                if ((var9 & 0x4) == 0) {
                    field1305[var7] = var11;
                } else {
                    field1305[var7] = var4.method2690();
                }
                var6 = var8;
                var7++;
                if (this.field1306.field1457[var8] == 5) {
                    this.field1309 = true;
                }
            }
        }
        if (var4.field2085 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1302 = var7;
        this.field1308 = new int[var7];
        this.field1312 = new int[var7];
        this.field1304 = new int[var7];
        this.field1311 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1308[var12] = field1310[var12];
            this.field1312[var12] = field1303[var12];
            this.field1304[var12] = field1307[var12];
            this.field1311[var12] = field1305[var12];
        }
    }
}
