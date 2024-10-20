package deob;

@ObfuscatedName("ie")
public class class254 extends class206 {

    @ObfuscatedName("ie.r")
    public static class201 field3393 = new class201(256);

    @ObfuscatedName("ie.h")
    public final int field3385;

    @ObfuscatedName("ie.d")
    public int field3386 = -1;

    @ObfuscatedName("ie.s")
    public int field3387 = -1;

    @ObfuscatedName("ie.b")
    public String field3391;

    @ObfuscatedName("ie.e")
    public int field3395;

    @ObfuscatedName("ie.f")
    public int field3390 = 0;

    @ObfuscatedName("ie.u")
    public String[] field3399 = new String[5];

    @ObfuscatedName("ie.p")
    public String field3394;

    @ObfuscatedName("ie.w")
    public int[] field3389;

    @ObfuscatedName("ie.t")
    public int field3401 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.o")
    public int field3388 = Integer.MAX_VALUE;

    @ObfuscatedName("ie.a")
    public int field3396 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.i")
    public int field3397 = Integer.MIN_VALUE;

    @ObfuscatedName("ie.m")
    public class269 field3398 = class269.field3632;

    @ObfuscatedName("ie.x")
    public class251 field3381 = class251.field3366;

    @ObfuscatedName("ie.l")
    public int[] field3400;

    @ObfuscatedName("ie.j")
    public byte[] field3382;

    @ObfuscatedName("ie.g")
    public int field3402 = -1;

    public class254(int arg0) {
        this.field3385 = arg0;
    }

    @ObfuscatedName("ie.n(Lgv;I)V")
    public void method4095(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4090(arg0, var2);
        }
    }

    @ObfuscatedName("ie.v(Lgv;II)V")
    public void method4090(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3386 = arg0.method3200();
        } else if (arg1 == 2) {
            this.field3387 = arg0.method3200();
        } else if (arg1 == 3) {
            this.field3391 = arg0.method3030();
        } else if (arg1 == 4) {
            this.field3395 = arg0.method3025();
        } else if (arg1 == 5) {
            arg0.method3025();
        } else if (arg1 == 6) {
            this.field3390 = arg0.method3021();
        } else if (arg1 == 7) {
            int var3 = arg0.method3021();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3021();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3399[arg1 - 10] = arg0.method3030();
        } else if (arg1 == 15) {
            int var4 = arg0.method3021();
            this.field3389 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3389[var5] = arg0.method3024();
            }
            arg0.method3026();
            int var6 = arg0.method3021();
            this.field3400 = new int[var6];
            for (int var7 = 0; var7 < this.field3400.length; var7++) {
                this.field3400[var7] = arg0.method3026();
            }
            this.field3382 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3382[var8] = arg0.method3022();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3394 = arg0.method3030();
            } else if (arg1 == 18) {
                arg0.method3200();
            } else if (arg1 == 19) {
                this.field3402 = arg0.method3015();
            } else if (arg1 == 21) {
                arg0.method3026();
            } else if (arg1 == 22) {
                arg0.method3026();
            } else if (arg1 == 23) {
                arg0.method3021();
                arg0.method3021();
                arg0.method3021();
            } else if (arg1 == 24) {
                arg0.method3024();
                arg0.method3024();
            } else if (arg1 == 25) {
                arg0.method3200();
            } else if (arg1 == 28) {
                arg0.method3021();
            } else if (arg1 == 29) {
                class269[] var9 = new class269[] { class269.field3632, class269.field3630, class269.field3629 };
                this.field3398 = (class269) class180.method455(var9, arg0.method3021());
            } else if (arg1 == 30) {
                this.field3381 = (class251) class180.method455(class251.method228(), arg0.method3021());
            }
        }
    }

    @ObfuscatedName("ie.y(I)V")
    public void method4091() {
        if (this.field3389 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3389.length; var1 += 2) {
            if (this.field3389[var1] < this.field3401) {
                this.field3401 = this.field3389[var1];
            } else if (this.field3389[var1] > this.field3396) {
                this.field3396 = this.field3389[var1];
            }
            if (this.field3389[var1 + 1] < this.field3388) {
                this.field3388 = this.field3389[var1 + 1];
            } else if (this.field3389[var1 + 1] > this.field3397) {
                this.field3397 = this.field3389[var1 + 1];
            }
        }
    }

    @ObfuscatedName("ie.r(ZI)Lkg;")
    public class299 method4092(boolean arg0) {
        int var2 = arg0 ? this.field3387 : this.field3386;
        return this.method4093(var2);
    }

    @ObfuscatedName("ie.h(IS)Lkg;")
    public class299 method4093(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class299 var2 = (class299) field3393.method3407((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class299 var3 = class300.method675(Statics.field3392, arg0, 0);
        if (var3 != null) {
            field3393.method3408(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("ie.d(I)I")
    public int method4094() {
        return this.field3385;
    }
}
