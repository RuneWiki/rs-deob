package deob;

@ObfuscatedName("tz")
public class class507 {

    @ObfuscatedName("tz.an")
    public int field5116;

    @ObfuscatedName("tz.aw")
    public int field5117;

    @ObfuscatedName("tz.ac")
    public int field5118;

    @ObfuscatedName("tz.au")
    public int field5119;

    @ObfuscatedName("tz.ab")
    public int field5120;

    @ObfuscatedName("tz.aq")
    public int field5121;

    @ObfuscatedName("tz.al")
    public int field5124 = 0;

    @ObfuscatedName("tz.at")
    public int field5123 = 0;

    @ObfuscatedName("tz.aa")
    public boolean field5126;

    @ObfuscatedName("tz.ay")
    public int field5125;

    @ObfuscatedName("tz.ao")
    public int field5115;

    @ObfuscatedName("tz.ax")
    public int field5127;

    @ObfuscatedName("tz.ai")
    public int field5128;

    @ObfuscatedName("tz.af(IIIIIIIIZI)V")
    public void method8818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5116 = arg0;
        this.field5117 = arg1;
        this.field5118 = arg2;
        this.field5119 = arg3;
        this.field5120 = arg4;
        this.field5121 = arg5;
        this.field5124 = arg6;
        this.field5123 = arg7;
        this.field5126 = arg8;
    }

    @ObfuscatedName("tz.an(IIIII)V")
    public void method8823(int arg0, int arg1, int arg2, int arg3) {
        this.field5125 = arg0;
        this.field5115 = arg1;
        this.field5127 = arg2;
        this.field5128 = arg3;
    }

    @ObfuscatedName("tz.aw(Loq;Lon;B)V")
    public void method8820(class380 arg0, class379 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4439;
        int var4 = Math.min(this.field5119, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6739(this.field5118);
        int var6 = arg0.method6741(this.field5119);
        int var7 = this.field5116 - this.field5120 + var5;
        int var8 = this.field5117 - this.field5121 + var6 + var3;
        class499.method8572(this.field5116, this.field5117, this.field5118 + this.field5116, this.field5119 + this.field5117);
        int var9 = this.field5123;
        int var10 = this.field5124;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class384 var12 = arg0.method6699(0, var9);
        class384 var13 = arg0.method6699(var9, var10);
        class384 var14 = arg0.method6699(var10, arg0.method6622());
        class384 var15 = arg0.method6699(0, this.field5124);
        if (!var13.method6863()) {
            int var16 = arg1.field4441 + arg1.field4440;
            for (int var17 = 0; var17 < var13.method6864(); var17++) {
                class382 var18 = var13.method6865(var17);
                int var19 = var18.field4428 + var7;
                int var20 = arg1.method6760(var18.field4429);
                int var21 = var18.field4431 + var8 - var3;
                class499.method8603(var19, var21, var20, var16, this.field5128);
            }
        }
        if (!var12.method6863()) {
            arg1.method6773(var12, var7, var8, this.field5125, this.field5115, -1);
        }
        if (!var13.method6863()) {
            arg1.method6773(var13, var7, var8, this.field5127, this.field5115, -1);
        }
        if (!var14.method6863()) {
            arg1.method6773(var14, var7, var8, this.field5125, this.field5115, -1);
        }
        if (!this.field5126) {
            return;
        }
        class462 var22 = var15.method6862();
        int var23 = var7 + (Integer) var22.field4887;
        int var24 = var8 + (Integer) var22.field4888;
        int var25 = var24 - var4;
        class499.method8601(var23, var24, var23, var25, this.field5125);
        if (this.field5115 != -1) {
            class499.method8601(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5115);
        }
    }
}
