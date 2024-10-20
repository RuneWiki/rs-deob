package deob;

@ObfuscatedName("ao")
public class class31 extends class174 {

    @ObfuscatedName("ao.o")
    public static class170 field775 = new class170(64);

    @ObfuscatedName("ao.n")
    public static class170 field776 = new class170(50);

    @ObfuscatedName("ao.l")
    public int field811;

    @ObfuscatedName("ao.v")
    public String field797 = "null";

    @ObfuscatedName("ao.g")
    public int field779 = 1;

    @ObfuscatedName("ao.x")
    public int[] field780;

    @ObfuscatedName("ao.c")
    public int[] field781;

    @ObfuscatedName("ao.f")
    public int field782 = -1;

    @ObfuscatedName("ao.r")
    public int field809 = -1;

    @ObfuscatedName("ao.d")
    public int field784 = -1;

    @ObfuscatedName("ao.a")
    public int field789 = -1;

    @ObfuscatedName("ao.q")
    public int field786 = -1;

    @ObfuscatedName("ao.u")
    public int field793 = -1;

    @ObfuscatedName("ao.w")
    public int field788 = -1;

    @ObfuscatedName("ao.s")
    public short[] field785;

    @ObfuscatedName("ao.e")
    public short[] field787;

    @ObfuscatedName("ao.b")
    public short[] field791;

    @ObfuscatedName("ao.j")
    public short[] field792;

    @ObfuscatedName("ao.h")
    public String[] field783 = new String[5];

    @ObfuscatedName("ao.m")
    public boolean field794 = true;

    @ObfuscatedName("ao.y")
    public int field790 = -1;

    @ObfuscatedName("ao.t")
    public int field796 = 128;

    @ObfuscatedName("ao.k")
    public int field773 = 128;

    @ObfuscatedName("ao.z")
    public boolean field798 = false;

    @ObfuscatedName("ao.at")
    public int field799 = 0;

    @ObfuscatedName("ao.ay")
    public int field777 = 0;

    @ObfuscatedName("ao.ae")
    public int field804 = -1;

    @ObfuscatedName("ao.af")
    public int field802 = 32;

    @ObfuscatedName("ao.ao")
    public int[] field803;

    @ObfuscatedName("ao.ad")
    public int field801 = -1;

    @ObfuscatedName("ao.aj")
    public int field805 = -1;

    @ObfuscatedName("ao.ah")
    public boolean field806 = true;

    @ObfuscatedName("ao.aq")
    public boolean field807 = true;

    @ObfuscatedName("cw.p(Lep;Lep;I)V")
    public static void method1682(class152 arg0, class152 arg1) {
        Statics.field800 = arg0;
        Statics.field778 = arg1;
    }

    @ObfuscatedName("em.i(II)Lao;")
    public static class31 method2723(int arg0) {
        class31 var1 = (class31) field775.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field800.method3049(9, arg0);
        class31 var3 = new class31();
        var3.field811 = arg0;
        if (var2 != null) {
            var3.method645(new class127(var2));
        }
        var3.method629();
        field775.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.o(B)V")
    public void method629() {
    }

    @ObfuscatedName("ao.n(Ldt;B)V")
    public void method645(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method631(arg0, var2);
        }
    }

