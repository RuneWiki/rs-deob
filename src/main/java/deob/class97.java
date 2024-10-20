package deob;

@ObfuscatedName("ce")
public class class97 {

    @ObfuscatedName("ce.l")
    public static int[] field1618 = new int[500];

    @ObfuscatedName("ce.b")
    public static int[] field1613 = new int[500];

    @ObfuscatedName("ce.o")
    public static int[] field1614 = new int[500];

    @ObfuscatedName("ce.w")
    public static int[] field1616 = new int[500];

    @ObfuscatedName("ce.r")
    public class105 field1623 = null;

    @ObfuscatedName("ce.k")
    public int field1617 = -1;

    @ObfuscatedName("ce.z")
    public int[] field1619;

    @ObfuscatedName("ce.g")
    public int[] field1615;

    @ObfuscatedName("ce.n")
    public int[] field1621;

    @ObfuscatedName("ce.j")
    public int[] field1622;

    @ObfuscatedName("ce.c")
    public boolean field1620 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1623 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2022 = 2;
        int var5 = var3.method2440();
        int var6 = -1;
        int var7 = 0;
        var4.field2022 = var3.field2022 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2440();
            if (var9 > 0) {
                if (this.field1623.field1761[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1623.field1761[var10] == 0) {
                            field1618[var7] = var10;
                            field1613[var7] = 0;
                            field1614[var7] = 0;
                            field1616[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1618[var7] = var8;
                short var11 = 0;
                if (this.field1623.field1761[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1613[var7] = var11;
                } else {
                    field1613[var7] = var4.method2449();
                }
                if ((var9 & 0x2) == 0) {
                    field1614[var7] = var11;
                } else {
                    field1614[var7] = var4.method2449();
                }
                if ((var9 & 0x4) == 0) {
                    field1616[var7] = var11;
                } else {
                    field1616[var7] = var4.method2449();
                }
                var6 = var8;
                var7++;
                if (this.field1623.field1761[var8] == 5) {
                    this.field1620 = true;
                }
            }
        }
        if (var4.field2022 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1617 = var7;
        this.field1619 = new int[var7];
        this.field1615 = new int[var7];
        this.field1621 = new int[var7];
        this.field1622 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1619[var12] = field1618[var12];
            this.field1615[var12] = field1613[var12];
            this.field1621[var12] = field1614[var12];
            this.field1622[var12] = field1616[var12];
        }
    }
}
