package deob;

@ObfuscatedName("ca")
public class class97 {

    @ObfuscatedName("ca.a")
    public static int[] field1630 = new int[500];

    @ObfuscatedName("ca.x")
    public static int[] field1629 = new int[500];

    @ObfuscatedName("ca.e")
    public static int[] field1636 = new int[500];

    @ObfuscatedName("ca.r")
    public static int[] field1631 = new int[500];

    @ObfuscatedName("ca.p")
    public class105 field1632 = null;

    @ObfuscatedName("ca.n")
    public int field1633 = -1;

    @ObfuscatedName("ca.o")
    public int[] field1634;

    @ObfuscatedName("ca.l")
    public int[] field1628;

    @ObfuscatedName("ca.t")
    public int[] field1635;

    @ObfuscatedName("ca.q")
    public int[] field1637;

    @ObfuscatedName("ca.c")
    public boolean field1638 = false;

    public class97(byte[] arg0, class105 arg1) {
        this.field1632 = arg1;
        class127 var3 = new class127(arg0);
        class127 var4 = new class127(arg0);
        var3.field2035 = 2;
        int var5 = var3.method2411();
        int var6 = -1;
        int var7 = 0;
        var4.field2035 = var3.field2035 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2411();
            if (var9 > 0) {
                if (this.field1632.field1789[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1632.field1789[var10] == 0) {
                            field1630[var7] = var10;
                            field1629[var7] = 0;
                            field1636[var7] = 0;
                            field1631[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1630[var7] = var8;
                short var11 = 0;
                if (this.field1632.field1789[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1629[var7] = var11;
                } else {
                    field1629[var7] = var4.method2423();
                }
                if ((var9 & 0x2) == 0) {
                    field1636[var7] = var11;
                } else {
                    field1636[var7] = var4.method2423();
                }
                if ((var9 & 0x4) == 0) {
                    field1631[var7] = var11;
                } else {
                    field1631[var7] = var4.method2423();
                }
                var6 = var8;
                var7++;
                if (this.field1632.field1789[var8] == 5) {
                    this.field1638 = true;
                }
            }
        }
        if (var4.field2035 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1633 = var7;
        this.field1634 = new int[var7];
        this.field1628 = new int[var7];
        this.field1635 = new int[var7];
        this.field1637 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1634[var12] = field1630[var12];
            this.field1628[var12] = field1629[var12];
            this.field1635[var12] = field1636[var12];
            this.field1637[var12] = field1631[var12];
        }
    }
}
