package deob;

@ObfuscatedName("rd")
public class class485 {

    @ObfuscatedName("rd.e")
    public int field5036;

    @ObfuscatedName("rd.v")
    public int field5044;

    @ObfuscatedName("rd.x")
    public int field5037;

    @ObfuscatedName("rd.m")
    public int field5038;

    @ObfuscatedName("rd.q")
    public int field5034;

    @ObfuscatedName("rd.f")
    public int field5041;

    @ObfuscatedName("rd.r")
    public int field5043 = 0;

    @ObfuscatedName("rd.u")
    public int field5040 = 0;

    @ObfuscatedName("rd.b")
    public boolean field5035;

    @ObfuscatedName("rd.j")
    public int field5039;

    @ObfuscatedName("rd.g")
    public int field5045;

    @ObfuscatedName("rd.i")
    public int field5046;

    @ObfuscatedName("rd.o")
    public int field5047;

    @ObfuscatedName("rd.h(IIIIIIIIIIZI)V")
    public void method8376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field5036 = arg0;
        this.field5044 = arg1;
        this.field5037 = arg2;
        this.field5038 = arg3;
        this.field5034 = arg4;
        this.field5041 = arg5;
        this.field5043 = arg8;
        this.field5040 = arg9;
        this.field5035 = arg10;
    }

    @ObfuscatedName("rd.e(IIIII)V")
    public void method8368(int arg0, int arg1, int arg2, int arg3) {
        this.field5039 = arg0;
        this.field5045 = arg1;
        this.field5046 = arg2;
        this.field5047 = arg3;
    }

    @ObfuscatedName("rd.v(Lnu;Lnv;B)V")
    public void method8367(class369 arg0, class368 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4408;
        int var4 = Math.min(this.field5038, (int) ((float) var3 * 0.9F));
        int var5 = this.field5036 - this.field5034;
        int var6 = this.field5044 - this.field5041 + var3;
        class477.method8112(this.field5036, this.field5044, this.field5037 + this.field5036, this.field5044 + this.field5038);
        int var7 = this.field5040;
        int var8 = this.field5043;
        if (var7 > var8) {
            int var9 = var7;
            var7 = var8;
            var8 = var9;
        }
        class373 var10 = arg0.method6456(0, var7);
        class373 var11 = arg0.method6456(var7, var8);
        class373 var12 = arg0.method6456(var8, arg0.method6405());
        class373 var13 = arg0.method6456(0, this.field5043);
        if (!var11.method6611()) {
            int var14 = arg1.field4418 + arg1.field4407;
            for (int var15 = 0; var15 < var11.method6629(); var15++) {
                class371 var16 = var11.method6616(var15);
                int var17 = var16.field4399 + var5;
                int var18 = arg1.method6519(var16.field4396);
                int var19 = var16.field4398 + var6 - var3;
                class477.method8120(var17, var19, var18, var14, this.field5047);
            }
        }
        if (!var10.method6611()) {
            arg1.method6530(var10, var5, var6, this.field5039, this.field5045, -1);
        }
        if (!var11.method6611()) {
            arg1.method6530(var11, var5, var6, this.field5046, this.field5045, -1);
        }
        if (!var12.method6611()) {
            arg1.method6530(var12, var5, var6, this.field5039, this.field5045, -1);
        }
        if (!this.field5035) {
            return;
        }
        class441 var20 = var13.method6615();
        int var21 = var5 + (Integer) var20.field4812;
        int var22 = var6 + (Integer) var20.field4810;
        int var23 = var22 - var4;
        class477.method8155(var21, var22, var21, var23, this.field5039);
        if (this.field5045 != -1) {
            class477.method8155(var21 + 1, var22 + 1, var21 + 1, var23 + 1, this.field5045);
        }
    }
}
