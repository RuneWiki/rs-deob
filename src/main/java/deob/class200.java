package deob;

@ObfuscatedName("gu")
public class class200 {

    @ObfuscatedName("gu.o")
    public static int[] field2345 = new int[500];

    @ObfuscatedName("gu.q")
    public static int[] field2343 = new int[500];

    @ObfuscatedName("gu.l")
    public static int[] field2352 = new int[500];

    @ObfuscatedName("gu.k")
    public static int[] field2346 = new int[500];

    @ObfuscatedName("gu.a")
    public class204 field2347 = null;

    @ObfuscatedName("gu.m")
    public int field2348 = -1;

    @ObfuscatedName("gu.p")
    public int[] field2349;

    @ObfuscatedName("gu.s")
    public int[] field2350;

    @ObfuscatedName("gu.r")
    public int[] field2351;

    @ObfuscatedName("gu.v")
    public int[] field2344;

    @ObfuscatedName("gu.y")
    public boolean field2353 = false;

    public class200(byte[] arg0, class204 arg1) {
        this.field2347 = arg1;
        class440 var3 = new class440(arg0);
        class440 var4 = new class440(arg0);
        var3.field4678 = 2;
        int var5 = var3.method7071();
        int var6 = -1;
        int var7 = 0;
        var4.field4678 = var3.field4678 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method7071();
            if (var9 > 0) {
                if (this.field2347.field2408[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2347.field2408[var10] == 0) {
                            field2345[var7] = var10;
                            field2343[var7] = 0;
                            field2352[var7] = 0;
                            field2346[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2345[var7] = var8;
                short var11 = 0;
                if (this.field2347.field2408[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2343[var7] = var11;
                } else {
                    field2343[var7] = var4.method6907();
                }
                if ((var9 & 0x2) == 0) {
                    field2352[var7] = var11;
                } else {
                    field2352[var7] = var4.method6907();
                }
                if ((var9 & 0x4) == 0) {
                    field2346[var7] = var11;
                } else {
                    field2346[var7] = var4.method6907();
                }
                var6 = var8;
                var7++;
                if (this.field2347.field2408[var8] == 5) {
                    this.field2353 = true;
                }
            }
        }
        if (var4.field4678 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2348 = var7;
        this.field2349 = new int[var7];
        this.field2350 = new int[var7];
        this.field2351 = new int[var7];
        this.field2344 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2349[var12] = field2345[var12];
            this.field2350[var12] = field2343[var12];
            this.field2351[var12] = field2352[var12];
            this.field2344[var12] = field2346[var12];
        }
    }
}
