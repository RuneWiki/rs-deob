package deob;

@ObfuscatedName("al")
public class class30 extends class173 {

    @ObfuscatedName("al.x")
    public static class169 field786 = new class169(64);

    @ObfuscatedName("al.m")
    public static class169 field769 = new class169(50);

    @ObfuscatedName("al.n")
    public int field791;

    @ObfuscatedName("al.q")
    public String field771 = "null";

    @ObfuscatedName("al.a")
    public int field772 = 1;

    @ObfuscatedName("al.g")
    public int[] field773;

    @ObfuscatedName("al.j")
    public int[] field774;

    @ObfuscatedName("al.l")
    public int field768 = -1;

    @ObfuscatedName("al.w")
    public int field775 = -1;

    @ObfuscatedName("al.z")
    public int field777 = -1;

    @ObfuscatedName("al.e")
    public int field776 = -1;

    @ObfuscatedName("al.b")
    public int field779 = -1;

    @ObfuscatedName("al.c")
    public int field780 = -1;

    @ObfuscatedName("al.d")
    public int field781 = -1;

    @ObfuscatedName("al.h")
    public short[] field782;

    @ObfuscatedName("al.i")
    public short[] field792;

    @ObfuscatedName("al.v")
    public short[] field784;

    @ObfuscatedName("al.s")
    public short[] field785;

    @ObfuscatedName("al.f")
    public String[] field800 = new String[5];

    @ObfuscatedName("al.y")
    public boolean field789 = true;

    @ObfuscatedName("al.t")
    public int field788 = -1;

    @ObfuscatedName("al.r")
    public int field787 = 128;

    @ObfuscatedName("al.p")
    public int field790 = 128;

    @ObfuscatedName("al.o")
    public boolean field767 = false;

    @ObfuscatedName("al.ax")
    public int field783 = 0;

    @ObfuscatedName("al.aa")
    public int field793 = 0;

    @ObfuscatedName("al.af")
    public int field794 = -1;

    @ObfuscatedName("al.al")
    public int field795 = 32;

    @ObfuscatedName("al.av")
    public int[] field796;

    @ObfuscatedName("al.ab")
    public int field797 = -1;

    @ObfuscatedName("al.ad")
    public int field798 = -1;

    @ObfuscatedName("al.ai")
    public boolean field799 = true;

    @ObfuscatedName("al.ak")
    public boolean field770 = true;

    @ObfuscatedName("cf.u(Leb;Leb;I)V")
    public static void method1851(class151 arg0, class151 arg1) {
        Statics.field802 = arg0;
        Statics.field807 = arg1;
    }

    @ObfuscatedName("al.x(I)V")
    public void method596() {
    }

