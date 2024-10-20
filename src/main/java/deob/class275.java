package deob;

@ObfuscatedName("jk")
public class class275 extends class219 {

    @ObfuscatedName("jk.d")
    public static class213 field3514 = new class213(64);

    @ObfuscatedName("jk.h")
    public int field3511 = -1;

    @ObfuscatedName("jk.m")
    public int[] field3513;

    @ObfuscatedName("jk.z")
    public short[] field3516;

    @ObfuscatedName("jk.i")
    public short[] field3518;

    @ObfuscatedName("jk.u")
    public short[] field3519;

    @ObfuscatedName("jk.x")
    public short[] field3521;

    @ObfuscatedName("jk.y")
    public int[] field3515 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jk.a")
    public boolean field3522 = false;

    @ObfuscatedName("ff.o(II)Ljk;")
    public static class275 method3062(int arg0) {
        class275 var1 = (class275) field3514.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3512.method4241(3, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4470(new class195(var2));
        }
        field3514.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.k(Lgc;I)V")
    public void method4470(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4450(arg0, var2);
        }
    }

    @ObfuscatedName("jk.t(Lgc;II)V")
    public void method4450(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3511 = arg0.method3205();
        } else if (arg1 == 2) {
            int var3 = arg0.method3205();
            this.field3513 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3513[var4] = arg0.method3207();
            }
        } else if (arg1 == 3) {
            this.field3522 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3205();
            this.field3516 = new short[var5];
            this.field3518 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3516[var6] = (short) arg0.method3207();
                this.field3518[var6] = (short) arg0.method3207();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3205();
            this.field3519 = new short[var7];
            this.field3521 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3519[var8] = (short) arg0.method3207();
                this.field3521[var8] = (short) arg0.method3207();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3515[arg1 - 60] = arg0.method3207();
        }
    }

    @ObfuscatedName("jk.d(B)Z")
    public boolean method4455() {
        if (this.field3513 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3513.length; var2++) {
            if (!Statics.field3517.method4159(this.field3513[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jk.h(S)Ldg;")
    public class126 method4452() {
        if (this.field3513 == null) {
            return null;
        }
        class126[] var1 = new class126[this.field3513.length];
        for (int var2 = 0; var2 < this.field3513.length; var2++) {
            var1[var2] = class126.method2418(Statics.field3517, this.field3513[var2], 0);
        }
        class126 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class126(var1, var1.length);
        }
        if (this.field3516 != null) {
            for (int var4 = 0; var4 < this.field3516.length; var4++) {
                var3.method2385(this.field3516[var4], this.field3518[var4]);
            }
        }
        if (this.field3519 != null) {
            for (int var5 = 0; var5 < this.field3519.length; var5++) {
                var3.method2386(this.field3519[var5], this.field3521[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jk.m(S)Z")
    public boolean method4453() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3515[var2] != -1 && !Statics.field3517.method4159(this.field3515[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jk.z(I)Ldg;")
    public class126 method4451() {
        class126[] var1 = new class126[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3515[var3] != -1) {
                var1[var2++] = class126.method2418(Statics.field3517, this.field3515[var3], 0);
            }
        }
        class126 var4 = new class126(var1, var2);
        if (this.field3516 != null) {
            for (int var5 = 0; var5 < this.field3516.length; var5++) {
                var4.method2385(this.field3516[var5], this.field3518[var5]);
            }
        }
        if (this.field3519 != null) {
            for (int var6 = 0; var6 < this.field3519.length; var6++) {
                var4.method2386(this.field3519[var6], this.field3521[var6]);
            }
        }
        return var4;
    }
}
