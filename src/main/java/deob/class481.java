package deob;

@ObfuscatedName("rc")
public class class481 {

    @ObfuscatedName("rc.f")
    public int field4987;

    @ObfuscatedName("rc.c")
    public int field4988;

    @ObfuscatedName("rc.x")
    public int field4998;

    @ObfuscatedName("rc.h")
    public int field4990;

    @ObfuscatedName("rc.j")
    public int field4986;

    @ObfuscatedName("rc.y")
    public int field4997;

    @ObfuscatedName("rc.d")
    public int field4993 = 0;

    @ObfuscatedName("rc.n")
    public int field4994 = 0;

    @ObfuscatedName("rc.r")
    public boolean field4991;

    @ObfuscatedName("rc.l")
    public int field4996;

    @ObfuscatedName("rc.s")
    public int field4989;

    @ObfuscatedName("rc.p")
    public int field4995;

    @ObfuscatedName("rc.b")
    public int field4999;

    @ObfuscatedName("rc.a(IIIIIIIIIIZI)V")
    public void method8278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field4987 = arg0;
        this.field4988 = arg1;
        this.field4998 = arg2;
        this.field4990 = arg3;
        this.field4986 = arg4;
        this.field4997 = arg5;
        this.field4993 = arg8;
        this.field4994 = arg9;
        this.field4991 = arg10;
    }

    @ObfuscatedName("rc.f(IIIII)V")
    public void method8279(int arg0, int arg1, int arg2, int arg3) {
        this.field4996 = arg0;
        this.field4989 = arg1;
        this.field4995 = arg2;
        this.field4999 = arg3;
    }

    @ObfuscatedName("rc.c(Lnz;Lnl;I)V")
    public void method8277(class366 arg0, class365 arg1) {
        if (arg1 == null) {
            return;
        }
        int var3 = arg1.field4355;
        int var4 = Math.min(this.field4990, (int) ((float) var3 * 0.9F));
        int var5 = this.field4987 - this.field4986;
        int var6 = this.field4988 - this.field4997 + var3;
        class473.method8015(this.field4987, this.field4988, this.field4998 + this.field4987, this.field4990 + this.field4988);
        int var7 = this.field4994;
        int var8 = this.field4993;
        if (var7 > var8) {
            int var9 = var7;
            var7 = var8;
            var8 = var9;
        }
        class370 var10 = arg0.method6311(0, var7);
        class370 var11 = arg0.method6311(var7, var8);
        class370 var12 = arg0.method6311(var8, arg0.method6363());
        class370 var13 = arg0.method6311(0, this.field4993);
        if (!var11.method6511()) {
            int var14 = arg1.field4357 + arg1.field4356;
            for (int var15 = 0; var15 < var11.method6512(); var15++) {
                class368 var16 = var11.method6528(var15);
                int var17 = var16.field4342 + var5;
                int var18 = arg1.method6480(var16.field4348);
                int var19 = var16.field4344 + var6 - var3;
                class473.method8022(var17, var19, var18, var14, this.field4999);
            }
        }
        if (!var10.method6511()) {
            arg1.method6425(var10, var5, var6, this.field4996, this.field4989, -1);
        }
        if (!var11.method6511()) {
            arg1.method6425(var11, var5, var6, this.field4995, this.field4989, -1);
        }
        if (!var12.method6511()) {
            arg1.method6425(var12, var5, var6, this.field4996, this.field4989, -1);
        }
        if (!this.field4991) {
            return;
        }
        class438 var20 = var13.method6515();
        int var21 = var5 + (Integer) var20.field4765;
        int var22 = var6 + (Integer) var20.field4766;
        int var23 = var22 - var4;
        class473.method8032(var21, var22, var21, var23, this.field4996);
        if (this.field4989 != -1) {
            class473.method8032(var21 + 1, var22 + 1, var21 + 1, var23 + 1, this.field4989);
        }
    }
}
