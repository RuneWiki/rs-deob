package deob;

@ObfuscatedName("in")
public class class256 extends class207 {

    @ObfuscatedName("in.b")
    public static class201 field3259 = new class201(256);

    @ObfuscatedName("in.f")
    public final int field3262;

    @ObfuscatedName("in.n")
    public int field3261 = -1;

    @ObfuscatedName("in.h")
    public int field3260 = -1;

    @ObfuscatedName("in.x")
    public String field3263;

    @ObfuscatedName("in.j")
    public int field3264;

    @ObfuscatedName("in.a")
    public int field3277 = 0;

    @ObfuscatedName("in.d")
    public String[] field3267 = new String[5];

    @ObfuscatedName("in.s")
    public String field3271;

    @ObfuscatedName("in.p")
    public int[] field3256;

    @ObfuscatedName("in.g")
    public int field3270 = Integer.MAX_VALUE;

    @ObfuscatedName("in.y")
    public int field3269 = Integer.MAX_VALUE;

    @ObfuscatedName("in.c")
    public int field3272 = Integer.MIN_VALUE;

    @ObfuscatedName("in.e")
    public int field3273 = Integer.MIN_VALUE;

    @ObfuscatedName("in.t")
    public class271 field3274 = class271.field3496;

    @ObfuscatedName("in.u")
    public class253 field3268 = class253.field3242;

    @ObfuscatedName("in.i")
    public int[] field3276;

    @ObfuscatedName("in.z")
    public byte[] field3265;

    @ObfuscatedName("in.k")
    public int field3278 = -1;

    public class256(int arg0) {
        this.field3262 = arg0;
    }

    @ObfuscatedName("in.w(Lgy;B)V")
    public void method4439(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4445(arg0, var2);
        }
    }

    @ObfuscatedName("in.m(Lgy;II)V")
    public void method4445(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3261 = arg0.method3279();
        } else if (arg1 == 2) {
            this.field3260 = arg0.method3279();
        } else if (arg1 == 3) {
            this.field3263 = arg0.method3271();
        } else if (arg1 == 4) {
            this.field3264 = arg0.method3266();
        } else if (arg1 == 5) {
            arg0.method3266();
        } else if (arg1 == 6) {
            this.field3277 = arg0.method3436();
        } else if (arg1 == 7) {
            int var3 = arg0.method3436();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method3436();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3267[arg1 - 10] = arg0.method3271();
        } else if (arg1 == 15) {
            int var4 = arg0.method3436();
            this.field3256 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3256[var5] = arg0.method3498();
            }
            arg0.method3267();
            int var6 = arg0.method3436();
            this.field3276 = new int[var6];
            for (int var7 = 0; var7 < this.field3276.length; var7++) {
                this.field3276[var7] = arg0.method3267();
            }
            this.field3265 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3265[var8] = arg0.method3263();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3271 = arg0.method3271();
            } else if (arg1 == 18) {
                arg0.method3279();
            } else if (arg1 == 19) {
                this.field3278 = arg0.method3268();
            } else if (arg1 == 21) {
                arg0.method3267();
            } else if (arg1 == 22) {
                arg0.method3267();
            } else if (arg1 == 23) {
                arg0.method3436();
                arg0.method3436();
                arg0.method3436();
            } else if (arg1 == 24) {
                arg0.method3498();
                arg0.method3498();
            } else if (arg1 == 25) {
                arg0.method3279();
            } else if (arg1 == 28) {
                arg0.method3436();
            } else if (arg1 == 29) {
                this.field3274 = (class271) class178.method90(class271.method4230(), arg0.method3436());
            } else if (arg1 == 30) {
                class253[] var9 = new class253[] { class253.field3244, class253.field3242, class253.field3243 };
                this.field3268 = (class253) class178.method90(var9, arg0.method3436());
            }
        }
    }

    @ObfuscatedName("in.q(I)V")
    public void method4440() {
        if (this.field3256 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3256.length; var1 += 2) {
            if (this.field3256[var1] < this.field3270) {
                this.field3270 = this.field3256[var1];
            } else if (this.field3256[var1] > this.field3272) {
                this.field3272 = this.field3256[var1];
            }
            if (this.field3256[var1 + 1] < this.field3269) {
                this.field3269 = this.field3256[var1 + 1];
            } else if (this.field3256[var1 + 1] > this.field3273) {
                this.field3273 = this.field3256[var1 + 1];
            }
        }
    }

    @ObfuscatedName("in.x(ZI)Llc;")
    public class319 method4442(boolean arg0) {
        int var2 = arg0 ? this.field3260 : this.field3261;
        return this.method4443(var2);
    }

    @ObfuscatedName("in.j(IB)Llc;")
    public class319 method4443(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class319 var2 = (class319) field3259.method3707((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class319 var3 = class320.method1871(Statics.field3257, arg0, 0);
        if (var3 != null) {
            field3259.method3712(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("in.a(I)I")
    public int method4444() {
        return this.field3262;
    }
}
