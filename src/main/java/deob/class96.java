package deob;

@ObfuscatedName("cq")
public class class96 {

    @ObfuscatedName("cq.v")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("cq.f")
    public static int[] field1613 = new int[500];

    @ObfuscatedName("cq.n")
    public static int[] field1615 = new int[500];

    @ObfuscatedName("cq.c")
    public static int[] field1614 = new int[500];

    @ObfuscatedName("cq.r")
    public class104 field1617 = null;

    @ObfuscatedName("cq.k")
    public int field1618 = -1;

    @ObfuscatedName("cq.e")
    public int[] field1623;

    @ObfuscatedName("cq.q")
    public int[] field1620;

    @ObfuscatedName("cq.u")
    public int[] field1621;

    @ObfuscatedName("cq.s")
    public int[] field1622;

    @ObfuscatedName("cq.l")
    public boolean field1616 = false;

    public class96(byte[] arg0, class104 arg1) {
        this.field1617 = arg1;
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        var3.field2027 = 2;
        int var5 = var3.method2466();
        int var6 = -1;
        int var7 = 0;
        var4.field2027 = var3.field2027 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2466();
            if (var9 > 0) {
                if (this.field1617.field1772[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1617.field1772[var10] == 0) {
                            field1619[var7] = var10;
                            field1613[var7] = 0;
                            field1615[var7] = 0;
                            field1614[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1619[var7] = var8;
                short var11 = 0;
                if (this.field1617.field1772[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1613[var7] = var11;
                } else {
                    field1613[var7] = var4.method2610();
                }
                if ((var9 & 0x2) == 0) {
                    field1615[var7] = var11;
                } else {
                    field1615[var7] = var4.method2610();
                }
                if ((var9 & 0x4) == 0) {
                    field1614[var7] = var11;
                } else {
                    field1614[var7] = var4.method2610();
                }
                var6 = var8;
                var7++;
                if (this.field1617.field1772[var8] == 5) {
                    this.field1616 = true;
                }
            }
        }
        if (var4.field2027 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1618 = var7;
        this.field1623 = new int[var7];
        this.field1620 = new int[var7];
        this.field1621 = new int[var7];
        this.field1622 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1623[var12] = field1619[var12];
            this.field1620[var12] = field1613[var12];
            this.field1621[var12] = field1615[var12];
            this.field1622[var12] = field1614[var12];
        }
    }
}
