package deob;

@ObfuscatedName("ap")
public class class35 extends class183 {

    @ObfuscatedName("ap.s")
    public static class172 field786 = new class172(64);

    @ObfuscatedName("ap.g")
    public static class172 field787 = new class172(50);

    @ObfuscatedName("ap.h")
    public int field788;

    @ObfuscatedName("ap.l")
    public String field789 = "null";

    @ObfuscatedName("ap.e")
    public int field790 = 1;

    @ObfuscatedName("ap.u")
    public int[] field823;

    @ObfuscatedName("ap.j")
    public int[] field792;

    @ObfuscatedName("ap.c")
    public int field793 = -1;

    @ObfuscatedName("ap.d")
    public int field794 = -1;

    @ObfuscatedName("ap.v")
    public int field795 = -1;

    @ObfuscatedName("ap.n")
    public int field815 = -1;

    @ObfuscatedName("ap.z")
    public int field812 = -1;

    @ObfuscatedName("ap.a")
    public int field798 = -1;

    @ObfuscatedName("ap.t")
    public int field784 = -1;

    @ObfuscatedName("ap.p")
    public short[] field800;

    @ObfuscatedName("ap.i")
    public short[] field801;

    @ObfuscatedName("ap.r")
    public short[] field802;

    @ObfuscatedName("ap.w")
    public short[] field785;

    @ObfuscatedName("ap.b")
    public String[] field804 = new String[5];

    @ObfuscatedName("ap.x")
    public boolean field799 = true;

    @ObfuscatedName("ap.q")
    public int field806 = -1;

    @ObfuscatedName("ap.o")
    public int field807 = 128;

    @ObfuscatedName("ap.m")
    public int field808 = 128;

    @ObfuscatedName("ap.f")
    public boolean field809 = false;

    @ObfuscatedName("ap.ab")
    public int field810 = 0;

    @ObfuscatedName("ap.al")
    public int field811 = 0;

    @ObfuscatedName("ap.an")
    public int field819 = -1;

    @ObfuscatedName("ap.aw")
    public int field814 = 32;

    @ObfuscatedName("ap.ar")
    public int[] field805;

    @ObfuscatedName("ap.ai")
    public int field797 = -1;

    @ObfuscatedName("ap.aj")
    public int field816 = -1;

    @ObfuscatedName("ap.ao")
    public boolean field817 = true;

    @ObfuscatedName("ap.ap")
    public boolean field818 = true;

    @ObfuscatedName("ap.as")
    public boolean field796 = false;

    @ObfuscatedName("ap.au")
    public int field820 = 30;

    @ObfuscatedName("ar.k(Lei;Lei;I)V")
    public static void method540(class147 arg0, class147 arg1) {
        Statics.field813 = arg0;
        Statics.field825 = arg1;
    }

    @ObfuscatedName("db.y(II)Lap;")
    public static class35 method2397(int arg0) {
        class35 var1 = (class35) field786.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field813.method2729(9, arg0);
        class35 var3 = new class35();
        var3.field788 = arg0;
        if (var2 != null) {
            var3.method576(new class107(var2));
        }
        var3.method602();
        field786.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.s(I)V")
    public void method602() {
    }

    @ObfuscatedName("ap.g(Ldy;B)V")
    public void method576(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method577(arg0, var2);
        }
    }

