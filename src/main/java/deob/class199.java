package deob;

@ObfuscatedName("ga")
public class class199 {

    @ObfuscatedName("ga.s")
    public static int[] field2300 = new int[500];

    @ObfuscatedName("ga.h")
    public static int[] field2308 = new int[500];

    @ObfuscatedName("ga.w")
    public static int[] field2299 = new int[500];

    @ObfuscatedName("ga.v")
    public static int[] field2302 = new int[500];

    @ObfuscatedName("ga.c")
    public class203 field2303 = null;

    @ObfuscatedName("ga.q")
    public int field2301 = -1;

    @ObfuscatedName("ga.i")
    public int[] field2305;

    @ObfuscatedName("ga.k")
    public int[] field2306;

    @ObfuscatedName("ga.o")
    public int[] field2307;

    @ObfuscatedName("ga.n")
    public int[] field2304;

    @ObfuscatedName("ga.d")
    public boolean field2309 = false;

    public class199(byte[] arg0, class203 arg1) {
        this.field2303 = arg1;
        class444 var3 = new class444(arg0);
        class444 var4 = new class444(arg0);
        var3.field4708 = 2;
        int var5 = var3.method6929();
        int var6 = -1;
        int var7 = 0;
        var4.field4708 = var3.field4708 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method6929();
            if (var9 > 0) {
                if (this.field2303.field2377[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2303.field2377[var10] == 0) {
                            field2300[var7] = var10;
                            field2308[var7] = 0;
                            field2299[var7] = 0;
                            field2302[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2300[var7] = var8;
                short var11 = 0;
                if (this.field2303.field2377[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2308[var7] = var11;
                } else {
                    field2308[var7] = var4.method7044();
                }
                if ((var9 & 0x2) == 0) {
                    field2299[var7] = var11;
                } else {
                    field2299[var7] = var4.method7044();
                }
                if ((var9 & 0x4) == 0) {
                    field2302[var7] = var11;
                } else {
                    field2302[var7] = var4.method7044();
                }
                var6 = var8;
                var7++;
                if (this.field2303.field2377[var8] == 5) {
                    this.field2309 = true;
                }
            }
        }
        if (var4.field4708 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2301 = var7;
        this.field2305 = new int[var7];
        this.field2306 = new int[var7];
        this.field2307 = new int[var7];
        this.field2304 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2305[var12] = field2300[var12];
            this.field2306[var12] = field2308[var12];
            this.field2307[var12] = field2299[var12];
            this.field2304[var12] = field2302[var12];
        }
    }
}
