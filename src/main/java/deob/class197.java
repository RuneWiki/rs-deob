package deob;

@ObfuscatedName("gs")
public class class197 extends class130 {

    @ObfuscatedName("gs.h")
    public static class125 field2869 = new class125(64);

    @ObfuscatedName("gs.w")
    public static class125 field2870 = new class125(64);

    @ObfuscatedName("gs.r")
    public static class125 field2871 = new class125(20);

    @ObfuscatedName("gs.l")
    public int field2873 = -1;

    @ObfuscatedName("gs.y")
    public int field2884 = 16777215;

    @ObfuscatedName("gs.e")
    public int field2868 = 70;

    @ObfuscatedName("gs.x")
    public int field2876 = -1;

    @ObfuscatedName("gs.f")
    public int field2877 = -1;

    @ObfuscatedName("gs.s")
    public int field2874 = -1;

    @ObfuscatedName("gs.o")
    public int field2879 = -1;

    @ObfuscatedName("gs.i")
    public int field2880 = 0;

    @ObfuscatedName("gs.a")
    public int field2881 = 0;

    @ObfuscatedName("gs.b")
    public int field2875 = -1;

    @ObfuscatedName("gs.j")
    public String field2883 = "";

    @ObfuscatedName("gs.k")
    public int field2885 = -1;

    @ObfuscatedName("gs.v")
    public int field2866 = 0;

    @ObfuscatedName("gs.u")
    public int[] field2886;

    @ObfuscatedName("gs.t")
    public int field2878 = -1;

    @ObfuscatedName("gs.av")
    public int field2887 = -1;

    @ObfuscatedName("c.n(IB)Lgs;")
    public static class197 method93(int arg0) {
        class197 var1 = (class197) field2869.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2882.method3093(32, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3373(new class161(var2));
        }
        field2869.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.d(Lfa;I)V")
    public void method3373(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3384(arg0, var2);
        }
    }

    @ObfuscatedName("gs.m(Lfa;IB)V")
    public void method3384(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2873 = arg0.method2795();
        } else if (arg1 == 2) {
            this.field2884 = arg0.method2784();
        } else if (arg1 == 3) {
            this.field2876 = arg0.method2795();
        } else if (arg1 == 4) {
            this.field2874 = arg0.method2795();
        } else if (arg1 == 5) {
            this.field2877 = arg0.method2795();
        } else if (arg1 == 6) {
            this.field2879 = arg0.method2795();
        } else if (arg1 == 7) {
            this.field2880 = arg0.method2783();
        } else if (arg1 == 8) {
            this.field2883 = arg0.method2789();
        } else if (arg1 == 9) {
            this.field2868 = arg0.method2887();
        } else if (arg1 == 10) {
            this.field2881 = arg0.method2783();
        } else if (arg1 == 11) {
            this.field2875 = 0;
        } else if (arg1 == 12) {
            this.field2885 = arg0.method2823();
        } else if (arg1 == 13) {
            this.field2866 = arg0.method2783();
        } else if (arg1 == 14) {
            this.field2875 = arg0.method2887();
        } else if (arg1 == 17 || arg1 == 18) {
            this.field2878 = arg0.method2887();
            if (this.field2878 == 65535) {
                this.field2878 = -1;
            }
            this.field2887 = arg0.method2887();
            if (this.field2887 == 65535) {
                this.field2887 = -1;
            }
            int var3 = -1;
            if (arg1 == 18) {
                var3 = arg0.method2887();
                if (var3 == 65535) {
                    var3 = -1;
                }
            }
            int var4 = arg0.method2823();
            this.field2886 = new int[var4 + 2];
            for (int var5 = 0; var5 <= var4; var5++) {
                this.field2886[var5] = arg0.method2887();
                if (this.field2886[var5] == 65535) {
                    this.field2886[var5] = -1;
                }
            }
            this.field2886[var4 + 1] = var3;
        }
    }

    @ObfuscatedName("gs.h(I)Lgs;")
    public final class197 method3375() {
        int var1 = -1;
        if (this.field2878 != -1) {
            var1 = class147.method748(this.field2878);
        } else if (this.field2887 != -1) {
            var1 = class147.field2032[this.field2887];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2886.length - 1) {
            var2 = this.field2886[var1];
        } else {
            var2 = this.field2886[this.field2886.length - 1];
        }
        return var2 == -1 ? null : method93(var2);
    }

    @ObfuscatedName("gs.w(IB)Ljava/lang/String;")
    public String method3374(int arg0) {
        String var2 = this.field2883;
        while (true) {
            int var3 = var2.indexOf("%1");
            if (var3 < 0) {
                return var2;
            }
            var2 = var2.substring(0, var3) + class208.method1397(arg0, false) + var2.substring(var3 + 2);
        }
    }

    @ObfuscatedName("gs.r(I)Lhf;")
    public class225 method3377() {
        if (this.field2876 < 0) {
            return null;
        }
        class225 var1 = (class225) field2870.method2221((long) this.field2876);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3650(Statics.field2867, this.field2876, 0);
        if (var2 != null) {
            field2870.method2219(var2, (long) this.field2876);
        }
        return var2;
    }

    @ObfuscatedName("gs.c(S)Lhf;")
    public class225 method3378() {
        if (this.field2877 < 0) {
            return null;
        }
        class225 var1 = (class225) field2870.method2221((long) this.field2877);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3650(Statics.field2867, this.field2877, 0);
        if (var2 != null) {
            field2870.method2219(var2, (long) this.field2877);
        }
        return var2;
    }

    @ObfuscatedName("gs.z(B)Lhf;")
    public class225 method3379() {
        if (this.field2874 < 0) {
            return null;
        }
        class225 var1 = (class225) field2870.method2221((long) this.field2874);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3650(Statics.field2867, this.field2874, 0);
        if (var2 != null) {
            field2870.method2219(var2, (long) this.field2874);
        }
        return var2;
    }

    @ObfuscatedName("gs.q(I)Lhf;")
    public class225 method3390() {
        if (this.field2879 < 0) {
            return null;
        }
        class225 var1 = (class225) field2870.method2221((long) this.field2879);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3650(Statics.field2867, this.field2879, 0);
        if (var2 != null) {
            field2870.method2219(var2, (long) this.field2879);
        }
        return var2;
    }

    @ObfuscatedName("gs.l(B)Lhe;")
    public class209 method3388() {
        if (this.field2873 == -1) {
            return null;
        }
        class209 var1 = (class209) field2871.method2221((long) this.field2873);
        if (var1 != null) {
            return var1;
        }
        class209 var2 = class226.method3230(Statics.field2867, Statics.field2889, this.field2873, 0);
        if (var2 != null) {
            field2871.method2219(var2, (long) this.field2873);
        }
        return var2;
    }

    @ObfuscatedName("cb.y(I)V")
    public static void method1822() {
        field2869.method2220();
        field2870.method2220();
        field2871.method2220();
    }
}
