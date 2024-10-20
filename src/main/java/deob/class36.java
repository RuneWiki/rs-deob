package deob;

@ObfuscatedName("aw")
public class class36 extends class176 {

    @ObfuscatedName("aw.r")
    public static class172 field909 = new class172(64);

    @ObfuscatedName("aw.l")
    public static class172 field927 = new class172(30);

    @ObfuscatedName("aw.s")
    public int field911;

    @ObfuscatedName("aw.d")
    public int field912;

    @ObfuscatedName("aw.e")
    public int field913 = -1;

    @ObfuscatedName("aw.u")
    public short[] field914;

    @ObfuscatedName("aw.q")
    public short[] field921;

    @ObfuscatedName("aw.o")
    public short[] field916;

    @ObfuscatedName("aw.v")
    public short[] field928;

    @ObfuscatedName("aw.m")
    public int field918 = 128;

    @ObfuscatedName("aw.x")
    public int field919 = 128;

    @ObfuscatedName("aw.w")
    public int field920 = 0;

    @ObfuscatedName("aw.p")
    public int field915 = 0;

    @ObfuscatedName("aw.z")
    public int field922 = 0;

    @ObfuscatedName("cn.i(Leg;Leg;I)V")
    public static void method1680(class155 arg0, class155 arg1) {
        Statics.field926 = arg0;
        Statics.field924 = arg1;
    }

    @ObfuscatedName("aw.r(Lds;I)V")
    public void method758(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method757(arg0, var2);
        }
    }

    @ObfuscatedName("aw.l(Lds;II)V")
    public void method757(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field912 = arg0.method2473();
        } else if (arg1 == 2) {
            this.field913 = arg0.method2473();
        } else if (arg1 == 4) {
            this.field918 = arg0.method2473();
        } else if (arg1 == 5) {
            this.field919 = arg0.method2473();
        } else if (arg1 == 6) {
            this.field920 = arg0.method2473();
        } else if (arg1 == 7) {
            this.field915 = arg0.method2531();
        } else if (arg1 == 8) {
            this.field922 = arg0.method2531();
        } else if (arg1 == 40) {
            int var3 = arg0.method2531();
            this.field914 = new short[var3];
            this.field921 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field914[var4] = (short) arg0.method2473();
                this.field921[var4] = (short) arg0.method2473();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2531();
            this.field916 = new short[var5];
            this.field928 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field916[var6] = (short) arg0.method2473();
                this.field928[var6] = (short) arg0.method2473();
            }
        }
    }

    @ObfuscatedName("aw.s(IB)Ldt;")
    public final class113 method756(int arg0) {
        class113 var2 = (class113) field927.method3277((long) this.field911);
        if (var2 == null) {
            class102 var3 = class102.method2056(Statics.field924, this.field912, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field914 != null) {
                for (int var4 = 0; var4 < this.field914.length; var4++) {
                    var3.method2099(this.field914[var4], this.field921[var4]);
                }
            }
            if (this.field916 != null) {
                for (int var5 = 0; var5 < this.field916.length; var5++) {
                    var3.method2075(this.field916[var5], this.field928[var5]);
                }
            }
            var2 = var3.method2076(this.field915 + 64, this.field922 + 850, -30, -50, -30);
            field927.method3281(var2, (long) this.field911);
        }
        class113 var6;
        if (this.field913 == -1 || arg0 == -1) {
            var6 = var2.method2309(true);
        } else {
            var6 = class35.method708(this.field913).method748(var2, arg0);
        }
        if (this.field918 != 128 || this.field919 != 128) {
            var6.method2263(this.field918, this.field919, this.field918);
        }
        if (this.field920 != 0) {
            if (this.field920 == 90) {
                var6.method2266();
            }
            if (this.field920 == 180) {
                var6.method2266();
                var6.method2266();
            }
            if (this.field920 == 270) {
                var6.method2266();
                var6.method2266();
                var6.method2266();
            }
        }
        return var6;
    }
}
