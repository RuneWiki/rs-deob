package deob;

@ObfuscatedName("ge")
public class class192 {

    @ObfuscatedName("ge.c")
    public static int[] field2230 = new int[500];

    @ObfuscatedName("ge.l")
    public static int[] field2222 = new int[500];

    @ObfuscatedName("ge.s")
    public static int[] field2232 = new int[500];

    @ObfuscatedName("ge.e")
    public static int[] field2225 = new int[500];

    @ObfuscatedName("ge.r")
    public class196 field2226 = null;

    @ObfuscatedName("ge.o")
    public int field2227 = -1;

    @ObfuscatedName("ge.i")
    public int[] field2228;

    @ObfuscatedName("ge.w")
    public int[] field2229;

    @ObfuscatedName("ge.v")
    public int[] field2223;

    @ObfuscatedName("ge.a")
    public int[] field2231;

    @ObfuscatedName("ge.y")
    public boolean field2224 = false;

    public class192(byte[] arg0, class196 arg1) {
        this.field2226 = arg1;
        class421 var3 = new class421(arg0);
        class421 var4 = new class421(arg0);
        var3.field4512 = 2;
        int var5 = var3.method6686();
        int var6 = -1;
        int var7 = 0;
        var4.field4512 = var3.field4512 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method6686();
            if (var9 > 0) {
                if (this.field2226.field2300[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2226.field2300[var10] == 0) {
                            field2230[var7] = var10;
                            field2222[var7] = 0;
                            field2232[var7] = 0;
                            field2225[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2230[var7] = var8;
                short var11 = 0;
                if (this.field2226.field2300[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2222[var7] = var11;
                } else {
                    field2222[var7] = var4.method6804();
                }
                if ((var9 & 0x2) == 0) {
                    field2232[var7] = var11;
                } else {
                    field2232[var7] = var4.method6804();
                }
                if ((var9 & 0x4) == 0) {
                    field2225[var7] = var11;
                } else {
                    field2225[var7] = var4.method6804();
                }
                var6 = var8;
                var7++;
                if (this.field2226.field2300[var8] == 5) {
                    this.field2224 = true;
                }
            }
        }
        if (var4.field4512 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2227 = var7;
        this.field2228 = new int[var7];
        this.field2229 = new int[var7];
        this.field2223 = new int[var7];
        this.field2231 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2228[var12] = field2230[var12];
            this.field2229[var12] = field2222[var12];
            this.field2223[var12] = field2232[var12];
            this.field2231[var12] = field2225[var12];
        }
    }
}
