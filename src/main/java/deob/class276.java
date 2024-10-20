package deob;

@ObfuscatedName("kv")
public class class276 {

    @ObfuscatedName("kv.aq")
    public static int[] field2849 = new int[500];

    @ObfuscatedName("kv.ad")
    public static int[] field2840 = new int[500];

    @ObfuscatedName("kv.ag")
    public static int[] field2841 = new int[500];

    @ObfuscatedName("kv.ak")
    public static int[] field2842 = new int[500];

    @ObfuscatedName("kv.ap")
    public class282 field2843 = null;

    @ObfuscatedName("kv.an")
    public int field2846 = -1;

    @ObfuscatedName("kv.aj")
    public int[] field2845;

    @ObfuscatedName("kv.av")
    public int[] field2844;

    @ObfuscatedName("kv.ab")
    public int[] field2839;

    @ObfuscatedName("kv.ai")
    public int[] field2847;

    @ObfuscatedName("kv.ae")
    public boolean field2848 = false;

    public class276(byte[] arg0, class282 arg1) {
        this.field2843 = arg1;
        class547 var3 = new class547(arg0);
        class547 var4 = new class547(arg0);
        var3.field5363 = 2;
        int var5 = var3.method8804();
        int var6 = -1;
        int var7 = 0;
        var4.field5363 = var3.field5363 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var9 = var3.method8804();
            if (var9 > 0) {
                if (this.field2843.field2908[var8] != 0) {
                    for (int var10 = var8 - 1; var10 > var6; var10--) {
                        if (this.field2843.field2908[var10] == 0) {
                            field2849[var7] = var10;
                            field2840[var7] = 0;
                            field2841[var7] = 0;
                            field2842[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2849[var7] = var8;
                short var11 = 0;
                if (this.field2843.field2908[var8] == 3) {
                    var11 = 128;
                }
                if ((var9 & 0x1) == 0) {
                    field2840[var7] = var11;
                } else {
                    field2840[var7] = var4.method8743();
                }
                if ((var9 & 0x2) == 0) {
                    field2841[var7] = var11;
                } else {
                    field2841[var7] = var4.method8743();
                }
                if ((var9 & 0x4) == 0) {
                    field2842[var7] = var11;
                } else {
                    field2842[var7] = var4.method8743();
                }
                var6 = var8;
                var7++;
                if (this.field2843.field2908[var8] == 5) {
                    this.field2848 = true;
                }
            }
        }
        if (var4.field5363 != arg0.length) {
            throw new RuntimeException();
        }
        this.field2846 = var7;
        this.field2845 = new int[var7];
        this.field2844 = new int[var7];
        this.field2839 = new int[var7];
        this.field2847 = new int[var7];
        for (int var12 = 0; var12 < var7; var12++) {
            this.field2845[var12] = field2849[var12];
            this.field2844[var12] = field2840[var12];
            this.field2839[var12] = field2841[var12];
            this.field2847[var12] = field2842[var12];
        }
    }
}
