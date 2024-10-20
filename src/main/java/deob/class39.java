package deob;

@ObfuscatedName("ap")
public class class39 extends class185 {

    @ObfuscatedName("ap.g")
    public static class174 field913 = new class174(64);

    @ObfuscatedName("ap.q")
    public static class174 field914 = new class174(100);

    @ObfuscatedName("ap.l")
    public int[] field925;

    @ObfuscatedName("ap.a")
    public int[] field916;

    @ObfuscatedName("ap.b")
    public int[] field917;

    @ObfuscatedName("ap.z")
    public int[] field915;

    @ObfuscatedName("ap.w")
    public int field919 = -1;

    @ObfuscatedName("ap.j")
    public int[] field928;

    @ObfuscatedName("ap.p")
    public boolean field934 = false;

    @ObfuscatedName("ap.n")
    public int field922 = 5;

    @ObfuscatedName("ap.r")
    public int field923 = -1;

    @ObfuscatedName("ap.s")
    public int field920 = -1;

    @ObfuscatedName("ap.f")
    public int field931 = 99;

    @ObfuscatedName("ap.c")
    public int field926 = -1;

    @ObfuscatedName("ap.t")
    public int field927 = -1;

    @ObfuscatedName("ap.i")
    public int field921 = 2;

    @ObfuscatedName("am.e(Lep;Lep;Lep;I)V")
    public static void method551(class149 arg0, class149 arg1, class149 arg2) {
        Statics.field910 = arg0;
        Statics.field911 = arg1;
        Statics.field918 = arg2;
    }

    @ObfuscatedName("dd.v(IS)Lap;")
    public static class39 method2315(int arg0) {
        class39 var1 = (class39) field913.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field910.method2721(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method700(new class108(var2));
        }
        var3.method702();
        field913.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.k(Ldd;I)V")
    public void method700(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method701(arg0, var2);
        }
    }

    @ObfuscatedName("ap.g(Ldd;IB)V")
    public void method701(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2124();
            this.field917 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field917[var4] = arg0.method2124();
            }
            this.field925 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field925[var5] = arg0.method2124();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field925[var6] += arg0.method2124() << 16;
            }
        } else if (arg1 == 2) {
            this.field919 = arg0.method2124();
        } else if (arg1 == 3) {
            int var7 = arg0.method2122();
            this.field928 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field928[var8] = arg0.method2122();
            }
            this.field928[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field934 = true;
        } else if (arg1 == 5) {
            this.field922 = arg0.method2122();
        } else if (arg1 == 6) {
            this.field923 = arg0.method2124();
        } else if (arg1 == 7) {
            this.field920 = arg0.method2124();
        } else if (arg1 == 8) {
            this.field931 = arg0.method2122();
        } else if (arg1 == 9) {
            this.field926 = arg0.method2122();
        } else if (arg1 == 10) {
            this.field927 = arg0.method2122();
        } else if (arg1 == 11) {
            this.field921 = arg0.method2122();
        } else if (arg1 == 12) {
            int var9 = arg0.method2122();
            this.field916 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field916[var10] = arg0.method2124();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field916[var11] += arg0.method2124() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2122();
            this.field915 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field915[var13] = arg0.method2126();
            }
        }
    }

    @ObfuscatedName("ap.q(I)V")
    public void method702() {
        if (this.field926 == -1) {
            if (this.field928 == null) {
                this.field926 = 0;
            } else {
                this.field926 = 2;
            }
        }
        if (this.field927 != -1) {
            return;
        }
        if (this.field928 == null) {
            this.field927 = 0;
        } else {
            this.field927 = 2;
        }
    }

    @ObfuscatedName("ap.l(Lcu;II)Lcu;")
    public class99 method712(class99 arg0, int arg1) {
        int var3 = this.field925[arg1];
        class97 var4 = method704(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1996(true);
        } else {
            class99 var6 = arg0.method1996(!var4.method1966(var5));
            var6.method2033(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ap.a(Lcu;III)Lcu;")
    public class99 method707(class99 arg0, int arg1, int arg2) {
        int var4 = this.field925[arg1];
        class97 var5 = method704(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1996(true);
        }
        class99 var7 = arg0.method1996(!var5.method1966(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1980();
        } else if (var8 == 2) {
            var7.method1979();
        } else if (var8 == 3) {
            var7.method1985();
        }
        var7.method2033(var5, var6);
        if (var8 == 1) {
            var7.method1985();
        } else if (var8 == 2) {
            var7.method1979();
        } else if (var8 == 3) {
            var7.method1980();
        }
        return var7;
    }

    @ObfuscatedName("ap.b(Lcu;IB)Lcu;")
    public class99 method717(class99 arg0, int arg1) {
        int var3 = this.field925[arg1];
        class97 var4 = method704(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1987(true);
        } else {
            class99 var6 = arg0.method1987(!var4.method1966(var5));
            var6.method2033(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ap.z(Lcu;ILap;II)Lcu;")
    public class99 method706(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field925[arg1];
        class97 var6 = method704(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method712(arg0, arg3);
        }
        int var8 = arg2.field925[arg3];
        class97 var9 = method704(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method1996(!var6.method1966(var7));
            var11.method2033(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method1996(!var6.method1966(var7) & !var9.method1966(var10));
            var12.method2015(var6, var7, var9, var10, this.field928);
            return var12;
        }
    }

    @ObfuscatedName("ap.w(Lcu;II)Lcu;")
    public class99 method716(class99 arg0, int arg1) {
        int var3 = this.field925[arg1];
        class97 var4 = method704(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1996(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field916 != null && arg1 < this.field916.length) {
            int var8 = this.field916[arg1];
            var6 = method704(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method1996(!var4.method1966(var5));
            var10.method2033(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method1996(!var4.method1966(var5) & !var6.method1966(var7));
            var9.method2033(var4, var5);
            var9.method2033(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ap.j(II)Lch;")
    public static class97 method704(int arg0) {
        class97 var1 = (class97) field914.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class149 var2 = Statics.field911;
        class149 var3 = Statics.field918;
        boolean var4 = true;
        int[] var5 = var2.method2733(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2726(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2726(var8, 0);
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
            field914.method3156(var10, (long) arg0);
        }
        return var10;
    }
}
