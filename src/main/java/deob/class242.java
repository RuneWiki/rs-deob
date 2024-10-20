package deob;

@ObfuscatedName("iq")
public class class242 extends class176 {

    @ObfuscatedName("iq.k")
    public static class146 field3196 = new class146(256);

    @ObfuscatedName("iq.u")
    public final int field3204;

    @ObfuscatedName("iq.n")
    public int field3198 = -1;

    @ObfuscatedName("iq.t")
    public int field3199 = -1;

    @ObfuscatedName("iq.q")
    public String field3200;

    @ObfuscatedName("iq.x")
    public int field3201;

    @ObfuscatedName("iq.d")
    public int field3197 = 0;

    @ObfuscatedName("iq.c")
    public String[] field3211 = new String[5];

    @ObfuscatedName("iq.r")
    public String field3203;

    @ObfuscatedName("iq.y")
    public int[] field3202;

    @ObfuscatedName("iq.p")
    public int field3205 = Integer.MAX_VALUE;

    @ObfuscatedName("iq.b")
    public int field3207 = Integer.MAX_VALUE;

    @ObfuscatedName("iq.g")
    public int field3208 = Integer.MIN_VALUE;

    @ObfuscatedName("iq.e")
    public int field3209 = Integer.MIN_VALUE;

    @ObfuscatedName("iq.z")
    public class256 field3210 = class256.field3439;

    @ObfuscatedName("iq.a")
    public class239 field3206 = class239.field3174;

    @ObfuscatedName("iq.w")
    public int[] field3212;

    @ObfuscatedName("iq.l")
    public byte[] field3193;

    @ObfuscatedName("iq.h")
    public int field3214 = -1;

    public class242(int arg0) {
        this.field3204 = arg0;
    }

    @ObfuscatedName("b.s(IS)Liq;")
    public static class242 method156(int arg0) {
        return arg0 < 0 || arg0 >= Statics.field3194.length || Statics.field3194[arg0] == null ? new class242(arg0) : Statics.field3194[arg0];
    }

    @ObfuscatedName("iq.j(Lky;I)V")
    public void method3986(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method3984(arg0, var2);
        }
    }

    @ObfuscatedName("iq.i(Lky;II)V")
    public void method3984(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3198 = arg0.method5246();
        } else if (arg1 == 2) {
            this.field3199 = arg0.method5246();
        } else if (arg1 == 3) {
            this.field3200 = arg0.method5150();
        } else if (arg1 == 4) {
            this.field3201 = arg0.method5169();
        } else if (arg1 == 5) {
            arg0.method5169();
        } else if (arg1 == 6) {
            this.field3197 = arg0.method5179();
        } else if (arg1 == 7) {
            int var3 = arg0.method5179();
            if ((var3 & 0x1) == 0) {
            }
            if ((var3 & 0x2) == 2) {
            }
        } else if (arg1 == 8) {
            arg0.method5179();
        } else if (arg1 >= 10 && arg1 <= 14) {
            this.field3211[arg1 - 10] = arg0.method5150();
        } else if (arg1 == 15) {
            int var4 = arg0.method5179();
            this.field3202 = new int[var4 * 2];
            for (int var5 = 0; var5 < var4 * 2; var5++) {
                this.field3202[var5] = arg0.method5055();
            }
            arg0.method5056();
            int var6 = arg0.method5179();
            this.field3212 = new int[var6];
            for (int var7 = 0; var7 < this.field3212.length; var7++) {
                this.field3212[var7] = arg0.method5056();
            }
            this.field3193 = new byte[var4];
            for (int var8 = 0; var8 < var4; var8++) {
                this.field3193[var8] = arg0.method5034();
            }
        } else if (arg1 != 16) {
            if (arg1 == 17) {
                this.field3203 = arg0.method5150();
            } else if (arg1 == 18) {
                arg0.method5246();
            } else if (arg1 == 19) {
                this.field3214 = arg0.method5054();
            } else if (arg1 == 21) {
                arg0.method5056();
            } else if (arg1 == 22) {
                arg0.method5056();
            } else if (arg1 == 23) {
                arg0.method5179();
                arg0.method5179();
                arg0.method5179();
            } else if (arg1 == 24) {
                arg0.method5055();
                arg0.method5055();
            } else if (arg1 == 25) {
                arg0.method5246();
            } else if (arg1 == 28) {
                arg0.method5179();
            } else if (arg1 == 29) {
                class256[] var9 = new class256[] { class256.field3436, class256.field3439, class256.field3437 };
                this.field3210 = (class256) class196.method1723(var9, arg0.method5179());
            } else if (arg1 == 30) {
                this.field3206 = (class239) class196.method1723(class239.method1725(), arg0.method5179());
            }
        }
    }

    @ObfuscatedName("iq.k(B)V")
    public void method3977() {
        if (this.field3202 == null) {
            return;
        }
        for (int var1 = 0; var1 < this.field3202.length; var1 += 2) {
            if (this.field3202[var1] < this.field3205) {
                this.field3205 = this.field3202[var1];
            } else if (this.field3202[var1] > this.field3208) {
                this.field3208 = this.field3202[var1];
            }
            if (this.field3202[var1 + 1] < this.field3207) {
                this.field3207 = this.field3202[var1 + 1];
            } else if (this.field3202[var1 + 1] > this.field3209) {
                this.field3209 = this.field3202[var1 + 1];
            }
        }
    }

    @ObfuscatedName("iq.u(ZI)Lls;")
    public class325 method3979(boolean arg0) {
        int var2 = arg0 ? this.field3199 : this.field3198;
        return this.method3980(var2);
    }

    @ObfuscatedName("iq.n(II)Lls;")
    public class325 method3980(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        class325 var2 = (class325) field3196.method3065((long) arg0);
        if (var2 != null) {
            return var2;
        }
        class325 var3 = class326.method2824(Statics.field3213, arg0, 0);
        if (var3 != null) {
            field3196.method3067(var3, (long) arg0);
        }
        return var3;
    }

    @ObfuscatedName("iq.t(I)I")
    public int method3981() {
        return this.field3204;
    }
}
