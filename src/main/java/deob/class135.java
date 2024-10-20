package deob;

@ObfuscatedName("es")
public class class135 {

    @ObfuscatedName("es.z")
    public static int[] field1660 = new int[500];

    @ObfuscatedName("es.k")
    public static int[] field1659 = new int[500];

    @ObfuscatedName("es.s")
    public static int[] field1668 = new int[500];

    @ObfuscatedName("es.t")
    public static int[] field1661 = new int[500];

    @ObfuscatedName("es.i")
    public class142 field1662 = null;

    @ObfuscatedName("es.o")
    public int field1663 = -1;

    @ObfuscatedName("es.x")
    public int[] field1658;

    @ObfuscatedName("es.w")
    public int[] field1665;

    @ObfuscatedName("es.g")
    public int[] field1666;

    @ObfuscatedName("es.m")
    public int[] field1667;

    @ObfuscatedName("es.n")
    public boolean field1664 = false;

    public class135(byte[] arg0, class142 arg1) {
        this.field1662 = arg1;
        class310 var3 = new class310(arg0);
        class310 var4 = new class310(arg0);
        var3.field3734 = 2;
        int var5 = var3.method5193();
        int var6 = -1;
        int var7 = 0;
        var4.field3734 = var3.field3734 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5193();
            if (var9 > 0) {
                if (this.field1662.field1826[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1662.field1826[var10] == 0) {
                            field1660[var7] = var10;
                            field1659[var7] = 0;
                            field1668[var7] = 0;
                            field1661[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1660[var7] = var8;
                short var11 = 0;
                if (this.field1662.field1826[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1659[var7] = var11;
                } else {
                    field1659[var7] = var4.method5291();
                }
                if ((var9 & 0x2) == 0) {
                    field1668[var7] = var11;
                } else {
                    field1668[var7] = var4.method5291();
                }
                if ((var9 & 0x4) == 0) {
                    field1661[var7] = var11;
                } else {
                    field1661[var7] = var4.method5291();
                }
                var6 = var8;
                var7++;
                if (this.field1662.field1826[var8] == 5) {
                    this.field1664 = true;
                }
            }
        }
        if (var4.field3734 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1663 = var7;
        this.field1658 = new int[var7];
        this.field1665 = new int[var7];
        this.field1666 = new int[var7];
        this.field1667 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1658[var12] = field1660[var12];
            this.field1665[var12] = field1659[var12];
            this.field1666[var12] = field1668[var12];
            this.field1667[var12] = field1661[var12];
        }
    }
}
