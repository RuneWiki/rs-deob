package deob;

@ObfuscatedName("gz")
public class class195 {

    @ObfuscatedName("gz.f")
    public static int[] field2232 = new int[500];

    @ObfuscatedName("gz.e")
    public static int[] field2225 = new int[500];

    @ObfuscatedName("gz.v")
    public static int[] field2227 = new int[500];

    @ObfuscatedName("gz.y")
    public static int[] field2228 = new int[500];

    @ObfuscatedName("gz.j")
    public class198 field2229 = null;

    @ObfuscatedName("gz.o")
    public int field2230 = -1;

    @ObfuscatedName("gz.m")
    public int[] field2231;

    @ObfuscatedName("gz.r")
    public int[] field2234;

    @ObfuscatedName("gz.h")
    public int[] field2233;

    @ObfuscatedName("gz.d")
    public int[] field2235;

    @ObfuscatedName("gz.z")
    public boolean field2226 = false;

    public class195(byte[] arg0, class198 arg1) {
        this.field2229 = arg1;
        class384 var3 = new class384(arg0);
        class384 var4 = new class384(arg0);
        var3.field4161 = 2;
        int var5 = var3.method5902();
        int var6 = -1;
        int var7 = 0;
        var4.field4161 = var3.field4161 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method5902();
            if (var9 > 0) {
                if (this.field2229.field2288[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2229.field2288[var10] == 0) {
                            field2232[var7] = var10;
                            field2225[var7] = 0;
                            field2227[var7] = 0;
                            field2228[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2232[var7] = var8;
                short var11 = 0;
                if (this.field2229.field2288[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2225[var7] = var11;
                } else {
                    field2225[var7] = var4.method5910();
                }
                if ((var9 & 0x2) == 0) {
                    field2227[var7] = var11;
                } else {
                    field2227[var7] = var4.method5910();
                }
                if ((var9 & 0x4) == 0) {
                    field2228[var7] = var11;
                } else {
                    field2228[var7] = var4.method5910();
                }
                var6 = var8;
                var7++;
                if (this.field2229.field2288[var8] == 5) {
                    this.field2226 = true;
                }
            }
        }
        if (var4.field4161 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2230 = var7;
        this.field2231 = new int[var7];
        this.field2234 = new int[var7];
        this.field2233 = new int[var7];
        this.field2235 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2231[var12] = field2232[var12];
            this.field2234[var12] = field2225[var12];
            this.field2233[var12] = field2227[var12];
            this.field2235[var12] = field2228[var12];
        }
    }
}
