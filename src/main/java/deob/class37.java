package deob;

@ObfuscatedName("aq")
public class class37 extends class174 {

    @ObfuscatedName("aq.g")
    public static class167 field914 = new class167(64);

    @ObfuscatedName("aq.r")
    public int field913 = -1;

    @ObfuscatedName("aq.i")
    public int[] field912;

    @ObfuscatedName("aq.f")
    public short[] field925;

    @ObfuscatedName("aq.a")
    public short[] field916;

    @ObfuscatedName("aq.w")
    public short[] field915;

    @ObfuscatedName("aq.u")
    public short[] field918;

    @ObfuscatedName("aq.d")
    public int[] field919 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.t")
    public boolean field920 = false;

    @ObfuscatedName("ay.m(II)Laq;")
    public static class37 method559(int arg0) {
        class37 var1 = (class37) field914.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field909.method2725(3, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method722(new class104(var2));
        }
        field914.method3130(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.k(Lcb;I)V")
    public void method722(class104 arg0) {
        while (true) {
            int var2 = arg0.method2190();
            if (var2 == 0) {
                return;
            }
            this.method723(arg0, var2);
        }
    }

    @ObfuscatedName("aq.y(Lcb;II)V")
    public void method723(class104 arg0, int arg1) {
        if (arg1 == 1) {
            this.field913 = arg0.method2190();
        } else if (arg1 == 2) {
            int var3 = arg0.method2190();
            this.field912 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field912[var4] = arg0.method2132();
            }
        } else if (arg1 == 3) {
            this.field920 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2190();
            this.field925 = new short[var5];
            this.field916 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field925[var6] = (short) arg0.method2132();
                this.field916[var6] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2190();
            this.field915 = new short[var7];
            this.field918 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field915[var8] = (short) arg0.method2132();
                this.field918[var8] = (short) arg0.method2132();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field919[arg1 - 60] = arg0.method2132();
        }
    }

    @ObfuscatedName("aq.g(I)Z")
    public boolean method724() {
        if (this.field912 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field912.length; var2++) {
            if (!Statics.field910.method2754(this.field912[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.r(B)Lck;")
    public class90 method725() {
        if (this.field912 == null) {
            return null;
        }
        class90[] var1 = new class90[this.field912.length];
        for (int var2 = 0; var2 < this.field912.length; var2++) {
            var1[var2] = class90.method1944(Statics.field910, this.field912[var2], 0);
        }
        class90 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class90(var1, var1.length);
        }
        if (this.field925 != null) {
            for (int var4 = 0; var4 < this.field925.length; var4++) {
                var3.method1957(this.field925[var4], this.field916[var4]);
            }
        }
        if (this.field915 != null) {
            for (int var5 = 0; var5 < this.field915.length; var5++) {
                var3.method1910(this.field915[var5], this.field918[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.i(S)Z")
    public boolean method726() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field919[var2] != -1 && !Statics.field910.method2754(this.field919[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.f(I)Lck;")
    public class90 method727() {
        class90[] var1 = new class90[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field919[var3] != -1) {
                var1[var2++] = class90.method1944(Statics.field910, this.field919[var3], 0);
            }
        }
        class90 var4 = new class90(var1, var2);
        if (this.field925 != null) {
            for (int var5 = 0; var5 < this.field925.length; var5++) {
                var4.method1957(this.field925[var5], this.field916[var5]);
            }
        }
        if (this.field915 != null) {
            for (int var6 = 0; var6 < this.field915.length; var6++) {
                var4.method1910(this.field915[var6], this.field918[var6]);
            }
        }
        return var4;
    }
}
