package deob;

@ObfuscatedName("vz")
public class class548 {

    @ObfuscatedName("vz.al")
    public int field5265;

    @ObfuscatedName("vz.ak")
    public int field5258;

    @ObfuscatedName("vz.ax")
    public int field5270;

    @ObfuscatedName("vz.ao")
    public int field5262;

    @ObfuscatedName("vz.ah")
    public int field5263;

    @ObfuscatedName("vz.ar")
    public int field5264;

    @ObfuscatedName("vz.ab")
    public int field5269 = 0;

    @ObfuscatedName("vz.am")
    public int field5266 = 0;

    @ObfuscatedName("vz.av")
    public boolean field5267;

    @ObfuscatedName("vz.ag")
    public int field5260;

    @ObfuscatedName("vz.aa")
    public int field5261;

    @ObfuscatedName("vz.ap")
    public int field5259;

    @ObfuscatedName("vz.ay")
    public int field5271;

    @ObfuscatedName("vz.ac(IIIIIIIIZI)V")
    public void method8968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field5265 = arg0;
        this.field5258 = arg1;
        this.field5270 = arg2;
        this.field5262 = arg3;
        this.field5263 = arg4;
        this.field5264 = arg5;
        this.field5269 = arg6;
        this.field5266 = arg7;
        this.field5267 = arg8;
    }

    @ObfuscatedName("vz.al(IIIII)V")
    public void method8972(int arg0, int arg1, int arg2, int arg3) {
        this.field5260 = arg0;
        this.field5261 = arg1;
        this.field5259 = arg2;
        this.field5271 = arg3;
    }

    @ObfuscatedName("vz.ak(Lpp;Lpu;B)V")
    public void method8969(class410 arg0, class409 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4536;
        int var4 = Math.min(this.field5262, (int) ((float) var3 * 0.9F));
        int var5 = arg0.method6829(this.field5270);
        int var6 = arg0.method6929(this.field5262);
        int var7 = this.field5265 - this.field5263 + var5;
        int var8 = this.field5258 - this.field5264 + var6 + var3;
        class540.method8694(this.field5265, this.field5258, this.field5270 + this.field5265, this.field5262 + this.field5258);
        int var9 = this.field5266;
        int var10 = this.field5269;
        if (var9 > var10) {
            int var11 = var9;
            var9 = var10;
            var10 = var11;
        }
        class414 var12 = arg0.method6883(0, var9);
        class414 var13 = arg0.method6883(var9, var10);
        class414 var14 = arg0.method6883(var10, arg0.method6801());
        class414 var15 = arg0.method6883(0, this.field5269);
        if (!var13.method7034()) {
            int var16 = arg1.field4543 + arg1.field4537;
            for (int var17 = 0; var17 < var13.method7036(); var17++) {
                class412 var18 = var13.method7039(var17);
                int var19 = var18.field4525 + var7;
                int var20 = arg1.method6947(var18.field4524);
                int var21 = var18.field4526 + var8 - var3;
                class540.method8758(var19, var21, var20, var16, this.field5271);
            }
        }
        if (!var12.method7034()) {
            arg1.method7029(var12, var7, var8, this.field5260, this.field5261, -1);
        }
        if (!var13.method7034()) {
            arg1.method7029(var13, var7, var8, this.field5259, this.field5261, -1);
        }
        if (!var14.method7034()) {
            arg1.method7029(var14, var7, var8, this.field5260, this.field5261, -1);
        }
        if (!this.field5267) {
            return;
        }
        class501 var22 = var15.method7038();
        int var23 = var7 + (Integer) var22.field5004;
        int var24 = var8 + (Integer) var22.field5005;
        int var25 = var24 - var4;
        class540.method8712(var23, var24, var23, var25, this.field5260);
        if (this.field5261 != -1) {
            class540.method8712(var23 + 1, var24 + 1, var23 + 1, var25 + 1, this.field5261);
        }
    }
}
