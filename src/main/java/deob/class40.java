package deob;

@ObfuscatedName("ap")
public class class40 extends class187 {

    @ObfuscatedName("ap.d")
    public static class176 field906 = new class176(64);

    @ObfuscatedName("ap.c")
    public static class176 field907 = new class176(30);

    @ObfuscatedName("ap.r")
    public int field908;

    @ObfuscatedName("ap.f")
    public int field911;

    @ObfuscatedName("ap.z")
    public int field915 = -1;

    @ObfuscatedName("ap.o")
    public short[] field916;

    @ObfuscatedName("ap.k")
    public short[] field904;

    @ObfuscatedName("ap.s")
    public short[] field913;

    @ObfuscatedName("ap.h")
    public short[] field914;

    @ObfuscatedName("ap.m")
    public int field912 = 128;

    @ObfuscatedName("ap.w")
    public int field909 = 128;

    @ObfuscatedName("ap.q")
    public int field917 = 0;

    @ObfuscatedName("ap.u")
    public int field918 = 0;

    @ObfuscatedName("ap.e")
    public int field919 = 0;

    @ObfuscatedName("dg.p(Len;Len;B)V")
    public static void method2322(class151 arg0, class151 arg1) {
        Statics.field910 = arg0;
        Statics.field905 = arg1;
    }

    @ObfuscatedName("at.y(IB)Lap;")
    public static class40 method761(int arg0) {
        class40 var1 = (class40) field906.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field910.method2811(13, arg0);
        class40 var3 = new class40();
        var3.field908 = arg0;
        if (var2 != null) {
            var3.method763(new class110(var2));
        }
        field906.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.d(Ldg;I)V")
    public void method763(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method764(arg0, var2);
        }
    }

    @ObfuscatedName("ap.c(Ldg;II)V")
    public void method764(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field911 = arg0.method2243();
        } else if (arg1 == 2) {
            this.field915 = arg0.method2243();
        } else if (arg1 == 4) {
            this.field912 = arg0.method2243();
        } else if (arg1 == 5) {
            this.field909 = arg0.method2243();
        } else if (arg1 == 6) {
            this.field917 = arg0.method2243();
        } else if (arg1 == 7) {
            this.field918 = arg0.method2309();
        } else if (arg1 == 8) {
            this.field919 = arg0.method2309();
        } else if (arg1 == 40) {
            int var3 = arg0.method2309();
            this.field916 = new short[var3];
            this.field904 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field916[var4] = (short) arg0.method2243();
                this.field904[var4] = (short) arg0.method2243();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2309();
            this.field913 = new short[var5];
            this.field914 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field913[var6] = (short) arg0.method2243();
                this.field914[var6] = (short) arg0.method2243();
            }
        }
    }

    @ObfuscatedName("ap.r(II)Lcy;")
    public final class99 method774(int arg0) {
        class99 var2 = (class99) field907.method3198((long) this.field908);
        if (var2 == null) {
            class94 var3 = class94.method1903(Statics.field905, this.field911, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field916 != null) {
                for (int var4 = 0; var4 < this.field916.length; var4++) {
                    var3.method1922(this.field916[var4], this.field904[var4]);
                }
            }
            if (this.field913 != null) {
                for (int var5 = 0; var5 < this.field913.length; var5++) {
                    var3.method1917(this.field913[var5], this.field914[var5]);
                }
            }
            var2 = var3.method1926(this.field918 + 64, this.field919 + 850, -30, -50, -30);
            field907.method3193(var2, (long) this.field908);
        }
        class99 var6;
        if (this.field915 == -1 || arg0 == -1) {
            var6 = var2.method1994(true);
        } else {
            var6 = class39.method2920(this.field915).method745(var2, arg0);
        }
        if (this.field912 != 128 || this.field909 != 128) {
            var6.method2013(this.field912, this.field909, this.field912);
        }
        if (this.field917 != 0) {
            if (this.field917 == 90) {
                var6.method2002();
            }
            if (this.field917 == 180) {
                var6.method2002();
                var6.method2002();
            }
            if (this.field917 == 270) {
                var6.method2002();
                var6.method2002();
                var6.method2002();
            }
        }
        return var6;
    }
}
