package deob;

@ObfuscatedName("ih")
public class class252 extends class185 {

    @ObfuscatedName("ih.j")
    public static class155 field3258 = new class155(256);

    @ObfuscatedName("ih.p")
    public final int field3245;

    @ObfuscatedName("ih.g")
    public int field3248 = -1;

    @ObfuscatedName("ih.n")
    public int field3246 = -1;

    @ObfuscatedName("ih.u")
    public String field3247;

    @ObfuscatedName("ih.a")
    public int field3252;

    @ObfuscatedName("ih.z")
    public int field3249 = 0;

    @ObfuscatedName("ih.y")
    public String[] field3250 = new String[5];

    @ObfuscatedName("ih.c")
    public String field3251;

    @ObfuscatedName("ih.h")
    public int[] field3244;

    @ObfuscatedName("ih.k")
    public int field3253 = Integer.MAX_VALUE;

    @ObfuscatedName("ih.r")
    public int field3243 = Integer.MAX_VALUE;

    @ObfuscatedName("ih.s")
    public int field3255 = Integer.MIN_VALUE;

    @ObfuscatedName("ih.v")
    public int field3256 = Integer.MIN_VALUE;

    @ObfuscatedName("ih.d")
    public class266 field3257 = class266.field3488;

    @ObfuscatedName("ih.e")
    public class249 field3241 = class249.field3226;

    @ObfuscatedName("ih.l")
    public int[] field3259;

    @ObfuscatedName("ih.t")
    public byte[] field3260;

    @ObfuscatedName("ih.x")
    public int field3261 = -1;

    public class252(int arg0) {
        this.field3245 = arg0;
    }

    @ObfuscatedName("client.m(II)Lih;")
    public static class252 method1412(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3328.length || Statics.field3328[arg0] == null ? new class252(arg0) : Statics.field3328[arg0];
    }

    @ObfuscatedName("ih.o(Lkn;B)V")
    public void method4122(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4116(arg0, var2);
        }
    }

    @ObfuscatedName("ih.q(Lkn;II)V")
    public void method4116(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3248 = arg0.method5353();
        } else if (arg1 == 2) {
            this.field3246 = arg0.method5353();
        } else if (arg1 == 3) {
            this.field3247 = arg0.method5236();
        } else if (arg1 == 4) {
            this.field3252 = arg0.method5231();
        } else if (arg1 == 5) {
            arg0.method5231();
        } else if (arg1 == 6) {
            this.field3249 = arg0.method5227();
        } else if (arg1 == 7) {
            int var3 = arg0.method5227();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5227();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3250[arg1 - 10] = arg0.method5236();
        } else if (arg1 == 15) {
            int var4 = arg0.method5227();
            this.field3244 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3244[var5] = arg0.method5241();
            }
            arg0.method5209();
            int var6 = arg0.method5227();
            this.field3259 = new int[var6];
            for (int var7 = 0; var7 < this.field3259.length; var7++) {
                this.field3259[var7] = arg0.method5209();
            }
            this.field3260 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3260[var8] = arg0.method5228();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3251 = arg0.method5236();
            } else if (arg1 == 18) {
                arg0.method5353();
            } else if (arg1 == 19) {
                this.field3261 = arg0.method5283();
            } else if (arg1 == 21) {
                arg0.method5209();
            } else if (arg1 == 22) {
                arg0.method5209();
            } else if (arg1 == 23) {
                arg0.method5227();
                arg0.method5227();
                arg0.method5227();
            } else if (arg1 == 24) {
                arg0.method5241();
                arg0.method5241();
            } else if (arg1 == 25) {
                arg0.method5353();
            } else if (arg1 == 28) {
                arg0.method5227();
            } else if (arg1 == 29) {
                this.field3257 = (class266) class205.method3095(class266.method178(), arg0.method5227());
            } else if (arg1 == 30) {
                this.field3241 = (class249) class205.method3095(class249.method3703(), arg0.method5227());
            }
        }
    }

    @ObfuscatedName("ih.j(B)V")
    public void method4117() {
        if (this.field3244 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3244.length; var1 += 2) {
            if (this.field3244[var1] < this.field3253) {
                this.field3253 = this.field3244[var1];
            } else if (this.field3244[var1] > this.field3255) {
                this.field3255 = this.field3244[var1];
            }
            if (this.field3244[var1 + 1] < this.field3243) {
                this.field3243 = this.field3244[var1 + 1];
            } else if (this.field3244[var1 + 1] > this.field3256) {
                this.field3256 = this.field3244[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ih.p(ZI)Llz;")
    public class335 method4132(boolean arg0) {
        int var2 = arg0 ? this.field3246 : this.field3248;
        return this.method4118(var2);
    }

    @ObfuscatedName("ih.g(II)Llz;")
    public class335 method4118(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class335 var2 = (class335) field3258.method3127((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class335 var3 = class336.method837(Statics.field3254, arg0, 0);
        if (var3 != null) {
            field3258.method3137(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ih.n(I)I")
    public int method4120() {
        return this.field3245;
    }
}
