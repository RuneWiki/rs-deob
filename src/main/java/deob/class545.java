package deob;

@ObfuscatedName("ut")
public class class545 {

    @ObfuscatedName("ut.ah")
    public int field5266;

    @ObfuscatedName("ut.ar")
    public int field5265;

    @ObfuscatedName("ut.ao")
    public int field5274;

    @ObfuscatedName("ut.ab")
    public int field5267;

    @ObfuscatedName("ut.au")
    public int field5268;

    @ObfuscatedName("ut.aa")
    public int field5264;

    @ObfuscatedName("ut.ac")
    public int field5263 = 0;

    @ObfuscatedName("ut.al")
    public int field5271 = 0;

    @ObfuscatedName("ut.az")
    public boolean field5272;

    @ObfuscatedName("ut.ap")
    public int field5269;

    @ObfuscatedName("ut.av")
    public int field5273;

    @ObfuscatedName("ut.ax")
    public int field5270;

    @ObfuscatedName("ut.as")
    public int field5276;

    @ObfuscatedName("ut.at(IIIIIIIIZB)V")
    public void method9059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5266 = arg0;
        this.field5265 = arg1;
        this.field5274 = arg2;
        this.field5267 = arg3;
        this.field5268 = arg4;
        this.field5264 = arg5;
        this.field5263 = arg6;
        this.field5271 = arg7;
        this.field5272 = arg8;
    }

    @ObfuscatedName("ut.ah(IIIIB)V")
    public void method9049(int arg0, int arg1, int arg2, int arg3) {
        this.field5269 = arg0;
        this.field5273 = arg1;
        this.field5270 = arg2;
        this.field5276 = arg3;
    }

    @ObfuscatedName("ut.ar(Lpv;Lpf;I)V")
    public void method9050(class407 arg0, class406 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4520;
        int var4 = Math.min(this.field5267, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6876(this.field5274);
        int var6 = arg0.method6867(this.field5267);
        int var7 = this.field5266 - this.field5268 + var5;
        int var8 = this.field5265 - this.field5264 + var6 + var3;
        class537.method8755(this.field5266, this.field5265, this.field5274 + this.field5266, this.field5267 + this.field5265);
        int var9 = this.field5271;
        int var10 = this.field5263;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class411 var12 = arg0.method6847(0, var9);
        class411 var13 = arg0.method6847(var9, var10);
        class411 var14 = arg0.method6847(var10, arg0.method6838());
        class411 var15 = arg0.method6847(0, this.field5263);
        if (!var13.method7089()) {
            int var16 = arg1.field4522 + arg1.field4521;
            for (int var17 = 0; var17 < var13.method7100(); var17++) {
                class409 var18 = var13.method7094(var17);
                int var19 = var18.field4509 + var7;
                int var20 = arg1.method7008(var18.field4510);
                int var21 = var18.field4508 + var8 - var3;
                class537.method8837(var19, var21, var20, var16, this.field5276);
            }
        }
        if (!var12.method7089()) {
            arg1.method6989(var12, var7, var8, this.field5269, this.field5273, -1);
        }
        if (!var13.method7089()) {
            arg1.method6989(var13, var7, var8, this.field5270, this.field5273, -1);
        }
        if (!var14.method7089()) {
            arg1.method6989(var14, var7, var8, this.field5269, this.field5273, -1);
        }
        if (!this.field5272) {
            return;
        }
        class498 var22 = var15.method7105();
        int var23 = var7 + (Integer) var22.field4997;
        int var24 = var8 + (Integer) var22.field4998;
        int var25 = var24 - var4;
        class537.method8793(var23, var24, var23, var25, this.field5269);
        if (this.field5273 != -1) {
            class537.method8793(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5273);
        }
    }
}
