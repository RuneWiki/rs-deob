package deob;

@ObfuscatedName("cr")
public class class88 {

    @ObfuscatedName("cr.v")
    public static int[] field1528 = new int[500];

    @ObfuscatedName("cr.f")
    public static int[] field1519 = new int[500];

    @ObfuscatedName("cr.i")
    public static int[] field1520 = new int[500];

    @ObfuscatedName("cr.d")
    public static int[] field1521 = new int[500];

    @ObfuscatedName("cr.o")
    public class102 field1525 = null;

    @ObfuscatedName("cr.c")
    public int field1523 = -1;

    @ObfuscatedName("cr.p")
    public int[] field1524;

    @ObfuscatedName("cr.j")
    public int[] field1522;

    @ObfuscatedName("cr.a")
    public int[] field1526;

    @ObfuscatedName("cr.y")
    public int[] field1527;

    @ObfuscatedName("cr.h")
    public boolean field1518 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1525 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1984 = 2;
        int var5 = var3.method2400();
        int var6 = -1;
        int var7 = 0;
        var4.field1984 = var3.field1984 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2400();
            if (var9 > 0) {
                if (this.field1525.field1747[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1525.field1747[var10] == 0) {
                            field1528[var7] = var10;
                            field1519[var7] = 0;
                            field1520[var7] = 0;
                            field1521[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1528[var7] = var8;
                short var11 = 0;
                if (this.field1525.field1747[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1519[var7] = var11;
                } else {
                    field1519[var7] = var4.method2361();
                }
                if ((var9 & 0x2) == 0) {
                    field1520[var7] = var11;
                } else {
                    field1520[var7] = var4.method2361();
                }
                if ((var9 & 0x4) == 0) {
                    field1521[var7] = var11;
                } else {
                    field1521[var7] = var4.method2361();
                }
                var6 = var8;
                var7++;
                if (this.field1525.field1747[var8] == 5) {
                    this.field1518 = true;
                }
            }
        }
        if (var4.field1984 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1523 = var7;
        this.field1524 = new int[var7];
        this.field1522 = new int[var7];
        this.field1526 = new int[var7];
        this.field1527 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1524[var12] = field1528[var12];
            this.field1522[var12] = field1519[var12];
            this.field1526[var12] = field1520[var12];
            this.field1527[var12] = field1521[var12];
        }
    }
}
