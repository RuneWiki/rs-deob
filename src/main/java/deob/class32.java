package deob;

@ObfuscatedName("aw")
public class class32 extends class176 {

    @ObfuscatedName("aw.k")
    public static class172 field795 = new class172(64);

    @ObfuscatedName("aw.q")
    public static class172 field825 = new class172(50);

    @ObfuscatedName("aw.j")
    public int field797;

    @ObfuscatedName("aw.z")
    public String field798 = "null";

    @ObfuscatedName("aw.m")
    public int field799 = 1;

    @ObfuscatedName("aw.w")
    public int[] field812;

    @ObfuscatedName("aw.a")
    public int[] field800;

    @ObfuscatedName("aw.d")
    public int field830 = -1;

    @ObfuscatedName("aw.u")
    public int field803 = -1;

    @ObfuscatedName("aw.p")
    public int field809 = -1;

    @ObfuscatedName("aw.t")
    public int field805 = -1;

    @ObfuscatedName("aw.g")
    public int field806 = -1;

    @ObfuscatedName("aw.o")
    public int field807 = -1;

    @ObfuscatedName("aw.x")
    public int field808 = -1;

    @ObfuscatedName("aw.c")
    public short[] field827;

    @ObfuscatedName("aw.b")
    public short[] field810;

    @ObfuscatedName("aw.f")
    public short[] field811;

    @ObfuscatedName("aw.s")
    public short[] field801;

    @ObfuscatedName("aw.y")
    public String[] field813 = new String[5];

    @ObfuscatedName("aw.r")
    public boolean field814 = true;

    @ObfuscatedName("aw.l")
    public int field815 = -1;

    @ObfuscatedName("aw.n")
    public int field816 = 128;

    @ObfuscatedName("aw.h")
    public int field817 = 128;

    @ObfuscatedName("aw.v")
    public boolean field818 = false;

    @ObfuscatedName("aw.ax")
    public int field819 = 0;

    @ObfuscatedName("aw.ao")
    public int field820 = 0;

    @ObfuscatedName("aw.al")
    public int field821 = -1;

    @ObfuscatedName("aw.ap")
    public int field822 = 32;

    @ObfuscatedName("aw.ak")
    public int[] field823;

    @ObfuscatedName("aw.aw")
    public int field824 = -1;

    @ObfuscatedName("aw.av")
    public int field802 = -1;

    @ObfuscatedName("aw.ah")
    public boolean field826 = true;

    @ObfuscatedName("aw.ae")
    public boolean field793 = true;

    @ObfuscatedName("ak.e(Lea;Lea;S)V")
    public static void method641(class155 arg0, class155 arg1) {
        Statics.field828 = arg0;
        Statics.field794 = arg1;
    }

    @ObfuscatedName("w.i(IB)Law;")
    public static class32 method48(int arg0) {
        class32 var1 = (class32) field795.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field828.method3069(9, arg0);
        class32 var3 = new class32();
        var3.field797 = arg0;
        if (var2 != null) {
            var3.method646(new class128(var2));
        }
        var3.method657();
        field795.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.k(S)V")
    public void method657() {
    }

    @ObfuscatedName("aw.q(Ldl;I)V")
    public void method646(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method647(arg0, var2);
        }
    }

