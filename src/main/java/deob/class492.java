package deob;

@ObfuscatedName("rj")
public class class492 {

    @ObfuscatedName("rj.w")
    public int field5069;

    @ObfuscatedName("rj.v")
    public int field5057;

    @ObfuscatedName("rj.s")
    public int field5059;

    @ObfuscatedName("rj.z")
    public int field5066;

    @ObfuscatedName("rj.j")
    public int field5060;

    @ObfuscatedName("rj.i")
    public int field5062;

    @ObfuscatedName("rj.n")
    public int field5058 = 0;

    @ObfuscatedName("rj.l")
    public int field5064 = 0;

    @ObfuscatedName("rj.k")
    public boolean field5065;

    @ObfuscatedName("rj.c")
    public int field5061;

    @ObfuscatedName("rj.r")
    public int field5067;

    @ObfuscatedName("rj.b")
    public int field5068;

    @ObfuscatedName("rj.m")
    public int field5063;

    @ObfuscatedName("rj.f(IIIIIIIIIIZB)V")
    public void method8539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field5069 = arg0;
        this.field5057 = arg1;
        this.field5059 = arg2;
        this.field5066 = arg3;
        this.field5060 = arg4;
        this.field5062 = arg5;
        this.field5058 = arg8;
        this.field5064 = arg9;
        this.field5065 = arg10;
    }

    @ObfuscatedName("rj.w(IIIII)V")
    public void method8534(int arg0, int arg1, int arg2, int arg3) {
        this.field5061 = arg0;
        this.field5067 = arg1;
        this.field5068 = arg2;
        this.field5063 = arg3;
    }

    @ObfuscatedName("rj.v(Lnp;Lnv;I)V")
    public void method8538(class373 arg0, class372 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4419;
        int var4 = Math.min(this.field5066, (int) ((float) var3 * 0.9F));
        int var5 = this.field5069 - this.field5060;
        int var6 = this.field5057 - this.field5062 + var3;
        class484.method8288(this.field5069, this.field5057, this.field5069 + this.field5059, this.field5066 + this.field5057);
        int var7 = this.field5064;
        int var8 = this.field5058;
        if (var7 > var8) {
            int var9 = var7;
            var7 = var8;
            var8 = var9;
        }
        class377 var10 = arg0.method6575(0, var7);
        class377 var11 = arg0.method6575(var7, var8);
        class377 var12 = arg0.method6575(var8, arg0.method6608());
        class377 var13 = arg0.method6575(0, this.field5058);
        if (!var11.method6726()) {
            int var14 = arg1.field4421 + arg1.field4420;
            for (int var15 = 0; var15 < var11.method6729(); var15++) {
                class375 var16 = var11.method6733(var15);
                int var17 = var16.field4409 + var5;
                int var18 = arg1.method6628(var16.field4412);
                int var19 = var16.field4411 + var6 - var3;
                class484.method8296(var17, var19, var18, var14, this.field5063);
            }
        }
        if (!var10.method6726()) {
            arg1.method6639(var10, var5, var6, this.field5061, this.field5067, -1);
        }
        if (!var11.method6726()) {
            arg1.method6639(var11, var5, var6, this.field5068, this.field5067, -1);
        }
        if (!var12.method6726()) {
            arg1.method6639(var12, var5, var6, this.field5061, this.field5067, -1);
        }
        if (!this.field5065) {
            return;
        }
        class448 var20 = var13.method6732();
        int var21 = var5 + (Integer) var20.field4833;
        int var22 = var6 + (Integer) var20.field4834;
        int var23 = var22 - var4;
        class484.method8306(var21, var22, var21, var23, this.field5061);
        if (this.field5067 != -1) {
            class484.method8306(var21 + 1, var22 + 1, var21 + 1, var23 + 1, this.field5067);
        }
    }
}
