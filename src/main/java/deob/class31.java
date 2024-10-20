package deob;

@ObfuscatedName("aq")
public class class31 extends class174 {

    @ObfuscatedName("aq.g")
    public static class170 field781 = new class170(64);

    @ObfuscatedName("aq.o")
    public static class170 field766 = new class170(50);

    @ObfuscatedName("aq.a")
    public int field767;

    @ObfuscatedName("aq.h")
    public String field768 = "null";

    @ObfuscatedName("aq.j")
    public int field769 = 1;

    @ObfuscatedName("aq.f")
    public int[] field770;

    @ObfuscatedName("aq.q")
    public int[] field771;

    @ObfuscatedName("aq.l")
    public int field774 = -1;

    @ObfuscatedName("aq.d")
    public int field773 = -1;

    @ObfuscatedName("aq.z")
    public int field765 = -1;

    @ObfuscatedName("aq.n")
    public int field763 = -1;

    @ObfuscatedName("aq.t")
    public int field776 = -1;

    @ObfuscatedName("aq.w")
    public int field791 = -1;

    @ObfuscatedName("aq.r")
    public int field778 = -1;

    @ObfuscatedName("aq.x")
    public short[] field779;

    @ObfuscatedName("aq.v")
    public short[] field780;

    @ObfuscatedName("aq.y")
    public short[] field794;

    @ObfuscatedName("aq.k")
    public short[] field782;

    @ObfuscatedName("aq.p")
    public String[] field786 = new String[5];

    @ObfuscatedName("aq.s")
    public boolean field784 = true;

    @ObfuscatedName("aq.m")
    public int field775 = -1;

    @ObfuscatedName("aq.c")
    public int field777 = 128;

    @ObfuscatedName("aq.i")
    public int field787 = 128;

    @ObfuscatedName("aq.u")
    public boolean field788 = false;

    @ObfuscatedName("aq.at")
    public int field789 = 0;

    @ObfuscatedName("aq.as")
    public int field790 = 0;

    @ObfuscatedName("aq.ax")
    public int field795 = -1;

    @ObfuscatedName("aq.ao")
    public int field792 = 32;

    @ObfuscatedName("aq.aq")
    public int[] field793;

    @ObfuscatedName("aq.am")
    public int field783 = -1;

    @ObfuscatedName("aq.al")
    public int field785 = -1;

    @ObfuscatedName("aq.ab")
    public boolean field796 = true;

    @ObfuscatedName("aq.aw")
    public boolean field772 = true;

