package deob;

@ObfuscatedName("vc")
public class class552 {

    @ObfuscatedName("vc.aw")
    public int field5329;

    @ObfuscatedName("vc.al")
    public int field5328;

    @ObfuscatedName("vc.ai")
    public int field5338;

    @ObfuscatedName("vc.ar")
    public int field5331;

    @ObfuscatedName("vc.as")
    public int field5327;

    @ObfuscatedName("vc.aa")
    public int field5332;

    @ObfuscatedName("vc.az")
    public int field5333 = 0;

    @ObfuscatedName("vc.ao")
    public int field5334 = 0;

    @ObfuscatedName("vc.au")
    public boolean field5335;

    @ObfuscatedName("vc.ak")
    public int field5330;

    @ObfuscatedName("vc.ah")
    public int field5336;

    @ObfuscatedName("vc.aj")
    public int field5337;

    @ObfuscatedName("vc.af")
    public int field5339;

    @ObfuscatedName("vc.aq(IIIIIIIIZI)V")
    public void method9160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5329 = arg0;
        this.field5328 = arg1;
        this.field5338 = arg2;
        this.field5331 = arg3;
        this.field5327 = arg4;
        this.field5332 = arg5;
        this.field5333 = arg6;
        this.field5334 = arg7;
        this.field5335 = arg8;
    }

    @ObfuscatedName("vc.aw(IIIII)V")
    public void method9161(int arg0, int arg1, int arg2, int arg3) {
        this.field5330 = arg0;
        this.field5336 = arg1;
        this.field5337 = arg2;
        this.field5339 = arg3;
    }

    @ObfuscatedName("vc.al(Lpv;Lpb;S)V")
    public void method9162(class414 arg0, class413 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4594;
        int var4 = Math.min(this.field5331, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method7063(this.field5338);
        int var6 = arg0.method7076(this.field5331);
        int var7 = this.field5329 - this.field5327 + var5;
        int var8 = this.field5328 - this.field5332 + var6 + var3;
        class544.method8892(this.field5329, this.field5328, this.field5338 + this.field5329, this.field5331 + this.field5328);
        int var9 = this.field5334;
        int var10 = this.field5333;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class418 var12 = arg0.method6997(0, var9);
        class418 var13 = arg0.method6997(var9, var10);
        class418 var14 = arg0.method6997(var10, arg0.method7001());
        class418 var15 = arg0.method6997(0, this.field5333);
        if (!var13.method7238()) {
            int var16 = arg1.field4599 + arg1.field4595;
            for (int var17 = 0; var17 < var13.method7239(); var17++) {
                class416 var18 = var13.method7253(var17);
                int var19 = var18.field4585 + var7;
                int var20 = arg1.method7127(var18.field4584);
                int var21 = var18.field4586 + var8 - var3;
                class544.method8900(var19, var21, var20, var16, this.field5339);
            }
        }
        if (!var12.method7238()) {
            arg1.method7139(var12, var7, var8, this.field5330, this.field5336, -1);
        }
        if (!var13.method7238()) {
            arg1.method7139(var13, var7, var8, this.field5337, this.field5336, -1);
        }
        if (!var14.method7238()) {
            arg1.method7139(var14, var7, var8, this.field5330, this.field5336, -1);
        }
        if (!this.field5335) {
            return;
        }
        class505 var22 = var15.method7245();
        int var23 = var7 + (Integer) var22.field5064;
        int var24 = var8 + (Integer) var22.field5065;
        int var25 = var24 - var4;
        class544.method8911(var23, var24, var23, var25, this.field5330);
        if (this.field5336 != -1) {
            class544.method8911(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5336);
        }
    }
}
