package deob;

@ObfuscatedName("aj")
public class class30 extends class172 {

    @ObfuscatedName("aj.c")
    public static class168 field779 = new class168(64);

    @ObfuscatedName("aj.p")
    public static class168 field780 = new class168(50);

    @ObfuscatedName("aj.i")
    public int field812;

    @ObfuscatedName("aj.v")
    public String field782 = "null";

    @ObfuscatedName("aj.l")
    public int field783 = 1;

    @ObfuscatedName("aj.m")
    public int[] field809;

    @ObfuscatedName("aj.g")
    public int[] field785;

    @ObfuscatedName("aj.t")
    public int field791 = -1;

    @ObfuscatedName("aj.o")
    public int field787 = -1;

    @ObfuscatedName("aj.b")
    public int field811 = -1;

    @ObfuscatedName("aj.d")
    public int field789 = -1;

    @ObfuscatedName("aj.k")
    public int field799 = -1;

    @ObfuscatedName("aj.f")
    public int field796 = -1;

    @ObfuscatedName("aj.e")
    public int field781 = -1;

    @ObfuscatedName("aj.u")
    public short[] field807;

    @ObfuscatedName("aj.n")
    public short[] field794;

    @ObfuscatedName("aj.q")
    public short[] field795;

    @ObfuscatedName("aj.y")
    public short[] field793;

    @ObfuscatedName("aj.a")
    public String[] field797 = new String[5];

    @ObfuscatedName("aj.r")
    public boolean field798 = true;

    @ObfuscatedName("aj.x")
    public int field788 = -1;

    @ObfuscatedName("aj.w")
    public int field800 = 128;

    @ObfuscatedName("aj.j")
    public int field801 = 128;

    @ObfuscatedName("aj.s")
    public boolean field802 = false;

    @ObfuscatedName("aj.au")
    public int field803 = 0;

    @ObfuscatedName("aj.ay")
    public int field804 = 0;

    @ObfuscatedName("aj.ar")
    public int field805 = -1;

    @ObfuscatedName("aj.aj")
    public int field806 = 32;

    @ObfuscatedName("aj.ad")
    public int[] field790;

    @ObfuscatedName("aj.at")
    public int field815 = -1;

    @ObfuscatedName("aj.as")
    public int field808 = -1;

    @ObfuscatedName("aj.aw")
    public boolean field810 = true;

    @ObfuscatedName("aj.ax")
    public boolean field777 = true;

