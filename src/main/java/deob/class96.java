package deob;

@ObfuscatedName("ca")
public class class96 {

    @ObfuscatedName("ca.j")
    public static int[] field1614 = new int[500];

    @ObfuscatedName("ca.y")
    public static int[] field1617 = new int[500];

    @ObfuscatedName("ca.x")
    public static int[] field1615 = new int[500];

    @ObfuscatedName("ca.z")
    public static int[] field1616 = new int[500];

    @ObfuscatedName("ca.c")
    public class104 field1619 = null;

    @ObfuscatedName("ca.e")
    public int field1618 = -1;

    @ObfuscatedName("ca.s")
    public int[] field1613;

    @ObfuscatedName("ca.i")
    public int[] field1620;

    @ObfuscatedName("ca.g")
    public int[] field1621;

    @ObfuscatedName("ca.q")
    public int[] field1622;

    @ObfuscatedName("ca.w")
    public boolean field1623 = false;

    public class96(byte[] arg0, class104 arg1) {
        this.field1619 = arg1;
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        var3.field2020 = 2;
        int var5 = var3.method2399();
        int var6 = -1;
        int var7 = 0;
        var4.field2020 = var3.field2020 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2399();
            if (var9 > 0) {
                if (this.field1619.field1768[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1619.field1768[var10] == 0) {
                            field1614[var7] = var10;
                            field1617[var7] = 0;
                            field1615[var7] = 0;
                            field1616[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1614[var7] = var8;
                short var11 = 0;
                if (this.field1619.field1768[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1617[var7] = var11;
                } else {
                    field1617[var7] = var4.method2394();
                }
                if ((var9 & 0x2) == 0) {
                    field1615[var7] = var11;
                } else {
                    field1615[var7] = var4.method2394();
                }
                if ((var9 & 0x4) == 0) {
                    field1616[var7] = var11;
                } else {
                    field1616[var7] = var4.method2394();
                }
                var6 = var8;
                var7++;
                if (this.field1619.field1768[var8] == 5) {
                    this.field1623 = true;
                }
            }
        }
        if (var4.field2020 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1618 = var7;
        this.field1613 = new int[var7];
        this.field1620 = new int[var7];
        this.field1621 = new int[var7];
        this.field1622 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1613[var12] = field1614[var12];
            this.field1620[var12] = field1617[var12];
            this.field1621[var12] = field1615[var12];
            this.field1622[var12] = field1616[var12];
        }
    }
}
