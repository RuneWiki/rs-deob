package deob;

@ObfuscatedName("fv")
public class class173 extends class406 {

    @ObfuscatedName("fv.v")
    public static class256 field1847 = new class256(64);

    @ObfuscatedName("fv.c")
    public int field1846 = -1;

    @ObfuscatedName("fv.q")
    public int[] field1842;

    @ObfuscatedName("fv.i")
    public short[] field1848;

    @ObfuscatedName("fv.k")
    public short[] field1855;

    @ObfuscatedName("fv.o")
    public short[] field1850;

    @ObfuscatedName("fv.n")
    public short[] field1851;

    @ObfuscatedName("fv.d")
    public int[] field1852 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fv.a")
    public boolean field1853 = false;

    @ObfuscatedName("em.s(Lls;Lls;I)V")
    public static void method2787(class316 arg0, class316 arg1) {
        Statics.field1844 = arg0;
        Statics.field1843 = arg1;
        Statics.field1858 = Statics.field1844.method5184(3);
    }

    @ObfuscatedName("y.h(II)Lfv;")
    public static class173 method230(int arg0) {
        class173 var1 = (class173) field1847.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1844.method5179(3, arg0);
        class173 var3 = new class173();
        if (var2 != null) {
            var3.method2999(new class444(var2));
        }
        field1847.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fv.w(Lqr;I)V")
    public void method2999(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3000(arg0, var2);
        }
    }

    @ObfuscatedName("fv.v(Lqr;IB)V")
    public void method3000(class444 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1846 = arg0.method6929();
        } else if (arg1 == 2) {
            int var3 = arg0.method6929();
            this.field1842 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1842[var4] = arg0.method7120();
            }
        } else if (arg1 == 3) {
            this.field1853 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method6929();
            this.field1848 = new short[var5];
            this.field1855 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1848[var6] = (short) arg0.method7120();
                this.field1855[var6] = (short) arg0.method7120();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6929();
            this.field1850 = new short[var7];
            this.field1851 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1850[var8] = (short) arg0.method7120();
                this.field1851[var8] = (short) arg0.method7120();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1852[arg1 - 60] = arg0.method7120();
        }
    }

    @ObfuscatedName("fv.c(I)Z")
    public boolean method3004() {
        if (this.field1842 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1842.length; var2++) {
            if (!Statics.field1843.method5234(this.field1842[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fv.q(B)Lgp;")
    public class196 method3002() {
        if (this.field1842 == null) {
            return null;
        }
        class196[] var1 = new class196[this.field1842.length];
        for (int var2 = 0; var2 < this.field1842.length; var2++) {
            var1[var2] = class196.method3512(Statics.field1843, this.field1842[var2], 0);
        }
        class196 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class196(var1, var1.length);
        }
        if (this.field1848 != null) {
            for (int var4 = 0; var4 < this.field1848.length; var4++) {
                var3.method3497(this.field1848[var4], this.field1855[var4]);
            }
        }
        if (this.field1850 != null) {
            for (int var5 = 0; var5 < this.field1850.length; var5++) {
                var3.method3500(this.field1850[var5], this.field1851[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fv.i(I)Z")
    public boolean method3020() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1852[var2] != -1 && !Statics.field1843.method5234(this.field1852[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fv.k(I)Lgp;")
    public class196 method3031() {
        class196[] var1 = new class196[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1852[var3] != -1) {
                var1[var2++] = class196.method3512(Statics.field1843, this.field1852[var3], 0);
            }
        }
        class196 var4 = new class196(var1, var2);
        if (this.field1848 != null) {
            for (int var5 = 0; var5 < this.field1848.length; var5++) {
                var4.method3497(this.field1848[var5], this.field1855[var5]);
            }
        }
        if (this.field1850 != null) {
            for (int var6 = 0; var6 < this.field1850.length; var6++) {
                var4.method3500(this.field1850[var6], this.field1851[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ck.o(I)V")
    public static void method2400() {
        field1847.method4603();
    }
}
