package deob;

@ObfuscatedName("ce")
public class class96 {

    @ObfuscatedName("ce.z")
    public static int[] field1616 = new int[500];

    @ObfuscatedName("ce.h")
    public static int[] field1613 = new int[500];

    @ObfuscatedName("ce.c")
    public static int[] field1619 = new int[500];

    @ObfuscatedName("ce.p")
    public static int[] field1615 = new int[500];

    @ObfuscatedName("ce.i")
    public class104 field1614 = null;

    @ObfuscatedName("ce.v")
    public int field1617 = -1;

    @ObfuscatedName("ce.l")
    public int[] field1618;

    @ObfuscatedName("ce.m")
    public int[] field1621;

    @ObfuscatedName("ce.g")
    public int[] field1620;

    @ObfuscatedName("ce.t")
    public int[] field1612;

    @ObfuscatedName("ce.o")
    public boolean field1622 = false;

    public class96(byte[] arg0, class104 arg1) {
        this.field1614 = arg1;
        class126 var3 = new class126(arg0);
        class126 var4 = new class126(arg0);
        var3.field2003 = 2;
        int var5 = var3.method2450();
        int var6 = -1;
        int var7 = 0;
        var4.field2003 = var3.field2003 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2450();
            if (var9 > 0) {
                if (this.field1614.field1771[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1614.field1771[var10] == 0) {
                            field1616[var7] = var10;
                            field1613[var7] = 0;
                            field1619[var7] = 0;
                            field1615[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1616[var7] = var8;
                short var11 = 0;
                if (this.field1614.field1771[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1613[var7] = var11;
                } else {
                    field1613[var7] = var4.method2530();
                }
                if ((var9 & 0x2) == 0) {
                    field1619[var7] = var11;
                } else {
                    field1619[var7] = var4.method2530();
                }
                if ((var9 & 0x4) == 0) {
                    field1615[var7] = var11;
                } else {
                    field1615[var7] = var4.method2530();
                }
                var6 = var8;
                var7++;
                if (this.field1614.field1771[var8] == 5) {
                    this.field1622 = true;
                }
            }
        }
        if (var4.field2003 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1617 = var7;
        this.field1618 = new int[var7];
        this.field1621 = new int[var7];
        this.field1620 = new int[var7];
        this.field1612 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1618[var12] = field1616[var12];
            this.field1621[var12] = field1613[var12];
            this.field1620[var12] = field1619[var12];
            this.field1612[var12] = field1615[var12];
        }
    }
}
