package deob;

@ObfuscatedName("cv")
public class class92 {

    @ObfuscatedName("cv.m")
    public static int[] field1617 = new int[500];

    @ObfuscatedName("cv.w")
    public static int[] field1614 = new int[500];

    @ObfuscatedName("cv.e")
    public static int[] field1615 = new int[500];

    @ObfuscatedName("cv.o")
    public static int[] field1622 = new int[500];

    @ObfuscatedName("cv.g")
    public class106 field1613 = null;

    @ObfuscatedName("cv.l")
    public int field1618 = -1;

    @ObfuscatedName("cv.j")
    public int[] field1619;

    @ObfuscatedName("cv.r")
    public int[] field1620;

    @ObfuscatedName("cv.x")
    public int[] field1621;

    @ObfuscatedName("cv.k")
    public int[] field1623;

    @ObfuscatedName("cv.v")
    public boolean field1616 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1613 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2046 = 2;
        int var5 = var3.method2398();
        int var6 = -1;
        int var7 = 0;
        var4.field2046 = var3.field2046 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2398();
            if (var9 > 0) {
                if (this.field1613.field1832[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1613.field1832[var10] == 0) {
                            field1617[var7] = var10;
                            field1614[var7] = 0;
                            field1615[var7] = 0;
                            field1622[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1617[var7] = var8;
                short var11 = 0;
                if (this.field1613.field1832[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1614[var7] = var11;
                } else {
                    field1614[var7] = var4.method2426();
                }
                if ((var9 & 0x2) == 0) {
                    field1615[var7] = var11;
                } else {
                    field1615[var7] = var4.method2426();
                }
                if ((var9 & 0x4) == 0) {
                    field1622[var7] = var11;
                } else {
                    field1622[var7] = var4.method2426();
                }
                var6 = var8;
                var7++;
                if (this.field1613.field1832[var8] == 5) {
                    this.field1616 = true;
                }
            }
        }
        if (var4.field2046 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1618 = var7;
        this.field1619 = new int[var7];
        this.field1620 = new int[var7];
        this.field1621 = new int[var7];
        this.field1623 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1619[var12] = field1617[var12];
            this.field1620[var12] = field1614[var12];
            this.field1621[var12] = field1615[var12];
            this.field1623[var12] = field1622[var12];
        }
    }
}
