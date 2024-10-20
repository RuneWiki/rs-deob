package deob;

@ObfuscatedName("cc")
public class class92 {

    @ObfuscatedName("cc.s")
    public static int[] field1589 = new int[500];

    @ObfuscatedName("cc.z")
    public static int[] field1581 = new int[500];

    @ObfuscatedName("cc.t")
    public static int[] field1580 = new int[500];

    @ObfuscatedName("cc.y")
    public static int[] field1583 = new int[500];

    @ObfuscatedName("cc.p")
    public class106 field1582 = null;

    @ObfuscatedName("cc.g")
    public int field1585 = -1;

    @ObfuscatedName("cc.m")
    public int[] field1584;

    @ObfuscatedName("cc.f")
    public int[] field1587;

    @ObfuscatedName("cc.k")
    public int[] field1588;

    @ObfuscatedName("cc.h")
    public int[] field1586;

    @ObfuscatedName("cc.r")
    public boolean field1590 = false;

    public class92(byte[] arg0, class106 arg1) {
        this.field1582 = arg1;
        class123 var3 = new class123(arg0);
        class123 var4 = new class123(arg0);
        var3.field2028 = 2;
        int var5 = var3.method2363();
        int var6 = -1;
        int var7 = 0;
        var4.field2028 = var3.field2028 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2363();
            if (var9 > 0) {
                if (this.field1582.field1805[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1582.field1805[var10] == 0) {
                            field1589[var7] = var10;
                            field1581[var7] = 0;
                            field1580[var7] = 0;
                            field1583[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1589[var7] = var8;
                short var11 = 0;
                if (this.field1582.field1805[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1581[var7] = var11;
                } else {
                    field1581[var7] = var4.method2552();
                }
                if ((var9 & 0x2) == 0) {
                    field1580[var7] = var11;
                } else {
                    field1580[var7] = var4.method2552();
                }
                if ((var9 & 0x4) == 0) {
                    field1583[var7] = var11;
                } else {
                    field1583[var7] = var4.method2552();
                }
                var6 = var8;
                var7++;
                if (this.field1582.field1805[var8] == 5) {
                    this.field1590 = true;
                }
            }
        }
        if (var4.field2028 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1585 = var7;
        this.field1584 = new int[var7];
        this.field1587 = new int[var7];
        this.field1588 = new int[var7];
        this.field1586 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1584[var12] = field1589[var12];
            this.field1587[var12] = field1581[var12];
            this.field1588[var12] = field1580[var12];
            this.field1586[var12] = field1583[var12];
        }
    }
}
