package deob;

@ObfuscatedName("ak")
public class class40 extends class204 {

    @ObfuscatedName("ak.v")
    public static class193 field891 = new class193(64);

    @ObfuscatedName("ak.n")
    public static class193 field895 = new class193(50);

    @ObfuscatedName("ak.f")
    public int field893;

    @ObfuscatedName("ak.g")
    public String field917 = "null";

    @ObfuscatedName("ak.o")
    public int field907 = 1;

    @ObfuscatedName("ak.s")
    public int[] field896;

    @ObfuscatedName("ak.k")
    public int[] field889;

    @ObfuscatedName("ak.b")
    public int field898 = -1;

    @ObfuscatedName("ak.c")
    public int field897 = -1;

    @ObfuscatedName("ak.l")
    public int field900 = -1;

    @ObfuscatedName("ak.p")
    public int field901 = -1;

    @ObfuscatedName("ak.d")
    public int field902 = -1;

    @ObfuscatedName("ak.i")
    public int field903 = -1;

    @ObfuscatedName("ak.x")
    public int field904 = -1;

    @ObfuscatedName("ak.j")
    public short[] field910;

    @ObfuscatedName("ak.w")
    public short[] field906;

    @ObfuscatedName("ak.r")
    public short[] field894;

    @ObfuscatedName("ak.u")
    public short[] field918;

    @ObfuscatedName("ak.m")
    public String[] field909 = new String[5];

    @ObfuscatedName("ak.t")
    public boolean field914 = true;

    @ObfuscatedName("ak.z")
    public int field905 = -1;

    @ObfuscatedName("ak.e")
    public int field912 = 128;

    @ObfuscatedName("ak.y")
    public int field913 = 128;

    @ObfuscatedName("ak.a")
    public boolean field911 = false;

    @ObfuscatedName("ak.at")
    public int field892 = 0;

    @ObfuscatedName("ak.aa")
    public int field916 = 0;

    @ObfuscatedName("ak.ad")
    public int field915 = -1;

    @ObfuscatedName("ak.af")
    public int field899 = 32;

    @ObfuscatedName("ak.ag")
    public int[] field919;

    @ObfuscatedName("ak.as")
    public int field920 = -1;

    @ObfuscatedName("ak.al")
    public int field890 = -1;

    @ObfuscatedName("ak.am")
    public boolean field922 = true;

    @ObfuscatedName("ak.ar")
    public boolean field923 = true;

    @ObfuscatedName("ak.ap")
    public boolean field924 = false;

    @ObfuscatedName("ak.ac")
    public int field925 = 30;

    @ObfuscatedName("h.q(IB)Lak;")
    public static class40 method3(int arg0) {
        class40 var1 = (class40) field891.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field921.method3073(9, arg0);
        class40 var3 = new class40();
        var3.field893 = arg0;
        if (var2 != null) {
            var3.method745(new class119(var2));
        }
        var3.method738();
        field891.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.v(I)V")
    public void method738() {
    }

    @ObfuscatedName("ak.n(Ldm;I)V")
    public void method745(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method739(arg0, var2);
        }
    }

