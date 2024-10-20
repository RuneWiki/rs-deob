package deob;

@ObfuscatedName("ci")
public class class60 {

    @ObfuscatedName("ci.az")
    public class42 field413;

    @ObfuscatedName("ci.ah")
    public boolean field416;

    @ObfuscatedName("ci.af")
    public int[] field414;

    @ObfuscatedName("ci.at")
    public int[] field412;

    @ObfuscatedName("ci.an")
    public boolean[] field415;

    public class60(class42 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
        this.field413 = arg0;
        this.field416 = arg1;
        this.field414 = arg2;
        this.field412 = arg3;
        this.field415 = arg4;
    }

    @ObfuscatedName("ci.az([FII)V")
    public void method1046(float[] arg0, int arg1) {
        int var3 = this.field413.field262.length;
        class42 var10000 = this.field413;
        int var4 = class42.field266[this.field413.field261 - 1];
        boolean[] var5 = this.field415;
        this.field415[1] = true;
        var5[0] = true;
        for (int var6 = 2; var6 < var3; var6++) {
            int var7 = this.field413.method743(this.field414, var6);
            int var8 = this.field413.method727(this.field414, var6);
            int var9 = this.field413.method732(this.field414[var7], this.field412[var7], this.field414[var8], this.field412[var8], this.field414[var6]);
            int var10 = this.field412[var6];
            int var11 = var4 - var9;
            int var13 = (var11 < var9 ? var11 : var9) << 1;
            if (var10 == 0) {
                this.field415[var6] = false;
                this.field412[var6] = var9;
            } else {
                boolean[] var14 = this.field415;
                this.field415[var8] = true;
                var14[var7] = true;
                this.field415[var6] = true;
                if (var10 >= var13) {
                    this.field412[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
                } else {
                    this.field412[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
                }
            }
        }
        this.method1048(0, var3 - 1);
        int var16 = 0;
        int var17 = this.field412[0] * this.field413.field261;
        for (int var18 = 1; var18 < var3; var18++) {
            if (this.field415[var18]) {
                int var19 = this.field414[var18];
                int var20 = this.field412[var18] * this.field413.field261;
                this.field413.method742(var16, var17, var19, var20, arg0, arg1);
                if (var19 >= arg1) {
                    return;
                }
                var16 = var19;
                var17 = var20;
            }
        }
        var10000 = this.field413;
        float var21 = class42.field260[var17];
        for (int var22 = var16; var22 < arg1; var22++) {
            arg0[var22] *= var21;
        }
    }

    @ObfuscatedName("ci.ah(I)Z")
    public boolean method1055() {
        return this.field416;
    }

    @ObfuscatedName("ci.af(III)V")
    public void method1048(int arg0, int arg1) {
        if (arg0 >= arg1) {
            return;
        }
        int var3 = arg0;
        int var4 = this.field414[arg0];
        int var5 = this.field412[arg0];
        boolean var6 = this.field415[arg0];
        for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
            int var8 = this.field414[var7];
            if (var8 < var4) {
                this.field414[var3] = var8;
                this.field412[var3] = this.field412[var7];
                this.field415[var3] = this.field415[var7];
                var3++;
                this.field414[var7] = this.field414[var3];
                this.field412[var7] = this.field412[var3];
                this.field415[var7] = this.field415[var3];
            }
        }
        this.field414[var3] = var4;
        this.field412[var3] = var5;
        this.field415[var3] = var6;
        this.method1048(arg0, var3 - 1);
        this.method1048(var3 + 1, arg1);
    }
}
