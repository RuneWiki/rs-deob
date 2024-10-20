package deob;

@ObfuscatedName("jk")
public class class254 extends class261 {

    @ObfuscatedName("jk.ak")
    public class424 field2791;

    @ObfuscatedName("jk.al")
    public float[] field2794 = new float[3];

    public class254(class424 arg0) {
        this.field2791 = arg0;
    }

    @ObfuscatedName("jk.ak(Lju;IIIIJ)V")
    public void method4415(class256 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method4737(arg1, this.field2791, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("jk.al(Ljy;Lkg;IIIB)V")
    public void method4414(class253 arg0, class267 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = arg3 << 7;
        int var8;
        int var9 = var8 = arg4 << 7;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field2733[arg2][arg3][arg4];
        int var15 = arg0.field2733[arg2][arg3 + 1][arg4];
        int var16 = arg0.field2733[arg2][arg3 + 1][arg4 + 1];
        int var17 = arg0.field2733[arg2][arg3][arg4 + 1];
        this.field2791.method7193((float) var7, (float) var14, (float) var9, this.field2794);
        int var18 = (int) this.field2794[0];
        int var19 = (int) this.field2794[1];
        int var20 = (int) this.field2794[2] | 0x1;
        this.field2791.method7193((float) var11, (float) var15, (float) var8, this.field2794);
        int var21 = (int) this.field2794[0];
        int var22 = (int) this.field2794[1];
        int var23 = (int) this.field2794[2] | 0x1;
        this.field2791.method7193((float) var10, (float) var16, (float) var13, this.field2794);
        int var24 = (int) this.field2794[0];
        int var25 = (int) this.field2794[1];
        int var26 = (int) this.field2794[2] | 0x1;
        this.field2791.method7193((float) var6, (float) var17, (float) var12, this.field2794);
        int var27 = (int) this.field2794[0];
        int var28 = (int) this.field2794[1];
        int var29 = (int) this.field2794[2] | 0x1;
        this.method4780(arg0, arg1, arg3, arg4, var18, var21, var24, var27, var19, var22, var25, var28, var20, var23, var26, var29);
    }

    @ObfuscatedName("jk.aj(Ljy;Lke;IIB)V")
    public void method4424(class253 arg0, class262 arg1, int arg2, int arg3) {
        int var5 = arg1.field2842.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2842[var6];
            int var8 = arg1.field2854[var6];
            int var9 = arg1.field2847[var6];
            this.field2791.method7193((float) var7, (float) var8, (float) var9, this.field2794);
            int var10 = (int) this.field2794[0];
            int var11 = (int) this.field2794[1];
            int var12 = (int) this.field2794[2];
            if (arg1.field2850 != null) {
                class262.field2859[var6] = var10;
                class262.field2860[var6] = var11;
                class262.field2861[var6] = var12;
            }
            int var13 = var12 | 0x1;
            class262.field2856[var6] = class248.method4352() + var10 * class248.method4339() / var13;
            class262.field2857[var6] = class248.method4335() + var11 * class248.method4339() / var13;
            class262.field2858[var6] = class263.method3305(var13);
        }
        this.method4783(arg0, arg1, arg2, arg3);
    }
}
