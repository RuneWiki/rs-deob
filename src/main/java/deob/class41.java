package deob;

@ObfuscatedName("af")
public class class41 extends class195 {

    @ObfuscatedName("af.i")
    public static class184 field966 = new class184(64);

    @ObfuscatedName("af.e")
    public static class184 field954 = new class184(30);

    @ObfuscatedName("af.h")
    public int field955;

    @ObfuscatedName("af.q")
    public int field956;

    @ObfuscatedName("af.l")
    public int field957 = -1;

    @ObfuscatedName("af.c")
    public short[] field952;

    @ObfuscatedName("af.f")
    public short[] field959;

    @ObfuscatedName("af.s")
    public short[] field960;

    @ObfuscatedName("af.m")
    public short[] field961;

    @ObfuscatedName("af.y")
    public int field967 = 128;

    @ObfuscatedName("af.b")
    public int field953 = 128;

    @ObfuscatedName("af.v")
    public int field958 = 0;

    @ObfuscatedName("af.z")
    public int field965 = 0;

    @ObfuscatedName("af.u")
    public int field963 = 0;

    @ObfuscatedName("u.n(Lfd;Lfd;I)V")
    public static void method151(class158 arg0, class158 arg1) {
        Statics.field962 = arg0;
        Statics.field3044 = arg1;
    }

    @ObfuscatedName("ag.w(II)Laf;")
    public static class41 method667(int arg0) {
        class41 var1 = (class41) field966.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field962.method2859(13, arg0);
        class41 var3 = new class41();
        var3.field955 = arg0;
        if (var2 != null) {
            var3.method778(new class111(var2));
        }
        field966.method3317(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.i(Ldo;I)V")
    public void method778(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method779(arg0, var2);
        }
    }

    @ObfuscatedName("af.e(Ldo;IB)V")
    public void method779(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field956 = arg0.method2157();
        } else if (arg1 == 2) {
            this.field957 = arg0.method2157();
        } else if (arg1 == 4) {
            this.field967 = arg0.method2157();
        } else if (arg1 == 5) {
            this.field953 = arg0.method2157();
        } else if (arg1 == 6) {
            this.field958 = arg0.method2157();
        } else if (arg1 == 7) {
            this.field965 = arg0.method2155();
        } else if (arg1 == 8) {
            this.field963 = arg0.method2155();
        } else if (arg1 == 40) {
            int var3 = arg0.method2155();
            this.field952 = new short[var3];
            this.field959 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field952[var4] = (short) arg0.method2157();
                this.field959[var4] = (short) arg0.method2157();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2155();
            this.field960 = new short[var5];
            this.field961 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field960[var6] = (short) arg0.method2157();
                this.field961[var6] = (short) arg0.method2157();
            }
        }
    }

    @ObfuscatedName("af.h(II)Lcw;")
    public final class100 method780(int arg0) {
        class100 var2 = (class100) field954.method3315((long) this.field955);
        if (var2 == null) {
            class95 var3 = class95.method1905(Statics.field3044, this.field956, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field952 != null) {
                for (int var4 = 0; var4 < this.field952.length; var4++) {
                    var3.method1919(this.field952[var4], this.field959[var4]);
                }
            }
            if (this.field960 != null) {
                for (int var5 = 0; var5 < this.field960.length; var5++) {
                    var3.method1920(this.field960[var5], this.field961[var5]);
                }
            }
            var2 = var3.method1982(this.field965 + 64, this.field963 + 850, -30, -50, -30);
            field954.method3317(var2, (long) this.field955);
        }
        class100 var6;
        if (this.field957 == -1 || arg0 == -1) {
            var6 = var2.method2013(true);
        } else {
            var6 = class40.method122(this.field957).method777(var2, arg0);
        }
        if (this.field967 != 128 || this.field953 != 128) {
            var6.method2012(this.field967, this.field953, this.field967);
        }
        if (this.field958 != 0) {
            if (this.field958 == 90) {
                var6.method2007();
            }
            if (this.field958 == 180) {
                var6.method2007();
                var6.method2007();
            }
            if (this.field958 == 270) {
                var6.method2007();
                var6.method2007();
                var6.method2007();
            }
        }
        return var6;
    }

    @ObfuscatedName("bs.q(I)V")
    public static void method1454() {
        field966.method3319();
        field954.method3319();
    }
}
