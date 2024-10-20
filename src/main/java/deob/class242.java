package deob;

@ObfuscatedName("iw")
public class class242 extends class176 {

    @ObfuscatedName("iw.p")
    public static class146 field3216 = new class146(256);

    @ObfuscatedName("iw.k")
    public final int field3214;

    @ObfuscatedName("iw.l")
    public int field3221 = -1;

    @ObfuscatedName("iw.b")
    public int field3213 = -1;

    @ObfuscatedName("iw.i")
    public String field3217;

    @ObfuscatedName("iw.c")
    public int field3218;

    @ObfuscatedName("iw.f")
    public int field3219 = 0;

    @ObfuscatedName("iw.u")
    public String[] field3211 = new String[5];

    @ObfuscatedName("iw.x")
    public String field3212;

    @ObfuscatedName("iw.r")
    public int[] field3222;

    @ObfuscatedName("iw.v")
    public int field3223 = Integer.MAX_VALUE;

    @ObfuscatedName("iw.y")
    public int field3224 = Integer.MAX_VALUE;

    @ObfuscatedName("iw.g")
    public int field3225 = Integer.MIN_VALUE;

    @ObfuscatedName("iw.a")
    public int field3232 = Integer.MIN_VALUE;

    @ObfuscatedName("iw.j")
    public class256 field3227 = class256.field3459;

    @ObfuscatedName("iw.t")
    public class239 field3228 = class239.field3194;

    @ObfuscatedName("iw.h")
    public int[] field3229;

    @ObfuscatedName("iw.o")
    public byte[] field3215;

    @ObfuscatedName("iw.n")
    public int field3231 = -1;

    public class242(int arg0) {
        this.field3214 = arg0;
    }

    @ObfuscatedName("ho.q(II)Liw;")
    public static class242 method3753(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3220.length || Statics.field3220[arg0] == null ? new class242(arg0) : Statics.field3220[arg0];
    }

    @ObfuscatedName("iw.w(Lkf;I)V")
    public void method3986(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method3988(arg0, var2);
        }
    }

    @ObfuscatedName("iw.e(Lkf;II)V")
    public void method3988(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3221 = arg0.method5084();
        } else if (arg1 == 2) {
            this.field3213 = arg0.method5084();
        } else if (arg1 == 3) {
            this.field3217 = arg0.method5076();
        } else if (arg1 == 4) {
            this.field3218 = arg0.method5140();
        } else if (arg1 == 5) {
            arg0.method5140();
        } else if (arg1 == 6) {
            this.field3219 = arg0.method5077();
        } else if (arg1 == 7) {
            int var3 = arg0.method5077();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5077();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3211[arg1 - 10] = arg0.method5076();
        } else if (arg1 == 15) {
            int var4 = arg0.method5077();
            this.field3222 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3222[var5] = arg0.method5179();
            }
            arg0.method5072();
            int var6 = arg0.method5077();
            this.field3229 = new int[var6];
            for (int var7 = 0; var7 < this.field3229.length; var7++) {
                this.field3229[var7] = arg0.method5072();
            }
            this.field3215 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3215[var8] = arg0.method5068();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3212 = arg0.method5076();
            } else if (arg1 == 18) {
                arg0.method5084();
            } else if (arg1 == 19) {
                this.field3231 = arg0.method5069();
            } else if (arg1 == 21) {
                arg0.method5072();
            } else if (arg1 == 22) {
                arg0.method5072();
            } else if (arg1 == 23) {
                arg0.method5077();
                arg0.method5077();
                arg0.method5077();
            } else if (arg1 == 24) {
                arg0.method5179();
                arg0.method5179();
            } else if (arg1 == 25) {
                arg0.method5084();
            } else if (arg1 == 28) {
                arg0.method5077();
            } else if (arg1 == 29) {
                class256[] var9 = new class256[] { class256.field3462, class256.field3461, class256.field3459 };
                this.field3227 = (class256) class196.method2257(var9, arg0.method5077());
            } else if (arg1 == 30) {
                class239[] var10 = new class239[] { class239.field3194, class239.field3196, class239.field3195 };
                this.field3228 = (class239) class196.method2257(var10, arg0.method5077());
            }
        }
    }

    @ObfuscatedName("iw.p(I)V")
    public void method3987() {
        if (this.field3222 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3222.length; var1 += 2) {
            if (this.field3222[var1] < this.field3223) {
                this.field3223 = this.field3222[var1];
            } else if (this.field3222[var1] > this.field3225) {
                this.field3225 = this.field3222[var1];
            }
            if (this.field3222[var1 + 1] < this.field3224) {
                this.field3224 = this.field3222[var1 + 1];
            } else if (this.field3222[var1 + 1] > this.field3232) {
                this.field3232 = this.field3222[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iw.k(ZI)Lly;")
    public class326 method3996(boolean arg0) {
        int var2 = arg0 ? this.field3213 : this.field3221;
        return this.method3989(var2);
    }

    @ObfuscatedName("iw.l(II)Lly;")
    public class326 method3989(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class326 var2 = (class326) field3216.method3039((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class326 var3 = class327.method1040(Statics.field3226, arg0, 0);
        if (var3 != null) {
            field3216.method3041(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iw.b(B)I")
    public int method3990() {
        return this.field3214;
    }

    @ObfuscatedName("bs.i(B)V")
    public static void method996() {
        field3216.method3042();
    }
}
