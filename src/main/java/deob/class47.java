package deob;

@ObfuscatedName("aw")
public class class47 extends class208 {

    @ObfuscatedName("aw.e")
    public static class197 field1064 = new class197(64);

    @ObfuscatedName("aw.h")
    public int field1057 = -1;

    @ObfuscatedName("aw.s")
    public int[] field1061;

    @ObfuscatedName("aw.k")
    public short[] field1069;

    @ObfuscatedName("aw.u")
    public short[] field1060;

    @ObfuscatedName("aw.n")
    public short[] field1068;

    @ObfuscatedName("aw.b")
    public short[] field1062;

    @ObfuscatedName("aw.m")
    public int[] field1063 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aw.q")
    public boolean field1054 = false;

    @ObfuscatedName("dj.l(II)Law;")
    public static class47 method2253(int arg0) {
        class47 var1 = (class47) field1064.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1056.method3210(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method962(new class123(var2));
        }
        field1064.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.g(Ldc;B)V")
    public void method962(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method961(arg0, var2);
        }
    }

    @ObfuscatedName("aw.r(Ldc;II)V")
    public void method961(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1057 = arg0.method2490();
        } else if (arg1 == 2) {
            int var3 = arg0.method2490();
            this.field1061 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1061[var4] = arg0.method2492();
            }
        } else if (arg1 == 3) {
            this.field1054 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2490();
            this.field1069 = new short[var5];
            this.field1060 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1069[var6] = (short) arg0.method2492();
                this.field1060[var6] = (short) arg0.method2492();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2490();
            this.field1068 = new short[var7];
            this.field1062 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1068[var8] = (short) arg0.method2492();
                this.field1062[var8] = (short) arg0.method2492();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1063[arg1 - 60] = arg0.method2492();
        }
    }

    @ObfuscatedName("aw.e(B)Z")
    public boolean method946() {
        if (this.field1061 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1061.length; var2++) {
            if (!Statics.field2198.method3252(this.field1061[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.h(I)Lcc;")
    public class104 method947() {
        if (this.field1061 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1061.length];
        for (int var2 = 0; var2 < this.field1061.length; var2++) {
            var1[var2] = class104.method2237(Statics.field2198, this.field1061[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1069 != null) {
            for (int var4 = 0; var4 < this.field1069.length; var4++) {
                var3.method2173(this.field1069[var4], this.field1060[var4]);
            }
        }
        if (this.field1068 != null) {
            for (int var5 = 0; var5 < this.field1068.length; var5++) {
                var3.method2174(this.field1068[var5], this.field1062[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aw.s(I)Z")
    public boolean method966() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1063[var2] != -1 && !Statics.field2198.method3252(this.field1063[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.k(B)Lcc;")
    public class104 method949() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1063[var3] != -1) {
                var1[var2++] = class104.method2237(Statics.field2198, this.field1063[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1069 != null) {
            for (int var5 = 0; var5 < this.field1069.length; var5++) {
                var4.method2173(this.field1069[var5], this.field1060[var5]);
            }
        }
        if (this.field1068 != null) {
            for (int var6 = 0; var6 < this.field1068.length; var6++) {
                var4.method2174(this.field1068[var6], this.field1062[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aa.u(I)V")
    public static void method1091() {
        field1064.method3658();
    }
}