    @ObfuscatedName("aw.j(Ldl;IB)V")
    public void method647(class128 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2548();
            this.field812 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field812[var4] = arg0.method2456();
            }
        } else if (arg1 == 2) {
            this.field798 = arg0.method2559();
        } else if (arg1 == 12) {
            this.field799 = arg0.method2548();
        } else if (arg1 == 13) {
            this.field830 = arg0.method2456();
        } else if (arg1 == 14) {
            this.field805 = arg0.method2456();
        } else if (arg1 == 15) {
            this.field803 = arg0.method2456();
        } else if (arg1 == 16) {
            this.field809 = arg0.method2456();
        } else if (arg1 == 17) {
            this.field805 = arg0.method2456();
            this.field806 = arg0.method2456();
            this.field807 = arg0.method2456();
            this.field808 = arg0.method2456();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field813[arg1 - 30] = arg0.method2559();
            if (this.field813[arg1 - 30].equalsIgnoreCase(class137.field2310)) {
                this.field813[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2548();
            this.field827 = new short[var5];
            this.field810 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field827[var6] = (short) arg0.method2456();
                this.field810[var6] = (short) arg0.method2456();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2548();
            this.field811 = new short[var7];
            this.field801 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field811[var8] = (short) arg0.method2456();
                this.field801[var8] = (short) arg0.method2456();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2548();
            this.field800 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field800[var10] = arg0.method2456();
            }
        } else if (arg1 == 93) {
            this.field814 = false;
        } else if (arg1 == 95) {
            this.field815 = arg0.method2456();
        } else if (arg1 == 97) {
            this.field816 = arg0.method2456();
        } else if (arg1 == 98) {
            this.field817 = arg0.method2456();
        } else if (arg1 == 99) {
            this.field818 = true;
        } else if (arg1 == 100) {
            this.field819 = arg0.method2455();
        } else if (arg1 == 101) {
            this.field820 = arg0.method2455() * 5;
        } else if (arg1 == 102) {
            this.field821 = arg0.method2456();
        } else if (arg1 == 103) {
            this.field822 = arg0.method2456();
        } else if (arg1 == 106) {
            this.field824 = arg0.method2456();
            if (this.field824 == 65535) {
                this.field824 = -1;
            }
            this.field802 = arg0.method2456();
            if (this.field802 == 65535) {
                this.field802 = -1;
            }
            int var11 = arg0.method2548();
            this.field823 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field823[var12] = arg0.method2456();
                if (this.field823[var12] == 65535) {
                    this.field823[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field826 = false;
        } else if (arg1 == 109) {
            this.field793 = false;
        }
    }

    @ObfuscatedName("aw.z(Lae;ILae;IB)Ldo;")
    public final class113 method648(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (this.field823 != null) {
            class32 var5 = this.method659();
            return var5 == null ? null : var5.method648(arg0, arg1, arg2, arg3);
        }
        class113 var6 = (class113) field825.method3262((long) this.field797);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field812.length; var8++) {
                if (!Statics.field794.method3022(this.field812[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class102[] var9 = new class102[this.field812.length];
            for (int var10 = 0; var10 < this.field812.length; var10++) {
                var9[var10] = class102.method2051(Statics.field794, this.field812[var10], 0);
            }
            class102 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class102(var9, var9.length);
            }
            if (this.field827 != null) {
                for (int var12 = 0; var12 < this.field827.length; var12++) {
                    var11.method2063(this.field827[var12], this.field810[var12]);
                }
            }
            if (this.field811 != null) {
                for (int var13 = 0; var13 < this.field811.length; var13++) {
                    var11.method2104(this.field811[var13], this.field801[var13]);
                }
            }
            var6 = var11.method2054(this.field819 + 64, this.field820 + 850, -30, -50, -30);
            field825.method3264(var6, (long) this.field797);
        }
        class113 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method760(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method764(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2300(true);
        } else {
            var14 = arg2.method764(var6, arg3);
        }
        if (this.field816 != 128 || this.field817 != 128) {
            var14.method2257(this.field816, this.field817, this.field816);
        }
        return var14;
    }

    @ObfuscatedName("aw.m(I)Lcq;")
    public final class102 method649() {
        if (this.field823 != null) {
            class32 var1 = this.method659();
            return var1 == null ? null : var1.method649();
        } else if (this.field800 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field800.length; var3++) {
                if (!Statics.field794.method3022(this.field800[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class102[] var4 = new class102[this.field800.length];
            for (int var5 = 0; var5 < this.field800.length; var5++) {
                var4[var5] = class102.method2051(Statics.field794, this.field800[var5], 0);
            }
            class102 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class102(var4, var4.length);
            }
            if (this.field827 != null) {
                for (int var7 = 0; var7 < this.field827.length; var7++) {
                    var6.method2063(this.field827[var7], this.field810[var7]);
                }
            }
            if (this.field811 != null) {
                for (int var8 = 0; var8 < this.field811.length; var8++) {
                    var6.method2104(this.field811[var8], this.field801[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aw.w(I)Law;")
    public final class32 method659() {
        int var1 = -1;
        if (this.field824 != -1) {
            var1 = class162.method3010(this.field824);
        } else if (this.field802 != -1) {
            var1 = class162.field2748[this.field802];
        }
        return var1 < 0 || var1 >= this.field823.length || this.field823[var1] == -1 ? null : method48(this.field823[var1]);
    }

    @ObfuscatedName("aw.a(B)Z")
    public boolean method651() {
        if (this.field823 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field824 != -1) {
            var1 = class162.method3010(this.field824);
        } else if (this.field802 != -1) {
            var1 = class162.field2748[this.field802];
        }
        return var1 >= 0 && var1 < this.field823.length && this.field823[var1] != -1;
    }

    @ObfuscatedName("e.d(B)V")
    public static void method3() {
        field795.method3265();
        field825.method3265();
    }
}
