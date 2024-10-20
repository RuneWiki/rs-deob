package deob;

@ObfuscatedName("ve")
public class class567 {

    @ObfuscatedName("ve.ay")
    public int field5505;

    @ObfuscatedName("ve.an")
    public int field5514;

    @ObfuscatedName("ve.au")
    public int field5507;

    @ObfuscatedName("ve.ax")
    public int field5508;

    @ObfuscatedName("ve.ao")
    public int field5509;

    @ObfuscatedName("ve.am")
    public int field5510;

    @ObfuscatedName("ve.ac")
    public int field5511 = 0;

    @ObfuscatedName("ve.ae")
    public int field5504 = 0;

    @ObfuscatedName("ve.ad")
    public boolean field5513;

    @ObfuscatedName("ve.aq")
    public int field5517;

    @ObfuscatedName("ve.al")
    public int field5515;

    @ObfuscatedName("ve.aj")
    public int field5516;

    @ObfuscatedName("ve.as")
    public int field5512;

    @ObfuscatedName("ve.ab(IIIIIIIIZB)V")
    public void method9411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5505 = arg0;
        this.field5514 = arg1;
        this.field5507 = arg2;
        this.field5508 = arg3;
        this.field5509 = arg4;
        this.field5510 = arg5;
        this.field5511 = arg6;
        this.field5504 = arg7;
        this.field5513 = arg8;
    }

    @ObfuscatedName("ve.ay(IIIII)V")
    public void method9412(int arg0, int arg1, int arg2, int arg3) {
        this.field5517 = arg0;
        this.field5515 = arg1;
        this.field5516 = arg2;
        this.field5512 = arg3;
    }

    @ObfuscatedName("ve.an(Lqd;Lqe;I)V")
    public void method9416(class434 arg0, class433 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4756;
        int var4 = Math.min(this.field5508, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method7457(this.field5507);
        int var6 = arg0.method7441(this.field5508);
        int var7 = this.field5505 - this.field5509 + var5;
        int var8 = this.field5514 - this.field5510 + var6 + var3;
        class559.method9119(this.field5505, this.field5514, this.field5507 + this.field5505, this.field5514 + this.field5508);
        int var9 = this.field5504;
        int var10 = this.field5511;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class438 var12 = arg0.method7471(0, var9);
        class438 var13 = arg0.method7471(var9, var10);
        class438 var14 = arg0.method7471(var10, arg0.method7393());
        class438 var15 = arg0.method7471(0, this.field5511);
        if (!var13.method7655()) {
            int var16 = arg1.field4767 + arg1.field4758;
            for (int var17 = 0; var17 < var13.method7636(); var17++) {
                class436 var18 = var13.method7640(var17);
                int var19 = var18.field4745 + var7;
                int var20 = arg1.method7579(var18.field4748);
                int var21 = var18.field4747 + var8 - var3;
                class559.method9145(var19, var21, var20, var16, this.field5512);
            }
        }
        if (!var12.method7655()) {
            arg1.method7540(var12, var7, var8, this.field5517, this.field5515, -1);
        }
        if (!var13.method7655()) {
            arg1.method7540(var13, var7, var8, this.field5516, this.field5515, -1);
        }
        if (!var14.method7655()) {
            arg1.method7540(var14, var7, var8, this.field5517, this.field5515, -1);
        }
        if (!this.field5513) {
            return;
        }
        class519 var22 = var15.method7635();
        int var23 = var7 + (Integer) var22.field5230;
        int var24 = var8 + (Integer) var22.field5228;
        int var25 = var24 - var4;
        class559.method9133(var23, var24, var23, var25, this.field5517);
        if (this.field5515 != -1) {
            class559.method9133(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5515);
        }
    }
}
