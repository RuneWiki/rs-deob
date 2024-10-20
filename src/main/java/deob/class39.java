package deob;

@ObfuscatedName("at")
public class class39 extends class185 {

    @ObfuscatedName("at.e")
    public static class174 field914 = new class174(64);

    @ObfuscatedName("at.r")
    public static class174 field923 = new class174(100);

    @ObfuscatedName("at.a")
    public int[] field913;

    @ObfuscatedName("at.n")
    public int[] field917;

    @ObfuscatedName("at.x")
    public int[] field918;

    @ObfuscatedName("at.g")
    public int[] field912;

    @ObfuscatedName("at.o")
    public int field924 = -1;

    @ObfuscatedName("at.p")
    public int[] field916;

    @ObfuscatedName("at.v")
    public boolean field922 = false;

    @ObfuscatedName("at.w")
    public int field928 = 5;

    @ObfuscatedName("at.t")
    public int field935 = -1;

    @ObfuscatedName("at.s")
    public int field925 = -1;

    @ObfuscatedName("at.b")
    public int field915 = 99;

    @ObfuscatedName("at.u")
    public int field927 = -1;

    @ObfuscatedName("at.j")
    public int field919 = -1;

    @ObfuscatedName("at.d")
    public int field929 = 2;

    @ObfuscatedName("ay.f(Lev;Lev;Lev;B)V")
    public static void method739(class149 arg0, class149 arg1, class149 arg2) {
        Statics.field2931 = arg0;
        Statics.field920 = arg1;
        Statics.field921 = arg2;
    }

    @ObfuscatedName("z.k(II)Lat;")
    public static class39 method547(int arg0) {
        class39 var1 = (class39) field914.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2931.method2763(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method741(new class108(var2));
        }
        var3.method772();
        field914.method3209(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.y(Ldu;I)V")
    public void method741(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method742(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldu;IB)V")
    public void method742(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2160();
            this.field918 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field918[var4] = arg0.method2160();
            }
            this.field913 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field913[var5] = arg0.method2160();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field913[var6] += arg0.method2160() << 16;
            }
        } else if (arg1 == 2) {
            this.field924 = arg0.method2160();
        } else if (arg1 == 3) {
            int var7 = arg0.method2158();
            this.field916 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field916[var8] = arg0.method2158();
            }
            this.field916[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field922 = true;
        } else if (arg1 == 5) {
            this.field928 = arg0.method2158();
        } else if (arg1 == 6) {
            this.field935 = arg0.method2160();
        } else if (arg1 == 7) {
            this.field925 = arg0.method2160();
        } else if (arg1 == 8) {
            this.field915 = arg0.method2158();
        } else if (arg1 == 9) {
            this.field927 = arg0.method2158();
        } else if (arg1 == 10) {
            this.field919 = arg0.method2158();
        } else if (arg1 == 11) {
            this.field929 = arg0.method2158();
        } else if (arg1 == 12) {
            int var9 = arg0.method2158();
            this.field917 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field917[var10] = arg0.method2160();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field917[var11] += arg0.method2160() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2158();
            this.field912 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field912[var13] = arg0.method2314();
            }
        }
    }

    @ObfuscatedName("at.r(I)V")
    public void method772() {
        if (this.field927 == -1) {
            if (this.field916 == null) {
                this.field927 = 0;
            } else {
                this.field927 = 2;
            }
        }
        if (this.field919 != -1) {
            return;
        }
        if (this.field916 == null) {
            this.field919 = 0;
        } else {
            this.field919 = 2;
        }
    }

    @ObfuscatedName("at.a(Lci;IB)Lci;")
    public class99 method744(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method517(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2021(true);
        } else {
            class99 var6 = arg0.method2021(!var4.method2013(var5));
            var6.method2027(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("at.n(Lci;III)Lci;")
    public class99 method745(class99 arg0, int arg1, int arg2) {
        int var4 = this.field913[arg1];
        class97 var5 = method517(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2021(true);
        }
        class99 var7 = arg0.method2021(!var5.method2013(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2022();
        } else if (var8 == 2) {
            var7.method2031();
        } else if (var8 == 3) {
            var7.method2030();
        }
        var7.method2027(var5, var6);
        if (var8 == 1) {
            var7.method2030();
        } else if (var8 == 2) {
            var7.method2031();
        } else if (var8 == 3) {
            var7.method2022();
        }
        return var7;
    }

    @ObfuscatedName("at.x(Lci;II)Lci;")
    public class99 method768(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method517(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2033(true);
        } else {
            class99 var6 = arg0.method2033(!var4.method2013(var5));
            var6.method2027(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("at.g(Lci;ILat;II)Lci;")
    public class99 method747(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field913[arg1];
        class97 var6 = method517(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method744(arg0, arg3);
        }
        int var8 = arg2.field913[arg3];
        class97 var9 = method517(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method2021(!var6.method2013(var7));
            var11.method2027(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method2021(!var6.method2013(var7) & !var9.method2013(var10));
            var12.method2042(var6, var7, var9, var10, this.field916);
            return var12;
        }
    }

    @ObfuscatedName("at.o(Lci;IB)Lci;")
    public class99 method748(class99 arg0, int arg1) {
        int var3 = this.field913[arg1];
        class97 var4 = method517(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2021(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field917 != null && arg1 < this.field917.length) {
            int var8 = this.field917[arg1];
            var6 = method517(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method2021(!var4.method2013(var5));
            var10.method2027(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method2021(!var4.method2013(var5) & !var6.method2013(var7));
            var9.method2027(var4, var5);
            var9.method2027(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("q.p(II)Lcc;")
    public static class97 method517(int arg0) {
        class97 var1 = (class97) field923.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class149 var2 = Statics.field920;
        class149 var3 = Statics.field921;
        boolean var4 = true;
        int[] var5 = var2.method2817(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2804(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2804(var8, 0);
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
            field923.method3209(var10, (long) arg0);
        }
        return var10;
    }
}
