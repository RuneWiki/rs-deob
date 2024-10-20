package deob;

@ObfuscatedName("ab")
public class class35 extends class173 {

    @ObfuscatedName("ab.c")
    public static class169 field906 = new class169(64);

    @ObfuscatedName("ab.r")
    public int field907 = -1;

    @ObfuscatedName("ab.k")
    public int[] field903;

    @ObfuscatedName("ab.e")
    public short[] field904;

    @ObfuscatedName("ab.q")
    public short[] field905;

    @ObfuscatedName("ab.u")
    public short[] field908;

    @ObfuscatedName("ab.s")
    public short[] field914;

    @ObfuscatedName("ab.l")
    public int[] field909 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ab.o")
    public boolean field898 = false;

    @ObfuscatedName("t.v(IB)Lab;")
    public static class35 method150(int arg0) {
        class35 var1 = (class35) field906.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field901.method3020(3, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method759(new class126(var2));
        }
        field906.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.f(Ldr;I)V")
    public void method759(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method760(arg0, var2);
        }
    }

    @ObfuscatedName("ab.n(Ldr;IB)V")
    public void method760(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field907 = arg0.method2466();
        } else if (arg1 == 2) {
            int var3 = arg0.method2466();
            this.field903 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field903[var4] = arg0.method2468();
            }
        } else if (arg1 == 3) {
            this.field898 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2466();
            this.field904 = new short[var5];
            this.field905 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field904[var6] = (short) arg0.method2468();
                this.field905[var6] = (short) arg0.method2468();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2466();
            this.field908 = new short[var7];
            this.field914 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field908[var8] = (short) arg0.method2468();
                this.field914[var8] = (short) arg0.method2468();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field909[arg1 - 60] = arg0.method2468();
        }
    }

    @ObfuscatedName("ab.c(I)Z")
    public boolean method761() {
        if (this.field903 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field903.length; var2++) {
            if (!Statics.field899.method2993(this.field903[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.r(B)Lcw;")
    public class100 method773() {
        if (this.field903 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field903.length];
        for (int var2 = 0; var2 < this.field903.length; var2++) {
            var1[var2] = class100.method2060(Statics.field899, this.field903[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field904 != null) {
            for (int var4 = 0; var4 < this.field904.length; var4++) {
                var3.method2082(this.field904[var4], this.field905[var4]);
            }
        }
        if (this.field908 != null) {
            for (int var5 = 0; var5 < this.field908.length; var5++) {
                var3.method2101(this.field908[var5], this.field914[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ab.k(I)Z")
    public boolean method769() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field909[var2] != -1 && !Statics.field899.method2993(this.field909[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.e(I)Lcw;")
    public class100 method758() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field909[var3] != -1) {
                var1[var2++] = class100.method2060(Statics.field899, this.field909[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field904 != null) {
            for (int var5 = 0; var5 < this.field904.length; var5++) {
                var4.method2082(this.field904[var5], this.field905[var5]);
            }
        }
        if (this.field908 != null) {
            for (int var6 = 0; var6 < this.field908.length; var6++) {
                var4.method2101(this.field908[var6], this.field914[var6]);
            }
        }
        return var4;
    }
}
