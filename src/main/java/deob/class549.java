package deob;

@ObfuscatedName("vv")
public class class549 {

    @ObfuscatedName("vv.ap")
    public int field5305;

    @ObfuscatedName("vv.af")
    public int field5303;

    @ObfuscatedName("vv.aj")
    public int field5304;

    @ObfuscatedName("vv.aq")
    public int field5310;

    @ObfuscatedName("vv.ar")
    public int field5314;

    @ObfuscatedName("vv.ag")
    public int field5307;

    @ObfuscatedName("vv.ao")
    public int field5302 = 0;

    @ObfuscatedName("vv.ae")
    public int field5309 = 0;

    @ObfuscatedName("vv.aa")
    public boolean field5306;

    @ObfuscatedName("vv.au")
    public int field5311;

    @ObfuscatedName("vv.an")
    public int field5312;

    @ObfuscatedName("vv.ad")
    public int field5313;

    @ObfuscatedName("vv.ax")
    public int field5301;

    @ObfuscatedName("vv.am(IIIIIIIIZI)V")
    public void method9136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5305 = arg0;
        this.field5303 = arg1;
        this.field5304 = arg2;
        this.field5310 = arg3;
        this.field5314 = arg4;
        this.field5307 = arg5;
        this.field5302 = arg6;
        this.field5309 = arg7;
        this.field5306 = arg8;
    }

    @ObfuscatedName("vv.ap(IIIIB)V")
    public void method9135(int arg0, int arg1, int arg2, int arg3) {
        this.field5311 = arg0;
        this.field5312 = arg1;
        this.field5313 = arg2;
        this.field5301 = arg3;
    }

    @ObfuscatedName("vv.af(Lpx;Lpv;B)V")
    public void method9138(class411 arg0, class410 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4556;
        int var4 = Math.min(this.field5310, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6970(this.field5304);
        int var6 = arg0.method6983(this.field5310);
        int var7 = this.field5305 - this.field5314 + var5;
        int var8 = this.field5303 - this.field5307 + var6 + var3;
        class541.method8876(this.field5305, this.field5303, this.field5305 + this.field5304, this.field5310 + this.field5303);
        int var9 = this.field5309;
        int var10 = this.field5302;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class415 var12 = arg0.method6963(0, var9);
        class415 var13 = arg0.method6963(var9, var10);
        class415 var14 = arg0.method6963(var10, arg0.method7048());
        class415 var15 = arg0.method6963(0, this.field5302);
        if (!var13.method7221()) {
            int var16 = arg1.field4558 + arg1.field4557;
            for (int var17 = 0; var17 < var13.method7234(); var17++) {
                class413 var18 = var13.method7241(var17);
                int var19 = var18.field4545 + var7;
                int var20 = arg1.method7102(var18.field4546);
                int var21 = var18.field4547 + var8 - var3;
                class541.method8884(var19, var21, var20, var16, this.field5301);
            }
        }
        if (!var12.method7221()) {
            arg1.method7114(var12, var7, var8, this.field5311, this.field5312, -1);
        }
        if (!var13.method7221()) {
            arg1.method7114(var13, var7, var8, this.field5313, this.field5312, -1);
        }
        if (!var14.method7221()) {
            arg1.method7114(var14, var7, var8, this.field5311, this.field5312, -1);
        }
        if (!this.field5306) {
            return;
        }
        class502 var22 = var15.method7225();
        int var23 = var7 + (Integer) var22.field5042;
        int var24 = var8 + (Integer) var22.field5043;
        int var25 = var24 - var4;
        class541.method8894(var23, var24, var23, var25, this.field5311);
        if (this.field5312 != -1) {
            class541.method8894(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5312);
        }
    }
}
