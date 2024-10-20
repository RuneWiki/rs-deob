package deob;

@ObfuscatedName("vy")
public class class564 {

    @ObfuscatedName("vy.al")
    public int field5470;

    @ObfuscatedName("vy.aj")
    public int field5479;

    @ObfuscatedName("vy.az")
    public int field5472;

    @ObfuscatedName("vy.af")
    public int field5473;

    @ObfuscatedName("vy.aa")
    public int field5477;

    @ObfuscatedName("vy.at")
    public int field5475;

    @ObfuscatedName("vy.ab")
    public int field5476 = 0;

    @ObfuscatedName("vy.ac")
    public int field5480 = 0;

    @ObfuscatedName("vy.ao")
    public boolean field5471;

    @ObfuscatedName("vy.ah")
    public int field5478;

    @ObfuscatedName("vy.av")
    public int field5474;

    @ObfuscatedName("vy.aq")
    public int field5481;

    @ObfuscatedName("vy.ap")
    public int field5482;

    @ObfuscatedName("vy.ak(IIIIIIIIZI)V")
    public void method9374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5470 = arg0;
        this.field5479 = arg1;
        this.field5472 = arg2;
        this.field5473 = arg3;
        this.field5477 = arg4;
        this.field5475 = arg5;
        this.field5476 = arg6;
        this.field5480 = arg7;
        this.field5471 = arg8;
    }

    @ObfuscatedName("vy.al(IIIII)V")
    public void method9367(int arg0, int arg1, int arg2, int arg3) {
        this.field5478 = arg0;
        this.field5474 = arg1;
        this.field5481 = arg2;
        this.field5482 = arg3;
    }

    @ObfuscatedName("vy.aj(Lqw;Lqb;B)V")
    public void method9369(class432 arg0, class431 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4760;
        int var4 = Math.min(this.field5473, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method7353(this.field5472);
        int var6 = arg0.method7354(this.field5473);
        int var7 = this.field5470 - this.field5477 + var5;
        int var8 = this.field5479 - this.field5475 + var6 + var3;
        class556.method9104(this.field5470, this.field5479, this.field5472 + this.field5470, this.field5479 + this.field5473);
        int var9 = this.field5480;
        int var10 = this.field5476;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class436 var12 = arg0.method7334(0, var9);
        class436 var13 = arg0.method7334(var9, var10);
        class436 var14 = arg0.method7334(var10, arg0.method7376());
        class436 var15 = arg0.method7334(0, this.field5476);
        if (!var13.method7562()) {
            int var16 = arg1.field4764 + arg1.field4762;
            for (int var17 = 0; var17 < var13.method7563(); var17++) {
                class434 var18 = var13.method7567(var17);
                int var19 = var18.field4751 + var7;
                int var20 = arg1.method7459(var18.field4750);
                int var21 = var18.field4752 + var8 - var3;
                class556.method9112(var19, var21, var20, var16, this.field5482);
            }
        }
        if (!var12.method7562()) {
            arg1.method7471(var12, var7, var8, this.field5478, this.field5474, -1);
        }
        if (!var13.method7562()) {
            arg1.method7471(var13, var7, var8, this.field5481, this.field5474, -1);
        }
        if (!var14.method7562()) {
            arg1.method7471(var14, var7, var8, this.field5478, this.field5474, -1);
        }
        if (!this.field5471) {
            return;
        }
        class517 var22 = var15.method7566();
        int var23 = var7 + (Integer) var22.field5200;
        int var24 = var8 + (Integer) var22.field5199;
        int var25 = var24 - var4;
        class556.method9180(var23, var24, var23, var25, this.field5478);
        if (this.field5474 != -1) {
            class556.method9180(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5474);
        }
    }
}