    @ObfuscatedName("ao.l(Ldt;II)V")
    public void method631(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2659();
            this.field780 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field780[var4] = arg0.method2652();
            }
        } else if (arg1 == 2) {
            this.field797 = arg0.method2490();
        } else if (arg1 == 12) {
            this.field779 = arg0.method2659();
        } else if (arg1 == 13) {
            this.field782 = arg0.method2652();
        } else if (arg1 == 14) {
            this.field789 = arg0.method2652();
        } else if (arg1 == 15) {
            this.field809 = arg0.method2652();
        } else if (arg1 == 16) {
            this.field784 = arg0.method2652();
        } else if (arg1 == 17) {
            this.field789 = arg0.method2652();
            this.field786 = arg0.method2652();
            this.field793 = arg0.method2652();
            this.field788 = arg0.method2652();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field783[arg1 - 30] = arg0.method2490();
            if (this.field783[arg1 - 30].equalsIgnoreCase(class134.field2091)) {
                this.field783[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2659();
            this.field785 = new short[var5];
            this.field787 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field785[var6] = (short) arg0.method2652();
                this.field787[var6] = (short) arg0.method2652();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2659();
            this.field791 = new short[var7];
            this.field792 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field791[var8] = (short) arg0.method2652();
                this.field792[var8] = (short) arg0.method2652();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2659();
            this.field781 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field781[var10] = arg0.method2652();
            }
        } else if (arg1 == 93) {
            this.field794 = false;
        } else if (arg1 == 95) {
            this.field790 = arg0.method2652();
        } else if (arg1 == 97) {
            this.field796 = arg0.method2652();
        } else if (arg1 == 98) {
            this.field773 = arg0.method2652();
        } else if (arg1 == 99) {
            this.field798 = true;
        } else if (arg1 == 100) {
            this.field799 = arg0.method2656();
        } else if (arg1 == 101) {
            this.field777 = arg0.method2656();
        } else if (arg1 == 102) {
            this.field804 = arg0.method2652();
        } else if (arg1 == 103) {
            this.field802 = arg0.method2652();
        } else if (arg1 == 106) {
            this.field801 = arg0.method2652();
            if (this.field801 == 65535) {
                this.field801 = -1;
            }
            this.field805 = arg0.method2652();
            if (this.field805 == 65535) {
                this.field805 = -1;
            }
            int var11 = arg0.method2659();
            this.field803 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field803[var12] = arg0.method2652();
                if (this.field803[var12] == 65535) {
                    this.field803[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field806 = false;
        } else if (arg1 == 109) {
            this.field807 = false;
        }
    }

    @ObfuscatedName("ao.v(Lah;ILah;II)Ldj;")
    public final class112 method632(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field803 != null) {
            class31 var5 = this.method634();
            return var5 == null ? null : var5.method632(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field776.method3264((long) this.field811);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field780.length; var8++) {
                if (!Statics.field778.method3038(this.field780[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field780.length];
            for (int var10 = 0; var10 < this.field780.length; var10++) {
                var9[var10] = class101.method2078(Statics.field778, this.field780[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field785 != null) {
                for (int var12 = 0; var12 < this.field785.length; var12++) {
                    var11.method2092(this.field785[var12], this.field787[var12]);
                }
            }
            if (this.field791 != null) {
                for (int var13 = 0; var13 < this.field791.length; var13++) {
                    var11.method2093(this.field791[var13], this.field792[var13]);
                }
            }
            var6 = var11.method2099(this.field799 + 64, this.field777 * 5 + 850, -30, -50, -30);
            field776.method3269(var6, (long) this.field811);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method739(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method732(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2268(true);
        } else {
            var14 = arg2.method732(var6, arg3);
        }
        if (this.field796 != 128 || this.field773 != 128) {
            var14.method2274(this.field796, this.field773, this.field796);
        }
        return var14;
    }

    @ObfuscatedName("ao.g(I)Lcf;")
    public final class101 method633() {
        if (this.field803 != null) {
            class31 var1 = this.method634();
            return var1 == null ? null : var1.method633();
        } else if (this.field781 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field781.length; var3++) {
                if (!Statics.field778.method3038(this.field781[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field781.length];
            for (int var5 = 0; var5 < this.field781.length; var5++) {
                var4[var5] = class101.method2078(Statics.field778, this.field781[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field785 != null) {
                for (int var7 = 0; var7 < this.field785.length; var7++) {
                    var6.method2092(this.field785[var7], this.field787[var7]);
                }
            }
            if (this.field791 != null) {
                for (int var8 = 0; var8 < this.field791.length; var8++) {
                    var6.method2093(this.field791[var8], this.field792[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ao.x(I)Lao;")
    public final class31 method634() {
        int var1 = -1;
        if (this.field801 != -1) {
            var1 = class159.method1349(this.field801);
        } else if (this.field805 != -1) {
            var1 = class159.field2703[this.field805];
        }
        return var1 < 0 || var1 >= this.field803.length || this.field803[var1] == -1 ? null : method2723(this.field803[var1]);
    }

    @ObfuscatedName("ao.c(S)Z")
    public boolean method661() {
        if (this.field803 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field801 != -1) {
            var1 = class159.method1349(this.field801);
        } else if (this.field805 != -1) {
            var1 = class159.field2703[this.field805];
        }
        return var1 >= 0 && var1 < this.field803.length && this.field803[var1] != -1;
    }

    @ObfuscatedName("t.f(B)V")
    public static void method221() {
        field775.method3265();
        field776.method3265();
    }
}
