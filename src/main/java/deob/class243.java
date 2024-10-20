package deob;

@ObfuscatedName("id")
public class class243 extends class195 {

    @ObfuscatedName("id.o")
    public static class190 field3298 = new class190(256);

    @ObfuscatedName("id.g")
    public final int field3288;

    @ObfuscatedName("id.v")
    public int field3289 = -1;

    @ObfuscatedName("id.p")
    public int field3290 = -1;

    @ObfuscatedName("id.e")
    public String field3291;

    @ObfuscatedName("id.d")
    public int field3293;

    @ObfuscatedName("id.x")
    public int field3285 = 0;

    @ObfuscatedName("id.n")
    public String[] field3294 = new String[5];

    @ObfuscatedName("id.u")
    public String field3292;

    @ObfuscatedName("id.t")
    public int[] field3306;

    @ObfuscatedName("id.a")
    public int field3297 = Integer.MAX_VALUE;

    @ObfuscatedName("id.i")
    public int field3299 = Integer.MAX_VALUE;

    @ObfuscatedName("id.h")
    public int field3296 = Integer.MIN_VALUE;

    @ObfuscatedName("id.b")
    public int field3300 = Integer.MIN_VALUE;

    @ObfuscatedName("id.j")
    public class258 field3295 = class258.field3546;

    @ObfuscatedName("id.y")
    public class240 field3302 = class240.field3269;

    @ObfuscatedName("id.k")
    public int[] field3303;

    @ObfuscatedName("id.c")
    public byte[] field3287;

    @ObfuscatedName("id.r")
    public int field3305 = -1;

    public class243(int arg0) {
        this.field3288 = arg0;
    }

    @ObfuscatedName("id.w(Lfz;I)V")
    public void method4035(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4034(arg0, var2);
        }
    }

    @ObfuscatedName("id.s(Lfz;II)V")
    public void method4034(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3289 = arg0.method3015();
        } else if (arg1 == 2) {
            this.field3290 = arg0.method3015();
        } else if (arg1 == 3) {
            this.field3291 = arg0.method3111();
        } else if (arg1 == 4) {
            this.field3293 = arg0.method2975();
        } else if (arg1 == 5) {
            arg0.method2975();
        } else if (arg1 == 6) {
            this.field3285 = arg0.method2971();
        } else if (arg1 == 7) {
            int var3 = arg0.method2971();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2971();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3294[arg1 - 10] = arg0.method3111();
        } else if (arg1 == 15) {
            int var4 = arg0.method2971();
            this.field3306 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3306[var5] = arg0.method2974();
            }
            arg0.method3131();
            int var6 = arg0.method2971();
            this.field3303 = new int[var6];
            for (int var7 = 0; var7 < this.field3303.length; var7++) {
                this.field3303[var7] = arg0.method3131();
            }
            this.field3287 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3287[var8] = arg0.method2972();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3292 = arg0.method3111();
            } else if (arg1 == 18) {
                arg0.method3015();
            } else if (arg1 == 19) {
                this.field3305 = arg0.method3178();
            } else if (arg1 == 21) {
                arg0.method3131();
            } else if (arg1 == 22) {
                arg0.method3131();
            } else if (arg1 == 23) {
                arg0.method2971();
                arg0.method2971();
                arg0.method2971();
            } else if (arg1 == 24) {
                arg0.method2974();
                arg0.method2974();
            } else if (arg1 == 25) {
                arg0.method3015();
            } else if (arg1 == 28) {
                arg0.method2971();
            } else if (arg1 == 29) {
                this.field3295 = (class258) class169.method233(class258.method2941(), arg0.method2971());
            } else if (arg1 == 30) {
                this.field3302 = (class240) class169.method233(class240.method668(), arg0.method2971());
            }
        }
    }

    @ObfuscatedName("id.q(B)V")
    public void method4037() {
        if (this.field3306 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3306.length; var1 += 2) {
            if (this.field3306[var1] < this.field3297) {
                this.field3297 = this.field3306[var1];
            } else if (this.field3306[var1] > this.field3296) {
                this.field3296 = this.field3306[var1];
            }
            if (this.field3306[var1 + 1] < this.field3299) {
                this.field3299 = this.field3306[var1 + 1];
            } else if (this.field3306[var1 + 1] > this.field3300) {
                this.field3300 = this.field3306[var1 + 1];
            }
        }
    }

    @ObfuscatedName("id.o(ZI)Lky;")
    public class287 method4038(boolean arg0) {
        int var2 = arg0 ? this.field3290 : this.field3289;
        return this.method4050(var2);
    }

    @ObfuscatedName("id.g(II)Lky;")
    public class287 method4050(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class287 var2 = (class287) field3298.method3357((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class287 var3 = class288.method3863(Statics.field3301, arg0, 0);
        if (var3 != null) {
            field3298.method3371(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("id.v(B)I")
    public int method4051() {
        return this.field3288;
    }
}