    @ObfuscatedName("al.m(Ldl;I)V")
    public void method578(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method579(arg0, var2);
        }
    }

    @ObfuscatedName("al.n(Ldl;II)V")
    public void method579(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2559();
            this.field773 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field773[var4] = arg0.method2450();
            }
        } else if (arg1 == 2) {
            this.field771 = arg0.method2630();
        } else if (arg1 == 12) {
            this.field772 = arg0.method2559();
        } else if (arg1 == 13) {
            this.field768 = arg0.method2450();
        } else if (arg1 == 14) {
            this.field776 = arg0.method2450();
        } else if (arg1 == 15) {
            this.field775 = arg0.method2450();
        } else if (arg1 == 16) {
            this.field777 = arg0.method2450();
        } else if (arg1 == 17) {
            this.field776 = arg0.method2450();
            this.field779 = arg0.method2450();
            this.field780 = arg0.method2450();
            this.field781 = arg0.method2450();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field800[arg1 - 30] = arg0.method2630();
            if (this.field800[arg1 - 30].equalsIgnoreCase(class133.field2227)) {
                this.field800[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2559();
            this.field782 = new short[var5];
            this.field792 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field782[var6] = (short) arg0.method2450();
                this.field792[var6] = (short) arg0.method2450();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2559();
            this.field784 = new short[var7];
            this.field785 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field784[var8] = (short) arg0.method2450();
                this.field785[var8] = (short) arg0.method2450();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2559();
            this.field774 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field774[var10] = arg0.method2450();
            }
        } else if (arg1 == 93) {
            this.field789 = false;
        } else if (arg1 == 95) {
            this.field788 = arg0.method2450();
        } else if (arg1 == 97) {
            this.field787 = arg0.method2450();
        } else if (arg1 == 98) {
            this.field790 = arg0.method2450();
        } else if (arg1 == 99) {
            this.field767 = true;
        } else if (arg1 == 100) {
            this.field783 = arg0.method2449();
        } else if (arg1 == 101) {
            this.field793 = arg0.method2449() * 5;
        } else if (arg1 == 102) {
            this.field794 = arg0.method2450();
        } else if (arg1 == 103) {
            this.field795 = arg0.method2450();
        } else if (arg1 == 106) {
            this.field797 = arg0.method2450();
            if (this.field797 == 65535) {
                this.field797 = -1;
            }
            this.field798 = arg0.method2450();
            if (this.field798 == 65535) {
                this.field798 = -1;
            }
            int var11 = arg0.method2559();
            this.field796 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field796[var12] = arg0.method2450();
                if (this.field796[var12] == 65535) {
                    this.field796[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field799 = false;
        } else if (arg1 == 109) {
            this.field770 = false;
        }
    }

    @ObfuscatedName("al.q(Lad;ILad;IB)Ldd;")
    public final class111 method585(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field796 != null) {
            class30 var5 = this.method582();
            return var5 == null ? null : var5.method585(arg0, arg1, arg2, arg3);
        }
        class111 var6 = (class111) field769.method3263((long) this.field791);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field773.length; var8++) {
                if (!Statics.field807.method3013(this.field773[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field773.length];
            for (int var10 = 0; var10 < this.field773.length; var10++) {
                var9[var10] = class100.method2044(Statics.field807, this.field773[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field782 != null) {
                for (int var12 = 0; var12 < this.field782.length; var12++) {
                    var11.method2107(this.field782[var12], this.field792[var12]);
                }
            }
            if (this.field784 != null) {
                for (int var13 = 0; var13 < this.field784.length; var13++) {
                    var11.method2110(this.field784[var13], this.field785[var13]);
                }
            }
            var6 = var11.method2064(this.field783 + 64, this.field793 + 850, -30, -50, -30);
            field769.method3260(var6, (long) this.field791);
        }
        class111 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method678(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method692(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2234(true);
        } else {
            var14 = arg2.method692(var6, arg3);
        }
        if (this.field787 != 128 || this.field790 != 128) {
            var14.method2279(this.field787, this.field790, this.field787);
        }
        return var14;
    }

    @ObfuscatedName("al.a(B)Lcj;")
    public final class100 method581() {
        if (this.field796 != null) {
            class30 var1 = this.method582();
            return var1 == null ? null : var1.method581();
        } else if (this.field774 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field774.length; var3++) {
                if (!Statics.field807.method3013(this.field774[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field774.length];
            for (int var5 = 0; var5 < this.field774.length; var5++) {
                var4[var5] = class100.method2044(Statics.field807, this.field774[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field782 != null) {
                for (int var7 = 0; var7 < this.field782.length; var7++) {
                    var6.method2107(this.field782[var7], this.field792[var7]);
                }
            }
            if (this.field784 != null) {
                for (int var8 = 0; var8 < this.field784.length; var8++) {
                    var6.method2110(this.field784[var8], this.field785[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("al.g(I)Lal;")
    public final class30 method582() {
        int var1 = -1;
        if (this.field797 != -1) {
            var1 = class158.method3077(this.field797);
        } else if (this.field798 != -1) {
            var1 = class158.field2687[this.field798];
        }
        return var1 < 0 || var1 >= this.field796.length || this.field796[var1] == -1 ? null : Statics.method202(this.field796[var1]);
    }

    @ObfuscatedName("al.j(I)Z")
    public boolean method583() {
        if (this.field796 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field797 != -1) {
            var1 = class158.method3077(this.field797);
        } else if (this.field798 != -1) {
            var1 = class158.field2687[this.field798];
        }
        return var1 >= 0 && var1 < this.field796.length && this.field796[var1] != -1;
    }

    @ObfuscatedName("ao.l(I)V")
    public static void method782() {
        field786.method3261();
        field769.method3261();
    }
}
