package deob;

@ObfuscatedName("il")
public class class249 extends class196 {

    @ObfuscatedName("il.y")
    public static class191 field3345 = new class191(64);

    @ObfuscatedName("il.w")
    public int field3346 = -1;

    @ObfuscatedName("il.k")
    public int[] field3347;

    @ObfuscatedName("il.v")
    public short[] field3348;

    @ObfuscatedName("il.z")
    public short[] field3349;

    @ObfuscatedName("il.r")
    public short[] field3344;

    @ObfuscatedName("il.u")
    public short[] field3352;

    @ObfuscatedName("il.d")
    public int[] field3342 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("il.o")
    public boolean field3353 = false;

    @ObfuscatedName("gp.e(Lit;Lit;I)V")
    public static void method3444(class237 arg0, class237 arg1) {
        Statics.field3350 = arg0;
        Statics.field3343 = arg1;
        Statics.field3351 = Statics.field3350.method3828(3);
    }

    @ObfuscatedName("il.g(Lfh;B)V")
    public void method4071(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4072(arg0, var2);
        }
    }

    @ObfuscatedName("il.y(Lfh;II)V")
    public void method4072(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3346 = arg0.method2928();
        } else if (arg1 == 2) {
            int var3 = arg0.method2928();
            this.field3347 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3347[var4] = arg0.method3091();
            }
        } else if (arg1 == 3) {
            this.field3353 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2928();
            this.field3348 = new short[var5];
            this.field3349 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3348[var6] = (short) arg0.method3091();
                this.field3349[var6] = (short) arg0.method3091();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2928();
            this.field3344 = new short[var7];
            this.field3352 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3344[var8] = (short) arg0.method3091();
                this.field3352[var8] = (short) arg0.method3091();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3342[arg1 - 60] = arg0.method3091();
        }
    }

    @ObfuscatedName("il.w(B)Z")
    public boolean method4075() {
        if (this.field3347 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3347.length; var2++) {
            if (!Statics.field3343.method3819(this.field3347[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("il.k(I)Ldn;")
    public class129 method4074() {
        if (this.field3347 == null) {
            return null;
        }
        class129[] var1 = new class129[this.field3347.length];
        for (int var2 = 0; var2 < this.field3347.length; var2++) {
            var1[var2] = class129.method2235(Statics.field3343, this.field3347[var2], 0);
        }
        class129 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class129(var1, var1.length);
        }
        if (this.field3348 != null) {
            for (int var4 = 0; var4 < this.field3348.length; var4++) {
                var3.method2234(this.field3348[var4], this.field3349[var4]);
            }
        }
        if (this.field3344 != null) {
            for (int var5 = 0; var5 < this.field3344.length; var5++) {
                var3.method2248(this.field3344[var5], this.field3352[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("il.v(I)Z")
    public boolean method4080() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3342[var2] != -1 && !Statics.field3343.method3819(this.field3342[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("il.z(B)Ldn;")
    public class129 method4079() {
        class129[] var1 = new class129[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3342[var3] != -1) {
                var1[var2++] = class129.method2235(Statics.field3343, this.field3342[var3], 0);
            }
        }
        class129 var4 = new class129(var1, var2);
        if (this.field3348 != null) {
            for (int var5 = 0; var5 < this.field3348.length; var5++) {
                var4.method2234(this.field3348[var5], this.field3349[var5]);
            }
        }
        if (this.field3344 != null) {
            for (int var6 = 0; var6 < this.field3344.length; var6++) {
                var4.method2248(this.field3344[var6], this.field3352[var6]);
            }
        }
        return var4;
    }
}
