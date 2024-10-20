package deob;

@ObfuscatedName("ak")
public class class31 extends class174 {

    @ObfuscatedName("ak.o")
    public static class170 field772 = new class170(64);

    @ObfuscatedName("ak.h")
    public static class170 field799 = new class170(50);

    @ObfuscatedName("ak.u")
    public int field770;

    @ObfuscatedName("ak.a")
    public String field778 = "null";

    @ObfuscatedName("ak.q")
    public int field781 = 1;

    @ObfuscatedName("ak.t")
    public int[] field773;

    @ObfuscatedName("ak.n")
    public int[] field771;

    @ObfuscatedName("ak.i")
    public int field787 = -1;

    @ObfuscatedName("ak.c")
    public int field776 = -1;

    @ObfuscatedName("ak.b")
    public int field777 = -1;

    @ObfuscatedName("ak.m")
    public int field769 = -1;

    @ObfuscatedName("ak.g")
    public int field779 = -1;

    @ObfuscatedName("ak.x")
    public int field780 = -1;

    @ObfuscatedName("ak.r")
    public int field798 = -1;

    @ObfuscatedName("ak.s")
    public short[] field782;

    @ObfuscatedName("ak.l")
    public short[] field767;

    @ObfuscatedName("ak.k")
    public short[] field784;

    @ObfuscatedName("ak.w")
    public short[] field785;

    @ObfuscatedName("ak.z")
    public String[] field768 = new String[5];

    @ObfuscatedName("ak.p")
    public boolean field775 = true;

    @ObfuscatedName("ak.v")
    public int field788 = -1;

    @ObfuscatedName("ak.d")
    public int field789 = 128;

    @ObfuscatedName("ak.e")
    public int field790 = 128;

    @ObfuscatedName("ak.y")
    public boolean field791 = false;

    @ObfuscatedName("ak.aw")
    public int field792 = 0;

    @ObfuscatedName("ak.ai")
    public int field793 = 0;

    @ObfuscatedName("ak.ah")
    public int field794 = -1;

    @ObfuscatedName("ak.ad")
    public int field795 = 32;

    @ObfuscatedName("ak.ak")
    public int[] field796;

    @ObfuscatedName("ak.ap")
    public int field774 = -1;

    @ObfuscatedName("ak.al")
    public int field783 = -1;

    @ObfuscatedName("ak.am")
    public boolean field786 = true;

    @ObfuscatedName("ak.ab")
    public boolean field800 = true;

    @ObfuscatedName("an.j(Lew;Lew;S)V")
    public static void method1163(class153 arg0, class153 arg1) {
        Statics.field797 = arg0;
        Statics.field2722 = arg1;
    }

    @ObfuscatedName("client.f(IB)Lak;")
    public static class31 method318(int arg0) {
        class31 var1 = (class31) field772.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field797.method3027(9, arg0);
        class31 var3 = new class31();
        var3.field770 = arg0;
        if (var2 != null) {
            var3.method623(new class127(var2));
        }
        var3.method622();
        field772.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.o(S)V")
    public void method622() {
    }

    @ObfuscatedName("ak.h(Ldq;I)V")
    public void method623(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method624(arg0, var2);
        }
    }