    @ObfuscatedName("ak.f(Ldm;IS)V")
    public void method739(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2383();
            this.field896 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field896[var4] = arg0.method2385();
            }
        } else if (arg1 == 2) {
            this.field917 = arg0.method2391();
        } else if (arg1 == 12) {
            this.field907 = arg0.method2383();
        } else if (arg1 == 13) {
            this.field898 = arg0.method2385();
        } else if (arg1 == 14) {
            this.field901 = arg0.method2385();
        } else if (arg1 == 15) {
            this.field897 = arg0.method2385();
        } else if (arg1 == 16) {
            this.field900 = arg0.method2385();
        } else if (arg1 == 17) {
            this.field901 = arg0.method2385();
            this.field902 = arg0.method2385();
            this.field903 = arg0.method2385();
            this.field904 = arg0.method2385();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field909[arg1 - 30] = arg0.method2391();
            if (this.field909[arg1 - 30].equalsIgnoreCase(class157.field2496)) {
                this.field909[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2383();
            this.field910 = new short[var5];
            this.field906 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field910[var6] = (short) arg0.method2385();
                this.field906[var6] = (short) arg0.method2385();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2383();
            this.field894 = new short[var7];
            this.field918 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field894[var8] = (short) arg0.method2385();
                this.field918[var8] = (short) arg0.method2385();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2383();
            this.field889 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field889[var10] = arg0.method2385();
            }
        } else if (arg1 == 93) {
            this.field914 = false;
        } else if (arg1 == 95) {
            this.field905 = arg0.method2385();
        } else if (arg1 == 97) {
            this.field912 = arg0.method2385();
        } else if (arg1 == 98) {
            this.field913 = arg0.method2385();
        } else if (arg1 == 99) {
            this.field911 = true;
        } else if (arg1 == 100) {
            this.field892 = arg0.method2370();
        } else if (arg1 == 101) {
            this.field916 = arg0.method2370();
        } else if (arg1 == 102) {
            this.field915 = arg0.method2385();
        } else if (arg1 == 103) {
            this.field899 = arg0.method2385();
        } else if (arg1 == 106) {
            this.field920 = arg0.method2385();
            if (this.field920 == 65535) {
                this.field920 = -1;
            }
            this.field890 = arg0.method2385();
            if (this.field890 == 65535) {
                this.field890 = -1;
            }
            int var11 = arg0.method2383();
            this.field919 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field919[var12] = arg0.method2385();
                if (this.field919[var12] == 65535) {
                    this.field919[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field922 = false;
        } else if (arg1 == 109) {
            this.field923 = false;
        } else if (arg1 == 111) {
            this.field924 = true;
        } else if (arg1 == 112) {
            this.field925 = arg0.method2383();
        }
    }

    @ObfuscatedName("ak.g(Laz;ILaz;II)Ldg;")
    public final class105 method740(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field919 != null) {
            class40 var5 = this.method742();
            return var5 == null ? null : var5.method740(arg0, arg1, arg2, arg3);
        }
        class105 var6 = (class105) field895.method3538((long) this.field893);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field896.length; var8++) {
                if (!Statics.field908.method3075(this.field896[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class100[] var9 = new class100[this.field896.length];
            for (int var10 = 0; var10 < this.field896.length; var10++) {
                var9[var10] = class100.method2084(Statics.field908, this.field896[var10], 0);
            }
            class100 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class100(var9, var9.length);
            }
            if (this.field910 != null) {
                for (int var12 = 0; var12 < this.field910.length; var12++) {
                    var11.method2097(this.field910[var12], this.field906[var12]);
                }
            }
            if (this.field894 != null) {
                for (int var13 = 0; var13 < this.field894.length; var13++) {
                    var11.method2149(this.field894[var13], this.field918[var13]);
                }
            }
            var6 = var11.method2112(this.field892 + 64, this.field916 * 5 + 850, -30, -50, -30);
            field895.method3540(var6, (long) this.field893);
        }
        class105 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method840(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method837(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2216(true);
        } else {
            var14 = arg2.method837(var6, arg3);
        }
        if (this.field912 != 128 || this.field913 != 128) {
            var14.method2192(this.field912, this.field913, this.field912);
        }
        return var14;
    }

    @ObfuscatedName("ak.o(B)Lch;")
    public final class100 method741() {
        if (this.field919 != null) {
            class40 var1 = this.method742();
            return var1 == null ? null : var1.method741();
        } else if (this.field889 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field889.length; var3++) {
                if (!Statics.field908.method3075(this.field889[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class100[] var4 = new class100[this.field889.length];
            for (int var5 = 0; var5 < this.field889.length; var5++) {
                var4[var5] = class100.method2084(Statics.field908, this.field889[var5], 0);
            }
            class100 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class100(var4, var4.length);
            }
            if (this.field910 != null) {
                for (int var7 = 0; var7 < this.field910.length; var7++) {
                    var6.method2097(this.field910[var7], this.field906[var7]);
                }
            }
            if (this.field894 != null) {
                for (int var8 = 0; var8 < this.field894.length; var8++) {
                    var6.method2149(this.field894[var8], this.field918[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ak.s(I)Lak;")
    public final class40 method742() {
        int var1 = -1;
        if (this.field920 != -1) {
            var1 = class176.method156(this.field920);
        } else if (this.field890 != -1) {
            var1 = class176.field2879[this.field890];
        }
        return var1 < 0 || var1 >= this.field919.length || this.field919[var1] == -1 ? null : method3(this.field919[var1]);
    }

    @ObfuscatedName("ak.k(B)Z")
    public boolean method752() {
        if (this.field919 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field920 != -1) {
            var1 = class176.method156(this.field920);
        } else if (this.field890 != -1) {
            var1 = class176.field2879[this.field890];
        }
        return var1 >= 0 && var1 < this.field919.length && this.field919[var1] != -1;
    }

    @ObfuscatedName("ex.b(I)V")
    public static void method2826() {
        field891.method3541();
        field895.method3541();
    }
}
