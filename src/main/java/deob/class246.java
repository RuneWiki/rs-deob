package deob;

@ObfuscatedName("ix")
public class class246 extends class183 {

    @ObfuscatedName("ix.w")
    public static class155 field3236 = new class155(64);

    @ObfuscatedName("ix.p")
    public int field3237 = -1;

    @ObfuscatedName("ix.b")
    public int[] field3238;

    @ObfuscatedName("ix.e")
    public short[] field3239;

    @ObfuscatedName("ix.x")
    public short[] field3235;

    @ObfuscatedName("ix.a")
    public short[] field3241;

    @ObfuscatedName("ix.d")
    public short[] field3242;

    @ObfuscatedName("ix.c")
    public int[] field3243 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ix.o")
    public boolean field3244 = false;

    @ObfuscatedName("gd.f(II)Lix;")
    public static class246 method3328(int arg0) {
        class246 var1 = (class246) field3236.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3245.method3752(3, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4042(new class300(var2));
        }
        field3236.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.i(Lkq;B)V")
    public void method4042(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4056(arg0, var2);
        }
    }

    @ObfuscatedName("ix.y(Lkq;II)V")
    public void method4056(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3237 = arg0.method5110();
        } else if (arg1 == 2) {
            int var3 = arg0.method5110();
            this.field3238 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3238[var4] = arg0.method5112();
            }
        } else if (arg1 == 3) {
            this.field3244 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5110();
            this.field3239 = new short[var5];
            this.field3235 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3239[var6] = (short) arg0.method5112();
                this.field3235[var6] = (short) arg0.method5112();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5110();
            this.field3241 = new short[var7];
            this.field3242 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3241[var8] = (short) arg0.method5112();
                this.field3242[var8] = (short) arg0.method5112();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3243[arg1 - 60] = arg0.method5112();
        }
    }

    @ObfuscatedName("ix.w(I)Z")
    public boolean method4044() {
        if (this.field3238 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3238.length; var2++) {
            if (!Statics.field3234.method3754(this.field3238[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ix.p(I)Ldd;")
    public class122 method4046() {
        if (this.field3238 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3238.length];
        for (int var2 = 0; var2 < this.field3238.length; var2++) {
            var1[var2] = class122.method2543(Statics.field3234, this.field3238[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3239 != null) {
            for (int var4 = 0; var4 < this.field3239.length; var4++) {
                var3.method2602(this.field3239[var4], this.field3235[var4]);
            }
        }
        if (this.field3241 != null) {
            for (int var5 = 0; var5 < this.field3241.length; var5++) {
                var3.method2556(this.field3241[var5], this.field3242[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ix.b(I)Z")
    public boolean method4043() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3243[var2] != -1 && !Statics.field3234.method3754(this.field3243[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ix.e(I)Ldd;")
    public class122 method4047() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3243[var3] != -1) {
                var1[var2++] = class122.method2543(Statics.field3234, this.field3243[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3239 != null) {
            for (int var5 = 0; var5 < this.field3239.length; var5++) {
                var4.method2602(this.field3239[var5], this.field3235[var5]);
            }
        }
        if (this.field3241 != null) {
            for (int var6 = 0; var6 < this.field3241.length; var6++) {
                var4.method2556(this.field3241[var6], this.field3242[var6]);
            }
        }
        return var4;
    }
}
