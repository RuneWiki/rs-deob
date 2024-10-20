package deob;

@ObfuscatedName("cy")
public class class81 {

    @ObfuscatedName("cy.q")
    public static int[] field1342 = new int[500];

    @ObfuscatedName("cy.d")
    public static int[] field1338 = new int[500];

    @ObfuscatedName("cy.h")
    public static int[] field1339 = new int[500];

    @ObfuscatedName("cy.p")
    public static int[] field1337 = new int[500];

    @ObfuscatedName("cy.j")
    public class87 field1344 = null;

    @ObfuscatedName("cy.n")
    public int field1343 = -1;

    @ObfuscatedName("cy.r")
    public int[] field1341;

    @ObfuscatedName("cy.c")
    public int[] field1346;

    @ObfuscatedName("cy.i")
    public int[] field1345;

    @ObfuscatedName("cy.o")
    public int[] field1340;

    @ObfuscatedName("cy.m")
    public boolean field1347 = false;

    public class81(byte[] arg0, class87 arg1) {
        this.field1344 = arg1;
        class154 var3 = new class154(arg0);
        class154 var4 = new class154(arg0);
        var3.field2091 = 2;
        int var5 = var3.method2666();
        int var6 = -1;
        int var7 = 0;
        var4.field2091 = var3.field2091 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method2666();
            if (var9 > 0) {
                if (this.field1344.field1485[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field1344.field1485[var10] == 0) {
                            field1342[var7] = var10;
                            field1338[var7] = 0;
                            field1339[var7] = 0;
                            field1337[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1342[var7] = var8;
                short var11 = 0;
                if (this.field1344.field1485[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field1338[var7] = var11;
                } else {
                    field1338[var7] = var4.method2678();
                }
                if ((var9 & 0x2) == 0) {
                    field1339[var7] = var11;
                } else {
                    field1339[var7] = var4.method2678();
                }
                if ((var9 & 0x4) == 0) {
                    field1337[var7] = var11;
                } else {
                    field1337[var7] = var4.method2678();
                }
                var6 = var8;
                var7++;
                if (this.field1344.field1485[var8] == 5) {
                    this.field1347 = true;
                }
            }
        }
        if (var4.field2091 != arg0.length) {
            throw new RuntimeException();
        }
        this.field1343 = var7;
        this.field1341 = new int[var7];
        this.field1346 = new int[var7];
        this.field1345 = new int[var7];
        this.field1340 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field1341[var12] = field1342[var12];
            this.field1346[var12] = field1338[var12];
            this.field1345[var12] = field1339[var12];
            this.field1340[var12] = field1337[var12];
        }
    }
}
