package deob;

@ObfuscatedName("aa")
public class class39 extends class187 {

    @ObfuscatedName("aa.b")
    public static class176 field921 = new class176(64);

    @ObfuscatedName("aa.l")
    public static class176 field923 = new class176(100);

    @ObfuscatedName("aa.m")
    public int[] field911;

    @ObfuscatedName("aa.w")
    public int[] field909;

    @ObfuscatedName("aa.e")
    public int[] field912;

    @ObfuscatedName("aa.n")
    public int[] field925;

    @ObfuscatedName("aa.s")
    public int field914 = -1;

    @ObfuscatedName("aa.k")
    public int[] field915;

    @ObfuscatedName("aa.f")
    public boolean field916 = false;

    @ObfuscatedName("aa.d")
    public int field917 = 5;

    @ObfuscatedName("aa.x")
    public int field918 = -1;

    @ObfuscatedName("aa.o")
    public int field919 = -1;

    @ObfuscatedName("aa.q")
    public int field920 = 99;

    @ObfuscatedName("aa.t")
    public int field906 = -1;

    @ObfuscatedName("aa.h")
    public int field922 = -1;

    @ObfuscatedName("aa.u")
    public int field910 = 2;

    @ObfuscatedName("aa.v(Ldi;I)V")
    public void method732(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method762(arg0, var2);
        }
    }

    @ObfuscatedName("aa.i(Ldi;II)V")
    public void method762(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2282();
            this.field912 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field912[var4] = arg0.method2282();
            }
            this.field911 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field911[var5] = arg0.method2282();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field911[var6] += arg0.method2282() << 16;
            }
        } else if (arg1 == 2) {
            this.field914 = arg0.method2282();
        } else if (arg1 == 3) {
            int var7 = arg0.method2199();
            this.field915 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field915[var8] = arg0.method2199();
            }
            this.field915[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field916 = true;
        } else if (arg1 == 5) {
            this.field917 = arg0.method2199();
        } else if (arg1 == 6) {
            this.field918 = arg0.method2282();
        } else if (arg1 == 7) {
            this.field919 = arg0.method2282();
        } else if (arg1 == 8) {
            this.field920 = arg0.method2199();
        } else if (arg1 == 9) {
            this.field906 = arg0.method2199();
        } else if (arg1 == 10) {
            this.field922 = arg0.method2199();
        } else if (arg1 == 11) {
            this.field910 = arg0.method2199();
        } else if (arg1 == 12) {
            int var9 = arg0.method2199();
            this.field909 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field909[var10] = arg0.method2282();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field909[var11] += arg0.method2282() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2199();
            this.field925 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field925[var13] = arg0.method2208();
            }
        }
    }

    @ObfuscatedName("aa.b(I)V")
    public void method734() {
        if (this.field906 == -1) {
            if (this.field915 == null) {
                this.field906 = 0;
            } else {
                this.field906 = 2;
            }
        }
        if (this.field922 != -1) {
            return;
        }
        if (this.field915 == null) {
            this.field922 = 0;
        } else {
            this.field922 = 2;
        }
    }

    @ObfuscatedName("aa.l(Lcl;II)Lcl;")
    public class99 method763(class99 arg0, int arg1) {
        int var3 = this.field911[arg1];
        class97 var4 = Statics.method766(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1977(true);
        } else {
            class99 var6 = arg0.method1977(!var4.method1970(var5));
            var6.method1983(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.m(Lcl;III)Lcl;")
    public class99 method736(class99 arg0, int arg1, int arg2) {
        int var4 = this.field911[arg1];
        class97 var5 = Statics.method766(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1977(true);
        }
        class99 var7 = arg0.method1977(!var5.method1970(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1975();
        } else if (var8 == 2) {
            var7.method1986();
        } else if (var8 == 3) {
            var7.method1985();
        }
        var7.method1983(var5, var6);
        if (var8 == 1) {
            var7.method1985();
        } else if (var8 == 2) {
            var7.method1986();
        } else if (var8 == 3) {
            var7.method1975();
        }
        return var7;
    }

    @ObfuscatedName("aa.w(Lcl;II)Lcl;")
    public class99 method737(class99 arg0, int arg1) {
        int var3 = this.field911[arg1];
        class97 var4 = Statics.method766(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1997(true);
        } else {
            class99 var6 = arg0.method1997(!var4.method1970(var5));
            var6.method1983(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.e(Lcl;ILaa;II)Lcl;")
    public class99 method744(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field911[arg1];
        class97 var6 = Statics.method766(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method763(arg0, arg3);
        }
        int var8 = arg2.field911[arg3];
        class97 var9 = Statics.method766(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method1977(!var6.method1970(var7));
            var11.method1983(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method1977(!var6.method1970(var7) & !var9.method1970(var10));
            var12.method2029(var6, var7, var9, var10, this.field915);
            return var12;
        }
    }

    @ObfuscatedName("aa.n(Lcl;II)Lcl;")
    public class99 method739(class99 arg0, int arg1) {
        int var3 = this.field911[arg1];
        class97 var4 = Statics.method766(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1977(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field909 != null && arg1 < this.field909.length) {
            int var8 = this.field909[arg1];
            var6 = Statics.method766(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method1977(!var4.method1970(var5));
            var10.method1983(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method1977(!var4.method1970(var5) & !var6.method1970(var7));
            var9.method1983(var4, var5);
            var9.method1983(var6, var7);
            return var9;
        }
    }
}
