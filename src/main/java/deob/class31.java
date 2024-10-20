package deob;

@ObfuscatedName("ax")
public class class31 extends class174 {

    @ObfuscatedName("ax.a")
    public static class170 field768 = new class170(64);

    @ObfuscatedName("ax.h")
    public static class170 field769 = new class170(50);

    @ObfuscatedName("ax.y")
    public int field801;

    @ObfuscatedName("ax.j")
    public String field794 = "null";

    @ObfuscatedName("ax.l")
    public int field766 = 1;

    @ObfuscatedName("ax.f")
    public int[] field803;

    @ObfuscatedName("ax.n")
    public int[] field774;

    @ObfuscatedName("ax.k")
    public int field799 = -1;

    @ObfuscatedName("ax.q")
    public int field788 = -1;

    @ObfuscatedName("ax.w")
    public int field777 = -1;

    @ObfuscatedName("ax.v")
    public int field778 = -1;

    @ObfuscatedName("ax.z")
    public int field779 = -1;

    @ObfuscatedName("ax.m")
    public int field780 = -1;

    @ObfuscatedName("ax.r")
    public int field781 = -1;

    @ObfuscatedName("ax.u")
    public short[] field782;

    @ObfuscatedName("ax.i")
    public short[] field783;

    @ObfuscatedName("ax.x")
    public short[] field784;

    @ObfuscatedName("ax.s")
    public short[] field785;

    @ObfuscatedName("ax.o")
    public String[] field786 = new String[5];

    @ObfuscatedName("ax.g")
    public boolean field787 = true;

    @ObfuscatedName("ax.d")
    public int field776 = -1;

    @ObfuscatedName("ax.t")
    public int field804 = 128;

    @ObfuscatedName("ax.b")
    public int field793 = 128;

    @ObfuscatedName("ax.c")
    public boolean field772 = false;

    @ObfuscatedName("ax.aw")
    public int field771 = 0;

    @ObfuscatedName("ax.ap")
    public int field770 = 0;

    @ObfuscatedName("ax.am")
    public int field773 = -1;

    @ObfuscatedName("ax.az")
    public int field795 = 32;

    @ObfuscatedName("ax.ax")
    public int[] field796;

    @ObfuscatedName("ax.af")
    public int field797 = -1;

    @ObfuscatedName("ax.aa")
    public int field798 = -1;

    @ObfuscatedName("ax.ag")
    public boolean field790 = true;

    @ObfuscatedName("ax.aj")
    public boolean field800 = true;

    @ObfuscatedName("ar.p(II)Lax;")
    public static class31 method843(int arg0) {
        class31 var1 = (class31) field768.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field791.method3048(9, arg0);
        class31 var3 = new class31();
        var3.field801 = arg0;
        if (var2 != null) {
            var3.method624(new class127(var2));
        }
        var3.method625();
        field768.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.e(I)V")
    public void method625() {
    }

    @ObfuscatedName("ax.a(Ldj;S)V")
    public void method624(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method642(arg0, var2);
        }
    }

