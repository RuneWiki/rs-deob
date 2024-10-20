package deob;

@ObfuscatedName("aw")
public class class30 extends class172 {

    @ObfuscatedName("aw.n")
    public static class168 field761 = new class168(64);

    @ObfuscatedName("aw.j")
    public static class168 field762 = new class168(50);

    @ObfuscatedName("aw.i")
    public int field782;

    @ObfuscatedName("aw.o")
    public String field764 = "null";

    @ObfuscatedName("aw.l")
    public int field765 = 1;

    @ObfuscatedName("aw.p")
    public int[] field763;

    @ObfuscatedName("aw.t")
    public int[] field767;

    @ObfuscatedName("aw.w")
    public int field766 = -1;

    @ObfuscatedName("aw.r")
    public int field769 = -1;

    @ObfuscatedName("aw.a")
    public int field770 = -1;

    @ObfuscatedName("aw.q")
    public int field771 = -1;

    @ObfuscatedName("aw.z")
    public int field796 = -1;

    @ObfuscatedName("aw.d")
    public int field773 = -1;

    @ObfuscatedName("aw.x")
    public int field774 = -1;

    @ObfuscatedName("aw.s")
    public short[] field775;

    @ObfuscatedName("aw.m")
    public short[] field776;

    @ObfuscatedName("aw.y")
    public short[] field777;

    @ObfuscatedName("aw.b")
    public short[] field778;

    @ObfuscatedName("aw.h")
    public String[] field779 = new String[5];

    @ObfuscatedName("aw.f")
    public boolean field760 = true;

    @ObfuscatedName("aw.v")
    public int field781 = -1;

    @ObfuscatedName("aw.u")
    public int field790 = 128;

    @ObfuscatedName("aw.k")
    public int field783 = 128;

    @ObfuscatedName("aw.c")
    public boolean field780 = false;

    @ObfuscatedName("aw.al")
    public int field784 = 0;

    @ObfuscatedName("aw.ai")
    public int field789 = 0;

    @ObfuscatedName("aw.ad")
    public int field787 = -1;

    @ObfuscatedName("aw.aw")
    public int field788 = 32;

    @ObfuscatedName("aw.af")
    public int[] field791;

    @ObfuscatedName("aw.an")
    public int field785 = -1;

    @ObfuscatedName("aw.ao")
    public int field759 = -1;

    @ObfuscatedName("aw.ak")
    public boolean field792 = true;

    @ObfuscatedName("aw.ah")
    public boolean field793 = true;

    @ObfuscatedName("ao.g(Lez;Lez;I)V")
    public static void method720(class150 arg0, class150 arg1) {
        Statics.field768 = arg0;
        Statics.field772 = arg1;
    }

