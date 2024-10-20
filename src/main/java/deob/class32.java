package deob;

@ObfuscatedName("ap")
public class class32 extends class176 {

    @ObfuscatedName("ap.r")
    public static class172 field772 = new class172(64);

    @ObfuscatedName("ap.l")
    public static class172 field798 = new class172(50);

    @ObfuscatedName("ap.s")
    public int field771;

    @ObfuscatedName("ap.d")
    public String field785 = "null";

    @ObfuscatedName("ap.e")
    public int field792 = 1;

    @ObfuscatedName("ap.u")
    public int[] field803;

    @ObfuscatedName("ap.q")
    public int[] field778;

    @ObfuscatedName("ap.o")
    public int field800 = -1;

    @ObfuscatedName("ap.v")
    public int field776 = -1;

    @ObfuscatedName("ap.m")
    public int field781 = -1;

    @ObfuscatedName("ap.x")
    public int field782 = -1;

    @ObfuscatedName("ap.w")
    public int field779 = -1;

    @ObfuscatedName("ap.p")
    public int field802 = -1;

    @ObfuscatedName("ap.z")
    public int field811 = -1;

    @ObfuscatedName("ap.h")
    public short[] field786;

    @ObfuscatedName("ap.a")
    public short[] field787;

    @ObfuscatedName("ap.c")
    public short[] field774;

    @ObfuscatedName("ap.k")
    public short[] field788;

    @ObfuscatedName("ap.n")
    public String[] field790 = new String[5];

    @ObfuscatedName("ap.t")
    public boolean field791 = true;

    @ObfuscatedName("ap.y")
    public int field773 = -1;

    @ObfuscatedName("ap.g")
    public int field793 = 128;

    @ObfuscatedName("ap.f")
    public int field794 = 128;

    @ObfuscatedName("ap.j")
    public boolean field795 = false;

    @ObfuscatedName("ap.af")
    public int field796 = 0;

    @ObfuscatedName("ap.ar")
    public int field797 = 0;

    @ObfuscatedName("ap.ax")
    public int field780 = -1;

    @ObfuscatedName("ap.at")
    public int field799 = 32;

    @ObfuscatedName("ap.ah")
    public int[] field784;

    @ObfuscatedName("ap.ap")
    public int field801 = -1;

    @ObfuscatedName("ap.ay")
    public int field783 = -1;

    @ObfuscatedName("ap.ag")
    public boolean field789 = true;

    @ObfuscatedName("ap.ai")
    public boolean field804 = true;

