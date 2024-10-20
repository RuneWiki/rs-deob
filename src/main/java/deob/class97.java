package deob;

@ObfuscatedName("cb")
public class class97 {

    @ObfuscatedName("cb.g")
    public static int[] field1613 = new int[500];

    @ObfuscatedName("cb.h")
    public static int[] field1611 = new int[500];

    @ObfuscatedName("cb.s")
    public static int[] field1620 = new int[500];

    @ObfuscatedName("cb.o")
    public static int[] field1614 = new int[500];

    @ObfuscatedName("cb.p")
    public class105 field1615 = null;

    @ObfuscatedName("cb.x")
    public int field1616 = -1;

    @ObfuscatedName("cb.k")
    public int[] field1617;

    @ObfuscatedName("cb.r")
    public int[] field1618;

    @ObfuscatedName("cb.z")
    public int[] field1612;

    @ObfuscatedName("cb.n")
    public int[] field1619;

    @ObfuscatedName("cb.j")
    public boolean field1621 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1615 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2027 = 2;
        int var5 = var3.method2499();
        int var6 = -1;
        int var7 = 0;
        var4.field2027 = var3.field2027 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2499();
            if (var9 > 0) {
                if (this.field1615.field1768[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1615.field1768[var10] == 0) {
                            field1613[var7] = var10;
                            field1611[var7] = 0;
                            field1620[var7] = 0;
                            field1614[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1613[var7] = var8;
                short var11 = 0;
                if (this.field1615.field1768[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1611[var7] = var11;
                } else {
                    field1611[var7] = var4.method2609();
                }
                if ((var9 & 0x2) == 0) {
                    field1620[var7] = var11;
                } else {
                    field1620[var7] = var4.method2609();
                }
                if ((var9 & 0x4) == 0) {
                    field1614[var7] = var11;
                } else {
                    field1614[var7] = var4.method2609();
                }
                var6 = var8;
                var7++;
                if (this.field1615.field1768[var8] == 5) {
                    this.field1621 = true;
                }
            }
        }
        if (var4.field2027 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1616 = var7;
        this.field1617 = new int[var7];
        this.field1618 = new int[var7];
        this.field1612 = new int[var7];
        this.field1619 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1617[var12] = field1613[var12];
            this.field1618[var12] = field1611[var12];
            this.field1612[var12] = field1620[var12];
            this.field1619[var12] = field1614[var12];
        }
    }
}
