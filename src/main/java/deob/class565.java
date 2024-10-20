package deob;

@ObfuscatedName("vn")
public class class565 {

    @ObfuscatedName("vn.ad")
    public int field5494;

    @ObfuscatedName("vn.ag")
    public int field5489;

    @ObfuscatedName("vn.ak")
    public int field5488;

    @ObfuscatedName("vn.ap")
    public int field5491;

    @ObfuscatedName("vn.an")
    public int field5492;

    @ObfuscatedName("vn.aj")
    public int field5487;

    @ObfuscatedName("vn.av")
    public int field5495 = 0;

    @ObfuscatedName("vn.ab")
    public int field5493 = 0;

    @ObfuscatedName("vn.ai")
    public boolean field5490;

    @ObfuscatedName("vn.ae")
    public int field5497;

    @ObfuscatedName("vn.au")
    public int field5496;

    @ObfuscatedName("vn.ah")
    public int field5498;

    @ObfuscatedName("vn.az")
    public int field5500;

    @ObfuscatedName("vn.aq(IIIIIIIIZI)V")
    public void method9322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5494 = arg0;
        this.field5489 = arg1;
        this.field5488 = arg2;
        this.field5491 = arg3;
        this.field5492 = arg4;
        this.field5487 = arg5;
        this.field5495 = arg6;
        this.field5493 = arg7;
        this.field5490 = arg8;
    }

    @ObfuscatedName("vn.ad(IIIII)V")
    public void method9333(int arg0, int arg1, int arg2, int arg3) {
        this.field5497 = arg0;
        this.field5496 = arg1;
        this.field5498 = arg2;
        this.field5500 = arg3;
    }

    @ObfuscatedName("vn.ag(Lql;Lqh;I)V")
    public void method9324(class433 arg0, class432 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4768;
        int var4 = Math.min(this.field5491, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method7404(this.field5488);
        int var6 = arg0.method7273(this.field5491);
        int var7 = this.field5494 - this.field5492 + var5;
        int var8 = this.field5489 - this.field5487 + var6 + var3;
        class557.method9105(this.field5494, this.field5489, this.field5494 + this.field5488, this.field5491 + this.field5489);
        int var9 = this.field5493;
        int var10 = this.field5495;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class437 var12 = arg0.method7277(0, var9);
        class437 var13 = arg0.method7277(var9, var10);
        class437 var14 = arg0.method7277(var10, arg0.method7329());
        class437 var15 = arg0.method7277(0, this.field5495);
        if (!var13.method7534()) {
            int var16 = arg1.field4777 + arg1.field4776;
            for (int var17 = 0; var17 < var13.method7535(); var17++) {
                class435 var18 = var13.method7543(var17);
                int var19 = var18.field4767 + var7;
                int var20 = arg1.method7512(var18.field4764);
                int var21 = var18.field4765 + var8 - var3;
                class557.method9060(var19, var21, var20, var16, this.field5500);
            }
        }
        if (!var12.method7534()) {
            arg1.method7438(var12, var7, var8, this.field5497, this.field5496, -1);
        }
        if (!var13.method7534()) {
            arg1.method7438(var13, var7, var8, this.field5498, this.field5496, -1);
        }
        if (!var14.method7534()) {
            arg1.method7438(var14, var7, var8, this.field5497, this.field5496, -1);
        }
        if (!this.field5490) {
            return;
        }
        class518 var22 = var15.method7538();
        int var23 = var7 + (Integer) var22.field5226;
        int var24 = var8 + (Integer) var22.field5223;
        int var25 = var24 - var4;
        class557.method9070(var23, var24, var23, var25, this.field5497);
        if (this.field5496 != -1) {
            class557.method9070(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5496);
        }
    }
}
