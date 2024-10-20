package deob;

@ObfuscatedName("io")
public class class246 extends class176 {

    @ObfuscatedName("io.q")
    public static class146 field3258 = new class146(64);

    @ObfuscatedName("io.v")
    public int field3256 = -1;

    @ObfuscatedName("io.l")
    public int[] field3254;

    @ObfuscatedName("io.c")
    public short[] field3255;

    @ObfuscatedName("io.o")
    public short[] field3251;

    @ObfuscatedName("io.i")
    public short[] field3257;

    @ObfuscatedName("io.d")
    public short[] field3250;

    @ObfuscatedName("io.m")
    public int[] field3259 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("io.p")
    public boolean field3260 = false;

    @ObfuscatedName("kl.a(II)Lio;")
    public static class246 method5455(int arg0) {
        class246 var1 = (class246) field3258.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3253.method3873(3, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4153(new class300(var2));
        }
        field3258.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.t(Lkc;I)V")
    public void method4153(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4152(arg0, var2);
        }
    }

    @ObfuscatedName("io.n(Lkc;II)V")
    public void method4152(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3256 = arg0.method5123();
        } else if (arg1 == 2) {
            int var3 = arg0.method5123();
            this.field3254 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3254[var4] = arg0.method5166();
            }
        } else if (arg1 == 3) {
            this.field3260 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5123();
            this.field3255 = new short[var5];
            this.field3251 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3255[var6] = (short) arg0.method5166();
                this.field3251[var6] = (short) arg0.method5166();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5123();
            this.field3257 = new short[var7];
            this.field3250 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3257[var8] = (short) arg0.method5166();
                this.field3250[var8] = (short) arg0.method5166();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3259[arg1 - 60] = arg0.method5166();
        }
    }

    @ObfuscatedName("io.q(I)Z")
    public boolean method4155() {
        if (this.field3254 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3254.length; var2++) {
            if (!Statics.field369.method3875(this.field3254[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("io.v(I)Ldu;")
    public class122 method4156() {
        if (this.field3254 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3254.length];
        for (int var2 = 0; var2 < this.field3254.length; var2++) {
            var1[var2] = class122.method2685(Statics.field369, this.field3254[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3255 != null) {
            for (int var4 = 0; var4 < this.field3255.length; var4++) {
                var3.method2640(this.field3255[var4], this.field3251[var4]);
            }
        }
        if (this.field3257 != null) {
            for (int var5 = 0; var5 < this.field3257.length; var5++) {
                var3.method2653(this.field3257[var5], this.field3250[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("io.l(I)Z")
    public boolean method4157() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3259[var2] != -1 && !Statics.field369.method3875(this.field3259[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("io.c(I)Ldu;")
    public class122 method4158() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3259[var3] != -1) {
                var1[var2++] = class122.method2685(Statics.field369, this.field3259[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3255 != null) {
            for (int var5 = 0; var5 < this.field3255.length; var5++) {
                var4.method2640(this.field3255[var5], this.field3251[var5]);
            }
        }
        if (this.field3257 != null) {
            for (int var6 = 0; var6 < this.field3257.length; var6++) {
                var4.method2653(this.field3257[var6], this.field3250[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ab.o(I)V")
    public static void method564() {
        field3258.method3123();
    }
}
