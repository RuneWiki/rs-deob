package deob;

@ObfuscatedName("ad")
public class class35 extends class173 {

    @ObfuscatedName("ad.h")
    public static class169 field921 = new class169(64);

    @ObfuscatedName("ad.v")
    public int field923 = -1;

    @ObfuscatedName("ad.k")
    public int[] field922;

    @ObfuscatedName("ad.g")
    public short[] field925;

    @ObfuscatedName("ad.n")
    public short[] field926;

    @ObfuscatedName("ad.c")
    public short[] field919;

    @ObfuscatedName("ad.o")
    public short[] field928;

    @ObfuscatedName("ad.u")
    public int[] field929 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ad.z")
    public boolean field930 = false;

    @ObfuscatedName("k.p(Ler;Ler;I)V")
    public static void method49(class151 arg0, class151 arg1) {
        Statics.field932 = arg0;
        Statics.field920 = arg1;
        Statics.field927 = Statics.field932.method2923(3);
    }

    @ObfuscatedName("ei.j(II)Lad;")
    public static class35 method2990(int arg0) {
        class35 var1 = (class35) field921.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field932.method2973(3, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method729(new class126(var2));
        }
        field921.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.w(Ldv;I)V")
    public void method729(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method730(arg0, var2);
        }
    }

    @ObfuscatedName("ad.h(Ldv;II)V")
    public void method730(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field923 = arg0.method2544();
        } else if (arg1 == 2) {
            int var3 = arg0.method2544();
            this.field922 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field922[var4] = arg0.method2489();
            }
        } else if (arg1 == 3) {
            this.field930 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2544();
            this.field925 = new short[var5];
            this.field926 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field925[var6] = (short) arg0.method2489();
                this.field926[var6] = (short) arg0.method2489();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2544();
            this.field919 = new short[var7];
            this.field928 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field919[var8] = (short) arg0.method2489();
                this.field928[var8] = (short) arg0.method2489();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field929[arg1 - 60] = arg0.method2489();
        }
    }

    @ObfuscatedName("ad.v(I)Z")
    public boolean method741() {
        if (this.field922 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            if (!Statics.field920.method2915(this.field922[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ad.k(I)Lcu;")
    public class100 method752() {
        if (this.field922 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field922.length];
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            var1[var2] = class100.method1997(Statics.field920, this.field922[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field925 != null) {
            for (int var4 = 0; var4 < this.field925.length; var4++) {
                var3.method2010(this.field925[var4], this.field926[var4]);
            }
        }
        if (this.field919 != null) {
            for (int var5 = 0; var5 < this.field919.length; var5++) {
                var3.method2011(this.field919[var5], this.field928[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ad.g(I)Z")
    public boolean method733() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field929[var2] != -1 && !Statics.field920.method2915(this.field929[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ad.n(I)Lcu;")
    public class100 method753() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field929[var3] != -1) {
                var1[var2++] = class100.method1997(Statics.field920, this.field929[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field925 != null) {
            for (int var5 = 0; var5 < this.field925.length; var5++) {
                var4.method2010(this.field925[var5], this.field926[var5]);
            }
        }
        if (this.field919 != null) {
            for (int var6 = 0; var6 < this.field919.length; var6++) {
                var4.method2011(this.field919[var6], this.field928[var6]);
            }
        }
        return var4;
    }
}
