package deob;

@ObfuscatedName("cf")
public class class89 {

    @ObfuscatedName("cf.w")
    public static int[] field1553 = new int[500];

    @ObfuscatedName("cf.x")
    public static int[] field1544 = new int[500];

    @ObfuscatedName("cf.t")
    public static int[] field1546 = new int[500];

    @ObfuscatedName("cf.p")
    public static int[] field1547 = new int[500];

    @ObfuscatedName("cf.e")
    public class103 field1548 = null;

    @ObfuscatedName("cf.y")
    public int field1549 = -1;

    @ObfuscatedName("cf.m")
    public int[] field1552;

    @ObfuscatedName("cf.c")
    public int[] field1551;

    @ObfuscatedName("cf.v")
    public int[] field1550;

    @ObfuscatedName("cf.l")
    public int[] field1545;

    @ObfuscatedName("cf.z")
    public boolean field1554 = false;

    public class89(byte[] arg0, class103 arg1) {
        this.field1548 = arg1;
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        var3.field2012 = 2;
        int var5 = var3.method2363();
        int var6 = -1;
        int var7 = 0;
        var4.field2012 = var3.field2012 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2363();
            if (var9 > 0) {
                if (this.field1548.field1780[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1548.field1780[var10] == 0) {
                            field1553[var7] = var10;
                            field1544[var7] = 0;
                            field1546[var7] = 0;
                            field1547[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1553[var7] = var8;
                short var11 = 0;
                if (this.field1548.field1780[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1544[var7] = var11;
                } else {
                    field1544[var7] = var4.method2375();
                }
                if ((var9 & 0x2) == 0) {
                    field1546[var7] = var11;
                } else {
                    field1546[var7] = var4.method2375();
                }
                if ((var9 & 0x4) == 0) {
                    field1547[var7] = var11;
                } else {
                    field1547[var7] = var4.method2375();
                }
                var6 = var8;
                var7++;
                if (this.field1548.field1780[var8] == 5) {
                    this.field1554 = true;
                }
            }
        }
        if (var4.field2012 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1549 = var7;
        this.field1552 = new int[var7];
        this.field1551 = new int[var7];
        this.field1550 = new int[var7];
        this.field1545 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1552[var12] = field1553[var12];
            this.field1551[var12] = field1544[var12];
            this.field1550[var12] = field1546[var12];
            this.field1545[var12] = field1547[var12];
        }
    }
}
