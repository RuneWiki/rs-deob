package deob;

@ObfuscatedName("fi")
public class class173 extends class405 {

    @ObfuscatedName("fi.f")
    public static class256 field1872 = new class256(64);

    @ObfuscatedName("fi.j")
    public int field1859 = -1;

    @ObfuscatedName("fi.e")
    public int[] field1860;

    @ObfuscatedName("fi.g")
    public short[] field1862;

    @ObfuscatedName("fi.w")
    public short[] field1865;

    @ObfuscatedName("fi.y")
    public short[] field1864;

    @ObfuscatedName("fi.i")
    public short[] field1858;

    @ObfuscatedName("fi.s")
    public int[] field1861 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fi.t")
    public boolean field1867 = false;

    @ObfuscatedName("bw.c(IB)Lfi;")
    public static class173 method1870(int arg0) {
        class173 var1 = (class173) field1872.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1866.method5305(3, arg0);
        class173 var3 = new class173();
        if (var2 != null) {
            var3.method3115(new class443(var2));
        }
        field1872.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fi.v(Lqt;B)V")
    public void method3115(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3112(arg0, var2);
        }
    }

    @ObfuscatedName("fi.q(Lqt;II)V")
    public void method3112(class443 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1859 = arg0.method7047();
        } else if (arg1 == 2) {
            int var3 = arg0.method7047();
            this.field1860 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1860[var4] = arg0.method7049();
            }
        } else if (arg1 == 3) {
            this.field1867 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method7047();
            this.field1862 = new short[var5];
            this.field1865 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1862[var6] = (short) arg0.method7049();
                this.field1865[var6] = (short) arg0.method7049();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7047();
            this.field1864 = new short[var7];
            this.field1858 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1864[var8] = (short) arg0.method7049();
                this.field1858[var8] = (short) arg0.method7049();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1861[arg1 - 60] = arg0.method7049();
        }
    }

    @ObfuscatedName("fi.f(I)Z")
    public boolean method3096() {
        if (this.field1860 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1860.length; var2++) {
            if (!Statics.field1857.method5302(this.field1860[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fi.j(I)Lgw;")
    public class196 method3100() {
        if (this.field1860 == null) {
            return null;
        }
        class196[] var1 = new class196[this.field1860.length];
        for (int var2 = 0; var2 < this.field1860.length; var2++) {
            var1[var2] = class196.method3646(Statics.field1857, this.field1860[var2], 0);
        }
        class196 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class196(var1, var1.length);
        }
        if (this.field1862 != null) {
            for (int var4 = 0; var4 < this.field1862.length; var4++) {
                var3.method3606(this.field1862[var4], this.field1865[var4]);
            }
        }
        if (this.field1864 != null) {
            for (int var5 = 0; var5 < this.field1864.length; var5++) {
                var3.method3626(this.field1864[var5], this.field1858[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fi.e(I)Z")
    public boolean method3098() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1861[var2] != -1 && !Statics.field1857.method5302(this.field1861[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fi.g(B)Lgw;")
    public class196 method3099() {
        class196[] var1 = new class196[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1861[var3] != -1) {
                var1[var2++] = class196.method3646(Statics.field1857, this.field1861[var3], 0);
            }
        }
        class196 var4 = new class196(var1, var2);
        if (this.field1862 != null) {
            for (int var5 = 0; var5 < this.field1862.length; var5++) {
                var4.method3606(this.field1862[var5], this.field1865[var5]);
            }
        }
        if (this.field1864 != null) {
            for (int var6 = 0; var6 < this.field1864.length; var6++) {
                var4.method3626(this.field1864[var6], this.field1858[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("kb.w(I)V")
    public static void method5181() {
        field1872.method4695();
    }
}