    @ObfuscatedName("ap.h(Ldy;II)V")
    public void method577(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2138();
            this.field823 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field823[var4] = arg0.method2239();
            }
        } else if (arg1 == 2) {
            this.field789 = arg0.method2146();
        } else if (arg1 == 12) {
            this.field790 = arg0.method2138();
        } else if (arg1 == 13) {
            this.field793 = arg0.method2239();
        } else if (arg1 == 14) {
            this.field815 = arg0.method2239();
        } else if (arg1 == 15) {
            this.field794 = arg0.method2239();
        } else if (arg1 == 16) {
            this.field795 = arg0.method2239();
        } else if (arg1 == 17) {
            this.field815 = arg0.method2239();
            this.field812 = arg0.method2239();
            this.field798 = arg0.method2239();
            this.field784 = arg0.method2239();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field804[arg1 - 30] = arg0.method2146();
            if (this.field804[arg1 - 30].equalsIgnoreCase(class143.field2221)) {
                this.field804[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2138();
            this.field800 = new short[var5];
            this.field801 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field800[var6] = (short) arg0.method2239();
                this.field801[var6] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2138();
            this.field802 = new short[var7];
            this.field785 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field802[var8] = (short) arg0.method2239();
                this.field785[var8] = (short) arg0.method2239();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2138();
            this.field792 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field792[var10] = arg0.method2239();
            }
        } else if (arg1 == 93) {
            this.field799 = false;
        } else if (arg1 == 95) {
            this.field806 = arg0.method2239();
        } else if (arg1 == 97) {
            this.field807 = arg0.method2239();
        } else if (arg1 == 98) {
            this.field808 = arg0.method2239();
        } else if (arg1 == 99) {
            this.field809 = true;
        } else if (arg1 == 100) {
            this.field810 = arg0.method2139();
        } else if (arg1 == 101) {
            this.field811 = arg0.method2139();
        } else if (arg1 == 102) {
            this.field819 = arg0.method2239();
        } else if (arg1 == 103) {
            this.field814 = arg0.method2239();
        } else if (arg1 == 106) {
            this.field797 = arg0.method2239();
            if (this.field797 == 65535) {
                this.field797 = -1;
            }
            this.field816 = arg0.method2239();
            if (this.field816 == 65535) {
                this.field816 = -1;
            }
            int var11 = arg0.method2138();
            this.field805 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field805[var12] = arg0.method2239();
                if (this.field805[var12] == 65535) {
                    this.field805[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field817 = false;
        } else if (arg1 == 109) {
            this.field818 = false;
        } else if (arg1 == 111) {
            this.field796 = true;
        } else if (arg1 == 112) {
            this.field820 = arg0.method2138();
        }
    }

    @ObfuscatedName("ap.l(Lac;ILac;II)Lck;")
    public final class98 method578(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field805 != null) {
            class35 var5 = this.method575();
            return var5 == null ? null : var5.method578(arg0, arg1, arg2, arg3);
        }
        class98 var6 = (class98) field787.method3202((long) this.field788);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field823.length; var8++) {
                if (!Statics.field825.method2731(this.field823[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class93[] var9 = new class93[this.field823.length];
            for (int var10 = 0; var10 < this.field823.length; var10++) {
                var9[var10] = class93.method1891(Statics.field825, this.field823[var10], 0);
            }
            class93 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class93(var9, var9.length);
            }
            if (this.field800 != null) {
                for (int var12 = 0; var12 < this.field800.length; var12++) {
                    var11.method1905(this.field800[var12], this.field801[var12]);
                }
            }
            if (this.field802 != null) {
                for (int var13 = 0; var13 < this.field802.length; var13++) {
                    var11.method1956(this.field802[var13], this.field785[var13]);
                }
            }
            var6 = var11.method1913(this.field810 + 64, this.field811 * 5 + 850, -30, -50, -30);
            field787.method3204(var6, (long) this.field788);
        }
        class98 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method685(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method682(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1988(true);
        } else {
            var14 = arg2.method682(var6, arg3);
        }
        if (this.field807 != 128 || this.field808 != 128) {
            var14.method1990(this.field807, this.field808, this.field807);
        }
        return var14;
    }

    @ObfuscatedName("ap.e(I)Lcf;")
    public final class93 method579() {
        if (this.field805 != null) {
            class35 var1 = this.method575();
            return var1 == null ? null : var1.method579();
        } else if (this.field792 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field792.length; var3++) {
                if (!Statics.field825.method2731(this.field792[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class93[] var4 = new class93[this.field792.length];
            for (int var5 = 0; var5 < this.field792.length; var5++) {
                var4[var5] = class93.method1891(Statics.field825, this.field792[var5], 0);
            }
            class93 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class93(var4, var4.length);
            }
            if (this.field800 != null) {
                for (int var7 = 0; var7 < this.field800.length; var7++) {
                    var6.method1905(this.field800[var7], this.field801[var7]);
                }
            }
            if (this.field802 != null) {
                for (int var8 = 0; var8 < this.field802.length; var8++) {
                    var6.method1956(this.field802[var8], this.field785[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ap.u(B)Lap;")
    public final class35 method575() {
        int var1 = -1;
        if (this.field797 != -1) {
            var1 = class155.method549(this.field797);
        } else if (this.field816 != -1) {
            var1 = class155.field2670[this.field816];
        }
        return var1 < 0 || var1 >= this.field805.length || this.field805[var1] == -1 ? null : method2397(this.field805[var1]);
    }

    @ObfuscatedName("ap.j(B)Z")
    public boolean method580() {
        if (this.field805 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field797 != -1) {
            var1 = class155.method549(this.field797);
        } else if (this.field816 != -1) {
            var1 = class155.field2670[this.field816];
        }
        return var1 >= 0 && var1 < this.field805.length && this.field805[var1] != -1;
    }
}
