package deob;

@ObfuscatedName("tl")
public class class496 {

    @ObfuscatedName("tl.al")
    public int field5024;

    @ObfuscatedName("tl.ac")
    public int field5025;

    @ObfuscatedName("tl.ab")
    public int field5026;

    @ObfuscatedName("tl.an")
    public int field5027;

    @ObfuscatedName("tl.ao")
    public int field5036;

    @ObfuscatedName("tl.av")
    public int field5030;

    @ObfuscatedName("tl.aq")
    public int field5028 = 0;

    @ObfuscatedName("tl.ap")
    public int field5031 = 0;

    @ObfuscatedName("tl.ar")
    public boolean field5032;

    @ObfuscatedName("tl.ak")
    public int field5023;

    @ObfuscatedName("tl.ax")
    public int field5029;

    @ObfuscatedName("tl.as")
    public int field5035;

    @ObfuscatedName("tl.ay")
    public int field5033;

    @ObfuscatedName("tl.aj(IIIIIIIIZI)V")
    public void method8474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5024 = arg0;
        this.field5025 = arg1;
        this.field5026 = arg2;
        this.field5027 = arg3;
        this.field5036 = arg4;
        this.field5030 = arg5;
        this.field5028 = arg6;
        this.field5031 = arg7;
        this.field5032 = arg8;
    }

    @ObfuscatedName("tl.al(IIIII)V")
    public void method8468(int arg0, int arg1, int arg2, int arg3) {
        this.field5023 = arg0;
        this.field5029 = arg1;
        this.field5035 = arg2;
        this.field5033 = arg3;
    }

    @ObfuscatedName("tl.ac(Low;Loe;I)V")
    public void method8469(class376 arg0, class375 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4389;
        int var4 = Math.min(this.field5027, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6476(this.field5026);
        int var6 = arg0.method6440(this.field5027);
        int var7 = this.field5024 - this.field5036 + var5;
        int var8 = this.field5025 - this.field5030 + var6 + var3;
        class488.method8233(this.field5024, this.field5025, this.field5026 + this.field5024, this.field5027 + this.field5025);
        int var9 = this.field5031;
        int var10 = this.field5028;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class380 var12 = arg0.method6414(0, var9);
        class380 var13 = arg0.method6414(var9, var10);
        class380 var14 = arg0.method6414(var10, arg0.method6405());
        class380 var15 = arg0.method6414(0, this.field5028);
        if (!var13.method6645()) {
            int var16 = arg1.field4395 + arg1.field4391;
            for (int var17 = 0; var17 < var13.method6646(); var17++) {
                class378 var18 = var13.method6650(var17);
                int var19 = var18.field4380 + var7;
                int var20 = arg1.method6550(var18.field4381);
                int var21 = var18.field4379 + var8 - var3;
                class488.method8241(var19, var21, var20, var16, this.field5033);
            }
        }
        if (!var12.method6645()) {
            arg1.method6562(var12, var7, var8, this.field5023, this.field5029, -1);
        }
        if (!var13.method6645()) {
            arg1.method6562(var13, var7, var8, this.field5035, this.field5029, -1);
        }
        if (!var14.method6645()) {
            arg1.method6562(var14, var7, var8, this.field5023, this.field5029, -1);
        }
        if (!this.field5032) {
            return;
        }
        class452 var22 = var15.method6667();
        int var23 = var7 + (Integer) var22.field4799;
        int var24 = var8 + (Integer) var22.field4800;
        int var25 = var24 - var4;
        class488.method8250(var23, var24, var23, var25, this.field5023);
        if (this.field5029 != -1) {
            class488.method8250(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5029);
        }
    }
}