    @ObfuscatedName("ax.h(Ldj;II)V")
    public void method642(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2494();
            this.field803 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field803[var4] = arg0.method2496();
            }
        } else if (arg1 == 2) {
            this.field794 = arg0.method2502();
        } else if (arg1 == 12) {
            this.field766 = arg0.method2494();
        } else if (arg1 == 13) {
            this.field799 = arg0.method2496();
        } else if (arg1 == 14) {
            this.field778 = arg0.method2496();
        } else if (arg1 == 15) {
            this.field788 = arg0.method2496();
        } else if (arg1 == 16) {
            this.field777 = arg0.method2496();
        } else if (arg1 == 17) {
            this.field778 = arg0.method2496();
            this.field779 = arg0.method2496();
            this.field780 = arg0.method2496();
            this.field781 = arg0.method2496();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field786[arg1 - 30] = arg0.method2502();
            if (this.field786[arg1 - 30].equalsIgnoreCase(class135.field2101)) {
                this.field786[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2494();
            this.field782 = new short[var5];
            this.field783 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field782[var6] = (short) arg0.method2496();
                this.field783[var6] = (short) arg0.method2496();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2494();
            this.field784 = new short[var7];
            this.field785 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field784[var8] = (short) arg0.method2496();
                this.field785[var8] = (short) arg0.method2496();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2494();
            this.field774 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field774[var10] = arg0.method2496();
            }
        } else if (arg1 == 93) {
            this.field787 = false;
        } else if (arg1 == 95) {
            this.field776 = arg0.method2496();
        } else if (arg1 == 97) {
            this.field804 = arg0.method2496();
        } else if (arg1 == 98) {
            this.field793 = arg0.method2496();
        } else if (arg1 == 99) {
            this.field772 = true;
        } else if (arg1 == 100) {
            this.field771 = arg0.method2604();
        } else if (arg1 == 101) {
            this.field770 = arg0.method2604() * 5;
        } else if (arg1 == 102) {
            this.field773 = arg0.method2496();
        } else if (arg1 == 103) {
            this.field795 = arg0.method2496();
        } else if (arg1 == 106) {
            this.field797 = arg0.method2496();
            if (this.field797 == 65535) {
                this.field797 = -1;
            }
            this.field798 = arg0.method2496();
            if (this.field798 == 65535) {
                this.field798 = -1;
            }
            int var11 = arg0.method2494();
            this.field796 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field796[var12] = arg0.method2496();
                if (this.field796[var12] == 65535) {
                    this.field796[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field790 = false;
        } else if (arg1 == 109) {
            this.field800 = false;
        }
    }

    @ObfuscatedName("ax.y(Lag;ILag;IB)Lds;")
    public final class112 method631(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field796 != null) {
            class31 var5 = this.method629();
            return var5 == null ? null : var5.method631(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field769.method3266((long) this.field801);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field803.length; var8++) {
                if (!Statics.field767.method3050(this.field803[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field803.length];
            for (int var10 = 0; var10 < this.field803.length; var10++) {
                var9[var10] = class101.method2070(Statics.field767, this.field803[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field782 != null) {
                for (int var12 = 0; var12 < this.field782.length; var12++) {
                    var11.method2083(this.field782[var12], this.field783[var12]);
                }
            }
            if (this.field784 != null) {
                for (int var13 = 0; var13 < this.field784.length; var13++) {
                    var11.method2084(this.field784[var13], this.field785[var13]);
                }
            }
            var6 = var11.method2090(this.field771 + 64, this.field770 + 850, -30, -50, -30);
            field769.method3268(var6, (long) this.field801);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method723(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method717(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2257(true);
        } else {
            var14 = arg2.method717(var6, arg3);
        }
        if (this.field804 != 128 || this.field793 != 128) {
            var14.method2271(this.field804, this.field793, this.field804);
        }
        return var14;
    }

    @ObfuscatedName("ax.j(B)Lch;")
    public final class101 method637() {
        if (this.field796 != null) {
            class31 var1 = this.method629();
            return var1 == null ? null : var1.method637();
        } else if (this.field774 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field774.length; var3++) {
                if (!Statics.field767.method3050(this.field774[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field774.length];
            for (int var5 = 0; var5 < this.field774.length; var5++) {
                var4[var5] = class101.method2070(Statics.field767, this.field774[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field782 != null) {
                for (int var7 = 0; var7 < this.field782.length; var7++) {
                    var6.method2083(this.field782[var7], this.field783[var7]);
                }
            }
            if (this.field784 != null) {
                for (int var8 = 0; var8 < this.field784.length; var8++) {
                    var6.method2084(this.field784[var8], this.field785[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ax.l(I)Lax;")
    public final class31 method629() {
        int var1 = -1;
        if (this.field797 != -1) {
            var1 = class160.method2809(this.field797);
        } else if (this.field798 != -1) {
            var1 = class160.field2709[this.field798];
        }
        return var1 < 0 || var1 >= this.field796.length || this.field796[var1] == -1 ? null : method843(this.field796[var1]);
    }

    @ObfuscatedName("ax.f(B)Z")
    public boolean method626() {
        if (this.field796 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field797 != -1) {
            var1 = class160.method2809(this.field797);
        } else if (this.field798 != -1) {
            var1 = class160.field2709[this.field798];
        }
        return var1 >= 0 && var1 < this.field796.length && this.field796[var1] != -1;
    }
}
