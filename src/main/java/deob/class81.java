package deob;

@ObfuscatedName("cb")
public class class81 {

    @ObfuscatedName("cb.x")
    public static int[] field1331 = new int[500];

    @ObfuscatedName("cb.j")
    public static int[] field1329 = new int[500];

    @ObfuscatedName("cb.c")
    public static int[] field1328 = new int[500];

    @ObfuscatedName("cb.d")
    public static int[] field1330 = new int[500];

    @ObfuscatedName("cb.w")
    public class87 field1332 = null;

    @ObfuscatedName("cb.h")
    public int field1333 = -1;

    @ObfuscatedName("cb.u")
    public int[] field1334;

    @ObfuscatedName("cb.k")
    public int[] field1335;

    @ObfuscatedName("cb.g")
    public int[] field1336;

    @ObfuscatedName("cb.y")
    public int[] field1337;

    @ObfuscatedName("cb.e")
    public boolean field1338 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1332 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2086 = 2;
        int var5 = var3.method2701();
        int var6 = -1;
        int var7 = 0;
        var4.field2086 = var3.field2086 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2701();
            if (var9 > 0) {
                if (this.field1332.field1479[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1332.field1479[var10] == 0) {
                            field1331[var7] = var10;
                            field1329[var7] = 0;
                            field1328[var7] = 0;
                            field1330[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1331[var7] = var8;
                short var11 = 0;
                if (this.field1332.field1479[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1329[var7] = var11;
                } else {
                    field1329[var7] = var4.method2700();
                }
                if ((var9 & 0x2) == 0) {
                    field1328[var7] = var11;
                } else {
                    field1328[var7] = var4.method2700();
                }
                if ((var9 & 0x4) == 0) {
                    field1330[var7] = var11;
                } else {
                    field1330[var7] = var4.method2700();
                }
                var6 = var8;
                var7++;
                if (this.field1332.field1479[var8] == 5) {
                    this.field1338 = true;
                }
            }
        }
        if (var4.field2086 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1333 = var7;
        this.field1334 = new int[var7];
        this.field1335 = new int[var7];
        this.field1336 = new int[var7];
        this.field1337 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1334[var12] = field1331[var12];
            this.field1335[var12] = field1329[var12];
            this.field1336[var12] = field1328[var12];
            this.field1337[var12] = field1330[var12];
        }
    }
}
