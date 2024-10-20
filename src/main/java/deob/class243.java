package deob;

@ObfuscatedName("in")
public class class243 extends class195 {

    @ObfuscatedName("in.j")
    public static class190 field3296 = new class190(256);

    @ObfuscatedName("in.f")
    public final int field3308;

    @ObfuscatedName("in.m")
    public int field3298 = -1;

    @ObfuscatedName("in.c")
    public int field3297 = -1;

    @ObfuscatedName("in.z")
    public String field3295;

    @ObfuscatedName("in.h")
    public int field3301;

    @ObfuscatedName("in.g")
    public int field3302 = 0;

    @ObfuscatedName("in.o")
    public String[] field3303 = new String[5];

    @ObfuscatedName("in.x")
    public String field3304;

    @ObfuscatedName("in.a")
    public int[] field3305;

    @ObfuscatedName("in.y")
    public int field3306 = Integer.MAX_VALUE;

    @ObfuscatedName("in.r")
    public int field3307 = Integer.MAX_VALUE;

    @ObfuscatedName("in.b")
    public int field3300 = Integer.MIN_VALUE;

    @ObfuscatedName("in.s")
    public int field3309 = Integer.MIN_VALUE;

    @ObfuscatedName("in.v")
    public class258 field3310 = class258.field3556;

    @ObfuscatedName("in.t")
    public class240 field3311 = class240.field3275;

    @ObfuscatedName("in.w")
    public int[] field3312;

    @ObfuscatedName("in.l")
    public byte[] field3313;

    @ObfuscatedName("in.q")
    public int field3314 = -1;

    public class243(int arg0) {
        this.field3308 = arg0;
    }

    @ObfuscatedName("in.n(Lfl;I)V")
    public void method4000(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4001(arg0, var2);
        }
    }

    @ObfuscatedName("in.p(Lfl;II)V")
    public void method4001(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3298 = arg0.method3100();
        } else if (arg1 == 2) {
            this.field3297 = arg0.method3100();
        } else if (arg1 == 3) {
            this.field3295 = arg0.method3098();
        } else if (arg1 == 4) {
            this.field3301 = arg0.method2910();
        } else if (arg1 == 5) {
            arg0.method2910();
        } else if (arg1 == 6) {
            this.field3302 = arg0.method2925();
        } else if (arg1 == 7) {
            int var3 = arg0.method2925();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method2925();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3303[arg1 - 10] = arg0.method3098();
        } else if (arg1 == 15) {
            int var4 = arg0.method2925();
            this.field3305 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3305[var5] = arg0.method2924();
            }
            arg0.method3058();
            int var6 = arg0.method2925();
            this.field3312 = new int[var6];
            for (int var7 = 0; var7 < this.field3312.length; var7++) {
                this.field3312[var7] = arg0.method3058();
            }
            this.field3313 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3313[var8] = arg0.method2922();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3304 = arg0.method3098();
            } else if (arg1 == 18) {
                arg0.method3100();
            } else if (arg1 == 19) {
                this.field3314 = arg0.method3065();
            } else if (arg1 == 21) {
                arg0.method3058();
            } else if (arg1 == 22) {
                arg0.method3058();
            } else if (arg1 == 23) {
                arg0.method2925();
                arg0.method2925();
                arg0.method2925();
            } else if (arg1 == 24) {
                arg0.method2924();
                arg0.method2924();
            } else if (arg1 == 25) {
                arg0.method3100();
            } else if (arg1 == 28) {
                arg0.method2925();
            } else if (arg1 == 29) {
                this.field3310 = (class258) class169.method1611(class258.method879(), arg0.method2925());
            } else if (arg1 == 30) {
                this.field3311 = (class240) class169.method1611(class240.method972(), arg0.method2925());
            }
        }
    }

    @ObfuscatedName("in.i(I)V")
    public void method4002() {
        if (this.field3305 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3305.length; var1 += 2) {
            if (this.field3305[var1] < this.field3306) {
                this.field3306 = this.field3305[var1];
            } else if (this.field3305[var1] > this.field3300) {
                this.field3300 = this.field3305[var1];
            }
            if (this.field3305[var1 + 1] < this.field3307) {
                this.field3307 = this.field3305[var1 + 1];
            } else if (this.field3305[var1 + 1] > this.field3309) {
                this.field3309 = this.field3305[var1 + 1];
            }
        }
    }

    @ObfuscatedName("in.j(ZI)Ljp;")
    public class286 method4015(boolean arg0) {
        int var2 = arg0 ? this.field3297 : this.field3298;
        return this.method4004(var2);
    }

    @ObfuscatedName("in.f(IS)Ljp;")
    public class286 method4004(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class286 var2 = (class286) field3296.method3280((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class286 var3 = class287.method2679(Statics.field3299, arg0, 0);
        if (var3 != null) {
            field3296.method3282(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("in.m(S)I")
    public int method4017() {
        return this.field3308;
    }
}
