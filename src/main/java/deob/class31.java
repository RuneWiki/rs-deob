package deob;

@ObfuscatedName("ax")
public class class31 extends class174 {

    @ObfuscatedName("ax.a")
    public static class170 field782 = new class170(64);

    @ObfuscatedName("ax.t")
    public static class170 field762 = new class170(50);

    @ObfuscatedName("ax.f")
    public int field763;

    @ObfuscatedName("ax.c")
    public String field764 = "null";

    @ObfuscatedName("ax.p")
    public int field769 = 1;

    @ObfuscatedName("ax.s")
    public int[] field766;

    @ObfuscatedName("ax.k")
    public int[] field767;

    @ObfuscatedName("ax.m")
    public int field777 = -1;

    @ObfuscatedName("ax.y")
    public int field761 = -1;

    @ObfuscatedName("ax.b")
    public int field791 = -1;

    @ObfuscatedName("ax.l")
    public int field771 = -1;

    @ObfuscatedName("ax.x")
    public int field772 = -1;

    @ObfuscatedName("ax.z")
    public int field773 = -1;

    @ObfuscatedName("ax.r")
    public int field774 = -1;

    @ObfuscatedName("ax.h")
    public short[] field775;

    @ObfuscatedName("ax.v")
    public short[] field776;

    @ObfuscatedName("ax.u")
    public short[] field786;

    @ObfuscatedName("ax.i")
    public short[] field778;

    @ObfuscatedName("ax.e")
    public String[] field783 = new String[5];

    @ObfuscatedName("ax.n")
    public boolean field780 = true;

    @ObfuscatedName("ax.q")
    public int field781 = -1;

    @ObfuscatedName("ax.w")
    public int field794 = 128;

    @ObfuscatedName("ax.o")
    public int field770 = 128;

    @ObfuscatedName("ax.j")
    public boolean field784 = false;

    @ObfuscatedName("ax.ae")
    public int field759 = 0;

    @ObfuscatedName("ax.aq")
    public int field785 = 0;

    @ObfuscatedName("ax.ap")
    public int field787 = -1;

    @ObfuscatedName("ax.ah")
    public int field788 = 32;

    @ObfuscatedName("ax.ax")
    public int[] field789;

    @ObfuscatedName("ax.ai")
    public int field790 = -1;

    @ObfuscatedName("ax.aa")
    public int field779 = -1;

    @ObfuscatedName("ax.ar")
    public boolean field760 = true;

    @ObfuscatedName("ax.ak")
    public boolean field793 = true;

    @ObfuscatedName("br.d(Lej;Lej;B)V")
    public static void method1375(class152 arg0, class152 arg1) {
        Statics.field792 = arg0;
        Statics.field765 = arg1;
    }

    @ObfuscatedName("o.g(IB)Lax;")
    public static class31 method213(int arg0) {
        class31 var1 = (class31) field782.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field792.method2958(9, arg0);
        class31 var3 = new class31();
        var3.field763 = arg0;
        if (var2 != null) {
            var3.method581(new class127(var2));
        }
        var3.method579();
        field782.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.a(B)V")
    public void method579() {
    }

    @ObfuscatedName("ax.t(Ldo;I)V")
    public void method581(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method603(arg0, var2);
        }
    }

