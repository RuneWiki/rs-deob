package deob;

@ObfuscatedName("ar")
public class class39 extends class185 {

    @ObfuscatedName("ar.e")
    public static class174 field915 = new class174(64);

    @ObfuscatedName("ar.h")
    public static class174 field916 = new class174(100);

    @ObfuscatedName("ar.p")
    public int[] field913;

    @ObfuscatedName("ar.j")
    public int[] field930;

    @ObfuscatedName("ar.i")
    public int[] field919;

    @ObfuscatedName("ar.u")
    public int[] field920;

    @ObfuscatedName("ar.l")
    public int field921 = -1;

    @ObfuscatedName("ar.k")
    public int[] field922;

    @ObfuscatedName("ar.q")
    public boolean field926 = false;

    @ObfuscatedName("ar.b")
    public int field924 = 5;

    @ObfuscatedName("ar.w")
    public int field933 = -1;

    @ObfuscatedName("ar.g")
    public int field925 = -1;

    @ObfuscatedName("ar.s")
    public int field927 = 99;

    @ObfuscatedName("ar.c")
    public int field917 = -1;

    @ObfuscatedName("ar.r")
    public int field929 = -1;

    @ObfuscatedName("ar.f")
    public int field928 = 2;

    @ObfuscatedName("ab.x(IB)Lar;")
    public static class39 method633(int arg0) {
        class39 var1 = (class39) field915.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2927.method2751(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method764(new class108(var2));
        }
        var3.method734();
        field915.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.v(Ldm;I)V")
    public void method764(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method751(arg0, var2);
        }
    }

    @ObfuscatedName("ar.m(Ldm;IB)V")
    public void method751(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2129();
            this.field919 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field919[var4] = arg0.method2129();
            }
            this.field913 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field913[var5] = arg0.method2129();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field913[var6] += arg0.method2129() << 16;
            }
        } else if (arg1 == 2) {
            this.field921 = arg0.method2129();
        } else if (arg1 == 3) {
            int var7 = arg0.method2299();
            this.field922 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field922[var8] = arg0.method2299();
            }
            this.field922[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field926 = true;
        } else if (arg1 == 5) {
            this.field924 = arg0.method2299();
        } else if (arg1 == 6) {
            this.field933 = arg0.method2129();
        } else if (arg1 == 7) {
            this.field925 = arg0.method2129();
        } else if (arg1 == 8) {
            this.field927 = arg0.method2299();
        } else if (arg1 == 9) {
            this.field917 = arg0.method2299();
        } else if (arg1 == 10) {
            this.field929 = arg0.method2299();
        } else if (arg1 == 11) {
            this.field928 = arg0.method2299();
        } else if (arg1 == 12) {
            int var9 = arg0.method2299();
            this.field930 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field930[var10] = arg0.method2129();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field930[var11] += arg0.method2129() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2299();
            this.field920 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field920[var13] = arg0.method2131();
            }
        }
    }

    @ObfuscatedName("ar.e(I)V")
    public void method734() {
        if (this.field917 == -1) {
            if (this.field922 == null) {
                this.field917 = 0;
            } else {
                this.field917 = 2;
            }
        }
        if (this.field929 != -1) {
            return;
        }
        if (this.field922 == null) {
            this.field929 = 0;
        } else {
            this.field929 = 2;
        }
    }

    @ObfuscatedName("ar.h(Lck;II)Lck;")
    public class99 method736(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method2978(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2018(true);
        } else {
            class99 var6 = arg0.method2018(!var4.method1976(var5));
            var6.method2044(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.p(Lck;III)Lck;")
    public class99 method756(class99 arg0, int arg1, int arg2) {
        int var4 = this.field913[arg1];
        class97 var5 = method2978(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2018(true);
        }
        class99 var7 = arg0.method2018(!var5.method1976(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1994();
        } else if (var8 == 2) {
            var7.method1993();
        } else if (var8 == 3) {
            var7.method2001();
        }
        var7.method2044(var5, var6);
        if (var8 == 1) {
            var7.method2001();
        } else if (var8 == 2) {
            var7.method1993();
        } else if (var8 == 3) {
            var7.method1994();
        }
        return var7;
    }

    @ObfuscatedName("ar.j(Lck;II)Lck;")
    public class99 method738(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method2978(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2007(true);
        } else {
            class99 var6 = arg0.method2007(!var4.method1976(var5));
            var6.method2044(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.i(Lck;ILar;II)Lck;")
    public class99 method739(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field913[arg1];
        class97 var6 = method2978(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method736(arg0, arg3);
        }
        int var8 = arg2.field913[arg3];
        class97 var9 = method2978(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method2018(!var6.method1976(var7));
            var11.method2044(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method2018(!var6.method1976(var7) & !var9.method1976(var10));
            var12.method1990(var6, var7, var9, var10, this.field922);
            return var12;
        }
    }

    @ObfuscatedName("ar.u(Lck;II)Lck;")
    public class99 method740(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method2978(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2018(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field930 != null && arg1 < this.field930.length) {
            int var8 = this.field930[arg1];
            var6 = method2978(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method2018(!var4.method1976(var5));
            var10.method2044(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method2018(!var4.method1976(var5) & !var6.method1976(var7));
            var9.method2044(var4, var5);
            var9.method2044(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fy.l(II)Lcz;")
    public static class97 method2978(int arg0) {
        class97 var1 = (class97) field916.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class149 var2 = Statics.field918;
        class149 var3 = Statics.field914;
        boolean var4 = true;
        int[] var5 = var2.method2740(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2757(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2757(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class97 var10;
        if (var4) {
            try {
                var10 = new class97(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field916.method3183(var10, (long) arg0);
        }
        return var10;
    }
}
