package deob;

@ObfuscatedName("aq")
public class class34 extends class174 {

    @ObfuscatedName("aq.k")
    public static class170 field864 = new class170(64);

    @ObfuscatedName("aq.n")
    public static class170 field865 = new class170(100);

    @ObfuscatedName("aq.s")
    public int[] field863;

    @ObfuscatedName("aq.x")
    public int[] field861;

    @ObfuscatedName("aq.b")
    public int[] field868;

    @ObfuscatedName("aq.j")
    public int[] field883;

    @ObfuscatedName("aq.p")
    public int field870 = -1;

    @ObfuscatedName("aq.l")
    public int[] field866;

    @ObfuscatedName("aq.i")
    public boolean field872 = false;

    @ObfuscatedName("aq.r")
    public int field873 = 5;

    @ObfuscatedName("aq.o")
    public int field869 = -1;

    @ObfuscatedName("aq.c")
    public int field875 = -1;

    @ObfuscatedName("aq.f")
    public int field876 = 99;

    @ObfuscatedName("aq.a")
    public int field877 = -1;

    @ObfuscatedName("aq.t")
    public int field871 = -1;

    @ObfuscatedName("aq.u")
    public int field879 = 2;

    @ObfuscatedName("l.y(Lel;Lel;Lel;I)V")
    public static void method104(class152 arg0, class152 arg1, class152 arg2) {
        Statics.field880 = arg0;
        Statics.field862 = arg1;
        Statics.field867 = arg2;
    }

    @ObfuscatedName("an.m(II)Laq;")
    public static class34 method540(int arg0) {
        class34 var1 = (class34) field864.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field880.method2991(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method726(new class127(var2));
        }
        var3.method712();
        field864.method3291(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.d(Ldp;B)V")
    public void method726(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method711(arg0, var2);
        }
    }

    @ObfuscatedName("aq.k(Ldp;IB)V")
    public void method711(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2460();
            this.field868 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field868[var4] = arg0.method2460();
            }
            this.field863 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field863[var5] = arg0.method2460();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field863[var6] += arg0.method2460() << 16;
            }
        } else if (arg1 == 2) {
            this.field870 = arg0.method2460();
        } else if (arg1 == 3) {
            int var7 = arg0.method2534();
            this.field866 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field866[var8] = arg0.method2534();
            }
            this.field866[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field872 = true;
        } else if (arg1 == 5) {
            this.field873 = arg0.method2534();
        } else if (arg1 == 6) {
            this.field869 = arg0.method2460();
        } else if (arg1 == 7) {
            this.field875 = arg0.method2460();
        } else if (arg1 == 8) {
            this.field876 = arg0.method2534();
        } else if (arg1 == 9) {
            this.field877 = arg0.method2534();
        } else if (arg1 == 10) {
            this.field871 = arg0.method2534();
        } else if (arg1 == 11) {
            this.field879 = arg0.method2534();
        } else if (arg1 == 12) {
            int var9 = arg0.method2534();
            this.field861 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field861[var10] = arg0.method2460();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field861[var11] += arg0.method2460() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2534();
            this.field883 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field883[var13] = arg0.method2462();
            }
        }
    }

    @ObfuscatedName("aq.n(I)V")
    public void method712() {
        if (this.field877 == -1) {
            if (this.field866 == null) {
                this.field877 = 0;
            } else {
                this.field877 = 2;
            }
        }
        if (this.field871 != -1) {
            return;
        }
        if (this.field866 == null) {
            this.field871 = 0;
        } else {
            this.field871 = 2;
        }
    }

    @ObfuscatedName("aq.s(Ldw;IS)Ldw;")
    public class112 method710(class112 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class109 var4 = method112(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2266(true);
        } else {
            class112 var6 = arg0.method2266(!var4.method2225(var5));
            var6.method2251(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.x(Ldw;III)Ldw;")
    public class112 method713(class112 arg0, int arg1, int arg2) {
        int var4 = this.field863[arg1];
        class109 var5 = method112(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2266(true);
        }
        class112 var7 = arg0.method2266(!var5.method2225(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2256();
        } else if (var8 == 2) {
            var7.method2296();
        } else if (var8 == 3) {
            var7.method2254();
        }
        var7.method2251(var5, var6);
        if (var8 == 1) {
            var7.method2254();
        } else if (var8 == 2) {
            var7.method2296();
        } else if (var8 == 3) {
            var7.method2256();
        }
        return var7;
    }

    @ObfuscatedName("aq.b(Ldw;II)Ldw;")
    public class112 method714(class112 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class109 var4 = method112(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2246(true);
        } else {
            class112 var6 = arg0.method2246(!var4.method2225(var5));
            var6.method2251(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.j(Ldw;ILaq;IB)Ldw;")
    public class112 method715(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field863[arg1];
        class109 var6 = method112(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method710(arg0, arg3);
        }
        int var8 = arg2.field863[arg3];
        class109 var9 = method112(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2266(!var6.method2225(var7));
            var11.method2251(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2266(!var6.method2225(var7) & !var9.method2225(var10));
            var12.method2252(var6, var7, var9, var10, this.field866);
            return var12;
        }
    }

    @ObfuscatedName("aq.p(Ldw;IS)Ldw;")
    public class112 method716(class112 arg0, int arg1) {
        int var3 = this.field863[arg1];
        class109 var4 = method112(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2266(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field861 != null && arg1 < this.field861.length) {
            int var8 = this.field861[arg1];
            var6 = method112(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2266(!var4.method2225(var5));
            var10.method2251(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2266(!var4.method2225(var5) & !var6.method2225(var7));
            var9.method2251(var4, var5);
            var9.method2251(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("i.l(II)Ldy;")
    public static class109 method112(int arg0) {
        class109 var1 = (class109) field865.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class152 var2 = Statics.field862;
        class152 var3 = Statics.field867;
        boolean var4 = true;
        int[] var5 = var2.method3033(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2997(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2997(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class109 var10;
        if (var4) {
            try {
                var10 = new class109(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field865.method3291(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ax.i(B)V")
    public static void method589() {
        field864.method3297();
        field865.method3297();
    }
}
