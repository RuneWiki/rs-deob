package deob;

@ObfuscatedName("hn")
public class class187 extends class194 {

    @ObfuscatedName("hn.ab")
    public class426 field2078;

    @ObfuscatedName("hn.ay")
    public float[] field2077 = new float[3];

    public class187(class426 arg0) {
        this.field2078 = arg0;
    }

    @ObfuscatedName("hn.ab(Lhs;IIIIJ)V")
    public void method3526(class189 arg0, int arg1, int arg2, int arg3, int arg4, long arg5) {
        arg0.method3830(arg1, this.field2078, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("hn.ay(Lhf;Lhv;IIII)V")
    public void method3527(class186 arg0, class200 arg1, int arg2, int arg3, int arg4) {
        int var6;
        int var7 = var6 = arg3 << 7;
        int var8;
        int var9 = var8 = arg4 << 7;
        int var10;
        int var11 = var10 = var7 + 128;
        int var12;
        int var13 = var12 = var9 + 128;
        int var14 = arg0.field1992[arg2][arg3][arg4];
        int var15 = arg0.field1992[arg2][arg3 + 1][arg4];
        int var16 = arg0.field1992[arg2][arg3 + 1][arg4 + 1];
        int var17 = arg0.field1992[arg2][arg3][arg4 + 1];
        this.field2078.method7252((float) var7, (float) var14, (float) var9, this.field2077);
        int var18 = (int) this.field2077[0];
        int var19 = (int) this.field2077[1];
        int var20 = (int) this.field2077[2] | 0x1;
        this.field2078.method7252((float) var11, (float) var15, (float) var8, this.field2077);
        int var21 = (int) this.field2077[0];
        int var22 = (int) this.field2077[1];
        int var23 = (int) this.field2077[2] | 0x1;
        this.field2078.method7252((float) var10, (float) var16, (float) var13, this.field2077);
        int var24 = (int) this.field2077[0];
        int var25 = (int) this.field2077[1];
        int var26 = (int) this.field2077[2] | 0x1;
        this.field2078.method7252((float) var6, (float) var17, (float) var12, this.field2077);
        int var27 = (int) this.field2077[0];
        int var28 = (int) this.field2077[1];
        int var29 = (int) this.field2077[2] | 0x1;
        this.method3870(arg0, arg1, arg3, arg4, var18, var21, var24, var27, var19, var22, var25, var28, var20, var23, var26, var29);
    }

    @ObfuscatedName("hn.an(Lhf;Lhc;III)V")
    public void method3525(class186 arg0, class195 arg1, int arg2, int arg3) {
        int var5 = arg1.field2134.length;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg1.field2134[var6];
            int var8 = arg1.field2133[var6];
            int var9 = arg1.field2128[var6];
            this.field2078.method7252((float) var7, (float) var8, (float) var9, this.field2077);
            int var10 = (int) this.field2077[0];
            int var11 = (int) this.field2077[1];
            int var12 = (int) this.field2077[2];
            if (arg1.field2135 != null) {
                class195.field2144[var6] = var10;
                class195.field2145[var6] = var11;
                class195.field2129[var6] = var12;
            }
            int var13 = var12 | 0x1;
            class195.field2141[var6] = class181.method3438() + var10 * class181.method3447() / var13;
            class195.field2127[var6] = class181.method3512() + var11 * class181.method3447() / var13;
            class195.field2143[var6] = class196.method2694(var13);
        }
        this.method3871(arg0, arg1, arg2, arg3);
    }
}
