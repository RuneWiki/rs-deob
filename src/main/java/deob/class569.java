package deob;

@ObfuscatedName("vx")
public class class569 {

    @ObfuscatedName("vx.ae")
    public int field5535;

    @ObfuscatedName("vx.ag")
    public int field5536;

    @ObfuscatedName("vx.am")
    public int field5546;

    @ObfuscatedName("vx.ax")
    public int field5538;

    @ObfuscatedName("vx.aq")
    public int field5539;

    @ObfuscatedName("vx.af")
    public int field5540;

    @ObfuscatedName("vx.at")
    public int field5541 = 0;

    @ObfuscatedName("vx.au")
    public int field5534 = 0;

    @ObfuscatedName("vx.ar")
    public boolean field5543;

    @ObfuscatedName("vx.al")
    public int field5542;

    @ObfuscatedName("vx.ad")
    public int field5545;

    @ObfuscatedName("vx.ah")
    public int field5544;

    @ObfuscatedName("vx.ap")
    public int field5547;

    @ObfuscatedName("vx.ac(IIIIIIIIZI)V")
    public void method9555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5535 = arg0;
        this.field5536 = arg1;
        this.field5546 = arg2;
        this.field5538 = arg3;
        this.field5539 = arg4;
        this.field5540 = arg5;
        this.field5541 = arg6;
        this.field5534 = arg7;
        this.field5543 = arg8;
    }

    @ObfuscatedName("vx.ae(IIIIB)V")
    public void method9556(int arg0, int arg1, int arg2, int arg3) {
        this.field5542 = arg0;
        this.field5545 = arg1;
        this.field5544 = arg2;
        this.field5547 = arg3;
    }

    @ObfuscatedName("vx.ag(Lqn;Lqu;B)V")
    public void method9557(class436 arg0, class435 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4804;
        int var4 = Math.min(this.field5538, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method7542(this.field5546);
        int var6 = arg0.method7543(this.field5538);
        int var7 = this.field5535 - this.field5539 + var5;
        int var8 = this.field5536 - this.field5540 + var6 + var3;
        class561.method9294(this.field5535, this.field5536, this.field5546 + this.field5535, this.field5538 + this.field5536);
        int var9 = this.field5534;
        int var10 = this.field5541;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class440 var12 = arg0.method7523(0, var9);
        class440 var13 = arg0.method7523(var9, var10);
        class440 var14 = arg0.method7523(var10, arg0.method7577());
        class440 var15 = arg0.method7523(0, this.field5541);
        if (!var13.method7773()) {
            int var16 = arg1.field4806 + arg1.field4805;
            for (int var17 = 0; var17 < var13.method7787(); var17++) {
                class438 var18 = var13.method7772(var17);
                int var19 = var18.field4794 + var7;
                int var20 = arg1.method7655(var18.field4795);
                int var21 = var18.field4796 + var8 - var3;
                class561.method9302(var19, var21, var20, var16, this.field5547);
            }
        }
        if (!var12.method7773()) {
            arg1.method7654(var12, var7, var8, this.field5542, this.field5545, -1);
        }
        if (!var13.method7773()) {
            arg1.method7654(var13, var7, var8, this.field5544, this.field5545, -1);
        }
        if (!var14.method7773()) {
            arg1.method7654(var14, var7, var8, this.field5542, this.field5545, -1);
        }
        if (!this.field5543) {
            return;
        }
        class521 var22 = var15.method7776();
        int var23 = var7 + (Integer) var22.field5265;
        int var24 = var8 + (Integer) var22.field5266;
        int var25 = var24 - var4;
        class561.method9363(var23, var24, var23, var25, this.field5542);
        if (this.field5545 != -1) {
            class561.method9363(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5545);
        }
    }
}
