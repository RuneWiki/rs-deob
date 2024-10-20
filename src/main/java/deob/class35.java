package deob;

@ObfuscatedName("an")
public class class35 extends class172 {

    @ObfuscatedName("an.y")
    public static class168 field903 = new class168(64);

    @ObfuscatedName("an.x")
    public int field911 = -1;

    @ObfuscatedName("an.e")
    public int[] field900;

    @ObfuscatedName("an.m")
    public short[] field906;

    @ObfuscatedName("an.s")
    public short[] field904;

    @ObfuscatedName("an.p")
    public short[] field908;

    @ObfuscatedName("an.w")
    public short[] field909;

    @ObfuscatedName("an.r")
    public int[] field910 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.n")
    public boolean field912 = false;

    @ObfuscatedName("q.c(II)Lan;")
    public static class35 method132(int arg0) {
        class35 var1 = (class35) field903.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field902.method2821(3, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method723(new class125(var2));
        }
        field903.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.j(Ldl;I)V")
    public void method723(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method726(arg0, var2);
        }
    }

    @ObfuscatedName("an.f(Ldl;IB)V")
    public void method726(class125 arg0, int arg1) {
        if (arg1 == 1) {
            this.field911 = arg0.method2326();
        } else if (arg1 == 2) {
            int var3 = arg0.method2326();
            this.field900 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field900[var4] = arg0.method2328();
            }
        } else if (arg1 == 3) {
            this.field912 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2326();
            this.field906 = new short[var5];
            this.field904 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field906[var6] = (short) arg0.method2328();
                this.field904[var6] = (short) arg0.method2328();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2326();
            this.field908 = new short[var7];
            this.field909 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field908[var8] = (short) arg0.method2328();
                this.field909[var8] = (short) arg0.method2328();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field910[arg1 - 60] = arg0.method2328();
        }
    }

    @ObfuscatedName("an.y(I)Z")
    public boolean method725() {
        if (this.field900 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field900.length; var2++) {
            if (!Statics.field901.method2823(this.field900[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.x(B)Lcl;")
    public class100 method729() {
        if (this.field900 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field900.length];
        for (int var2 = 0; var2 < this.field900.length; var2++) {
            var1[var2] = class100.method1925(Statics.field901, this.field900[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field906 != null) {
            for (int var4 = 0; var4 < this.field906.length; var4++) {
                var3.method1938(this.field906[var4], this.field904[var4]);
            }
        }
        if (this.field908 != null) {
            for (int var5 = 0; var5 < this.field908.length; var5++) {
                var3.method1959(this.field908[var5], this.field909[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.e(B)Z")
    public boolean method727() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field910[var2] != -1 && !Statics.field901.method2823(this.field910[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.m(I)Lcl;")
    public class100 method747() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field910[var3] != -1) {
                var1[var2++] = class100.method1925(Statics.field901, this.field910[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field906 != null) {
            for (int var5 = 0; var5 < this.field906.length; var5++) {
                var4.method1938(this.field906[var5], this.field904[var5]);
            }
        }
        if (this.field908 != null) {
            for (int var6 = 0; var6 < this.field908.length; var6++) {
                var4.method1959(this.field908[var6], this.field909[var6]);
            }
        }
        return var4;
    }
}