    @ObfuscatedName("n.z(II)Laj;")
    public static class30 method154(int arg0) {
        class30 var1 = (class30) field779.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field786.method2951(9, arg0);
        class30 var3 = new class30();
        var3.field812 = arg0;
        if (var2 != null) {
            var3.method621(new class126(var2));
        }
        var3.method616();
        field779.method3237(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.h(I)V")
    public void method616() {
    }

    @ObfuscatedName("aj.c(Ldq;I)V")
    public void method621(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method618(arg0, var2);
        }
    }

    @ObfuscatedName("aj.p(Ldq;IB)V")
    public void method618(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2450();
            this.field809 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field809[var4] = arg0.method2627();
            }
        } else if (arg1 == 2) {
            this.field782 = arg0.method2603();
        } else if (arg1 == 12) {
            this.field783 = arg0.method2450();
        } else if (arg1 == 13) {
            this.field791 = arg0.method2627();
        } else if (arg1 == 14) {
            this.field789 = arg0.method2627();
        } else if (arg1 == 15) {
            this.field787 = arg0.method2627();
        } else if (arg1 == 16) {
            this.field811 = arg0.method2627();
        } else if (arg1 == 17) {
            this.field789 = arg0.method2627();
            this.field799 = arg0.method2627();
            this.field796 = arg0.method2627();
            this.field781 = arg0.method2627();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field797[arg1 - 30] = arg0.method2603();
            if (this.field797[arg1 - 30].equalsIgnoreCase(class133.field2145)) {
                this.field797[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2450();
            this.field807 = new short[var5];
            this.field794 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field807[var6] = (short) arg0.method2627();
                this.field794[var6] = (short) arg0.method2627();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2450();
            this.field795 = new short[var7];
            this.field793 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field795[var8] = (short) arg0.method2627();
                this.field793[var8] = (short) arg0.method2627();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2450();
            this.field785 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field785[var10] = arg0.method2627();
            }
        } else if (arg1 == 93) {
            this.field798 = false;
        } else if (arg1 == 95) {
            this.field788 = arg0.method2627();
        } else if (arg1 == 97) {
            this.field800 = arg0.method2627();
        } else if (arg1 == 98) {
            this.field801 = arg0.method2627();
        } else if (arg1 == 99) {
            this.field802 = true;
        } else if (arg1 == 100) {
            this.field803 = arg0.method2451();
        } else if (arg1 == 101) {
            this.field804 = arg0.method2451();
        } else if (arg1 == 102) {
            this.field805 = arg0.method2627();
        } else if (arg1 == 103) {
            this.field806 = arg0.method2627();
        } else if (arg1 == 106) {
            this.field815 = arg0.method2627();
            if (this.field815 == 65535) {
                this.field815 = -1;
            }
            this.field808 = arg0.method2627();
            if (this.field808 == 65535) {
                this.field808 = -1;
            }
            int var11 = arg0.method2450();
            this.field790 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field790[var12] = arg0.method2627();
                if (this.field790[var12] == 65535) {
                    this.field790[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field810 = false;
        } else if (arg1 == 109) {
            this.field777 = false;
        }
    }

    @ObfuscatedName("aj.i(Las;ILas;II)Ldh;")
    public final class111 method629(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field790 != null) {
            class30 var5 = this.method645();
            return var5 == null ? null : var5.method629(arg0, arg1, arg2, arg3);
        }
        class111 var6 = (class111) field780.method3240((long) this.field812);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field809.length; var8++) {
                if (!Statics.field778.method2995(this.field809[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field809.length];
            for (int var10 = 0; var10 < this.field809.length; var10++) {
                var9[var10] = class100.method2037(Statics.field778, this.field809[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field807 != null) {
                for (int var12 = 0; var12 < this.field807.length; var12++) {
                    var11.method2059(this.field807[var12], this.field794[var12]);
                }
            }
            if (this.field795 != null) {
                for (int var13 = 0; var13 < this.field795.length; var13++) {
                    var11.method2082(this.field795[var13], this.field793[var13]);
                }
            }
            var6 = var11.method2046(this.field803 + 64, this.field804 * 5 + 850, -30, -50, -30);
            field780.method3237(var6, (long) this.field812);
        }
        class111 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method738(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method710(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2216(true);
        } else {
            var14 = arg2.method710(var6, arg3);
        }
        if (this.field800 != 128 || this.field801 != 128) {
            var14.method2226(this.field800, this.field801, this.field800);
        }
        return var14;
    }

    @ObfuscatedName("aj.v(I)Lcj;")
    public final class100 method630() {
        if (this.field790 != null) {
            class30 var1 = this.method645();
            return var1 == null ? null : var1.method630();
        } else if (this.field785 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field785.length; var3++) {
                if (!Statics.field778.method2995(this.field785[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field785.length];
            for (int var5 = 0; var5 < this.field785.length; var5++) {
                var4[var5] = class100.method2037(Statics.field778, this.field785[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field807 != null) {
                for (int var7 = 0; var7 < this.field807.length; var7++) {
                    var6.method2059(this.field807[var7], this.field794[var7]);
                }
            }
            if (this.field795 != null) {
                for (int var8 = 0; var8 < this.field795.length; var8++) {
                    var6.method2082(this.field795[var8], this.field793[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aj.l(I)Laj;")
    public final class30 method645() {
        int var1 = -1;
        if (this.field815 != -1) {
            var1 = class157.method3063(this.field815);
        } else if (this.field808 != -1) {
            var1 = class157.field2634[this.field808];
        }
        return var1 < 0 || var1 >= this.field790.length || this.field790[var1] == -1 ? null : method154(this.field790[var1]);
    }

    @ObfuscatedName("aj.m(I)Z")
    public boolean method619() {
        if (this.field790 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field815 != -1) {
            var1 = class157.method3063(this.field815);
        } else if (this.field808 != -1) {
            var1 = class157.field2634[this.field808];
        }
        return var1 >= 0 && var1 < this.field790.length && this.field790[var1] != -1;
    }
}
