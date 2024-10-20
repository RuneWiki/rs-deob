package deob;

@ObfuscatedName("ae")
public class class43 extends class205 {

    @ObfuscatedName("ae.z")
    public static class194 field971 = new class194(64);

    @ObfuscatedName("ae.x")
    public static class194 field972 = new class194(100);

    @ObfuscatedName("ae.e")
    public int[] field973;

    @ObfuscatedName("ae.i")
    public int[] field974;

    @ObfuscatedName("ae.c")
    public int[] field975;

    @ObfuscatedName("ae.n")
    public int[] field976;

    @ObfuscatedName("ae.l")
    public int field968 = -1;

    @ObfuscatedName("ae.u")
    public int[] field978;

    @ObfuscatedName("ae.r")
    public boolean field979 = false;

    @ObfuscatedName("ae.a")
    public int field985 = 5;

    @ObfuscatedName("ae.d")
    public int field982 = -1;

    @ObfuscatedName("ae.p")
    public int field980 = -1;

    @ObfuscatedName("ae.q")
    public int field983 = 99;

    @ObfuscatedName("ae.b")
    public int field984 = -1;

    @ObfuscatedName("ae.t")
    public int field977 = -1;

    @ObfuscatedName("ae.y")
    public int field986 = 2;

    @ObfuscatedName("fw.j(IB)Lae;")
    public static class43 method2947(int arg0) {
        class43 var1 = (class43) field971.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field981.method3011(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method837(new class120(var2));
        }
        var3.method839();
        field971.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.h(Ldx;I)V")
    public void method837(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method838(arg0, var2);
        }
    }

    @ObfuscatedName("ae.m(Ldx;II)V")
    public void method838(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2363();
            this.field975 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field975[var4] = arg0.method2363();
            }
            this.field973 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field973[var5] = arg0.method2363();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field973[var6] += arg0.method2363() << 16;
            }
        } else if (arg1 == 2) {
            this.field968 = arg0.method2363();
        } else if (arg1 == 3) {
            int var7 = arg0.method2361();
            this.field978 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field978[var8] = arg0.method2361();
            }
            this.field978[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field979 = true;
        } else if (arg1 == 5) {
            this.field985 = arg0.method2361();
        } else if (arg1 == 6) {
            this.field982 = arg0.method2363();
        } else if (arg1 == 7) {
            this.field980 = arg0.method2363();
        } else if (arg1 == 8) {
            this.field983 = arg0.method2361();
        } else if (arg1 == 9) {
            this.field984 = arg0.method2361();
        } else if (arg1 == 10) {
            this.field977 = arg0.method2361();
        } else if (arg1 == 11) {
            this.field986 = arg0.method2361();
        } else if (arg1 == 12) {
            int var9 = arg0.method2361();
            this.field974 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field974[var10] = arg0.method2363();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field974[var11] += arg0.method2363() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2361();
            this.field976 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field976[var13] = arg0.method2523();
            }
        }
    }

    @ObfuscatedName("ae.z(I)V")
    public void method839() {
        if (this.field984 == -1) {
            if (this.field978 == null) {
                this.field984 = 0;
            } else {
                this.field984 = 2;
            }
        }
        if (this.field977 != -1) {
            return;
        }
        if (this.field978 == null) {
            this.field977 = 0;
        } else {
            this.field977 = 2;
        }
    }

    @ObfuscatedName("ae.x(Ldf;II)Ldf;")
    public class106 method845(class106 arg0, int arg1) {
        int var3 = this.field973[arg1];
        class104 var4 = method1781(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2157(true);
        } else {
            class106 var6 = arg0.method2157(!var4.method2148(var5));
            var6.method2161(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ae.e(Ldf;III)Ldf;")
    public class106 method841(class106 arg0, int arg1, int arg2) {
        int var4 = this.field973[arg1];
        class104 var5 = method1781(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2157(true);
        }
        class106 var7 = arg0.method2157(!var5.method2148(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2166();
        } else if (var8 == 2) {
            var7.method2178();
        } else if (var8 == 3) {
            var7.method2164();
        }
        var7.method2161(var5, var6);
        if (var8 == 1) {
            var7.method2164();
        } else if (var8 == 2) {
            var7.method2178();
        } else if (var8 == 3) {
            var7.method2166();
        }
        return var7;
    }

    @ObfuscatedName("ae.i(Ldf;II)Ldf;")
    public class106 method840(class106 arg0, int arg1) {
        int var3 = this.field973[arg1];
        class104 var4 = method1781(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2158(true);
        } else {
            class106 var6 = arg0.method2158(!var4.method2148(var5));
            var6.method2161(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ae.c(Ldf;ILae;II)Ldf;")
    public class106 method843(class106 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field973[arg1];
        class104 var6 = method1781(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method845(arg0, arg3);
        }
        int var8 = arg2.field973[arg3];
        class104 var9 = method1781(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class106 var11 = arg0.method2157(!var6.method2148(var7));
            var11.method2161(var6, var7);
            return var11;
        } else {
            class106 var12 = arg0.method2157(!var6.method2148(var7) & !var9.method2148(var10));
            var12.method2162(var6, var7, var9, var10, this.field978);
            return var12;
        }
    }

    @ObfuscatedName("ae.n(Ldf;II)Ldf;")
    public class106 method844(class106 arg0, int arg1) {
        int var3 = this.field973[arg1];
        class104 var4 = method1781(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2157(true);
        }
        class104 var6 = null;
        int var7 = 0;
        if (this.field974 != null && arg1 < this.field974.length) {
            int var8 = this.field974[arg1];
            var6 = method1781(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class106 var10 = arg0.method2157(!var4.method2148(var5));
            var10.method2161(var4, var5);
            return var10;
        } else {
            class106 var9 = arg0.method2157(!var4.method2148(var5) & !var6.method2148(var7));
            var9.method2161(var4, var5);
            var9.method2161(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ck.l(II)Lch;")
    public static class104 method1781(int arg0) {
        class104 var1 = (class104) field972.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class168 var2 = Statics.field969;
        class168 var3 = Statics.field970;
        boolean var4 = true;
        int[] var5 = var2.method3020(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3017(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3017(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class104 var10;
        if (var4) {
            try {
                var10 = new class104(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field972.method3462(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("fx.u(I)V")
    public static void method3199() {
        field971.method3463();
        field972.method3463();
    }
}
