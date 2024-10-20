package deob;

@ObfuscatedName("jg")
public class class266 extends class214 {

    @ObfuscatedName("jg.g")
    public static class208 field3364 = new class208(64);

    @ObfuscatedName("jg.b")
    public int field3365 = -1;

    @ObfuscatedName("jg.a")
    public int[] field3368;

    @ObfuscatedName("jg.c")
    public short[] field3367;

    @ObfuscatedName("jg.z")
    public short[] field3369;

    @ObfuscatedName("jg.j")
    public short[] field3366;

    @ObfuscatedName("jg.d")
    public short[] field3370;

    @ObfuscatedName("jg.t")
    public int[] field3361 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jg.f")
    public boolean field3372 = false;

    @ObfuscatedName("bf.n(Lij;Lij;B)V")
    public static void method900(class254 arg0, class254 arg1) {
        Statics.field3363 = arg0;
        Statics.field3362 = arg1;
        Statics.field3371 = Statics.field3363.method4466(3);
    }

    @ObfuscatedName("ea.h(IB)Ljg;")
    public static class266 method3075(int arg0) {
        class266 var1 = (class266) field3364.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3363.method4494(3, arg0);
        class266 var3 = new class266();
        if (var2 != null) {
            var3.method4737(new class190(var2));
        }
        field3364.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.l(Lgc;I)V")
    public void method4737(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4732(arg0, var2);
        }
    }

    @ObfuscatedName("jg.g(Lgc;II)V")
    public void method4732(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3365 = arg0.method3511();
        } else if (arg1 == 2) {
            int var3 = arg0.method3511();
            this.field3368 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3368[var4] = arg0.method3513();
            }
        } else if (arg1 == 3) {
            this.field3372 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3511();
            this.field3367 = new short[var5];
            this.field3369 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3367[var6] = (short) arg0.method3513();
                this.field3369[var6] = (short) arg0.method3513();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3511();
            this.field3366 = new short[var7];
            this.field3370 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3366[var8] = (short) arg0.method3513();
                this.field3370[var8] = (short) arg0.method3513();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3361[arg1 - 60] = arg0.method3513();
        }
    }

    @ObfuscatedName("jg.b(I)Z")
    public boolean method4735() {
        if (this.field3368 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3368.length; var2++) {
            if (!Statics.field3362.method4456(this.field3368[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jg.a(I)Lde;")
    public class121 method4720() {
        if (this.field3368 == null) {
            return null;
        }
        class121[] var1 = new class121[this.field3368.length];
        for (int var2 = 0; var2 < this.field3368.length; var2++) {
            var1[var2] = class121.method2653(Statics.field3362, this.field3368[var2], 0);
        }
        class121 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class121(var1, var1.length);
        }
        if (this.field3367 != null) {
            for (int var4 = 0; var4 < this.field3367.length; var4++) {
                var3.method2648(this.field3367[var4], this.field3369[var4]);
            }
        }
        if (this.field3366 != null) {
            for (int var5 = 0; var5 < this.field3366.length; var5++) {
                var3.method2590(this.field3366[var5], this.field3370[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jg.c(I)Z")
    public boolean method4721() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3361[var2] != -1 && !Statics.field3362.method4456(this.field3361[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jg.z(I)Lde;")
    public class121 method4722() {
        class121[] var1 = new class121[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3361[var3] != -1) {
                var1[var2++] = class121.method2653(Statics.field3362, this.field3361[var3], 0);
            }
        }
        class121 var4 = new class121(var1, var2);
        if (this.field3367 != null) {
            for (int var5 = 0; var5 < this.field3367.length; var5++) {
                var4.method2648(this.field3367[var5], this.field3369[var5]);
            }
        }
        if (this.field3366 != null) {
            for (int var6 = 0; var6 < this.field3366.length; var6++) {
                var4.method2590(this.field3366[var6], this.field3370[var6]);
            }
        }
        return var4;
    }
}
