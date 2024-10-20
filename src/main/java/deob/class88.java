package deob;

@ObfuscatedName("cq")
public class class88 {

    @ObfuscatedName("cq.c")
    public static int[] field1523 = new int[500];

    @ObfuscatedName("cq.h")
    public static int[] field1514 = new int[500];

    @ObfuscatedName("cq.k")
    public static int[] field1515 = new int[500];

    @ObfuscatedName("cq.t")
    public static int[] field1516 = new int[500];

    @ObfuscatedName("cq.g")
    public class102 field1517 = null;

    @ObfuscatedName("cq.o")
    public int field1518 = -1;

    @ObfuscatedName("cq.i")
    public int[] field1519;

    @ObfuscatedName("cq.w")
    public int[] field1521;

    @ObfuscatedName("cq.m")
    public int[] field1522;

    @ObfuscatedName("cq.r")
    public int[] field1513;

    @ObfuscatedName("cq.y")
    public boolean field1520 = false;

    public class88(byte[] arg0, class102 arg1) {
        this.field1517 = arg1;
        class119 var3 = new class119(arg0);
        class119 var4 = new class119(arg0);
        var3.field1955 = 2;
        int var5 = var3.method2291();
        int var6 = -1;
        int var7 = 0;
        var4.field1955 = var3.field1955 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2291();
            if (var9 > 0) {
                if (this.field1517.field1732[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1517.field1732[var10] == 0) {
                            field1523[var7] = var10;
                            field1514[var7] = 0;
                            field1515[var7] = 0;
                            field1516[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1523[var7] = var8;
                short var11 = 0;
                if (this.field1517.field1732[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1514[var7] = var11;
                } else {
                    field1514[var7] = var4.method2280();
                }
                if ((var9 & 0x2) == 0) {
                    field1515[var7] = var11;
                } else {
                    field1515[var7] = var4.method2280();
                }
                if ((var9 & 0x4) == 0) {
                    field1516[var7] = var11;
                } else {
                    field1516[var7] = var4.method2280();
                }
                var6 = var8;
                var7++;
                if (this.field1517.field1732[var8] == 5) {
                    this.field1520 = true;
                }
            }
        }
        if (var4.field1955 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1518 = var7;
        this.field1519 = new int[var7];
        this.field1521 = new int[var7];
        this.field1522 = new int[var7];
        this.field1513 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1519[var12] = field1523[var12];
            this.field1521[var12] = field1514[var12];
            this.field1522[var12] = field1515[var12];
            this.field1513[var12] = field1516[var12];
        }
    }
}
