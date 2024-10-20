package deob;

@ObfuscatedName("uo")
public class class533 {

    @ObfuscatedName("uo.ae")
    public int field5245;

    @ObfuscatedName("uo.ao")
    public int field5233;

    @ObfuscatedName("uo.at")
    public int field5235;

    @ObfuscatedName("uo.ac")
    public int field5236;

    @ObfuscatedName("uo.ai")
    public int field5237;

    @ObfuscatedName("uo.az")
    public int field5238;

    @ObfuscatedName("uo.ap")
    public int field5234 = 0;

    @ObfuscatedName("uo.aa")
    public int field5240 = 0;

    @ObfuscatedName("uo.af")
    public boolean field5241;

    @ObfuscatedName("uo.ad")
    public int field5242;

    @ObfuscatedName("uo.aq")
    public int field5243;

    @ObfuscatedName("uo.al")
    public int field5244;

    @ObfuscatedName("uo.an")
    public int field5239;

    @ObfuscatedName("uo.au(IIIIIIIIZB)V")
    public void method8891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5245 = arg0;
        this.field5233 = arg1;
        this.field5235 = arg2;
        this.field5236 = arg3;
        this.field5237 = arg4;
        this.field5238 = arg5;
        this.field5234 = arg6;
        this.field5240 = arg7;
        this.field5241 = arg8;
    }

    @ObfuscatedName("uo.ae(IIIII)V")
    public void method8892(int arg0, int arg1, int arg2, int arg3) {
        this.field5242 = arg0;
        this.field5243 = arg1;
        this.field5244 = arg2;
        this.field5239 = arg3;
    }

    @ObfuscatedName("uo.ao(Lpj;Lpi;B)V")
    public void method8894(class395 arg0, class394 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4484;
        int var4 = Math.min(this.field5236, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6723(this.field5235);
        int var6 = arg0.method6724(this.field5236);
        int var7 = this.field5245 - this.field5237 + var5;
        int var8 = this.field5233 - this.field5238 + var6 + var3;
        class525.method8621(this.field5245, this.field5233, this.field5245 + this.field5235, this.field5236 + this.field5233);
        int var9 = this.field5240;
        int var10 = this.field5234;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class399 var12 = arg0.method6704(0, var9);
        class399 var13 = arg0.method6704(var9, var10);
        class399 var14 = arg0.method6704(var10, arg0.method6695());
        class399 var15 = arg0.method6704(0, this.field5234);
        if (!var13.method6950()) {
            int var16 = arg1.field4489 + arg1.field4488;
            for (int var17 = 0; var17 < var13.method6951(); var17++) {
                class397 var18 = var13.method6955(var17);
                int var19 = var18.field4476 + var7;
                int var20 = arg1.method6928(var18.field4477);
                int var21 = var18.field4479 + var8 - var3;
                class525.method8612(var19, var21, var20, var16, this.field5239);
            }
        }
        if (!var12.method6950()) {
            arg1.method6849(var12, var7, var8, this.field5242, this.field5243, -1);
        }
        if (!var13.method6950()) {
            arg1.method6849(var13, var7, var8, this.field5244, this.field5243, -1);
        }
        if (!var14.method6950()) {
            arg1.method6849(var14, var7, var8, this.field5242, this.field5243, -1);
        }
        if (!this.field5241) {
            return;
        }
        class486 var22 = var15.method6959();
        int var23 = var7 + (Integer) var22.field4967;
        int var24 = var8 + (Integer) var22.field4966;
        int var25 = var24 - var4;
        class525.method8614(var23, var24, var23, var25, this.field5242);
        if (this.field5243 != -1) {
            class525.method8614(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5243);
        }
    }
}
