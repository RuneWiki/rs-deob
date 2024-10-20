package deob;

@ObfuscatedName("ae")
public class class40 extends class195 {

    @ObfuscatedName("ae.w")
    public static class184 field955 = new class184(64);

    @ObfuscatedName("ae.m")
    public static class184 field956 = new class184(100);

    @ObfuscatedName("ae.h")
    public int[] field957;

    @ObfuscatedName("ae.i")
    public int[] field952;

    @ObfuscatedName("ae.r")
    public int[] field971;

    @ObfuscatedName("ae.l")
    public int[] field960;

    @ObfuscatedName("ae.f")
    public int field970 = -1;

    @ObfuscatedName("ae.e")
    public int[] field962;

    @ObfuscatedName("ae.z")
    public boolean field963 = false;

    @ObfuscatedName("ae.v")
    public int field964 = 5;

    @ObfuscatedName("ae.x")
    public int field965 = -1;

    @ObfuscatedName("ae.q")
    public int field966 = -1;

    @ObfuscatedName("ae.b")
    public int field967 = 99;

    @ObfuscatedName("ae.u")
    public int field968 = -1;

    @ObfuscatedName("ae.t")
    public int field961 = -1;

    @ObfuscatedName("ae.s")
    public int field958 = 2;

    @ObfuscatedName("ao.n(Lfd;Lfd;Lfd;I)V")
    public static void method619(class158 arg0, class158 arg1, class158 arg2) {
        Statics.field959 = arg0;
        Statics.field953 = arg1;
        Statics.field954 = arg2;
    }

    @ObfuscatedName("ae.a(Ldl;B)V")
    public void method758(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method787(arg0, var2);
        }
    }

    @ObfuscatedName("ae.w(Ldl;IB)V")
    public void method787(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2236();
            this.field971 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field971[var4] = arg0.method2236();
            }
            this.field957 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field957[var5] = arg0.method2236();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field957[var6] += arg0.method2236() << 16;
            }
        } else if (arg1 == 2) {
            this.field970 = arg0.method2236();
        } else if (arg1 == 3) {
            int var7 = arg0.method2234();
            this.field962 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field962[var8] = arg0.method2234();
            }
            this.field962[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field963 = true;
        } else if (arg1 == 5) {
            this.field964 = arg0.method2234();
        } else if (arg1 == 6) {
            this.field965 = arg0.method2236();
        } else if (arg1 == 7) {
            this.field966 = arg0.method2236();
        } else if (arg1 == 8) {
            this.field967 = arg0.method2234();
        } else if (arg1 == 9) {
            this.field968 = arg0.method2234();
        } else if (arg1 == 10) {
            this.field961 = arg0.method2234();
        } else if (arg1 == 11) {
            this.field958 = arg0.method2234();
        } else if (arg1 == 12) {
            int var9 = arg0.method2234();
            this.field952 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field952[var10] = arg0.method2236();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field952[var11] += arg0.method2236() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2234();
            this.field960 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field960[var13] = arg0.method2238();
            }
        }
    }

    @ObfuscatedName("ae.m(I)V")
    public void method760() {
        if (this.field968 == -1) {
            if (this.field962 == null) {
                this.field968 = 0;
            } else {
                this.field968 = 2;
            }
        }
        if (this.field961 != -1) {
            return;
        }
        if (this.field962 == null) {
            this.field961 = 0;
        } else {
            this.field961 = 2;
        }
    }

    @ObfuscatedName("ae.h(Lcp;II)Lcp;")
    public class100 method777(class100 arg0, int arg1) {
        int var3 = this.field957[arg1];
        class98 var4 = method2149(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2078(true);
        } else {
            class100 var6 = arg0.method2078(!var4.method2066(var5));
            var6.method2083(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ae.i(Lcp;IIB)Lcp;")
    public class100 method762(class100 arg0, int arg1, int arg2) {
        int var4 = this.field957[arg1];
        class98 var5 = method2149(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2078(true);
        }
        class100 var7 = arg0.method2078(!var5.method2066(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2088();
        } else if (var8 == 2) {
            var7.method2087();
        } else if (var8 == 3) {
            var7.method2086();
        }
        var7.method2083(var5, var6);
        if (var8 == 1) {
            var7.method2086();
        } else if (var8 == 2) {
            var7.method2087();
        } else if (var8 == 3) {
            var7.method2088();
        }
        return var7;
    }

    @ObfuscatedName("ae.r(Lcp;II)Lcp;")
    public class100 method782(class100 arg0, int arg1) {
        int var3 = this.field957[arg1];
        class98 var4 = method2149(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2129(true);
        } else {
            class100 var6 = arg0.method2129(!var4.method2066(var5));
            var6.method2083(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ae.l(Lcp;ILae;II)Lcp;")
    public class100 method771(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field957[arg1];
        class98 var6 = method2149(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method777(arg0, arg3);
        }
        int var8 = arg2.field957[arg3];
        class98 var9 = method2149(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method2078(!var6.method2066(var7));
            var11.method2083(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method2078(!var6.method2066(var7) & !var9.method2066(var10));
            var12.method2084(var6, var7, var9, var10, this.field962);
            return var12;
        }
    }

    @ObfuscatedName("ae.f(Lcp;II)Lcp;")
    public class100 method767(class100 arg0, int arg1) {
        int var3 = this.field957[arg1];
        class98 var4 = method2149(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2078(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field952 != null && arg1 < this.field952.length) {
            int var8 = this.field952[arg1];
            var6 = method2149(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method2078(!var4.method2066(var5));
            var10.method2083(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method2078(!var4.method2066(var5) & !var6.method2066(var7));
            var9.method2083(var4, var5);
            var9.method2083(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cx.e(IB)Lcb;")
    public static class98 method2149(int arg0) {
        class98 var1 = (class98) field956.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class98 var2 = class98.method1429(Statics.field953, Statics.field954, arg0, false);
        if (var2 != null) {
            field956.method3372(var2, (long) arg0);
        }
        return var2;
    }
}
