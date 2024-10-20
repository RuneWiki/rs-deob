package deob;

@ObfuscatedName("aw")
public class class34 extends class172 {

    @ObfuscatedName("aw.c")
    public static class168 field910 = new class168(64);

    @ObfuscatedName("aw.p")
    public static class168 field901 = new class168(30);

    @ObfuscatedName("aw.i")
    public int field902;

    @ObfuscatedName("aw.v")
    public int field903;

    @ObfuscatedName("aw.l")
    public int field904 = -1;

    @ObfuscatedName("aw.m")
    public short[] field908;

    @ObfuscatedName("aw.g")
    public short[] field906;

    @ObfuscatedName("aw.t")
    public short[] field898;

    @ObfuscatedName("aw.o")
    public short[] field911;

    @ObfuscatedName("aw.b")
    public int field909 = 128;

    @ObfuscatedName("aw.d")
    public int field905 = 128;

    @ObfuscatedName("aw.k")
    public int field907 = 0;

    @ObfuscatedName("aw.f")
    public int field912 = 0;

    @ObfuscatedName("aw.e")
    public int field913 = 0;

    @ObfuscatedName("ex.z(Len;Len;I)V")
    public static void method2947(class150 arg0, class150 arg1) {
        Statics.field900 = arg0;
        Statics.field899 = arg1;
    }

    @ObfuscatedName("aw.c(Ldq;B)V")
    public void method746(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("aw.p(Ldq;IB)V")
    public void method747(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field903 = arg0.method2627();
        } else if (arg1 == 2) {
            this.field904 = arg0.method2627();
        } else if (arg1 == 4) {
            this.field909 = arg0.method2627();
        } else if (arg1 == 5) {
            this.field905 = arg0.method2627();
        } else if (arg1 == 6) {
            this.field907 = arg0.method2627();
        } else if (arg1 == 7) {
            this.field912 = arg0.method2450();
        } else if (arg1 == 8) {
            this.field913 = arg0.method2450();
        } else if (arg1 == 40) {
            int var3 = arg0.method2450();
            this.field908 = new short[var3];
            this.field906 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field908[var4] = (short) arg0.method2627();
                this.field906[var4] = (short) arg0.method2627();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2450();
            this.field898 = new short[var5];
            this.field911 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field898[var6] = (short) arg0.method2627();
                this.field911[var6] = (short) arg0.method2627();
            }
        }
    }

    @ObfuscatedName("aw.i(II)Ldh;")
    public final class111 method748(int arg0) {
        class111 var2 = (class111) field901.method3240((long) this.field902);
        if (var2 == null) {
            class100 var3 = class100.method2037(Statics.field899, this.field903, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field908 != null) {
                for (int var4 = 0; var4 < this.field908.length; var4++) {
                    var3.method2059(this.field908[var4], this.field906[var4]);
                }
            }
            if (this.field898 != null) {
                for (int var5 = 0; var5 < this.field898.length; var5++) {
                    var3.method2082(this.field898[var5], this.field911[var5]);
                }
            }
            var2 = var3.method2046(this.field912 + 64, this.field913 + 850, -30, -50, -30);
            field901.method3237(var2, (long) this.field902);
        }
        class111 var6;
        if (this.field904 == -1 || arg0 == -1) {
            var6 = var2.method2217(true);
        } else {
            var6 = class33.method2674(this.field904).method712(var2, arg0);
        }
        if (this.field909 != 128 || this.field905 != 128) {
            var6.method2226(this.field909, this.field905, this.field909);
        }
        if (this.field907 != 0) {
            if (this.field907 == 90) {
                var6.method2225();
            }
            if (this.field907 == 180) {
                var6.method2225();
                var6.method2225();
            }
            if (this.field907 == 270) {
                var6.method2225();
                var6.method2225();
                var6.method2225();
            }
        }
        return var6;
    }

    @ObfuscatedName("ek.v(I)V")
    public static void method3065() {
        field910.method3241();
        field901.method3241();
    }
}
