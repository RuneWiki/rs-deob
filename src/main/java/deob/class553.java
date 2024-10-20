package deob;

@ObfuscatedName("vv")
public class class553 {

    @ObfuscatedName("vv.ah")
    public int field5359;

    @ObfuscatedName("vv.af")
    public int field5360;

    @ObfuscatedName("vv.at")
    public int field5361;

    @ObfuscatedName("vv.an")
    public int field5367;

    @ObfuscatedName("vv.ao")
    public int field5366;

    @ObfuscatedName("vv.ab")
    public int field5358;

    @ObfuscatedName("vv.aw")
    public int field5365 = 0;

    @ObfuscatedName("vv.ad")
    public int field5371 = 0;

    @ObfuscatedName("vv.al")
    public boolean field5364;

    @ObfuscatedName("vv.as")
    public int field5368;

    @ObfuscatedName("vv.ag")
    public int field5369;

    @ObfuscatedName("vv.ai")
    public int field5370;

    @ObfuscatedName("vv.ax")
    public int field5362;

    @ObfuscatedName("vv.az(IIIIIIIIZI)V")
    public void method9056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5359 = arg0;
        this.field5360 = arg1;
        this.field5361 = arg2;
        this.field5367 = arg3;
        this.field5366 = arg4;
        this.field5358 = arg5;
        this.field5365 = arg6;
        this.field5371 = arg7;
        this.field5364 = arg8;
    }

    @ObfuscatedName("vv.ah(IIIIB)V")
    public void method9057(int arg0, int arg1, int arg2, int arg3) {
        this.field5368 = arg0;
        this.field5369 = arg1;
        this.field5370 = arg2;
        this.field5362 = arg3;
    }

    @ObfuscatedName("vv.af(Lpl;Lpx;I)V")
    public void method9058(class415 arg0, class414 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4617;
        int var4 = Math.min(this.field5367, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6907(this.field5361);
        int var6 = arg0.method6900(this.field5367);
        int var7 = this.field5359 - this.field5366 + var5;
        int var8 = this.field5360 - this.field5358 + var6 + var3;
        class545.method8801(this.field5359, this.field5360, this.field5361 + this.field5359, this.field5367 + this.field5360);
        int var9 = this.field5371;
        int var10 = this.field5365;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class419 var12 = arg0.method6880(0, var9);
        class419 var13 = arg0.method6880(var9, var10);
        class419 var14 = arg0.method6880(var10, arg0.method6871());
        class419 var15 = arg0.method6880(0, this.field5365);
        if (!var13.method7135()) {
            int var16 = arg1.field4619 + arg1.field4618;
            for (int var17 = 0; var17 < var13.method7118(); var17++) {
                class417 var18 = var13.method7114(var17);
                int var19 = var18.field4607 + var7;
                int var20 = arg1.method7078(var18.field4608);
                int var21 = var18.field4606 + var8 - var3;
                class545.method8784(var19, var21, var20, var16, this.field5362);
            }
        }
        if (!var12.method7135()) {
            arg1.method7054(var12, var7, var8, this.field5368, this.field5369, -1);
        }
        if (!var13.method7135()) {
            arg1.method7054(var13, var7, var8, this.field5370, this.field5369, -1);
        }
        if (!var14.method7135()) {
            arg1.method7054(var14, var7, var8, this.field5368, this.field5369, -1);
        }
        if (!this.field5364) {
            return;
        }
        class506 var22 = var15.method7120();
        int var23 = var7 + (Integer) var22.field5091;
        int var24 = var8 + (Integer) var22.field5090;
        int var25 = var24 - var4;
        class545.method8793(var23, var24, var23, var25, this.field5368);
        if (this.field5369 != -1) {
            class545.method8793(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5369);
        }
    }
}
