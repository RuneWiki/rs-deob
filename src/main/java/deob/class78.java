package deob;

@ObfuscatedName("bs")
public class class78 {

    @ObfuscatedName("bs.z")
    public static int[] field1394 = new int[500];

    @ObfuscatedName("bs.n")
    public static int[] field1391 = new int[500];

    @ObfuscatedName("bs.u")
    public static int[] field1392 = new int[500];

    @ObfuscatedName("bs.t")
    public static int[] field1396 = new int[500];

    @ObfuscatedName("bs.e")
    public class92 field1397 = null;

    @ObfuscatedName("bs.a")
    public int field1395 = -1;

    @ObfuscatedName("bs.l")
    public int[] field1390;

    @ObfuscatedName("bs.v")
    public int[] field1393;

    @ObfuscatedName("bs.j")
    public int[] field1398;

    @ObfuscatedName("bs.k")
    public int[] field1399;

    @ObfuscatedName("bs.g")
    public boolean field1400 = false;

    public class78(byte[] arg0, class92 arg1) {
        this.field1397 = arg1;
        class104 var3 = new class104(arg0);
        class104 var4 = new class104(arg0);
        var3.field1815 = 2;
        int var5 = var3.method2257();
        int var6 = -1;
        int var7 = 0;
        var4.field1815 = var3.field1815 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2257();
            if (var9 > 0) {
                if (this.field1397.field1631[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1397.field1631[var10] == 0) {
                            field1394[var7] = var10;
                            field1391[var7] = 0;
                            field1392[var7] = 0;
                            field1396[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1394[var7] = var8;
                short var11 = 0;
                if (this.field1397.field1631[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1391[var7] = var11;
                } else {
                    field1391[var7] = var4.method2139();
                }
                if ((var9 & 0x2) == 0) {
                    field1392[var7] = var11;
                } else {
                    field1392[var7] = var4.method2139();
                }
                if ((var9 & 0x4) == 0) {
                    field1396[var7] = var11;
                } else {
                    field1396[var7] = var4.method2139();
                }
                var6 = var8;
                var7++;
                if (this.field1397.field1631[var8] == 5) {
                    this.field1400 = true;
                }
            }
        }
        if (var4.field1815 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1395 = var7;
        this.field1390 = new int[var7];
        this.field1393 = new int[var7];
        this.field1398 = new int[var7];
        this.field1399 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1390[var12] = field1394[var12];
            this.field1393[var12] = field1391[var12];
            this.field1398[var12] = field1392[var12];
            this.field1399[var12] = field1396[var12];
        }
    }
}
