package deob;

@ObfuscatedName("am")
public class class42 extends class208 {

    @ObfuscatedName("am.j")
    public static class197 field887 = new class197(64);

    @ObfuscatedName("am.z")
    public static class197 field922 = new class197(50);

    @ObfuscatedName("am.i")
    public int field889;

    @ObfuscatedName("am.b")
    public String field890 = "null";

    @ObfuscatedName("am.l")
    public int field903 = 1;

    @ObfuscatedName("am.m")
    public int[] field892;

    @ObfuscatedName("am.p")
    public int[] field885;

    @ObfuscatedName("am.f")
    public int field894 = -1;

    @ObfuscatedName("am.d")
    public int field908 = -1;

    @ObfuscatedName("am.v")
    public int field920 = -1;

    @ObfuscatedName("am.q")
    public int field897 = -1;

    @ObfuscatedName("am.t")
    public int field910 = -1;

    @ObfuscatedName("am.g")
    public int field899 = -1;

    @ObfuscatedName("am.s")
    public int field917 = -1;

    @ObfuscatedName("am.h")
    public short[] field901;

    @ObfuscatedName("am.u")
    public short[] field902;

    @ObfuscatedName("am.a")
    public short[] field900;

    @ObfuscatedName("am.e")
    public short[] field904;

    @ObfuscatedName("am.c")
    public String[] field905 = new String[5];

    @ObfuscatedName("am.n")
    public boolean field906 = true;

    @ObfuscatedName("am.y")
    public int field907 = -1;

    @ObfuscatedName("am.k")
    public int field891 = 128;

    @ObfuscatedName("am.w")
    public int field909 = 128;

    @ObfuscatedName("am.o")
    public boolean field893 = false;

    @ObfuscatedName("am.ah")
    public int field911 = 0;

    @ObfuscatedName("am.an")
    public int field912 = 0;

    @ObfuscatedName("am.ag")
    public int field896 = -1;

    @ObfuscatedName("am.as")
    public int field914 = 32;

    @ObfuscatedName("am.aq")
    public int[] field915;

    @ObfuscatedName("am.ax")
    public int field916 = -1;

    @ObfuscatedName("am.az")
    public int field898 = -1;

    @ObfuscatedName("am.ap")
    public boolean field918 = true;

    @ObfuscatedName("am.ao")
    public boolean field919 = true;

    @ObfuscatedName("am.af")
    public boolean field888 = false;

    @ObfuscatedName("cu.x(IB)Lam;")
    public static class42 method2094(int arg0) {
        class42 var1 = (class42) field887.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field895.method3079(9, arg0);
        class42 var3 = new class42();
        var3.field889 = arg0;
        if (var2 != null) {
            var3.method759(new class123(var2));
        }
        var3.method765();
        field887.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.r(I)V")
    public void method765() {
    }

    @ObfuscatedName("am.j(Ldp;I)V")
    public void method759(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method745(arg0, var2);
        }
    }