    @ObfuscatedName("ak.u(Ldq;II)V")
    public void method624(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2464();
            this.field773 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field773[var4] = arg0.method2582();
            }
        } else if (arg1 == 2) {
            this.field778 = arg0.method2518();
        } else if (arg1 == 12) {
            this.field781 = arg0.method2464();
        } else if (arg1 == 13) {
            this.field787 = arg0.method2582();
        } else if (arg1 == 14) {
            this.field769 = arg0.method2582();
        } else if (arg1 == 15) {
            this.field776 = arg0.method2582();
        } else if (arg1 == 16) {
            this.field777 = arg0.method2582();
        } else if (arg1 == 17) {
            this.field769 = arg0.method2582();
            this.field779 = arg0.method2582();
            this.field780 = arg0.method2582();
            this.field798 = arg0.method2582();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field768[arg1 - 30] = arg0.method2518();
            if (this.field768[arg1 - 30].equalsIgnoreCase(class135.field2099)) {
                this.field768[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2464();
            this.field782 = new short[var5];
            this.field767 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field782[var6] = (short) arg0.method2582();
                this.field767[var6] = (short) arg0.method2582();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2464();
            this.field784 = new short[var7];
            this.field785 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field784[var8] = (short) arg0.method2582();
                this.field785[var8] = (short) arg0.method2582();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2464();
            this.field771 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field771[var10] = arg0.method2582();
            }
        } else if (arg1 == 93) {
            this.field775 = false;
        } else if (arg1 == 95) {
            this.field788 = arg0.method2582();
        } else if (arg1 == 97) {
            this.field789 = arg0.method2582();
        } else if (arg1 == 98) {
            this.field790 = arg0.method2582();
        } else if (arg1 == 99) {
            this.field791 = true;
        } else if (arg1 == 100) {
            this.field792 = arg0.method2449();
        } else if (arg1 == 101) {
            this.field793 = arg0.method2449() * 5;
        } else if (arg1 == 102) {
            this.field794 = arg0.method2582();
        } else if (arg1 == 103) {
            this.field795 = arg0.method2582();
        } else if (arg1 == 106) {
            this.field774 = arg0.method2582();
            if (this.field774 == 65535) {
                this.field774 = -1;
            }
            this.field783 = arg0.method2582();
            if (this.field783 == 65535) {
                this.field783 = -1;
            }
            int var11 = arg0.method2464();
            this.field796 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field796[var12] = arg0.method2582();
                if (this.field796[var12] == 65535) {
                    this.field796[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field786 = false;
        } else if (arg1 == 109) {
            this.field800 = false;
        }
    }

    @ObfuscatedName("ak.a(Lam;ILam;IB)Ldo;")
    public final class112 method625(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field796 != null) {
            class31 var5 = this.method637();
            return var5 == null ? null : var5.method625(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field799.method3256((long) this.field770);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field773.length; var8++) {
                if (!Statics.field2722.method3083(this.field773[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field773.length];
            for (int var10 = 0; var10 < this.field773.length; var10++) {
                var9[var10] = class101.method2064(Statics.field2722, this.field773[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field782 != null) {
                for (int var12 = 0; var12 < this.field782.length; var12++) {
                    var11.method2112(this.field782[var12], this.field767[var12]);
                }
            }
            if (this.field784 != null) {
                for (int var13 = 0; var13 < this.field784.length; var13++) {
                    var11.method2082(this.field784[var13], this.field785[var13]);
                }
            }
            var6 = var11.method2083(this.field792 + 64, this.field793 + 850, -30, -50, -30);
            field799.method3257(var6, (long) this.field770);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method720(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method747(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2248(true);
        } else {
            var14 = arg2.method747(var6, arg3);
        }
        if (this.field789 != 128 || this.field790 != 128) {
            var14.method2268(this.field789, this.field790, this.field789);
        }
        return var14;
    }

    @ObfuscatedName("ak.q(I)Lch;")
    public final class101 method626() {
        if (this.field796 != null) {
            class31 var1 = this.method637();
            return var1 == null ? null : var1.method626();
        } else if (this.field771 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field771.length; var3++) {
                if (!Statics.field2722.method3083(this.field771[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field771.length];
            for (int var5 = 0; var5 < this.field771.length; var5++) {
                var4[var5] = class101.method2064(Statics.field2722, this.field771[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field782 != null) {
                for (int var7 = 0; var7 < this.field782.length; var7++) {
                    var6.method2112(this.field782[var7], this.field767[var7]);
                }
            }
            if (this.field784 != null) {
                for (int var8 = 0; var8 < this.field784.length; var8++) {
                    var6.method2082(this.field784[var8], this.field785[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ak.t(I)Lak;")
    public final class31 method637() {
        int var1 = -1;
        if (this.field774 != -1) {
            var1 = class160.method1486(this.field774);
        } else if (this.field783 != -1) {
            var1 = class160.field2716[this.field783];
        }
        return var1 < 0 || var1 >= this.field796.length || this.field796[var1] == -1 ? null : method318(this.field796[var1]);
    }

    @ObfuscatedName("ak.n(B)Z")
    public boolean method629() {
        if (this.field796 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field774 != -1) {
            var1 = class160.method1486(this.field774);
        } else if (this.field783 != -1) {
            var1 = class160.field2716[this.field783];
        }
        return var1 >= 0 && var1 < this.field796.length && this.field796[var1] != -1;
    }
}
