package deob;

@ObfuscatedName("fb")
public class class174 extends class406 {

    @ObfuscatedName("fb.k")
    public static class257 field1902 = new class257(64);

    @ObfuscatedName("fb.a")
    public int field1897 = -1;

    @ObfuscatedName("fb.m")
    public int[] field1898;

    @ObfuscatedName("fb.p")
    public short[] field1899;

    @ObfuscatedName("fb.s")
    public short[] field1900;

    @ObfuscatedName("fb.r")
    public short[] field1901;

    @ObfuscatedName("fb.v")
    public short[] field1906;

    @ObfuscatedName("fb.y")
    public int[] field1903 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fb.c")
    public boolean field1904 = false;

    @ObfuscatedName("fp.o(Llp;Llp;B)V")
    public static void method2895(class316 arg0, class316 arg1) {
        Statics.field94 = arg0;
        Statics.field4278 = arg1;
        Statics.field1699 = Statics.field94.method5200(3);
    }

    @ObfuscatedName("bb.q(II)Lfb;")
    public static class174 method1855(int arg0) {
        class174 var1 = (class174) field1902.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field94.method5249(3, arg0);
        class174 var3 = new class174();
        if (var2 != null) {
            var3.method3052(new class440(var2));
        }
        field1902.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fb.l(Lpx;B)V")
    public void method3052(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3040(arg0, var2);
        }
    }

    @ObfuscatedName("fb.k(Lpx;IB)V")
    public void method3040(class440 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1897 = arg0.method7071();
        } else if (arg1 == 2) {
            int var3 = arg0.method7071();
            this.field1898 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1898[var4] = arg0.method7082();
            }
        } else if (arg1 == 3) {
            this.field1904 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method7071();
            this.field1899 = new short[var5];
            this.field1900 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1899[var6] = (short) arg0.method7082();
                this.field1900[var6] = (short) arg0.method7082();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7071();
            this.field1901 = new short[var7];
            this.field1906 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1901[var8] = (short) arg0.method7082();
                this.field1906[var8] = (short) arg0.method7082();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1903[arg1 - 60] = arg0.method7082();
        }
    }

    @ObfuscatedName("fb.a(I)Z")
    public boolean method3041() {
        if (this.field1898 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1898.length; var2++) {
            if (!Statics.field4278.method5237(this.field1898[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fb.m(I)Lgs;")
    public class197 method3042() {
        if (this.field1898 == null) {
            return null;
        }
        class197[] var1 = new class197[this.field1898.length];
        for (int var2 = 0; var2 < this.field1898.length; var2++) {
            var1[var2] = class197.method3507(Statics.field4278, this.field1898[var2], 0);
        }
        class197 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class197(var1, var1.length);
        }
        if (this.field1899 != null) {
            for (int var4 = 0; var4 < this.field1899.length; var4++) {
                var3.method3574(this.field1899[var4], this.field1900[var4]);
            }
        }
        if (this.field1901 != null) {
            for (int var5 = 0; var5 < this.field1901.length; var5++) {
                var3.method3523(this.field1901[var5], this.field1906[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fb.p(B)Z")
    public boolean method3046() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1903[var2] != -1 && !Statics.field4278.method5237(this.field1903[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fb.s(I)Lgs;")
    public class197 method3044() {
        class197[] var1 = new class197[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1903[var3] != -1) {
                var1[var2++] = class197.method3507(Statics.field4278, this.field1903[var3], 0);
            }
        }
        class197 var4 = new class197(var1, var2);
        if (this.field1899 != null) {
            for (int var5 = 0; var5 < this.field1899.length; var5++) {
                var4.method3574(this.field1899[var5], this.field1900[var5]);
            }
        }
        if (this.field1901 != null) {
            for (int var6 = 0; var6 < this.field1901.length; var6++) {
                var4.method3523(this.field1901[var6], this.field1906[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("al.r(I)V")
    public static void method729() {
        field1902.method4569();
    }
}
