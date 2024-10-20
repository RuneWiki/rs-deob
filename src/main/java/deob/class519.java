package deob;

@ObfuscatedName("tw")
public class class519 {

    @ObfuscatedName("tw.an")
    public int field5150;

    @ObfuscatedName("tw.av")
    public int field5145;

    @ObfuscatedName("tw.as")
    public int field5143;

    @ObfuscatedName("tw.ax")
    public int field5144;

    @ObfuscatedName("tw.ap")
    public int field5151;

    @ObfuscatedName("tw.ab")
    public int field5146;

    @ObfuscatedName("tw.ak")
    public int field5147 = 0;

    @ObfuscatedName("tw.ae")
    public int field5153 = 0;

    @ObfuscatedName("tw.af")
    public boolean field5149;

    @ObfuscatedName("tw.ao")
    public int field5141;

    @ObfuscatedName("tw.aa")
    public int field5148;

    @ObfuscatedName("tw.aj")
    public int field5152;

    @ObfuscatedName("tw.ad")
    public int field5142;

    @ObfuscatedName("tw.at(IIIIIIIIZI)V")
    public void method8738(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5150 = arg0;
        this.field5145 = arg1;
        this.field5143 = arg2;
        this.field5144 = arg3;
        this.field5151 = arg4;
        this.field5146 = arg5;
        this.field5147 = arg6;
        this.field5153 = arg7;
        this.field5149 = arg8;
    }

    @ObfuscatedName("tw.an(IIIIB)V")
    public void method8746(int arg0, int arg1, int arg2, int arg3) {
        this.field5141 = arg0;
        this.field5148 = arg1;
        this.field5152 = arg2;
        this.field5142 = arg3;
    }

    @ObfuscatedName("tw.av(Lpk;Lph;I)V")
    public void method8744(class393 arg0, class392 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4447;
        int var4 = Math.min(this.field5144, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6650(this.field5143);
        int var6 = arg0.method6681(this.field5144);
        int var7 = this.field5150 - this.field5151 + var5;
        int var8 = this.field5145 - this.field5146 + var6 + var3;
        class511.method8523(this.field5150, this.field5145, this.field5150 + this.field5143, this.field5145 + this.field5144);
        int var9 = this.field5153;
        int var10 = this.field5147;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class397 var12 = arg0.method6631(0, var9);
        class397 var13 = arg0.method6631(var9, var10);
        class397 var14 = arg0.method6631(var10, arg0.method6622());
        class397 var15 = arg0.method6631(0, this.field5147);
        if (!var13.method6876()) {
            int var16 = arg1.field4454 + arg1.field4453;
            for (int var17 = 0; var17 < var13.method6894(); var17++) {
                class395 var18 = var13.method6881(var17);
                int var19 = var18.field4442 + var7;
                int var20 = arg1.method6774(var18.field4439);
                int var21 = var18.field4441 + var8 - var3;
                class511.method8468(var19, var21, var20, var16, this.field5142);
            }
        }
        if (!var12.method6876()) {
            arg1.method6787(var12, var7, var8, this.field5141, this.field5148, -1);
        }
        if (!var13.method6876()) {
            arg1.method6787(var13, var7, var8, this.field5152, this.field5148, -1);
        }
        if (!var14.method6876()) {
            arg1.method6787(var14, var7, var8, this.field5141, this.field5148, -1);
        }
        if (!this.field5149) {
            return;
        }
        class474 var22 = var15.method6886();
        int var23 = var7 + (Integer) var22.field4904;
        int var24 = var8 + (Integer) var22.field4905;
        int var25 = var24 - var4;
        class511.method8478(var23, var24, var23, var25, this.field5141);
        if (this.field5148 != -1) {
            class511.method8478(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5148);
        }
    }
}
