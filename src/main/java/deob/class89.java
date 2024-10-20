package deob;

@ObfuscatedName("cn")
public class class89 {

    @ObfuscatedName("cn.a")
    public static int[] field1545 = new int[500];

    @ObfuscatedName("cn.w")
    public static int[] field1542 = new int[500];

    @ObfuscatedName("cn.d")
    public static int[] field1543 = new int[500];

    @ObfuscatedName("cn.c")
    public static int[] field1544 = new int[500];

    @ObfuscatedName("cn.y")
    public class103 field1550 = null;

    @ObfuscatedName("cn.k")
    public int field1546 = -1;

    @ObfuscatedName("cn.r")
    public int[] field1547;

    @ObfuscatedName("cn.p")
    public int[] field1548;

    @ObfuscatedName("cn.q")
    public int[] field1549;

    @ObfuscatedName("cn.m")
    public int[] field1541;

    @ObfuscatedName("cn.e")
    public boolean field1551 = false;

    public class89(byte[] arg0, class103 arg1) {
        this.field1550 = arg1;
        class120 var3 = new class120(arg0);
        class120 var4 = new class120(arg0);
        var3.field1993 = 2;
        int var5 = var3.method2462();
        int var6 = -1;
        int var7 = 0;
        var4.field1993 = var3.field1993 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2462();
            if (var9 > 0) {
                if (this.field1550.field1762[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1550.field1762[var10] == 0) {
                            field1545[var7] = var10;
                            field1542[var7] = 0;
                            field1543[var7] = 0;
                            field1544[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1545[var7] = var8;
                short var11 = 0;
                if (this.field1550.field1762[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1542[var7] = var11;
                } else {
                    field1542[var7] = var4.method2491();
                }
                if ((var9 & 0x2) == 0) {
                    field1543[var7] = var11;
                } else {
                    field1543[var7] = var4.method2491();
                }
                if ((var9 & 0x4) == 0) {
                    field1544[var7] = var11;
                } else {
                    field1544[var7] = var4.method2491();
                }
                var6 = var8;
                var7++;
                if (this.field1550.field1762[var8] == 5) {
                    this.field1551 = true;
                }
            }
        }
        if (var4.field1993 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1546 = var7;
        this.field1547 = new int[var7];
        this.field1548 = new int[var7];
        this.field1549 = new int[var7];
        this.field1541 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1547[var12] = field1545[var12];
            this.field1548[var12] = field1542[var12];
            this.field1549[var12] = field1543[var12];
            this.field1541[var12] = field1544[var12];
        }
    }
}
