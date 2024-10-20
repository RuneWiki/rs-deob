package deob;

@ObfuscatedName("fz")
public class class180 extends class425 {

    @ObfuscatedName("fz.x")
    public static class266 field1909 = new class266(64);

    @ObfuscatedName("fz.h")
    public int field1905 = -1;

    @ObfuscatedName("fz.j")
    public int[] field1906;

    @ObfuscatedName("fz.y")
    public short[] field1907;

    @ObfuscatedName("fz.d")
    public short[] field1902;

    @ObfuscatedName("fz.n")
    public short[] field1903;

    @ObfuscatedName("fz.r")
    public short[] field1910;

    @ObfuscatedName("fz.l")
    public int[] field1911 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fz.s")
    public boolean field1912 = false;

    @ObfuscatedName("bz.a(II)Lfz;")
    public static class180 method2038(int arg0) {
        class180 var1 = (class180) field1909.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1904.method5859(3, arg0);
        class180 var3 = new class180();
        if (var2 != null) {
            var3.method3160(new class464(var2));
        }
        field1909.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fz.f(Lqr;I)V")
    public void method3160(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3163(arg0, var2);
        }
    }

    @ObfuscatedName("fz.c(Lqr;II)V")
    public void method3163(class464 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1905 = arg0.method7735();
        } else if (arg1 == 2) {
            int var3 = arg0.method7735();
            this.field1906 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1906[var4] = arg0.method7716();
            }
        } else if (arg1 == 3) {
            this.field1912 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method7735();
            this.field1907 = new short[var5];
            this.field1902 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1907[var6] = (short) arg0.method7716();
                this.field1902[var6] = (short) arg0.method7716();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7735();
            this.field1903 = new short[var7];
            this.field1910 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1903[var8] = (short) arg0.method7716();
                this.field1910[var8] = (short) arg0.method7716();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1911[arg1 - 60] = arg0.method7716();
        }
    }

    @ObfuscatedName("fz.x(I)Z")
    public boolean method3162() {
        if (this.field1906 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1906.length; var2++) {
            if (!Statics.field1901.method5784(this.field1906[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fz.h(B)Lgs;")
    public class206 method3177() {
        if (this.field1906 == null) {
            return null;
        }
        class206[] var1 = new class206[this.field1906.length];
        for (int var2 = 0; var2 < this.field1906.length; var2++) {
            var1[var2] = class206.method3710(Statics.field1901, this.field1906[var2], 0);
        }
        class206 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class206(var1, var1.length);
        }
        if (this.field1907 != null) {
            for (int var4 = 0; var4 < this.field1907.length; var4++) {
                var3.method3726(this.field1907[var4], this.field1902[var4]);
            }
        }
        if (this.field1903 != null) {
            for (int var5 = 0; var5 < this.field1903.length; var5++) {
                var3.method3727(this.field1903[var5], this.field1910[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fz.j(B)Z")
    public boolean method3164() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1911[var2] != -1 && !Statics.field1901.method5784(this.field1911[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fz.y(I)Lgs;")
    public class206 method3166() {
        class206[] var1 = new class206[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1911[var3] != -1) {
                var1[var2++] = class206.method3710(Statics.field1901, this.field1911[var3], 0);
            }
        }
        class206 var4 = new class206(var1, var2);
        if (this.field1907 != null) {
            for (int var5 = 0; var5 < this.field1907.length; var5++) {
                var4.method3726(this.field1907[var5], this.field1902[var5]);
            }
        }
        if (this.field1903 != null) {
            for (int var6 = 0; var6 < this.field1903.length; var6++) {
                var4.method3727(this.field1903[var6], this.field1910[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fu.d(I)V")
    public static void method3107() {
        field1909.method4837();
    }
}
