package deob;

@ObfuscatedName("al")
public class class35 extends class181 {

    @ObfuscatedName("al.a")
    public static class171 field769 = new class171(64);

    @ObfuscatedName("al.y")
    public static class171 field770 = new class171(50);

    @ObfuscatedName("al.i")
    public int field771;

    @ObfuscatedName("al.b")
    public String field802 = "null";

    @ObfuscatedName("al.s")
    public int field790 = 1;

    @ObfuscatedName("al.q")
    public int[] field774;

    @ObfuscatedName("al.p")
    public int[] field775;

    @ObfuscatedName("al.h")
    public int field767 = -1;

    @ObfuscatedName("al.r")
    public int field777 = -1;

    @ObfuscatedName("al.o")
    public int field778 = -1;

    @ObfuscatedName("al.f")
    public int field779 = -1;

    @ObfuscatedName("al.u")
    public int field780 = -1;

    @ObfuscatedName("al.c")
    public int field782 = -1;

    @ObfuscatedName("al.l")
    public int field803 = -1;

    @ObfuscatedName("al.w")
    public short[] field773;

    @ObfuscatedName("al.x")
    public short[] field784;

    @ObfuscatedName("al.t")
    public short[] field804;

    @ObfuscatedName("al.k")
    public short[] field786;

    @ObfuscatedName("al.e")
    public String[] field787 = new String[5];

    @ObfuscatedName("al.v")
    public boolean field788 = true;

    @ObfuscatedName("al.n")
    public int field789 = -1;

    @ObfuscatedName("al.d")
    public int field797 = 128;

    @ObfuscatedName("al.m")
    public int field791 = 128;

    @ObfuscatedName("al.g")
    public boolean field792 = false;

    @ObfuscatedName("al.aq")
    public int field793 = 0;

    @ObfuscatedName("al.ao")
    public int field772 = 0;

    @ObfuscatedName("al.af")
    public int field795 = -1;

    @ObfuscatedName("al.ag")
    public int field796 = 32;

    @ObfuscatedName("al.ad")
    public int[] field785;

    @ObfuscatedName("al.ak")
    public int field798 = -1;

    @ObfuscatedName("al.aj")
    public int field783 = -1;

    @ObfuscatedName("al.as")
    public boolean field800 = true;

    @ObfuscatedName("al.al")
    public boolean field799 = true;

    @ObfuscatedName("al.ai")
    public boolean field781 = false;

    @ObfuscatedName("ci.z(Ler;Ler;I)V")
    public static void method1771(class146 arg0, class146 arg1) {
        Statics.field768 = arg0;
        Statics.field794 = arg1;
    }

