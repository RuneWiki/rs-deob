package deob;

@ObfuscatedName("gs")
public class class200 {

    @ObfuscatedName("gs.c")
    public static int[] field2342 = new int[500];

    @ObfuscatedName("gs.p")
    public static int[] field2335 = new int[500];

    @ObfuscatedName("gs.f")
    public static int[] field2336 = new int[500];

    @ObfuscatedName("gs.n")
    public static int[] field2337 = new int[500];

    @ObfuscatedName("gs.k")
    public class204 field2338 = null;

    @ObfuscatedName("gs.w")
    public int field2339 = -1;

    @ObfuscatedName("gs.s")
    public int[] field2340;

    @ObfuscatedName("gs.q")
    public int[] field2334;

    @ObfuscatedName("gs.m")
    public int[] field2341;

    @ObfuscatedName("gs.x")
    public int[] field2343;

    @ObfuscatedName("gs.j")
    public boolean field2344 = false;

    public class200(byte[] arg0, class204 arg1) {
        this.field2338 = arg1;
        class445 var3 = new class445(arg0);
        class445 var4 = new class445(arg0);
        var3.field4735 = 2;
        int var5 = var3.method7196();
        int var6 = -1;
        int var7 = 0;
        var4.field4735 = var3.field4735 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method7196();
            if (var9 > 0) {
                if (this.field2338.field2402[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2338.field2402[var10] == 0) {
                            field2342[var7] = var10;
                            field2335[var7] = 0;
                            field2336[var7] = 0;
                            field2337[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2342[var7] = var8;
                short var11 = 0;
                if (this.field2338.field2402[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2335[var7] = var11;
                } else {
                    field2335[var7] = var4.method7210();
                }
                if ((var9 & 0x2) == 0) {
                    field2336[var7] = var11;
                } else {
                    field2336[var7] = var4.method7210();
                }
                if ((var9 & 0x4) == 0) {
                    field2337[var7] = var11;
                } else {
                    field2337[var7] = var4.method7210();
                }
                var6 = var8;
                var7++;
                if (this.field2338.field2402[var8] == 5) {
                    this.field2344 = true;
                }
            }
        }
        if (var4.field4735 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2339 = var7;
        this.field2340 = new int[var7];
        this.field2334 = new int[var7];
        this.field2341 = new int[var7];
        this.field2343 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2340[var12] = field2342[var12];
            this.field2334[var12] = field2335[var12];
            this.field2341[var12] = field2336[var12];
            this.field2343[var12] = field2337[var12];
        }
    }
}
