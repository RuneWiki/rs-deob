package deob;

@ObfuscatedName("cb")
public class class83 {

    @ObfuscatedName("cb.t")
    public static int[] field1454 = new int[500];

    @ObfuscatedName("cb.b")
    public static int[] field1448 = new int[500];

    @ObfuscatedName("cb.p")
    public static int[] field1449 = new int[500];

    @ObfuscatedName("cb.e")
    public static int[] field1450 = new int[500];

    @ObfuscatedName("cb.i")
    public class97 field1451 = null;

    @ObfuscatedName("cb.o")
    public int field1452 = -1;

    @ObfuscatedName("cb.f")
    public int[] field1457;

    @ObfuscatedName("cb.d")
    public int[] field1456;

    @ObfuscatedName("cb.j")
    public int[] field1455;

    @ObfuscatedName("cb.x")
    public int[] field1447;

    @ObfuscatedName("cb.v")
    public boolean field1453 = false;

    public class83(byte[] arg0, class97 arg1) {
        this.field1451 = arg1;
        class111 var3 = new class111(arg0);
        class111 var4 = new class111(arg0);
        var3.field1867 = 2;
        int var5 = var3.method2172();
        int var6 = -1;
        int var7 = 0;
        var4.field1867 = var3.field1867 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2172();
            if (var9 > 0) {
                if (this.field1451.field1680[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1451.field1680[var10] == 0) {
                            field1454[var7] = var10;
                            field1448[var7] = 0;
                            field1449[var7] = 0;
                            field1450[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1454[var7] = var8;
                short var11 = 0;
                if (this.field1451.field1680[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1448[var7] = var11;
                } else {
                    field1448[var7] = var4.method2184();
                }
                if ((var9 & 0x2) == 0) {
                    field1449[var7] = var11;
                } else {
                    field1449[var7] = var4.method2184();
                }
                if ((var9 & 0x4) == 0) {
                    field1450[var7] = var11;
                } else {
                    field1450[var7] = var4.method2184();
                }
                var6 = var8;
                var7++;
                if (this.field1451.field1680[var8] == 5) {
                    this.field1453 = true;
                }
            }
        }
        if (var4.field1867 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1452 = var7;
        this.field1457 = new int[var7];
        this.field1456 = new int[var7];
        this.field1455 = new int[var7];
        this.field1447 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1457[var12] = field1454[var12];
            this.field1456[var12] = field1448[var12];
            this.field1455[var12] = field1449[var12];
            this.field1447[var12] = field1450[var12];
        }
    }
}
