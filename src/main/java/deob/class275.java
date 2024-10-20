package deob;

@ObfuscatedName("jt")
public class class275 extends class219 {

    @ObfuscatedName("jt.j")
    public static class213 field3508 = new class213(64);

    @ObfuscatedName("jt.k")
    public int field3510 = -1;

    @ObfuscatedName("jt.x")
    public int[] field3511;

    @ObfuscatedName("jt.z")
    public short[] field3512;

    @ObfuscatedName("jt.p")
    public short[] field3517;

    @ObfuscatedName("jt.w")
    public short[] field3514;

    @ObfuscatedName("jt.r")
    public short[] field3515;

    @ObfuscatedName("jt.d")
    public int[] field3516 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jt.a")
    public boolean field3509 = false;

    @ObfuscatedName("ju.c(II)Ljt;")
    public static class275 method4408(int arg0) {
        class275 var1 = (class275) field3508.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3507.method4190(3, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4459(new class195(var2));
        }
        field3508.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jt.i(Lgp;I)V")
    public void method4459(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4457(arg0, var2);
        }
    }

    @ObfuscatedName("jt.o(Lgp;IB)V")
    public void method4457(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3510 = arg0.method3429();
        } else if (arg1 == 2) {
            int var3 = arg0.method3429();
            this.field3511 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3511[var4] = arg0.method3218();
            }
        } else if (arg1 == 3) {
            this.field3509 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3429();
            this.field3512 = new short[var5];
            this.field3517 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3512[var6] = (short) arg0.method3218();
                this.field3517[var6] = (short) arg0.method3218();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3429();
            this.field3514 = new short[var7];
            this.field3515 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3514[var8] = (short) arg0.method3218();
                this.field3515[var8] = (short) arg0.method3218();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3516[arg1 - 60] = arg0.method3218();
        }
    }

    @ObfuscatedName("jt.j(I)Z")
    public boolean method4460() {
        if (this.field3511 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3511.length; var2++) {
            if (!Statics.field3506.method4209(this.field3511[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jt.k(B)Ldj;")
    public class126 method4461() {
        if (this.field3511 == null) {
            return null;
        }
        class126[] var1 = new class126[this.field3511.length];
        for (int var2 = 0; var2 < this.field3511.length; var2++) {
            var1[var2] = class126.method2371(Statics.field3506, this.field3511[var2], 0);
        }
        class126 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class126(var1, var1.length);
        }
        if (this.field3512 != null) {
            for (int var4 = 0; var4 < this.field3512.length; var4++) {
                var3.method2383(this.field3512[var4], this.field3517[var4]);
            }
        }
        if (this.field3514 != null) {
            for (int var5 = 0; var5 < this.field3514.length; var5++) {
                var3.method2448(this.field3514[var5], this.field3515[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jt.x(I)Z")
    public boolean method4462() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3516[var2] != -1 && !Statics.field3506.method4209(this.field3516[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jt.z(I)Ldj;")
    public class126 method4463() {
        class126[] var1 = new class126[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3516[var3] != -1) {
                var1[var2++] = class126.method2371(Statics.field3506, this.field3516[var3], 0);
            }
        }
        class126 var4 = new class126(var1, var2);
        if (this.field3512 != null) {
            for (int var5 = 0; var5 < this.field3512.length; var5++) {
                var4.method2383(this.field3512[var5], this.field3517[var5]);
            }
        }
        if (this.field3514 != null) {
            for (int var6 = 0; var6 < this.field3514.length; var6++) {
                var4.method2448(this.field3514[var6], this.field3515[var6]);
            }
        }
        return var4;
    }
}
