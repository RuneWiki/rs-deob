package deob;

@ObfuscatedName("ck")
public class class81 {

    @ObfuscatedName("ck.x")
    public static int[] field1333 = new int[500];

    @ObfuscatedName("ck.n")
    public static int[] field1329 = new int[500];

    @ObfuscatedName("ck.g")
    public static int[] field1337 = new int[500];

    @ObfuscatedName("ck.v")
    public static int[] field1331 = new int[500];

    @ObfuscatedName("ck.y")
    public class87 field1328 = null;

    @ObfuscatedName("ck.p")
    public int field1332 = -1;

    @ObfuscatedName("ck.j")
    public int[] field1330;

    @ObfuscatedName("ck.m")
    public int[] field1335;

    @ObfuscatedName("ck.a")
    public int[] field1336;

    @ObfuscatedName("ck.i")
    public int[] field1334;

    @ObfuscatedName("ck.s")
    public boolean field1338 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1328 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2087 = 2;
        int var5 = var3.method2878();
        int var6 = -1;
        int var7 = 0;
        var4.field2087 = var3.field2087 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2878();
            if (var9 > 0) {
                if (this.field1328.field1472[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1328.field1472[var10] == 0) {
                            field1333[var7] = var10;
                            field1329[var7] = 0;
                            field1337[var7] = 0;
                            field1331[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1333[var7] = var8;
                short var11 = 0;
                if (this.field1328.field1472[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1329[var7] = var11;
                } else {
                    field1329[var7] = var4.method2843();
                }
                if ((var9 & 0x2) == 0) {
                    field1337[var7] = var11;
                } else {
                    field1337[var7] = var4.method2843();
                }
                if ((var9 & 0x4) == 0) {
                    field1331[var7] = var11;
                } else {
                    field1331[var7] = var4.method2843();
                }
                var6 = var8;
                var7++;
                if (this.field1328.field1472[var8] == 5) {
                    this.field1338 = true;
                }
            }
        }
        if (var4.field2087 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1332 = var7;
        this.field1330 = new int[var7];
        this.field1335 = new int[var7];
        this.field1336 = new int[var7];
        this.field1334 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1330[var12] = field1333[var12];
            this.field1335[var12] = field1329[var12];
            this.field1336[var12] = field1337[var12];
            this.field1334[var12] = field1331[var12];
        }
    }
}
