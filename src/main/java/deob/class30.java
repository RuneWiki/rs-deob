package deob;

@ObfuscatedName("av")
public class class30 extends class172 {

    @ObfuscatedName("av.f")
    public static class168 field762 = new class168(64);

    @ObfuscatedName("av.y")
    public static class168 field763 = new class168(50);

    @ObfuscatedName("av.x")
    public int field764;

    @ObfuscatedName("av.e")
    public String field775 = "null";

    @ObfuscatedName("av.m")
    public int field766 = 1;

    @ObfuscatedName("av.s")
    public int[] field767;

    @ObfuscatedName("av.p")
    public int[] field771;

    @ObfuscatedName("av.w")
    public int field769 = -1;

    @ObfuscatedName("av.r")
    public int field770 = -1;

    @ObfuscatedName("av.n")
    public int field765 = -1;

    @ObfuscatedName("av.b")
    public int field772 = -1;

    @ObfuscatedName("av.z")
    public int field773 = -1;

    @ObfuscatedName("av.h")
    public int field774 = -1;

    @ObfuscatedName("av.q")
    public int field768 = -1;

    @ObfuscatedName("av.l")
    public short[] field793;

    @ObfuscatedName("av.t")
    public short[] field791;

    @ObfuscatedName("av.g")
    public short[] field778;

    @ObfuscatedName("av.a")
    public short[] field779;

    @ObfuscatedName("av.v")
    public String[] field780 = new String[5];

    @ObfuscatedName("av.i")
    public boolean field781 = true;

    @ObfuscatedName("av.k")
    public int field782 = -1;

    @ObfuscatedName("av.o")
    public int field789 = 128;

    @ObfuscatedName("av.d")
    public int field784 = 128;

    @ObfuscatedName("av.u")
    public boolean field785 = false;

    @ObfuscatedName("av.ap")
    public int field786 = 0;

    @ObfuscatedName("av.ad")
    public int field787 = 0;

    @ObfuscatedName("av.ao")
    public int field788 = -1;

    @ObfuscatedName("av.av")
    public int field761 = 32;

    @ObfuscatedName("av.af")
    public int[] field790;

    @ObfuscatedName("av.ae")
    public int field794 = -1;

    @ObfuscatedName("av.ax")
    public int field792 = -1;

    @ObfuscatedName("av.aw")
    public boolean field783 = true;

    @ObfuscatedName("av.an")
    public boolean field776 = true;

    @ObfuscatedName("am.c(II)Lav;")
    public static class30 method804(int arg0) {
        class30 var1 = (class30) field762.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field777.method2821(9, arg0);
        class30 var3 = new class30();
        var3.field764 = arg0;
        if (var2 != null) {
            var3.method560(new class125(var2));
        }
        var3.method582();
        field762.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.j(I)V")
    public void method582() {
    }

    @ObfuscatedName("av.f(Ldl;B)V")
    public void method560(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method561(arg0, var2);
        }
    }

