package deob;

@ObfuscatedName("ii")
public class class251 extends class198 {

    @ObfuscatedName("ii.m")
    public static class193 field3363 = new class193(64);

    @ObfuscatedName("ii.h")
    public int field3364 = -1;

    @ObfuscatedName("ii.t")
    public int[] field3374;

    @ObfuscatedName("ii.p")
    public short[] field3366;

    @ObfuscatedName("ii.d")
    public short[] field3367;

    @ObfuscatedName("ii.n")
    public short[] field3368;

    @ObfuscatedName("ii.z")
    public short[] field3369;

    @ObfuscatedName("ii.o")
    public int[] field3370 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ii.q")
    public boolean field3373 = false;

    @ObfuscatedName("h.s(Liw;Liw;I)V")
    public static void method17(class239 arg0, class239 arg1) {
        Statics.field3365 = arg0;
        Statics.field3361 = arg1;
        Statics.field3371 = Statics.field3365.method3858(3);
    }

    @ObfuscatedName("u.c(II)Lii;")
    public static class251 method58(int arg0) {
        class251 var1 = (class251) field3363.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3365.method3840(3, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4090(new class177(var2));
        }
        field3363.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.f(Lfs;I)V")
    public void method4090(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4115(arg0, var2);
        }
    }

    @ObfuscatedName("ii.m(Lfs;II)V")
    public void method4115(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3364 = arg0.method2965();
        } else if (arg1 == 2) {
            int var3 = arg0.method2965();
            this.field3374 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3374[var4] = arg0.method2967();
            }
        } else if (arg1 == 3) {
            this.field3373 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2965();
            this.field3366 = new short[var5];
            this.field3367 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3366[var6] = (short) arg0.method2967();
                this.field3367[var6] = (short) arg0.method2967();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2965();
            this.field3368 = new short[var7];
            this.field3369 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3368[var8] = (short) arg0.method2967();
                this.field3369[var8] = (short) arg0.method2967();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3370[arg1 - 60] = arg0.method2967();
        }
    }

    @ObfuscatedName("ii.h(I)Z")
    public boolean method4092() {
        if (this.field3374 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3374.length; var2++) {
            if (!Statics.field3361.method3842(this.field3374[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ii.t(I)Ldn;")
    public class128 method4099() {
        if (this.field3374 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3374.length];
        for (int var2 = 0; var2 < this.field3374.length; var2++) {
            var1[var2] = class128.method2239(Statics.field3361, this.field3374[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3366 != null) {
            for (int var4 = 0; var4 < this.field3366.length; var4++) {
                var3.method2249(this.field3366[var4], this.field3367[var4]);
            }
        }
        if (this.field3368 != null) {
            for (int var5 = 0; var5 < this.field3368.length; var5++) {
                var3.method2250(this.field3368[var5], this.field3369[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ii.p(I)Z")
    public boolean method4094() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3370[var2] != -1 && !Statics.field3361.method3842(this.field3370[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ii.d(I)Ldn;")
    public class128 method4095() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3370[var3] != -1) {
                var1[var2++] = class128.method2239(Statics.field3361, this.field3370[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3366 != null) {
            for (int var5 = 0; var5 < this.field3366.length; var5++) {
                var4.method2249(this.field3366[var5], this.field3367[var5]);
            }
        }
        if (this.field3368 != null) {
            for (int var6 = 0; var6 < this.field3368.length; var6++) {
                var4.method2250(this.field3368[var6], this.field3369[var6]);
            }
        }
        return var4;
    }
}
