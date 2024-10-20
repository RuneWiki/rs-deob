package deob;

@ObfuscatedName("jf")
public class class275 extends class219 {

    @ObfuscatedName("jf.a")
    public static class213 field3515 = new class213(64);

    @ObfuscatedName("jf.l")
    public int field3516 = -1;

    @ObfuscatedName("jf.b")
    public int[] field3517;

    @ObfuscatedName("jf.e")
    public short[] field3518;

    @ObfuscatedName("jf.x")
    public short[] field3519;

    @ObfuscatedName("jf.p")
    public short[] field3521;

    @ObfuscatedName("jf.g")
    public short[] field3513;

    @ObfuscatedName("jf.n")
    public int[] field3524 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jf.o")
    public boolean field3523 = false;

    @ObfuscatedName("an.t(II)Ljf;")
    public static class275 method512(int arg0) {
        class275 var1 = (class275) field3515.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2805.method4265(3, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4444(new class195(var2));
        }
        field3515.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.q(Lgb;I)V")
    public void method4444(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4452(arg0, var2);
        }
    }

    @ObfuscatedName("jf.i(Lgb;II)V")
    public void method4452(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3516 = arg0.method3236();
        } else if (arg1 == 2) {
            int var3 = arg0.method3236();
            this.field3517 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3517[var4] = arg0.method3238();
            }
        } else if (arg1 == 3) {
            this.field3523 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3236();
            this.field3518 = new short[var5];
            this.field3519 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3518[var6] = (short) arg0.method3238();
                this.field3519[var6] = (short) arg0.method3238();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3236();
            this.field3521 = new short[var7];
            this.field3513 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3521[var8] = (short) arg0.method3238();
                this.field3513[var8] = (short) arg0.method3238();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3524[arg1 - 60] = arg0.method3238();
        }
    }

    @ObfuscatedName("jf.a(I)Z")
    public boolean method4455() {
        if (this.field3517 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3517.length; var2++) {
            if (!Statics.field3520.method4194(this.field3517[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jf.l(I)Ldi;")
    public class126 method4447() {
        if (this.field3517 == null) {
            return null;
        }
        class126[] var1 = new class126[this.field3517.length];
        for (int var2 = 0; var2 < this.field3517.length; var2++) {
            var1[var2] = class126.method2374(Statics.field3520, this.field3517[var2], 0);
        }
        class126 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class126(var1, var1.length);
        }
        if (this.field3518 != null) {
            for (int var4 = 0; var4 < this.field3518.length; var4++) {
                var3.method2435(this.field3518[var4], this.field3519[var4]);
            }
        }
        if (this.field3521 != null) {
            for (int var5 = 0; var5 < this.field3521.length; var5++) {
                var3.method2389(this.field3521[var5], this.field3513[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jf.b(I)Z")
    public boolean method4450() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3524[var2] != -1 && !Statics.field3520.method4194(this.field3524[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jf.e(I)Ldi;")
    public class126 method4449() {
        class126[] var1 = new class126[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3524[var3] != -1) {
                var1[var2++] = class126.method2374(Statics.field3520, this.field3524[var3], 0);
            }
        }
        class126 var4 = new class126(var1, var2);
        if (this.field3518 != null) {
            for (int var5 = 0; var5 < this.field3518.length; var5++) {
                var4.method2435(this.field3518[var5], this.field3519[var5]);
            }
        }
        if (this.field3521 != null) {
            for (int var6 = 0; var6 < this.field3521.length; var6++) {
                var4.method2389(this.field3521[var6], this.field3513[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bk.x(I)V")
    public static void method746() {
        field3515.method3632();
    }
}
