package deob;

@ObfuscatedName("gl")
public class class199 {

    @ObfuscatedName("gl.c")
    public static int[] field2304 = new int[500];

    @ObfuscatedName("gl.v")
    public static int[] field2309 = new int[500];

    @ObfuscatedName("gl.q")
    public static int[] field2306 = new int[500];

    @ObfuscatedName("gl.f")
    public static int[] field2305 = new int[500];

    @ObfuscatedName("gl.j")
    public class203 field2308 = null;

    @ObfuscatedName("gl.e")
    public int field2312 = -1;

    @ObfuscatedName("gl.g")
    public int[] field2310;

    @ObfuscatedName("gl.w")
    public int[] field2307;

    @ObfuscatedName("gl.y")
    public int[] field2311;

    @ObfuscatedName("gl.i")
    public int[] field2313;

    @ObfuscatedName("gl.s")
    public boolean field2314 = false;

    public class199(byte[] arg0, class203 arg1) {
        this.field2308 = arg1;
        class443 var3 = new class443(arg0);
        class443 var4 = new class443(arg0);
        var3.field4700 = 2;
        int var5 = var3.method7047();
        int var6 = -1;
        int var7 = 0;
        var4.field4700 = var3.field4700 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method7047();
            if (var9 > 0) {
                if (this.field2308.field2376[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2308.field2376[var10] == 0) {
                            field2304[var7] = var10;
                            field2309[var7] = 0;
                            field2306[var7] = 0;
                            field2305[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2304[var7] = var8;
                short var11 = 0;
                if (this.field2308.field2376[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2309[var7] = var11;
                } else {
                    field2309[var7] = var4.method7213();
                }
                if ((var9 & 0x2) == 0) {
                    field2306[var7] = var11;
                } else {
                    field2306[var7] = var4.method7213();
                }
                if ((var9 & 0x4) == 0) {
                    field2305[var7] = var11;
                } else {
                    field2305[var7] = var4.method7213();
                }
                var6 = var8;
                var7++;
                if (this.field2308.field2376[var8] == 5) {
                    this.field2314 = true;
                }
            }
        }
        if (var4.field4700 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2312 = var7;
        this.field2310 = new int[var7];
        this.field2307 = new int[var7];
        this.field2311 = new int[var7];
        this.field2313 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2310[var12] = field2304[var12];
            this.field2307[var12] = field2309[var12];
            this.field2311[var12] = field2306[var12];
            this.field2313[var12] = field2305[var12];
        }
    }
}