    @ObfuscatedName("av.y(Ldl;II)V")
    public void method561(class125 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2326();
            this.field767 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field767[var4] = arg0.method2328();
            }
        } else if (arg1 == 2) {
            this.field775 = arg0.method2515();
        } else if (arg1 == 12) {
            this.field766 = arg0.method2326();
        } else if (arg1 == 13) {
            this.field769 = arg0.method2328();
        } else if (arg1 == 14) {
            this.field772 = arg0.method2328();
        } else if (arg1 == 15) {
            this.field770 = arg0.method2328();
        } else if (arg1 == 16) {
            this.field765 = arg0.method2328();
        } else if (arg1 == 17) {
            this.field772 = arg0.method2328();
            this.field773 = arg0.method2328();
            this.field774 = arg0.method2328();
            this.field768 = arg0.method2328();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field780[arg1 - 30] = arg0.method2515();
            if (this.field780[arg1 - 30].equalsIgnoreCase(class133.field2181)) {
                this.field780[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2326();
            this.field793 = new short[var5];
            this.field791 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field793[var6] = (short) arg0.method2328();
                this.field791[var6] = (short) arg0.method2328();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2326();
            this.field778 = new short[var7];
            this.field779 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field778[var8] = (short) arg0.method2328();
                this.field779[var8] = (short) arg0.method2328();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2326();
            this.field771 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field771[var10] = arg0.method2328();
            }
        } else if (arg1 == 93) {
            this.field781 = false;
        } else if (arg1 == 95) {
            this.field782 = arg0.method2328();
        } else if (arg1 == 97) {
            this.field789 = arg0.method2328();
        } else if (arg1 == 98) {
            this.field784 = arg0.method2328();
        } else if (arg1 == 99) {
            this.field785 = true;
        } else if (arg1 == 100) {
            this.field786 = arg0.method2347();
        } else if (arg1 == 101) {
            this.field787 = arg0.method2347();
        } else if (arg1 == 102) {
            this.field788 = arg0.method2328();
        } else if (arg1 == 103) {
            this.field761 = arg0.method2328();
        } else if (arg1 == 106) {
            this.field794 = arg0.method2328();
            if (this.field794 == 65535) {
                this.field794 = -1;
            }
            this.field792 = arg0.method2328();
            if (this.field792 == 65535) {
                this.field792 = -1;
            }
            int var11 = arg0.method2326();
            this.field790 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field790[var12] = arg0.method2328();
                if (this.field790[var12] == 65535) {
                    this.field790[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field783 = false;
        } else if (arg1 == 109) {
            this.field776 = false;
        }
    }

    @ObfuscatedName("av.x(Lax;ILax;II)Ldf;")
    public final class111 method565(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field790 != null) {
            class30 var5 = this.method564();
            return var5 == null ? null : var5.method565(arg0, arg1, arg2, arg3);
        }
        class111 var6 = (class111) field763.method3087((long) this.field764);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field767.length; var8++) {
                if (!Statics.field2663.method2823(this.field767[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field767.length];
            for (int var10 = 0; var10 < this.field767.length; var10++) {
                var9[var10] = class100.method1925(Statics.field2663, this.field767[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field793 != null) {
                for (int var12 = 0; var12 < this.field793.length; var12++) {
                    var11.method1938(this.field793[var12], this.field791[var12]);
                }
            }
            if (this.field778 != null) {
                for (int var13 = 0; var13 < this.field778.length; var13++) {
                    var11.method1959(this.field778[var13], this.field779[var13]);
                }
            }
            var6 = var11.method1946(this.field786 + 64, this.field787 * 5 + 850, -30, -50, -30);
            field763.method3089(var6, (long) this.field764);
        }
        class111 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method667(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method702(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2118(true);
        } else {
            var14 = arg2.method702(var6, arg3);
        }
        if (this.field789 != 128 || this.field784 != 128) {
            var14.method2132(this.field789, this.field784, this.field789);
        }
        return var14;
    }

    @ObfuscatedName("av.e(I)Lcl;")
    public final class100 method563() {
        if (this.field790 != null) {
            class30 var1 = this.method564();
            return var1 == null ? null : var1.method563();
        } else if (this.field771 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field771.length; var3++) {
                if (!Statics.field2663.method2823(this.field771[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field771.length];
            for (int var5 = 0; var5 < this.field771.length; var5++) {
                var4[var5] = class100.method1925(Statics.field2663, this.field771[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field793 != null) {
                for (int var7 = 0; var7 < this.field793.length; var7++) {
                    var6.method1938(this.field793[var7], this.field791[var7]);
                }
            }
            if (this.field778 != null) {
                for (int var8 = 0; var8 < this.field778.length; var8++) {
                    var6.method1959(this.field778[var8], this.field779[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("av.m(B)Lav;")
    public final class30 method564() {
        int var1 = -1;
        if (this.field794 != -1) {
            var1 = class157.method125(this.field794);
        } else if (this.field792 != -1) {
            var1 = class157.field2649[this.field792];
        }
        return var1 < 0 || var1 >= this.field790.length || this.field790[var1] == -1 ? null : method804(this.field790[var1]);
    }

    @ObfuscatedName("av.s(I)Z")
    public boolean method566() {
        if (this.field790 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field794 != -1) {
            var1 = class157.method125(this.field794);
        } else if (this.field792 != -1) {
            var1 = class157.field2649[this.field792];
        }
        return var1 >= 0 && var1 < this.field790.length && this.field790[var1] != -1;
    }
}