    @ObfuscatedName("ak.e(II)Law;")
    public static class30 method763(int arg0) {
        class30 var1 = (class30) field761.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field768.method3012(9, arg0);
        class30 var3 = new class30();
        var3.field782 = arg0;
        if (var2 != null) {
            var3.method607(new class126(var2));
        }
        var3.method630();
        field761.method3314(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.n(I)V")
    public void method630() {
    }

    @ObfuscatedName("aw.j(Ldu;B)V")
    public void method607(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method618(arg0, var2);
        }
    }

    @ObfuscatedName("aw.i(Ldu;II)V")
    public void method618(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2485();
            this.field763 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field763[var4] = arg0.method2487();
            }
        } else if (arg1 == 2) {
            this.field764 = arg0.method2470();
        } else if (arg1 == 12) {
            this.field765 = arg0.method2485();
        } else if (arg1 == 13) {
            this.field766 = arg0.method2487();
        } else if (arg1 == 14) {
            this.field771 = arg0.method2487();
        } else if (arg1 == 15) {
            this.field769 = arg0.method2487();
        } else if (arg1 == 16) {
            this.field770 = arg0.method2487();
        } else if (arg1 == 17) {
            this.field771 = arg0.method2487();
            this.field796 = arg0.method2487();
            this.field773 = arg0.method2487();
            this.field774 = arg0.method2487();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field779[arg1 - 30] = arg0.method2470();
            if (this.field779[arg1 - 30].equalsIgnoreCase(class133.field2061)) {
                this.field779[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2485();
            this.field775 = new short[var5];
            this.field776 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field775[var6] = (short) arg0.method2487();
                this.field776[var6] = (short) arg0.method2487();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2485();
            this.field777 = new short[var7];
            this.field778 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field777[var8] = (short) arg0.method2487();
                this.field778[var8] = (short) arg0.method2487();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2485();
            this.field767 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field767[var10] = arg0.method2487();
            }
        } else if (arg1 == 93) {
            this.field760 = false;
        } else if (arg1 == 95) {
            this.field781 = arg0.method2487();
        } else if (arg1 == 97) {
            this.field790 = arg0.method2487();
        } else if (arg1 == 98) {
            this.field783 = arg0.method2487();
        } else if (arg1 == 99) {
            this.field780 = true;
        } else if (arg1 == 100) {
            this.field784 = arg0.method2479();
        } else if (arg1 == 101) {
            this.field789 = arg0.method2479() * 5;
        } else if (arg1 == 102) {
            this.field787 = arg0.method2487();
        } else if (arg1 == 103) {
            this.field788 = arg0.method2487();
        } else if (arg1 == 106) {
            this.field785 = arg0.method2487();
            if (this.field785 == 65535) {
                this.field785 = -1;
            }
            this.field759 = arg0.method2487();
            if (this.field759 == 65535) {
                this.field759 = -1;
            }
            int var11 = arg0.method2485();
            this.field791 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field791[var12] = arg0.method2487();
                if (this.field791[var12] == 65535) {
                    this.field791[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field792 = false;
        } else if (arg1 == 109) {
            this.field793 = false;
        }
    }

    @ObfuscatedName("aw.o(Lao;ILao;II)Ldk;")
    public final class111 method624(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field791 != null) {
            class30 var5 = this.method606();
            return var5 == null ? null : var5.method624(arg0, arg1, arg2, arg3);
        }
        class111 var6 = (class111) field762.method3311((long) this.field782);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field763.length; var8++) {
                if (!Statics.field772.method3014(this.field763[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field763.length];
            for (int var10 = 0; var10 < this.field763.length; var10++) {
                var9[var10] = class100.method2068(Statics.field772, this.field763[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field775 != null) {
                for (int var12 = 0; var12 < this.field775.length; var12++) {
                    var11.method2100(this.field775[var12], this.field776[var12]);
                }
            }
            if (this.field777 != null) {
                for (int var13 = 0; var13 < this.field777.length; var13++) {
                    var11.method2083(this.field777[var13], this.field778[var13]);
                }
            }
            var6 = var11.method2067(this.field784 + 64, this.field789 + 850, -30, -50, -30);
            field762.method3314(var6, (long) this.field782);
        }
        class111 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method708(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method717(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2264(true);
        } else {
            var14 = arg2.method717(var6, arg3);
        }
        if (this.field790 != 128 || this.field783 != 128) {
            var14.method2278(this.field790, this.field783, this.field790);
        }
        return var14;
    }

    @ObfuscatedName("aw.l(I)Lcm;")
    public final class100 method609() {
        if (this.field791 != null) {
            class30 var1 = this.method606();
            return var1 == null ? null : var1.method609();
        } else if (this.field767 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field767.length; var3++) {
                if (!Statics.field772.method3014(this.field767[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field767.length];
            for (int var5 = 0; var5 < this.field767.length; var5++) {
                var4[var5] = class100.method2068(Statics.field772, this.field767[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field775 != null) {
                for (int var7 = 0; var7 < this.field775.length; var7++) {
                    var6.method2100(this.field775[var7], this.field776[var7]);
                }
            }
            if (this.field777 != null) {
                for (int var8 = 0; var8 < this.field777.length; var8++) {
                    var6.method2083(this.field777[var8], this.field778[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aw.p(I)Law;")
    public final class30 method606() {
        int var1 = -1;
        if (this.field785 != -1) {
            var1 = class157.method1589(this.field785);
        } else if (this.field759 != -1) {
            var1 = class157.field2656[this.field759];
        }
        return var1 < 0 || var1 >= this.field791.length || this.field791[var1] == -1 ? null : method763(this.field791[var1]);
    }

    @ObfuscatedName("aw.t(B)Z")
    public boolean method611() {
        if (this.field791 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field785 != -1) {
            var1 = class157.method1589(this.field785);
        } else if (this.field759 != -1) {
            var1 = class157.field2656[this.field759];
        }
        return var1 >= 0 && var1 < this.field791.length && this.field791[var1] != -1;
    }
}
