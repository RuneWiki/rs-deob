package deob;

@ObfuscatedName("aw")
public class class47 {

    @ObfuscatedName("aw.q")
    public static int[] field667 = new int[500];

    @ObfuscatedName("aw.l")
    public static int[] field660 = new int[500];

    @ObfuscatedName("aw.a")
    public static int[] field661 = new int[500];

    @ObfuscatedName("aw.o")
    public static int[] field662 = new int[500];

    @ObfuscatedName("aw.c")
    public class135 field659 = null;

    @ObfuscatedName("aw.h")
    public int field663 = -1;

    @ObfuscatedName("aw.r")
    public int[] field665;

    @ObfuscatedName("aw.d")
    public int[] field666;

    @ObfuscatedName("aw.k")
    public int[] field664;

    @ObfuscatedName("aw.u")
    public int[] field668;

    @ObfuscatedName("aw.v")
    public boolean field669 = false;

    public class47(byte[] arg0, class135 arg1) {
        this.field659 = arg1;
        class136 var3 = new class136(arg0);
        class136 var4 = new class136(arg0);
        var3.field1722 = 2;
        int var5 = var3.method1602();
        int var6 = -1;
        int var7 = 0;
        var4.field1722 = var3.field1722 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method1602();
            if (var9 > 0) {
                if (this.field659.field1718[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field659.field1718[var10] == 0) {
                            field667[var7] = var10;
                            field660[var7] = 0;
                            field661[var7] = 0;
                            field662[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field667[var7] = var8;
                short var11 = 0;
                if (this.field659.field1718[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field660[var7] = var11;
                } else {
                    field660[var7] = var4.method1614();
                }
                if ((var9 & 0x2) == 0) {
                    field661[var7] = var11;
                } else {
                    field661[var7] = var4.method1614();
                }
                if ((var9 & 0x4) == 0) {
                    field662[var7] = var11;
                } else {
                    field662[var7] = var4.method1614();
                }
                var6 = var8;
                var7++;
                if (this.field659.field1718[var8] == 5) {
                    this.field669 = true;
                }
            }
        }
        if (var4.field1722 != arg0.length) {
            throw new RuntimeException();
        }
        this.field663 = var7;
        this.field665 = new int[var7];
        this.field666 = new int[var7];
        this.field664 = new int[var7];
        this.field668 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field665[var12] = field667[var12];
            this.field666[var12] = field660[var12];
            this.field664[var12] = field661[var12];
            this.field668[var12] = field662[var12];
        }
    }
}
