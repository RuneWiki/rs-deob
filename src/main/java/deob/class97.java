package deob;

@ObfuscatedName("ci")
public class class97 {

    @ObfuscatedName("ci.b")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("ci.e")
    public static int[] field1614 = new int[500];

    @ObfuscatedName("ci.g")
    public static int[] field1616 = new int[500];

    @ObfuscatedName("ci.o")
    public static int[] field1617 = new int[500];

    @ObfuscatedName("ci.a")
    public class105 field1618 = null;

    @ObfuscatedName("ci.h")
    public int field1621 = -1;

    @ObfuscatedName("ci.j")
    public int[] field1620;

    @ObfuscatedName("ci.f")
    public int[] field1624;

    @ObfuscatedName("ci.q")
    public int[] field1622;

    @ObfuscatedName("ci.l")
    public int[] field1623;

    @ObfuscatedName("ci.d")
    public boolean field1615 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1618 = arg1;
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        var3.field2027 = 2;
        int var5 = var3.method2436();
        int var6 = -1;
        int var7 = 0;
        var4.field2027 = var3.field2027 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2436();
            if (var9 > 0) {
                if (this.field1618.field1778[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1618.field1778[var10] == 0) {
                            field1619[var7] = var10;
                            field1614[var7] = 0;
                            field1616[var7] = 0;
                            field1617[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1619[var7] = var8;
                short var11 = 0;
                if (this.field1618.field1778[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1614[var7] = var11;
                } else {
                    field1614[var7] = var4.method2448();
                }
                if ((var9 & 0x2) == 0) {
                    field1616[var7] = var11;
                } else {
                    field1616[var7] = var4.method2448();
                }
                if ((var9 & 0x4) == 0) {
                    field1617[var7] = var11;
                } else {
                    field1617[var7] = var4.method2448();
                }
                var6 = var8;
                var7++;
                if (this.field1618.field1778[var8] == 5) {
                    this.field1615 = true;
                }
            }
        }
        if (var4.field2027 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1621 = var7;
        this.field1620 = new int[var7];
        this.field1624 = new int[var7];
        this.field1622 = new int[var7];
        this.field1623 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1620[var12] = field1619[var12];
            this.field1624[var12] = field1614[var12];
            this.field1622[var12] = field1616[var12];
            this.field1623[var12] = field1617[var12];
        }
    }
}
