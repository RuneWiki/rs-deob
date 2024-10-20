package deob;

@ObfuscatedName("il")
public class class217 {

    @ObfuscatedName("il.af")
    public static int[] field2488 = new int[500];

    @ObfuscatedName("il.an")
    public static int[] field2487 = new int[500];

    @ObfuscatedName("il.aw")
    public static int[] field2478 = new int[500];

    @ObfuscatedName("il.ac")
    public static int[] field2481 = new int[500];

    @ObfuscatedName("il.au")
    public class222 field2482 = null;

    @ObfuscatedName("il.ab")
    public int field2483 = -1;

    @ObfuscatedName("il.aq")
    public int[] field2484;

    @ObfuscatedName("il.al")
    public int[] field2485;

    @ObfuscatedName("il.at")
    public int[] field2479;

    @ObfuscatedName("il.aa")
    public int[] field2486;

    @ObfuscatedName("il.ay")
    public boolean field2480 = false;

    public class217(byte[] arg0, class222 arg1) {
        this.field2482 = arg1;
        class489 var3 = new class489(arg0);
        class489 var4 = new class489(arg0);
        var3.field4989 = 2;
        int var5 = var3.method8248();
        int var6 = -1;
        int var7 = 0;
        var4.field4989 = var3.field4989 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8248();
            if (var9 > 0) {
                if (this.field2482.field2540[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2482.field2540[var10] == 0) {
                            field2488[var7] = var10;
                            field2487[var7] = 0;
                            field2478[var7] = 0;
                            field2481[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2488[var7] = var8;
                short var11 = 0;
                if (this.field2482.field2540[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2487[var7] = var11;
                } else {
                    field2487[var7] = var4.method8263();
                }
                if ((var9 & 0x2) == 0) {
                    field2478[var7] = var11;
                } else {
                    field2478[var7] = var4.method8263();
                }
                if ((var9 & 0x4) == 0) {
                    field2481[var7] = var11;
                } else {
                    field2481[var7] = var4.method8263();
                }
                var6 = var8;
                var7++;
                if (this.field2482.field2540[var8] == 5) {
                    this.field2480 = true;
                }
            }
        }
        if (var4.field4989 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2483 = var7;
        this.field2484 = new int[var7];
        this.field2485 = new int[var7];
        this.field2479 = new int[var7];
        this.field2486 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2484[var12] = field2488[var12];
            this.field2485[var12] = field2487[var12];
            this.field2479[var12] = field2478[var12];
            this.field2486[var12] = field2481[var12];
        }
    }
}
