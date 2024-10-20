package deob;

@ObfuscatedName("ij")
public class class242 extends class176 {

    @ObfuscatedName("ij.u")
    public static class146 field3191 = new class146(256);

    @ObfuscatedName("ij.r")
    public final int field3207;

    @ObfuscatedName("ij.p")
    public int field3193 = -1;

    @ObfuscatedName("ij.q")
    public int field3192 = -1;

    @ObfuscatedName("ij.m")
    public String field3188;

    @ObfuscatedName("ij.y")
    public int field3196;

    @ObfuscatedName("ij.i")
    public int field3209 = 0;

    @ObfuscatedName("ij.b")
    public String[] field3198 = new String[5];

    @ObfuscatedName("ij.o")
    public String field3200;

    @ObfuscatedName("ij.a")
    public int[] field3190;

    @ObfuscatedName("ij.e")
    public int field3201 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.w")
    public int field3199 = Integer.MAX_VALUE;

    @ObfuscatedName("ij.t")
    public int field3203 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.g")
    public int field3204 = Integer.MIN_VALUE;

    @ObfuscatedName("ij.x")
    public class256 field3205 = class256.field3444;

    @ObfuscatedName("ij.h")
    public class239 field3206 = class239.field3172;

    @ObfuscatedName("ij.s")
    public int[] field3195;

    @ObfuscatedName("ij.f")
    public byte[] field3208;

    @ObfuscatedName("ij.j")
    public int field3194 = -1;

    public class242(int arg0) {
        this.field3207 = arg0;
    }

    @ObfuscatedName("dr.z(II)Lij;")
    public static class242 method2284(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3189.length || Statics.field3189[arg0] == null ? new class242(arg0) : Statics.field3189[arg0];
    }

    @ObfuscatedName("ij.n(Lkl;I)V")
    public void method3951(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method3945(arg0, var2);
        }
    }

    @ObfuscatedName("ij.v(Lkl;II)V")
    public void method3945(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3193 = arg0.method5001();
        } else if (arg1 == 2) {
            this.field3192 = arg0.method5001();
        } else if (arg1 == 3) {
            this.field3188 = arg0.method4999();
        } else if (arg1 == 4) {
            this.field3196 = arg0.method4994();
        } else if (arg1 == 5) {
            arg0.method4994();
        } else if (arg1 == 6) {
            this.field3209 = arg0.method4990();
        } else if (arg1 == 7) {
            int var3 = arg0.method4990();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method4990();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3198[arg1 - 10] = arg0.method4999();
        } else if (arg1 == 15) {
            int var4 = arg0.method4990();
            this.field3190 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3190[var5] = arg0.method4993();
            }
            arg0.method5085();
            int var6 = arg0.method4990();
            this.field3195 = new int[var6];
            for (int var7 = 0; var7 < this.field3195.length; var7++) {
                this.field3195[var7] = arg0.method5085();
            }
            this.field3208 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3208[var8] = arg0.method5002();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3200 = arg0.method4999();
            } else if (arg1 == 18) {
                arg0.method5001();
            } else if (arg1 == 19) {
                this.field3194 = arg0.method4992();
            } else if (arg1 == 21) {
                arg0.method5085();
            } else if (arg1 == 22) {
                arg0.method5085();
            } else if (arg1 == 23) {
                arg0.method4990();
                arg0.method4990();
                arg0.method4990();
            } else if (arg1 == 24) {
                arg0.method4993();
                arg0.method4993();
            } else if (arg1 == 25) {
                arg0.method5001();
            } else if (arg1 == 28) {
                arg0.method4990();
            } else if (arg1 == 29) {
                this.field3205 = (class256) class196.method3185(class256.method3634(), arg0.method4990());
            } else if (arg1 == 30) {
                class239[] var9 = new class239[] { class239.field3173, class239.field3171, class239.field3172 };
                this.field3206 = (class239) class196.method3185(var9, arg0.method4990());
            }
        }
    }

    @ObfuscatedName("ij.u(B)V")
    public void method3946() {
        if (this.field3190 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3190.length; var1 += 2) {
            if (this.field3190[var1] < this.field3201) {
                this.field3201 = this.field3190[var1];
            } else if (this.field3190[var1] > this.field3203) {
                this.field3203 = this.field3190[var1];
            }
            if (this.field3190[var1 + 1] < this.field3199) {
                this.field3199 = this.field3190[var1 + 1];
            } else if (this.field3190[var1 + 1] > this.field3204) {
                this.field3204 = this.field3190[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ij.r(ZB)Llf;")
    public class325 method3947(boolean arg0) {
        int var2 = arg0 ? this.field3192 : this.field3193;
        return this.method3948(var2);
    }

    @ObfuscatedName("ij.p(II)Llf;")
    public class325 method3948(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class325 var2 = (class325) field3191.method2992((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class325 var3 = class326.method4283(Statics.field3197, arg0, 0);
        if (var3 != null) {
            field3191.method2994(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ij.q(I)I")
    public int method3949() {
        return this.field3207;
    }
}
