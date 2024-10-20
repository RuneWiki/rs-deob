package deob;

@ObfuscatedName("jx")
public class class267 extends class214 {

    @ObfuscatedName("jx.x")
    public static class208 field3375 = new class208(64);

    @ObfuscatedName("jx.h")
    public int field3376 = -1;

    @ObfuscatedName("jx.f")
    public int[] field3382;

    @ObfuscatedName("jx.p")
    public short[] field3378;

    @ObfuscatedName("jx.m")
    public short[] field3379;

    @ObfuscatedName("jx.q")
    public short[] field3380;

    @ObfuscatedName("jx.b")
    public short[] field3377;

    @ObfuscatedName("jx.n")
    public int[] field3381 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jx.e")
    public boolean field3383 = false;

    @ObfuscatedName("ck.a(Liz;Liz;I)V")
    public static void method2100(class255 arg0, class255 arg1) {
        Statics.field3373 = arg0;
        Statics.field3374 = arg1;
        Statics.field1231 = Statics.field3373.method4419(3);
    }

    @ObfuscatedName("bx.s(IB)Ljx;")
    public static class267 method1879(int arg0) {
        class267 var1 = (class267) field3375.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3373.method4422(3, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4674(new class190(var2));
        }
        field3375.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.g(Lgx;B)V")
    public void method4674(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4675(arg0, var2);
        }
    }

    @ObfuscatedName("jx.x(Lgx;IB)V")
    public void method4675(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3376 = arg0.method3443();
        } else if (arg1 == 2) {
            int var3 = arg0.method3443();
            this.field3382 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3382[var4] = arg0.method3610();
            }
        } else if (arg1 == 3) {
            this.field3383 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3443();
            this.field3378 = new short[var5];
            this.field3379 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3378[var6] = (short) arg0.method3610();
                this.field3379[var6] = (short) arg0.method3610();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3443();
            this.field3380 = new short[var7];
            this.field3377 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3380[var8] = (short) arg0.method3610();
                this.field3377[var8] = (short) arg0.method3610();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3381[arg1 - 60] = arg0.method3610();
        }
    }

    @ObfuscatedName("jx.h(I)Z")
    public boolean method4683() {
        if (this.field3382 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3382.length; var2++) {
            if (!Statics.field3374.method4424(this.field3382[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jx.f(B)Ldk;")
    public class121 method4695() {
        if (this.field3382 == null) {
            return null;
        }
        class121[] var1 = new class121[this.field3382.length];
        for (int var2 = 0; var2 < this.field3382.length; var2++) {
            var1[var2] = class121.method2585(Statics.field3374, this.field3382[var2], 0);
        }
        class121 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class121(var1, var1.length);
        }
        if (this.field3378 != null) {
            for (int var4 = 0; var4 < this.field3378.length; var4++) {
                var3.method2607(this.field3378[var4], this.field3379[var4]);
            }
        }
        if (this.field3380 != null) {
            for (int var5 = 0; var5 < this.field3380.length; var5++) {
                var3.method2656(this.field3380[var5], this.field3377[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jx.p(I)Z")
    public boolean method4677() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3381[var2] != -1 && !Statics.field3374.method4424(this.field3381[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jx.m(I)Ldk;")
    public class121 method4678() {
        class121[] var1 = new class121[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3381[var3] != -1) {
                var1[var2++] = class121.method2585(Statics.field3374, this.field3381[var3], 0);
            }
        }
        class121 var4 = new class121(var1, var2);
        if (this.field3378 != null) {
            for (int var5 = 0; var5 < this.field3378.length; var5++) {
                var4.method2607(this.field3378[var5], this.field3379[var5]);
            }
        }
        if (this.field3380 != null) {
            for (int var6 = 0; var6 < this.field3380.length; var6++) {
                var4.method2656(this.field3380[var6], this.field3377[var6]);
            }
        }
        return var4;
    }
}
