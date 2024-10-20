package deob;

@ObfuscatedName("wz")
public class class576 {

    @ObfuscatedName("wz.aw")
    public int field5590;

    @ObfuscatedName("wz.ak")
    public int field5588;

    @ObfuscatedName("wz.aj")
    public int field5589;

    @ObfuscatedName("wz.ai")
    public int field5596;

    @ObfuscatedName("wz.ay")
    public int field5591;

    @ObfuscatedName("wz.as")
    public int field5592;

    @ObfuscatedName("wz.ae")
    public int field5593 = 0;

    @ObfuscatedName("wz.am")
    public int field5594 = 0;

    @ObfuscatedName("wz.at")
    public boolean field5595;

    @ObfuscatedName("wz.au")
    public int field5597;

    @ObfuscatedName("wz.an")
    public int field5586;

    @ObfuscatedName("wz.ao")
    public int field5598;

    @ObfuscatedName("wz.af")
    public int field5599;

    @ObfuscatedName("wz.ap(IIIIIIIIZI)V")
    public void method9903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5590 = arg0;
        this.field5588 = arg1;
        this.field5589 = arg2;
        this.field5596 = arg3;
        this.field5591 = arg4;
        this.field5592 = arg5;
        this.field5593 = arg6;
        this.field5594 = arg7;
        this.field5595 = arg8;
    }

    @ObfuscatedName("wz.aw(IIIII)V")
    public void method9905(int arg0, int arg1, int arg2, int arg3) {
        this.field5597 = arg0;
        this.field5586 = arg1;
        this.field5598 = arg2;
        this.field5599 = arg3;
    }

    @ObfuscatedName("wz.ak(Lql;Lqi;B)V")
    public void method9908(class437 arg0, class436 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4851;
        int var4 = Math.min(this.field5596, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method7808(this.field5589);
        int var6 = arg0.method7809(this.field5596);
        int var7 = this.field5590 - this.field5591 + var5;
        int var8 = this.field5588 - this.field5592 + var6 + var3;
        class568.method9608(this.field5590, this.field5588, this.field5590 + this.field5589, this.field5596 + this.field5588);
        int var9 = this.field5594;
        int var10 = this.field5593;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class441 var12 = arg0.method7789(0, var9);
        class441 var13 = arg0.method7789(var9, var10);
        class441 var14 = arg0.method7789(var10, arg0.method7780());
        class441 var15 = arg0.method7789(0, this.field5593);
        if (!var13.method8038()) {
            int var16 = arg1.field4852 + arg1.field4843;
            for (int var17 = 0; var17 < var13.method8023(); var17++) {
                class439 var18 = var13.method8027(var17);
                int var19 = var18.field4841 + var7;
                int var20 = arg1.method7929(var18.field4840);
                int var21 = var18.field4842 + var8 - var3;
                class568.method9616(var19, var21, var20, var16, this.field5599);
            }
        }
        if (!var12.method8038()) {
            arg1.method7938(var12, var7, var8, this.field5597, this.field5586, -1);
        }
        if (!var13.method8038()) {
            arg1.method7938(var13, var7, var8, this.field5598, this.field5586, -1);
        }
        if (!var14.method8038()) {
            arg1.method7938(var14, var7, var8, this.field5597, this.field5586, -1);
        }
        if (!this.field5595) {
            return;
        }
        class528 var22 = var15.method8026();
        int var23 = var7 + (Integer) var22.field5317;
        int var24 = var8 + (Integer) var22.field5318;
        int var25 = var24 - var4;
        class568.method9671(var23, var24, var23, var25, this.field5597);
        if (this.field5586 != -1) {
            class568.method9671(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5586);
        }
    }
}