    @ObfuscatedName("d.j(II)Lal;")
    public static class35 method514(int arg0) {
        class35 var1 = (class35) field769.method3162((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field768.method2705(9, arg0);
        class35 var3 = new class35();
        var3.field771 = arg0;
        if (var2 != null) {
            var3.method627(new class107(var2));
        }
        var3.method600();
        field769.method3171(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.a(I)V")
    public void method600() {
    }

    @ObfuscatedName("al.y(Ldq;I)V")
    public void method627(class107 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method621(arg0, var2);
        }
    }

    @ObfuscatedName("al.i(Ldq;II)V")
    public void method621(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2122();
            this.field774 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field774[var4] = arg0.method2239();
            }
        } else if (arg1 == 2) {
            this.field802 = arg0.method2130();
        } else if (arg1 == 12) {
            this.field790 = arg0.method2122();
        } else if (arg1 == 13) {
            this.field767 = arg0.method2239();
        } else if (arg1 == 14) {
            this.field779 = arg0.method2239();
        } else if (arg1 == 15) {
            this.field777 = arg0.method2239();
        } else if (arg1 == 16) {
            this.field778 = arg0.method2239();
        } else if (arg1 == 17) {
            this.field779 = arg0.method2239();
            this.field780 = arg0.method2239();
            this.field782 = arg0.method2239();
            this.field803 = arg0.method2239();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field787[arg1 - 30] = arg0.method2130();
            if (this.field787[arg1 - 30].equalsIgnoreCase(class142.field2134)) {
                this.field787[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2122();
            this.field773 = new short[var5];
            this.field784 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field773[var6] = (short) arg0.method2239();
                this.field784[var6] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2122();
            this.field804 = new short[var7];
            this.field786 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field804[var8] = (short) arg0.method2239();
                this.field786[var8] = (short) arg0.method2239();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2122();
            this.field775 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field775[var10] = arg0.method2239();
            }
        } else if (arg1 == 93) {
            this.field788 = false;
        } else if (arg1 == 95) {
            this.field789 = arg0.method2239();
        } else if (arg1 == 97) {
            this.field797 = arg0.method2239();
        } else if (arg1 == 98) {
            this.field791 = arg0.method2239();
        } else if (arg1 == 99) {
            this.field792 = true;
        } else if (arg1 == 100) {
            this.field793 = arg0.method2201();
        } else if (arg1 == 101) {
            this.field772 = arg0.method2201() * 5;
        } else if (arg1 == 102) {
            this.field795 = arg0.method2239();
        } else if (arg1 == 103) {
            this.field796 = arg0.method2239();
        } else if (arg1 == 106) {
            this.field798 = arg0.method2239();
            if (this.field798 == 65535) {
                this.field798 = -1;
            }
            this.field783 = arg0.method2239();
            if (this.field783 == 65535) {
                this.field783 = -1;
            }
            int var11 = arg0.method2122();
            this.field785 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field785[var12] = arg0.method2239();
                if (this.field785[var12] == 65535) {
                    this.field785[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field800 = false;
        } else if (arg1 == 109) {
            this.field799 = false;
        } else if (arg1 == 111) {
            this.field781 = true;
        }
    }

    @ObfuscatedName("al.b(Law;ILaw;II)Lcu;")
    public final class98 method603(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field785 != null) {
            class35 var5 = this.method605();
            return var5 == null ? null : var5.method603(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field770.method3162((long) this.field771);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field774.length; var8++) {
                if (!Statics.field794.method2772(this.field774[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field774.length];
            for (int var10 = 0; var10 < this.field774.length; var10++) {
                var9[var10] = class93.method1883(Statics.field794, this.field774[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field773 != null) {
                for (int var12 = 0; var12 < this.field773.length; var12++) {
                    var11.method1888(this.field773[var12], this.field784[var12]);
                }
            }
            if (this.field804 != null) {
                for (int var13 = 0; var13 < this.field804.length; var13++) {
                    var11.method1930(this.field804[var13], this.field786[var13]);
                }
            }
            var6 = var11.method1897(this.field793 + 64, this.field772 + 850, -30, -50, -30);
            field770.method3171(var6, (long) this.field771);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method690(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method718(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1999(true);
        } else {
            var14 = arg2.method718(var6, arg3);
        }
        if (this.field797 != 128 || this.field791 != 128) {
            var14.method2008(this.field797, this.field791, this.field797);
        }
        return var14;
    }

    @ObfuscatedName("al.s(I)Lcy;")
    public final class93 method607() {
        if (this.field785 != null) {
            class35 var1 = this.method605();
            return var1 == null ? null : var1.method607();
        } else if (this.field775 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field775.length; var3++) {
                if (!Statics.field794.method2772(this.field775[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field775.length];
            for (int var5 = 0; var5 < this.field775.length; var5++) {
                var4[var5] = class93.method1883(Statics.field794, this.field775[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field773 != null) {
                for (int var7 = 0; var7 < this.field773.length; var7++) {
                    var6.method1888(this.field773[var7], this.field784[var7]);
                }
            }
            if (this.field804 != null) {
                for (int var8 = 0; var8 < this.field804.length; var8++) {
                    var6.method1930(this.field804[var8], this.field786[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("al.q(I)Lal;")
    public final class35 method605() {
        int var1 = -1;
        if (this.field798 != -1) {
            var1 = class154.method2824(this.field798);
        } else if (this.field783 != -1) {
            var1 = class154.field2649[this.field783];
        }
        return var1 < 0 || var1 >= this.field785.length || this.field785[var1] == -1 ? null : method514(this.field785[var1]);
    }

    @ObfuscatedName("al.p(I)Z")
    public boolean method606() {
        if (this.field785 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field798 != -1) {
            var1 = class154.method2824(this.field798);
        } else if (this.field783 != -1) {
            var1 = class154.field2649[this.field783];
        }
        return var1 >= 0 && var1 < this.field785.length && this.field785[var1] != -1;
    }
}
