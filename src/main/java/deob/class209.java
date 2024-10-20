package deob;

@ObfuscatedName("hj")
public class class209 {

    @ObfuscatedName("hj.l")
    public static int[] field2313 = new int[500];

    @ObfuscatedName("hj.q")
    public static int[] field2307 = new int[500];

    @ObfuscatedName("hj.f")
    public static int[] field2308 = new int[500];

    @ObfuscatedName("hj.j")
    public static int[] field2309 = new int[500];

    @ObfuscatedName("hj.m")
    public class212 field2306 = null;

    @ObfuscatedName("hj.k")
    public int field2311 = -1;

    @ObfuscatedName("hj.t")
    public int[] field2312;

    @ObfuscatedName("hj.a")
    public int[] field2310;

    @ObfuscatedName("hj.e")
    public int[] field2314;

    @ObfuscatedName("hj.i")
    public int[] field2315;

    @ObfuscatedName("hj.y")
    public boolean field2316 = false;

    public class209(byte[] arg0, class212 arg1) {
        this.field2306 = arg1;
        class401 var3 = new class401(arg0);
        class401 var4 = new class401(arg0);
        var3.field4292 = 2;
        int var5 = var3.method6272();
        int var6 = -1;
        int var7 = 0;
        var4.field4292 = var3.field4292 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method6272();
            if (var9 > 0) {
                if (this.field2306.field2375[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2306.field2375[var10] == 0) {
                            field2313[var7] = var10;
                            field2307[var7] = 0;
                            field2308[var7] = 0;
                            field2309[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2313[var7] = var8;
                short var11 = 0;
                if (this.field2306.field2375[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2307[var7] = var11;
                } else {
                    field2307[var7] = var4.method6285();
                }
                if ((var9 & 0x2) == 0) {
                    field2308[var7] = var11;
                } else {
                    field2308[var7] = var4.method6285();
                }
                if ((var9 & 0x4) == 0) {
                    field2309[var7] = var11;
                } else {
                    field2309[var7] = var4.method6285();
                }
                var6 = var8;
                var7++;
                if (this.field2306.field2375[var8] == 5) {
                    this.field2316 = true;
                }
            }
        }
        if (var4.field4292 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2311 = var7;
        this.field2312 = new int[var7];
        this.field2310 = new int[var7];
        this.field2314 = new int[var7];
        this.field2315 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2312[var12] = field2313[var12];
            this.field2310[var12] = field2307[var12];
            this.field2314[var12] = field2308[var12];
            this.field2315[var12] = field2309[var12];
        }
    }
}
