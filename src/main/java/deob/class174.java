package deob;

@ObfuscatedName("fa")
public class class174 extends class407 {

    @ObfuscatedName("fa.n")
    public static class257 field1879 = new class257(64);

    @ObfuscatedName("fa.k")
    public int field1883 = -1;

    @ObfuscatedName("fa.w")
    public int[] field1881;

    @ObfuscatedName("fa.s")
    public short[] field1877;

    @ObfuscatedName("fa.q")
    public short[] field1885;

    @ObfuscatedName("fa.m")
    public short[] field1884;

    @ObfuscatedName("fa.x")
    public short[] field1888;

    @ObfuscatedName("fa.j")
    public int[] field1886 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fa.v")
    public boolean field1887 = false;

    @ObfuscatedName("j.c(IB)Lfa;")
    public static class174 method96(int arg0) {
        class174 var1 = (class174) field1879.method4789((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1882.method5499(3, arg0);
        class174 var3 = new class174();
        if (var2 != null) {
            var3.method3215(new class445(var2));
        }
        field1879.method4781(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fa.p(Lqq;I)V")
    public void method3215(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3205(arg0, var2);
        }
    }

    @ObfuscatedName("fa.f(Lqq;II)V")
    public void method3205(class445 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1883 = arg0.method7196();
        } else if (arg1 == 2) {
            int var3 = arg0.method7196();
            this.field1881 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1881[var4] = arg0.method7198();
            }
        } else if (arg1 == 3) {
            this.field1887 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method7196();
            this.field1877 = new short[var5];
            this.field1885 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1877[var6] = (short) arg0.method7198();
                this.field1885[var6] = (short) arg0.method7198();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7196();
            this.field1884 = new short[var7];
            this.field1888 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1884[var8] = (short) arg0.method7198();
                this.field1888[var8] = (short) arg0.method7198();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1886[arg1 - 60] = arg0.method7198();
        }
    }

    @ObfuscatedName("fa.n(B)Z")
    public boolean method3206() {
        if (this.field1881 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1881.length; var2++) {
            if (!Statics.field4684.method5490(this.field1881[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fa.k(I)Lgu;")
    public class197 method3207() {
        if (this.field1881 == null) {
            return null;
        }
        class197[] var1 = new class197[this.field1881.length];
        for (int var2 = 0; var2 < this.field1881.length; var2++) {
            var1[var2] = class197.method3742(Statics.field4684, this.field1881[var2], 0);
        }
        class197 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class197(var1, var1.length);
        }
        if (this.field1877 != null) {
            for (int var4 = 0; var4 < this.field1877.length; var4++) {
                var3.method3683(this.field1877[var4], this.field1885[var4]);
            }
        }
        if (this.field1884 != null) {
            for (int var5 = 0; var5 < this.field1884.length; var5++) {
                var3.method3722(this.field1884[var5], this.field1888[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fa.w(B)Z")
    public boolean method3208() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1886[var2] != -1 && !Statics.field4684.method5490(this.field1886[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fa.s(I)Lgu;")
    public class197 method3209() {
        class197[] var1 = new class197[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1886[var3] != -1) {
                var1[var2++] = class197.method3742(Statics.field4684, this.field1886[var3], 0);
            }
        }
        class197 var4 = new class197(var1, var2);
        if (this.field1877 != null) {
            for (int var5 = 0; var5 < this.field1877.length; var5++) {
                var4.method3683(this.field1877[var5], this.field1885[var5]);
            }
        }
        if (this.field1884 != null) {
            for (int var6 = 0; var6 < this.field1884.length; var6++) {
                var4.method3722(this.field1884[var6], this.field1888[var6]);
            }
        }
        return var4;
    }
}
