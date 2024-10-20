package deob;

@ObfuscatedName("jf")
public class class264 extends class209 {

    @ObfuscatedName("jf.e")
    public static class203 field3386 = new class203(64);

    @ObfuscatedName("jf.q")
    public static class203 field3383 = new class203(64);

    @ObfuscatedName("jf.c")
    public int field3384;

    @ObfuscatedName("jf.w")
    public int field3392 = 255;

    @ObfuscatedName("jf.n")
    public int field3387 = 255;

    @ObfuscatedName("jf.i")
    public int field3395 = -1;

    @ObfuscatedName("jf.p")
    public int field3382 = 1;

    @ObfuscatedName("jf.m")
    public int field3388 = 70;

    @ObfuscatedName("jf.d")
    public int field3391 = -1;

    @ObfuscatedName("jf.j")
    public int field3380 = -1;

    @ObfuscatedName("jf.x")
    public int field3393 = 30;

    @ObfuscatedName("jf.v")
    public int field3394 = 0;

    @ObfuscatedName("at.g(II)Ljf;")
    public static class264 method635(int arg0) {
        class264 var1 = (class264) field3386.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3390.method4438(33, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4739(new class185(var2));
        }
        field3386.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.r(Lgl;B)V")
    public void method4739(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4748(arg0, var2);
        }
    }

    @ObfuscatedName("jf.e(Lgl;II)V")
    public void method4748(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3467();
        } else if (arg1 == 2) {
            this.field3392 = arg0.method3679();
        } else if (arg1 == 3) {
            this.field3387 = arg0.method3679();
        } else if (arg1 == 4) {
            this.field3395 = 0;
        } else if (arg1 == 5) {
            this.field3388 = arg0.method3467();
        } else if (arg1 == 6) {
            arg0.method3679();
        } else if (arg1 == 7) {
            this.field3391 = arg0.method3594();
        } else if (arg1 == 8) {
            this.field3380 = arg0.method3594();
        } else if (arg1 == 11) {
            this.field3395 = arg0.method3467();
        } else if (arg1 == 14) {
            this.field3393 = arg0.method3679();
        } else if (arg1 == 15) {
            this.field3394 = arg0.method3679();
        }
    }

    @ObfuscatedName("jf.q(I)Lls;")
    public class324 method4741() {
        if (this.field3391 < 0) {
            return null;
        }
        class324 var1 = (class324) field3383.method3879((long) this.field3391);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method3125(Statics.field3381, this.field3391, 0);
        if (var2 != null) {
            field3383.method3885(var2, (long) this.field3391);
        }
        return var2;
    }

    @ObfuscatedName("jf.c(I)Lls;")
    public class324 method4742() {
        if (this.field3380 < 0) {
            return null;
        }
        class324 var1 = (class324) field3383.method3879((long) this.field3380);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method3125(Statics.field3381, this.field3380, 0);
        if (var2 != null) {
            field3383.method3885(var2, (long) this.field3380);
        }
        return var2;
    }
}
