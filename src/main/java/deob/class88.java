package deob;

@ObfuscatedName("cp")
public class class88 {

    @ObfuscatedName("cp.j")
    public static int[] field1545 = new int[500];

    @ObfuscatedName("cp.l")
    public static int[] field1538 = new int[500];

    @ObfuscatedName("cp.a")
    public static int[] field1539 = new int[500];

    @ObfuscatedName("cp.i")
    public static int[] field1537 = new int[500];

    @ObfuscatedName("cp.f")
    public class102 field1541 = null;

    @ObfuscatedName("cp.m")
    public int field1542 = -1;

    @ObfuscatedName("cp.o")
    public int[] field1540;

    @ObfuscatedName("cp.h")
    public int[] field1544;

    @ObfuscatedName("cp.n")
    public int[] field1543;

    @ObfuscatedName("cp.k")
    public int[] field1546;

    @ObfuscatedName("cp.r")
    public boolean field1547 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1541 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1999 = 2;
        int var5 = var3.method2316();
        int var6 = -1;
        int var7 = 0;
        var4.field1999 = var3.field1999 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2316();
            if (var9 > 0) {
                if (this.field1541.field1772[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1541.field1772[var10] == 0) {
                            field1545[var7] = var10;
                            field1538[var7] = 0;
                            field1539[var7] = 0;
                            field1537[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1545[var7] = var8;
                short var11 = 0;
                if (this.field1541.field1772[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1538[var7] = var11;
                } else {
                    field1538[var7] = var4.method2328();
                }
                if ((var9 & 0x2) == 0) {
                    field1539[var7] = var11;
                } else {
                    field1539[var7] = var4.method2328();
                }
                if ((var9 & 0x4) == 0) {
                    field1537[var7] = var11;
                } else {
                    field1537[var7] = var4.method2328();
                }
                var6 = var8;
                var7++;
                if (this.field1541.field1772[var8] == 5) {
                    this.field1547 = true;
                }
            }
        }
        if (var4.field1999 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1542 = var7;
        this.field1540 = new int[var7];
        this.field1544 = new int[var7];
        this.field1543 = new int[var7];
        this.field1546 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1540[var12] = field1545[var12];
            this.field1544[var12] = field1538[var12];
            this.field1543[var12] = field1539[var12];
            this.field1546[var12] = field1537[var12];
        }
    }
}
