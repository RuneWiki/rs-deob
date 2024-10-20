package deob;

@ObfuscatedName("ax")
public class class33 extends class172 {

    @ObfuscatedName("ax.y")
    public static class168 field860 = new class168(64);

    @ObfuscatedName("ax.x")
    public static class168 field861 = new class168(100);

    @ObfuscatedName("ax.e")
    public int[] field857;

    @ObfuscatedName("ax.m")
    public int[] field863;

    @ObfuscatedName("ax.s")
    public int[] field864;

    @ObfuscatedName("ax.p")
    public int[] field869;

    @ObfuscatedName("ax.w")
    public int field866 = -1;

    @ObfuscatedName("ax.r")
    public int[] field870;

    @ObfuscatedName("ax.n")
    public boolean field868 = false;

    @ObfuscatedName("ax.b")
    public int field862 = 5;

    @ObfuscatedName("ax.z")
    public int field876 = -1;

    @ObfuscatedName("ax.h")
    public int field871 = -1;

    @ObfuscatedName("ax.q")
    public int field865 = 99;

    @ObfuscatedName("ax.l")
    public int field867 = -1;

    @ObfuscatedName("ax.t")
    public int field874 = -1;

    @ObfuscatedName("ax.g")
    public int field875 = 2;

    @ObfuscatedName("ca.c(Lew;Lew;Lew;I)V")
    public static void method1761(class150 arg0, class150 arg1, class150 arg2) {
        Statics.field872 = arg0;
        Statics.field858 = arg1;
        Statics.field859 = arg2;
    }

    @ObfuscatedName("er.j(IS)Lax;")
    public static class33 method2589(int arg0) {
        class33 var1 = (class33) field860.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field872.method2821(12, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method669(new class125(var2));
        }
        var3.method664();
        field860.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.f(Ldl;B)V")
    public void method669(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method662(arg0, var2);
        }
    }

    @ObfuscatedName("ax.y(Ldl;II)V")
    public void method662(class125 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2328();
            this.field864 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field864[var4] = arg0.method2328();
            }
            this.field857 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field857[var5] = arg0.method2328();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field857[var6] += arg0.method2328() << 16;
            }
        } else if (arg1 == 2) {
            this.field866 = arg0.method2328();
        } else if (arg1 == 3) {
            int var7 = arg0.method2326();
            this.field870 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field870[var8] = arg0.method2326();
            }
            this.field870[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field868 = true;
        } else if (arg1 == 5) {
            this.field862 = arg0.method2326();
        } else if (arg1 == 6) {
            this.field876 = arg0.method2328();
        } else if (arg1 == 7) {
            this.field871 = arg0.method2328();
        } else if (arg1 == 8) {
            this.field865 = arg0.method2326();
        } else if (arg1 == 9) {
            this.field867 = arg0.method2326();
        } else if (arg1 == 10) {
            this.field874 = arg0.method2326();
        } else if (arg1 == 11) {
            this.field875 = arg0.method2326();
        } else if (arg1 == 12) {
            int var9 = arg0.method2326();
            this.field863 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field863[var10] = arg0.method2328();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field863[var11] += arg0.method2328() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2326();
            this.field869 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field869[var13] = arg0.method2330();
            }
        }
    }

    @ObfuscatedName("ax.x(I)V")
    public void method664() {
        if (this.field867 == -1) {
            if (this.field870 == null) {
                this.field867 = 0;
            } else {
                this.field867 = 2;
            }
        }
        if (this.field874 != -1) {
            return;
        }
        if (this.field870 == null) {
            this.field874 = 0;
        } else {
            this.field874 = 2;
        }
    }

    @ObfuscatedName("ax.e(Ldf;IB)Ldf;")
    public class111 method702(class111 arg0, int arg1) {
        int var3 = this.field857[arg1];
        class108 var4 = method62(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2118(true);
        } else {
            class111 var6 = arg0.method2118(!var4.method2097(var5));
            var6.method2186(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ax.m(Ldf;III)Ldf;")
    public class111 method665(class111 arg0, int arg1, int arg2) {
        int var4 = this.field857[arg1];
        class108 var5 = method62(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2118(true);
        }
        class111 var7 = arg0.method2118(!var5.method2097(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2129();
        } else if (var8 == 2) {
            var7.method2128();
        } else if (var8 == 3) {
            var7.method2127();
        }
        var7.method2186(var5, var6);
        if (var8 == 1) {
            var7.method2127();
        } else if (var8 == 2) {
            var7.method2128();
        } else if (var8 == 3) {
            var7.method2129();
        }
        return var7;
    }

    @ObfuscatedName("ax.s(Ldf;IB)Ldf;")
    public class111 method688(class111 arg0, int arg1) {
        int var3 = this.field857[arg1];
        class108 var4 = method62(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2119(true);
        } else {
            class111 var6 = arg0.method2119(!var4.method2097(var5));
            var6.method2186(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ax.p(Ldf;ILax;IB)Ldf;")
    public class111 method667(class111 arg0, int arg1, class33 arg2, int arg3) {
        int var5 = this.field857[arg1];
        class108 var6 = method62(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method702(arg0, arg3);
        }
        int var8 = arg2.field857[arg3];
        class108 var9 = method62(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class111 var11 = arg0.method2118(!var6.method2097(var7));
            var11.method2186(var6, var7);
            return var11;
        } else {
            class111 var12 = arg0.method2118(!var6.method2097(var7) & !var9.method2097(var10));
            var12.method2155(var6, var7, var9, var10, this.field870);
            return var12;
        }
    }

    @ObfuscatedName("ax.w(Ldf;IB)Ldf;")
    public class111 method668(class111 arg0, int arg1) {
        int var3 = this.field857[arg1];
        class108 var4 = method62(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2118(true);
        }
        class108 var6 = null;
        int var7 = 0;
        if (this.field863 != null && arg1 < this.field863.length) {
            int var8 = this.field863[arg1];
            var6 = method62(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class111 var10 = arg0.method2118(!var4.method2097(var5));
            var10.method2186(var4, var5);
            return var10;
        } else {
            class111 var9 = arg0.method2118(!var4.method2097(var5) & !var6.method2097(var7));
            var9.method2186(var4, var5);
            var9.method2186(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("s.r(II)Ldw;")
    public static class108 method62(int arg0) {
        class108 var1 = (class108) field861.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class108 var2 = class108.method581(Statics.field858, Statics.field859, arg0, false);
        if (var2 != null) {
            field861.method3089(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("be.n(I)V")
    public static void method1433() {
        field860.method3092();
        field861.method3092();
    }
}