    @ObfuscatedName("a.i(II)Lap;")
    public static class32 method167(int arg0) {
        class32 var1 = (class32) field772.method3277((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2750.method3043(9, arg0);
        class32 var3 = new class32();
        var3.field771 = arg0;
        if (var2 != null) {
            var3.method624(new class128(var2));
        }
        var3.method642();
        field772.method3281(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.b(I)V")
    public void method642() {
    }

    @ObfuscatedName("ap.r(Lds;B)V")
    public void method624(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method632(arg0, var2);
        }
    }

    @ObfuscatedName("ap.l(Lds;II)V")
    public void method632(class128 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2531();
            this.field803 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field803[var4] = arg0.method2473();
            }
        } else if (arg1 == 2) {
            this.field785 = arg0.method2618();
        } else if (arg1 == 12) {
            this.field792 = arg0.method2531();
        } else if (arg1 == 13) {
            this.field800 = arg0.method2473();
        } else if (arg1 == 14) {
            this.field782 = arg0.method2473();
        } else if (arg1 == 15) {
            this.field776 = arg0.method2473();
        } else if (arg1 == 16) {
            this.field781 = arg0.method2473();
        } else if (arg1 == 17) {
            this.field782 = arg0.method2473();
            this.field779 = arg0.method2473();
            this.field802 = arg0.method2473();
            this.field811 = arg0.method2473();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field790[arg1 - 30] = arg0.method2618();
            if (this.field790[arg1 - 30].equalsIgnoreCase(class137.field2125)) {
                this.field790[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2531();
            this.field786 = new short[var5];
            this.field787 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field786[var6] = (short) arg0.method2473();
                this.field787[var6] = (short) arg0.method2473();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2531();
            this.field774 = new short[var7];
            this.field788 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field774[var8] = (short) arg0.method2473();
                this.field788[var8] = (short) arg0.method2473();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2531();
            this.field778 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field778[var10] = arg0.method2473();
            }
        } else if (arg1 == 93) {
            this.field791 = false;
        } else if (arg1 == 95) {
            this.field773 = arg0.method2473();
        } else if (arg1 == 97) {
            this.field793 = arg0.method2473();
        } else if (arg1 == 98) {
            this.field794 = arg0.method2473();
        } else if (arg1 == 99) {
            this.field795 = true;
        } else if (arg1 == 100) {
            this.field796 = arg0.method2464();
        } else if (arg1 == 101) {
            this.field797 = arg0.method2464() * 5;
        } else if (arg1 == 102) {
            this.field780 = arg0.method2473();
        } else if (arg1 == 103) {
            this.field799 = arg0.method2473();
        } else if (arg1 == 106) {
            this.field801 = arg0.method2473();
            if (this.field801 == 65535) {
                this.field801 = -1;
            }
            this.field783 = arg0.method2473();
            if (this.field783 == 65535) {
                this.field783 = -1;
            }
            int var11 = arg0.method2531();
            this.field784 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field784[var12] = arg0.method2473();
                if (this.field784[var12] == 65535) {
                    this.field784[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field789 = false;
        } else if (arg1 == 109) {
            this.field804 = false;
        }
    }

    @ObfuscatedName("ap.s(Lai;ILai;II)Ldt;")
    public final class113 method626(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (this.field784 != null) {
            class32 var5 = this.method628();
            return var5 == null ? null : var5.method626(arg0, arg1, arg2, arg3);
        }
        class113 var6 = (class113) field798.method3277((long) this.field771);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field803.length; var8++) {
                if (!Statics.field775.method3045(this.field803[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class102[] var9 = new class102[this.field803.length];
            for (int var10 = 0; var10 < this.field803.length; var10++) {
                var9[var10] = class102.method2056(Statics.field775, this.field803[var10], 0);
            }
            class102 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class102(var9, var9.length);
            }
            if (this.field786 != null) {
                for (int var12 = 0; var12 < this.field786.length; var12++) {
                    var11.method2099(this.field786[var12], this.field787[var12]);
                }
            }
            if (this.field774 != null) {
                for (int var13 = 0; var13 < this.field774.length; var13++) {
                    var11.method2075(this.field774[var13], this.field788[var13]);
                }
            }
            var6 = var11.method2076(this.field796 + 64, this.field797 + 850, -30, -50, -30);
            field798.method3281(var6, (long) this.field771);
        }
        class113 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method722(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method747(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2311(true);
        } else {
            var14 = arg2.method747(var6, arg3);
        }
        if (this.field793 != 128 || this.field794 != 128) {
            var14.method2263(this.field793, this.field794, this.field793);
        }
        return var14;
    }

    @ObfuscatedName("ap.d(I)Lco;")
    public final class102 method627() {
        if (this.field784 != null) {
            class32 var1 = this.method628();
            return var1 == null ? null : var1.method627();
        } else if (this.field778 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field778.length; var3++) {
                if (!Statics.field775.method3045(this.field778[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class102[] var4 = new class102[this.field778.length];
            for (int var5 = 0; var5 < this.field778.length; var5++) {
                var4[var5] = class102.method2056(Statics.field775, this.field778[var5], 0);
            }
            class102 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class102(var4, var4.length);
            }
            if (this.field786 != null) {
                for (int var7 = 0; var7 < this.field786.length; var7++) {
                    var6.method2099(this.field786[var7], this.field787[var7]);
                }
            }
            if (this.field774 != null) {
                for (int var8 = 0; var8 < this.field774.length; var8++) {
                    var6.method2075(this.field774[var8], this.field788[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ap.e(B)Lap;")
    public final class32 method628() {
        int var1 = -1;
        if (this.field801 != -1) {
            var1 = class162.method2738(this.field801);
        } else if (this.field783 != -1) {
            var1 = class162.field2740[this.field783];
        }
        return var1 < 0 || var1 >= this.field784.length || this.field784[var1] == -1 ? null : method167(this.field784[var1]);
    }

    @ObfuscatedName("ap.u(I)Z")
    public boolean method643() {
        if (this.field784 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field801 != -1) {
            var1 = class162.method2738(this.field801);
        } else if (this.field783 != -1) {
            var1 = class162.field2740[this.field783];
        }
        return var1 >= 0 && var1 < this.field784.length && this.field784[var1] != -1;
    }

    @ObfuscatedName("di.q(B)V")
    public static void method2249() {
        field772.method3279();
        field798.method3279();
    }
}
