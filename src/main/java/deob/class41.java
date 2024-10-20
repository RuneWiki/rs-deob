package deob;

@ObfuscatedName("ax")
public class class41 extends class198 {

    @ObfuscatedName("ax.l")
    public static class187 field966 = new class187(64);

    @ObfuscatedName("ax.w")
    public static class187 field975 = new class187(100);

    @ObfuscatedName("ax.d")
    public int[] field970;

    @ObfuscatedName("ax.f")
    public int[] field969;

    @ObfuscatedName("ax.i")
    public int[] field963;

    @ObfuscatedName("ax.a")
    public int[] field968;

    @ObfuscatedName("ax.o")
    public int field972 = -1;

    @ObfuscatedName("ax.u")
    public int[] field973;

    @ObfuscatedName("ax.m")
    public boolean field971 = false;

    @ObfuscatedName("ax.e")
    public int field965 = 5;

    @ObfuscatedName("ax.v")
    public int field976 = -1;

    @ObfuscatedName("ax.r")
    public int field977 = -1;

    @ObfuscatedName("ax.t")
    public int field985 = 99;

    @ObfuscatedName("ax.g")
    public int field979 = -1;

    @ObfuscatedName("ax.s")
    public int field974 = -1;

    @ObfuscatedName("ax.n")
    public int field981 = 2;

    @ObfuscatedName("ay.j(II)Lax;")
    public static class41 method1016(int arg0) {
        class41 var1 = (class41) field966.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field980.method2995(12, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method848(new class114(var2));
        }
        var3.method850();
        field966.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.y(Lde;I)V")
    public void method848(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method879(arg0, var2);
        }
    }

    @ObfuscatedName("ax.z(Lde;IB)V")
    public void method879(class114 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2324();
            this.field963 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field963[var4] = arg0.method2324();
            }
            this.field970 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field970[var5] = arg0.method2324();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field970[var6] += arg0.method2324() << 16;
            }
        } else if (arg1 == 2) {
            this.field972 = arg0.method2324();
        } else if (arg1 == 3) {
            int var7 = arg0.method2322();
            this.field973 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field973[var8] = arg0.method2322();
            }
            this.field973[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field971 = true;
        } else if (arg1 == 5) {
            this.field965 = arg0.method2322();
        } else if (arg1 == 6) {
            this.field976 = arg0.method2324();
        } else if (arg1 == 7) {
            this.field977 = arg0.method2324();
        } else if (arg1 == 8) {
            this.field985 = arg0.method2322();
        } else if (arg1 == 9) {
            this.field979 = arg0.method2322();
        } else if (arg1 == 10) {
            this.field974 = arg0.method2322();
        } else if (arg1 == 11) {
            this.field981 = arg0.method2322();
        } else if (arg1 == 12) {
            int var9 = arg0.method2322();
            this.field969 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field969[var10] = arg0.method2324();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field969[var11] += arg0.method2324() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2322();
            this.field968 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field968[var13] = arg0.method2321();
            }
        }
    }

    @ObfuscatedName("ax.l(B)V")
    public void method850() {
        if (this.field979 == -1) {
            if (this.field973 == null) {
                this.field979 = 0;
            } else {
                this.field979 = 2;
            }
        }
        if (this.field974 != -1) {
            return;
        }
        if (this.field973 == null) {
            this.field974 = 0;
        } else {
            this.field974 = 2;
        }
    }

    @ObfuscatedName("ax.w(Lcw;II)Lcw;")
    public class103 method851(class103 arg0, int arg1) {
        int var3 = this.field970[arg1];
        class101 var4 = method917(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2167(true);
        } else {
            class103 var6 = arg0.method2167(!var4.method2159(var5));
            var6.method2173(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ax.d(Lcw;IIB)Lcw;")
    public class103 method847(class103 arg0, int arg1, int arg2) {
        int var4 = this.field970[arg1];
        class101 var5 = method917(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2167(true);
        }
        class103 var7 = arg0.method2167(!var5.method2159(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2178();
        } else if (var8 == 2) {
            var7.method2206();
        } else if (var8 == 3) {
            var7.method2176();
        }
        var7.method2173(var5, var6);
        if (var8 == 1) {
            var7.method2176();
        } else if (var8 == 2) {
            var7.method2206();
        } else if (var8 == 3) {
            var7.method2178();
        }
        return var7;
    }

    @ObfuscatedName("ax.f(Lcw;II)Lcw;")
    public class103 method867(class103 arg0, int arg1) {
        int var3 = this.field970[arg1];
        class101 var4 = method917(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2210(true);
        } else {
            class103 var6 = arg0.method2210(!var4.method2159(var5));
            var6.method2173(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ax.i(Lcw;ILax;II)Lcw;")
    public class103 method854(class103 arg0, int arg1, class41 arg2, int arg3) {
        int var5 = this.field970[arg1];
        class101 var6 = method917(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method851(arg0, arg3);
        }
        int var8 = arg2.field970[arg3];
        class101 var9 = method917(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class103 var11 = arg0.method2167(!var6.method2159(var7));
            var11.method2173(var6, var7);
            return var11;
        } else {
            class103 var12 = arg0.method2167(!var6.method2159(var7) & !var9.method2159(var10));
            var12.method2225(var6, var7, var9, var10, this.field973);
            return var12;
        }
    }

    @ObfuscatedName("ax.a(Lcw;II)Lcw;")
    public class103 method868(class103 arg0, int arg1) {
        int var3 = this.field970[arg1];
        class101 var4 = method917(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2167(true);
        }
        class101 var6 = null;
        int var7 = 0;
        if (this.field969 != null && arg1 < this.field969.length) {
            int var8 = this.field969[arg1];
            var6 = method917(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class103 var10 = arg0.method2167(!var4.method2159(var5));
            var10.method2173(var4, var5);
            return var10;
        } else {
            class103 var9 = arg0.method2167(!var4.method2159(var5) & !var6.method2159(var7));
            var9.method2173(var4, var5);
            var9.method2173(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ac.o(II)Lcm;")
    public static class101 method917(int arg0) {
        class101 var1 = (class101) field975.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class101 var2 = class101.method2883(Statics.field964, Statics.field967, arg0, false);
        if (var2 != null) {
            field975.method3434(var2, (long) arg0);
        }
        return var2;
    }
}
