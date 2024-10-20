package deob;

@ObfuscatedName("av")
public class class40 extends class183 {

    @ObfuscatedName("av.g")
    public static class172 field928 = new class172(64);

    @ObfuscatedName("av.h")
    public int field929 = -1;

    @ObfuscatedName("av.l")
    public int[] field930;

    @ObfuscatedName("av.e")
    public short[] field931;

    @ObfuscatedName("av.u")
    public short[] field938;

    @ObfuscatedName("av.j")
    public short[] field939;

    @ObfuscatedName("av.c")
    public short[] field934;

    @ObfuscatedName("av.d")
    public int[] field935 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("av.v")
    public boolean field936 = false;

    @ObfuscatedName("c.k(Lei;Lei;I)V")
    public static void method116(class147 arg0, class147 arg1) {
        Statics.field932 = arg0;
        Statics.field132 = arg1;
        Statics.field926 = Statics.field932.method2739(3);
    }

    @ObfuscatedName("au.y(II)Lav;")
    public static class40 method675(int arg0) {
        class40 var1 = (class40) field928.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field932.method2729(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method737(new class107(var2));
        }
        field928.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.s(Ldy;I)V")
    public void method737(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method752(arg0, var2);
        }
    }

    @ObfuscatedName("av.g(Ldy;IB)V")
    public void method752(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field929 = arg0.method2138();
        } else if (arg1 == 2) {
            int var3 = arg0.method2138();
            this.field930 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field930[var4] = arg0.method2239();
            }
        } else if (arg1 == 3) {
            this.field936 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2138();
            this.field931 = new short[var5];
            this.field938 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field931[var6] = (short) arg0.method2239();
                this.field938[var6] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2138();
            this.field939 = new short[var7];
            this.field934 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field939[var8] = (short) arg0.method2239();
                this.field934[var8] = (short) arg0.method2239();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field935[arg1 - 60] = arg0.method2239();
        }
    }

    @ObfuscatedName("av.h(I)Z")
    public boolean method739() {
        if (this.field930 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field930.length; var2++) {
            if (!Statics.field132.method2731(this.field930[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("av.l(I)Lcf;")
    public class93 method766() {
        if (this.field930 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field930.length];
        for (int var2 = 0; var2 < this.field930.length; var2++) {
            var1[var2] = class93.method1891(Statics.field132, this.field930[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field931 != null) {
            for (int var4 = 0; var4 < this.field931.length; var4++) {
                var3.method1905(this.field931[var4], this.field938[var4]);
            }
        }
        if (this.field939 != null) {
            for (int var5 = 0; var5 < this.field939.length; var5++) {
                var3.method1956(this.field939[var5], this.field934[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("av.e(B)Z")
    public boolean method740() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field935[var2] != -1 && !Statics.field132.method2731(this.field935[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("av.u(I)Lcf;")
    public class93 method742() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field935[var3] != -1) {
                var1[var2++] = class93.method1891(Statics.field132, this.field935[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field931 != null) {
            for (int var5 = 0; var5 < this.field931.length; var5++) {
                var4.method1905(this.field931[var5], this.field938[var5]);
            }
        }
        if (this.field939 != null) {
            for (int var6 = 0; var6 < this.field939.length; var6++) {
                var4.method1956(this.field939[var6], this.field934[var6]);
            }
        }
        return var4;
    }
}