    @ObfuscatedName("ax.f(Ldo;IB)V")
    public void method603(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2509();
            this.field766 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field766[var4] = arg0.method2512();
            }
        } else if (arg1 == 2) {
            this.field764 = arg0.method2408();
        } else if (arg1 == 12) {
            this.field769 = arg0.method2509();
        } else if (arg1 == 13) {
            this.field777 = arg0.method2512();
        } else if (arg1 == 14) {
            this.field771 = arg0.method2512();
        } else if (arg1 == 15) {
            this.field761 = arg0.method2512();
        } else if (arg1 == 16) {
            this.field791 = arg0.method2512();
        } else if (arg1 == 17) {
            this.field771 = arg0.method2512();
            this.field772 = arg0.method2512();
            this.field773 = arg0.method2512();
            this.field774 = arg0.method2512();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field783[arg1 - 30] = arg0.method2408();
            if (this.field783[arg1 - 30].equalsIgnoreCase(class134.field2081)) {
                this.field783[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2509();
            this.field775 = new short[var5];
            this.field776 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field775[var6] = (short) arg0.method2512();
                this.field776[var6] = (short) arg0.method2512();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2509();
            this.field786 = new short[var7];
            this.field778 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field786[var8] = (short) arg0.method2512();
                this.field778[var8] = (short) arg0.method2512();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2509();
            this.field767 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field767[var10] = arg0.method2512();
            }
        } else if (arg1 == 93) {
            this.field780 = false;
        } else if (arg1 == 95) {
            this.field781 = arg0.method2512();
        } else if (arg1 == 97) {
            this.field794 = arg0.method2512();
        } else if (arg1 == 98) {
            this.field770 = arg0.method2512();
        } else if (arg1 == 99) {
            this.field784 = true;
        } else if (arg1 == 100) {
            this.field759 = arg0.method2500();
        } else if (arg1 == 101) {
            this.field785 = arg0.method2500() * 5;
        } else if (arg1 == 102) {
            this.field787 = arg0.method2512();
        } else if (arg1 == 103) {
            this.field788 = arg0.method2512();
        } else if (arg1 == 106) {
            this.field790 = arg0.method2512();
            if (this.field790 == 65535) {
                this.field790 = -1;
            }
            this.field779 = arg0.method2512();
            if (this.field779 == 65535) {
                this.field779 = -1;
            }
            int var11 = arg0.method2509();
            this.field789 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field789[var12] = arg0.method2512();
                if (this.field789[var12] == 65535) {
                    this.field789[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field760 = false;
        } else if (arg1 == 109) {
            this.field793 = false;
        }
    }

    @ObfuscatedName("ax.c(Lar;ILar;IB)Ldd;")
    public final class112 method583(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field789 != null) {
            class31 var5 = this.method585();
            return var5 == null ? null : var5.method583(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field762.method3210((long) this.field763);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field766.length; var8++) {
                if (!Statics.field765.method2999(this.field766[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field766.length];
            for (int var10 = 0; var10 < this.field766.length; var10++) {
                var9[var10] = class101.method2016(Statics.field765, this.field766[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field775 != null) {
                for (int var12 = 0; var12 < this.field775.length; var12++) {
                    var11.method2035(this.field775[var12], this.field776[var12]);
                }
            }
            if (this.field786 != null) {
                for (int var13 = 0; var13 < this.field786.length; var13++) {
                    var11.method2017(this.field786[var13], this.field778[var13]);
                }
            }
            var6 = var11.method2013(this.field759 + 64, this.field785 + 850, -30, -50, -30);
            field762.method3221(var6, (long) this.field763);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method674(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method687(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2187(true);
        } else {
            var14 = arg2.method687(var6, arg3);
        }
        if (this.field794 != 128 || this.field770 != 128) {
            var14.method2201(this.field794, this.field770, this.field794);
        }
        return var14;
    }

    @ObfuscatedName("ax.p(I)Lcr;")
    public final class101 method582() {
        if (this.field789 != null) {
            class31 var1 = this.method585();
            return var1 == null ? null : var1.method582();
        } else if (this.field767 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field767.length; var3++) {
                if (!Statics.field765.method2999(this.field767[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field767.length];
            for (int var5 = 0; var5 < this.field767.length; var5++) {
                var4[var5] = class101.method2016(Statics.field765, this.field767[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field775 != null) {
                for (int var7 = 0; var7 < this.field775.length; var7++) {
                    var6.method2035(this.field775[var7], this.field776[var7]);
                }
            }
            if (this.field786 != null) {
                for (int var8 = 0; var8 < this.field786.length; var8++) {
                    var6.method2017(this.field786[var8], this.field778[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ax.s(B)Lax;")
    public final class31 method585() {
        int var1 = -1;
        if (this.field790 != -1) {
            var1 = Statics.method2894(this.field790);
        } else if (this.field779 != -1) {
            var1 = class159.field2715[this.field779];
        }
        return var1 < 0 || var1 >= this.field789.length || this.field789[var1] == -1 ? null : method213(this.field789[var1]);
    }

    @ObfuscatedName("ax.k(B)Z")
    public boolean method586() {
        if (this.field789 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field790 != -1) {
            var1 = Statics.method2894(this.field790);
        } else if (this.field779 != -1) {
            var1 = class159.field2715[this.field779];
        }
        return var1 >= 0 && var1 < this.field789.length && this.field789[var1] != -1;
    }
}