    @ObfuscatedName("n.b(II)Laq;")
    public static class31 method120(int arg0) {
        class31 var1 = (class31) field781.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field797.method3026(9, arg0);
        class31 var3 = new class31();
        var3.field767 = arg0;
        if (var2 != null) {
            var3.method595(new class126(var2));
        }
        var3.method612();
        field781.method3252(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.e(I)V")
    public void method612() {
    }

    @ObfuscatedName("aq.g(Ldv;B)V")
    public void method595(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method596(arg0, var2);
        }
    }

    @ObfuscatedName("aq.o(Ldv;II)V")
    public void method596(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2436();
            this.field770 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field770[var4] = arg0.method2572();
            }
        } else if (arg1 == 2) {
            this.field768 = arg0.method2444();
        } else if (arg1 == 12) {
            this.field769 = arg0.method2436();
        } else if (arg1 == 13) {
            this.field774 = arg0.method2572();
        } else if (arg1 == 14) {
            this.field763 = arg0.method2572();
        } else if (arg1 == 15) {
            this.field773 = arg0.method2572();
        } else if (arg1 == 16) {
            this.field765 = arg0.method2572();
        } else if (arg1 == 17) {
            this.field763 = arg0.method2572();
            this.field776 = arg0.method2572();
            this.field791 = arg0.method2572();
            this.field778 = arg0.method2572();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field786[arg1 - 30] = arg0.method2444();
            if (this.field786[arg1 - 30].equalsIgnoreCase(class135.field2241)) {
                this.field786[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2436();
            this.field779 = new short[var5];
            this.field780 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field779[var6] = (short) arg0.method2572();
                this.field780[var6] = (short) arg0.method2572();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2436();
            this.field794 = new short[var7];
            this.field782 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field794[var8] = (short) arg0.method2572();
                this.field782[var8] = (short) arg0.method2572();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2436();
            this.field771 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field771[var10] = arg0.method2572();
            }
        } else if (arg1 == 93) {
            this.field784 = false;
        } else if (arg1 == 95) {
            this.field775 = arg0.method2572();
        } else if (arg1 == 97) {
            this.field777 = arg0.method2572();
        } else if (arg1 == 98) {
            this.field787 = arg0.method2572();
        } else if (arg1 == 99) {
            this.field788 = true;
        } else if (arg1 == 100) {
            this.field789 = arg0.method2437();
        } else if (arg1 == 101) {
            this.field790 = arg0.method2437() * 5;
        } else if (arg1 == 102) {
            this.field795 = arg0.method2572();
        } else if (arg1 == 103) {
            this.field792 = arg0.method2572();
        } else if (arg1 == 106) {
            this.field783 = arg0.method2572();
            if (this.field783 == 65535) {
                this.field783 = -1;
            }
            this.field785 = arg0.method2572();
            if (this.field785 == 65535) {
                this.field785 = -1;
            }
            int var11 = arg0.method2436();
            this.field793 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field793[var12] = arg0.method2572();
                if (this.field793[var12] == 65535) {
                    this.field793[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field796 = false;
        } else if (arg1 == 109) {
            this.field772 = false;
        }
    }

    @ObfuscatedName("aq.a(Lab;ILab;II)Ldp;")
    public final class112 method597(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field793 != null) {
            class31 var5 = this.method630();
            return var5 == null ? null : var5.method597(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field766.method3248((long) this.field767);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field770.length; var8++) {
                if (!Statics.field764.method2998(this.field770[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field770.length];
            for (int var10 = 0; var10 < this.field770.length; var10++) {
                var9[var10] = class101.method2032(Statics.field764, this.field770[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field779 != null) {
                for (int var12 = 0; var12 < this.field779.length; var12++) {
                    var11.method2047(this.field779[var12], this.field780[var12]);
                }
            }
            if (this.field794 != null) {
                for (int var13 = 0; var13 < this.field794.length; var13++) {
                    var11.method2048(this.field794[var13], this.field782[var13]);
                }
            }
            var6 = var11.method2056(this.field789 + 64, this.field790 + 850, -30, -50, -30);
            field766.method3252(var6, (long) this.field767);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method697(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method726(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2247(true);
        } else {
            var14 = arg2.method726(var6, arg3);
        }
        if (this.field777 != 128 || this.field787 != 128) {
            var14.method2275(this.field777, this.field787, this.field777);
        }
        return var14;
    }

    @ObfuscatedName("aq.h(I)Lcu;")
    public final class101 method598() {
        if (this.field793 != null) {
            class31 var1 = this.method630();
            return var1 == null ? null : var1.method598();
        } else if (this.field771 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field771.length; var3++) {
                if (!Statics.field764.method2998(this.field771[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field771.length];
            for (int var5 = 0; var5 < this.field771.length; var5++) {
                var4[var5] = class101.method2032(Statics.field764, this.field771[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field779 != null) {
                for (int var7 = 0; var7 < this.field779.length; var7++) {
                    var6.method2047(this.field779[var7], this.field780[var7]);
                }
            }
            if (this.field794 != null) {
                for (int var8 = 0; var8 < this.field794.length; var8++) {
                    var6.method2048(this.field794[var8], this.field782[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aq.j(B)Laq;")
    public final class31 method630() {
        int var1 = -1;
        if (this.field783 != -1) {
            var1 = class160.method748(this.field783);
        } else if (this.field785 != -1) {
            var1 = class160.field2726[this.field785];
        }
        return var1 < 0 || var1 >= this.field793.length || this.field793[var1] == -1 ? null : method120(this.field793[var1]);
    }

    @ObfuscatedName("aq.f(I)Z")
    public boolean method614() {
        if (this.field793 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field783 != -1) {
            var1 = class160.method748(this.field783);
        } else if (this.field785 != -1) {
            var1 = class160.field2726[this.field785];
        }
        return var1 >= 0 && var1 < this.field793.length && this.field793[var1] != -1;
    }

    @ObfuscatedName("dx.q(I)V")
    public static void method2302() {
        field781.method3251();
        field766.method3251();
    }
}
