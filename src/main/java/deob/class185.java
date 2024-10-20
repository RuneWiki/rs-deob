package deob;

@ObfuscatedName("ae")
public class class185 extends class7 {

    @ObfuscatedName("ae.g")
    public short[] field2859;

    @ObfuscatedName("ae.d")
    public short[] field2857;

    @ObfuscatedName("ae.a")
    public boolean field2852 = false;

    @ObfuscatedName("ae.m")
    public int field2854 = -1;

    @ObfuscatedName("ae.j")
    public short[] field2851;

    @ObfuscatedName("ae.i")
    public static class75 field2862 = new class75(64);

    @ObfuscatedName("ae.z")
    public int[] field2855;

    @ObfuscatedName("ae.y")
    public int[] field2860 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ae.x")
    public short[] field2856;

    @ObfuscatedName("ae.b(Ldv;I)V")
    public void method3468(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3494(arg0, var2);
        }
    }

    @ObfuscatedName("ae.m(B)Z")
    public boolean method3470() {
        if (this.field2855 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2855.length; var2++) {
            if (!Statics.field2861.method1300(this.field2855[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.z(I)Lcl;")
    public class151 method3471() {
        if (this.field2855 == null) {
            return null;
        }
        class151[] var1 = new class151[this.field2855.length];
        for (int var2 = 0; var2 < this.field2855.length; var2++) {
            var1[var2] = class151.method2655(Statics.field2861, this.field2855[var2], 0);
        }
        class151 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class151(var1, var1.length);
        }
        if (this.field2856 != null) {
            for (int var4 = 0; var4 < this.field2856.length; var4++) {
                var3.method2668(this.field2856[var4], this.field2857[var4]);
            }
        }
        if (this.field2851 != null) {
            for (int var5 = 0; var5 < this.field2851.length; var5++) {
                var3.method2657(this.field2851[var5], this.field2859[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ae.x(I)Z")
    public boolean method3472() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2860[var2] != -1 && !Statics.field2861.method1300(this.field2860[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.d(S)Lcl;")
    public class151 method3473() {
        class151[] var1 = new class151[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2860[var3] != -1) {
                var1[var2++] = class151.method2655(Statics.field2861, this.field2860[var3], 0);
            }
        }
        class151 var4 = new class151(var1, var2);
        if (this.field2856 != null) {
            for (int var5 = 0; var5 < this.field2856.length; var5++) {
                var4.method2668(this.field2856[var5], this.field2857[var5]);
            }
        }
        if (this.field2851 != null) {
            for (int var6 = 0; var6 < this.field2851.length; var6++) {
                var4.method2657(this.field2851[var6], this.field2859[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.i(Ldv;II)V")
    public void method3494(class28 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2854 = arg0.method450();
        } else if (arg1 == 2) {
            int var3 = arg0.method450();
            this.field2855 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2855[var4] = arg0.method349();
            }
        } else if (arg1 == 3) {
            this.field2852 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method450();
            this.field2856 = new short[var5];
            this.field2857 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2856[var6] = (short) arg0.method349();
                this.field2857[var6] = (short) arg0.method349();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method450();
            this.field2851 = new short[var7];
            this.field2859 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2851[var8] = (short) arg0.method349();
                this.field2859[var8] = (short) arg0.method349();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2860[arg1 - 60] = arg0.method349();
        }
    }

    @ObfuscatedName("z.c(IB)Lae;")
    public static class185 method1470(int arg0) {
        class185 var1 = (class185) field2862.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2858.method1298(3, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3468(new class28(var2));
        }
        field2862.method1184(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bz.v(Lel;Lel;B)V")
    public static void method1903(class87 arg0, class87 arg1) {
        Statics.field2858 = arg0;
        Statics.field2861 = arg1;
        Statics.field2863 = Statics.field2858.method1352(3);
    }
}