    @ObfuscatedName("am.z(Ldp;IS)V")
    public void method745(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2408();
            this.field892 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field892[var4] = arg0.method2403();
            }
        } else if (arg1 == 2) {
            this.field890 = arg0.method2626();
        } else if (arg1 == 12) {
            this.field903 = arg0.method2408();
        } else if (arg1 == 13) {
            this.field894 = arg0.method2403();
        } else if (arg1 == 14) {
            this.field897 = arg0.method2403();
        } else if (arg1 == 15) {
            this.field908 = arg0.method2403();
        } else if (arg1 == 16) {
            this.field920 = arg0.method2403();
        } else if (arg1 == 17) {
            this.field897 = arg0.method2403();
            this.field910 = arg0.method2403();
            this.field899 = arg0.method2403();
            this.field917 = arg0.method2403();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field905[arg1 - 30] = arg0.method2626();
            if (this.field905[arg1 - 30].equalsIgnoreCase(class161.field2399)) {
                this.field905[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2408();
            this.field901 = new short[var5];
            this.field902 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field901[var6] = (short) arg0.method2403();
                this.field902[var6] = (short) arg0.method2403();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2408();
            this.field900 = new short[var7];
            this.field904 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field900[var8] = (short) arg0.method2403();
                this.field904[var8] = (short) arg0.method2403();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2408();
            this.field885 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field885[var10] = arg0.method2403();
            }
        } else if (arg1 == 93) {
            this.field906 = false;
        } else if (arg1 == 95) {
            this.field907 = arg0.method2403();
        } else if (arg1 == 97) {
            this.field891 = arg0.method2403();
        } else if (arg1 == 98) {
            this.field909 = arg0.method2403();
        } else if (arg1 == 99) {
            this.field893 = true;
        } else if (arg1 == 100) {
            this.field911 = arg0.method2409();
        } else if (arg1 == 101) {
            this.field912 = arg0.method2409() * 5;
        } else if (arg1 == 102) {
            this.field896 = arg0.method2403();
        } else if (arg1 == 103) {
            this.field914 = arg0.method2403();
        } else if (arg1 == 106) {
            this.field916 = arg0.method2403();
            if (this.field916 == 65535) {
                this.field916 = -1;
            }
            this.field898 = arg0.method2403();
            if (this.field898 == 65535) {
                this.field898 = -1;
            }
            int var11 = arg0.method2408();
            this.field915 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field915[var12] = arg0.method2403();
                if (this.field915[var12] == 65535) {
                    this.field915[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field918 = false;
        } else if (arg1 == 109) {
            this.field919 = false;
        } else if (arg1 == 111) {
            this.field888 = true;
        }
    }

    @ObfuscatedName("am.i(Lak;ILak;IB)Ldj;")
    public final class109 method746(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field915 != null) {
            class42 var5 = this.method748();
            return var5 == null ? null : var5.method746(arg0, arg1, arg2, arg3);
        }
        class109 var6 = (class109) field922.method3533((long) this.field889);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field892.length; var8++) {
                if (!Statics.field886.method3081(this.field892[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class104[] var9 = new class104[this.field892.length];
            for (int var10 = 0; var10 < this.field892.length; var10++) {
                var9[var10] = class104.method2122(Statics.field886, this.field892[var10], 0);
            }
            class104 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class104(var9, var9.length);
            }
            if (this.field901 != null) {
                for (int var12 = 0; var12 < this.field901.length; var12++) {
                    var11.method2197(this.field901[var12], this.field902[var12]);
                }
            }
            if (this.field900 != null) {
                for (int var13 = 0; var13 < this.field900.length; var13++) {
                    var11.method2136(this.field900[var13], this.field904[var13]);
                }
            }
            var6 = var11.method2150(this.field911 + 64, this.field912 + 850, -30, -50, -30);
            field922.method3535(var6, (long) this.field889);
        }
        class109 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method849(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method833(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2220(true);
        } else {
            var14 = arg2.method833(var6, arg3);
        }
        if (this.field891 != 128 || this.field909 != 128) {
            var14.method2234(this.field891, this.field909, this.field891);
        }
        return var14;
    }

    @ObfuscatedName("am.b(I)Lcy;")
    public final class104 method747() {
        if (this.field915 != null) {
            class42 var1 = this.method748();
            return var1 == null ? null : var1.method747();
        } else if (this.field885 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field885.length; var3++) {
                if (!Statics.field886.method3081(this.field885[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class104[] var4 = new class104[this.field885.length];
            for (int var5 = 0; var5 < this.field885.length; var5++) {
                var4[var5] = class104.method2122(Statics.field886, this.field885[var5], 0);
            }
            class104 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class104(var4, var4.length);
            }
            if (this.field901 != null) {
                for (int var7 = 0; var7 < this.field901.length; var7++) {
                    var6.method2197(this.field901[var7], this.field902[var7]);
                }
            }
            if (this.field900 != null) {
                for (int var8 = 0; var8 < this.field900.length; var8++) {
                    var6.method2136(this.field900[var8], this.field904[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("am.l(I)Lam;")
    public final class42 method748() {
        int var1 = -1;
        if (this.field916 != -1) {
            var1 = class180.method870(this.field916);
        } else if (this.field898 != -1) {
            var1 = class180.field2960[this.field898];
        }
        return var1 < 0 || var1 >= this.field915.length || this.field915[var1] == -1 ? null : method2094(this.field915[var1]);
    }

    @ObfuscatedName("am.m(I)Z")
    public boolean method749() {
        if (this.field915 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field916 != -1) {
            var1 = class180.method870(this.field916);
        } else if (this.field898 != -1) {
            var1 = class180.field2960[this.field898];
        }
        return var1 >= 0 && var1 < this.field915.length && this.field915[var1] != -1;
    }
}
