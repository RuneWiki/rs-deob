package deob;

@ObfuscatedName("fq")
public class class174 extends class404 {

    @ObfuscatedName("fq.f")
    public static class257 field1847 = new class257(64);

    @ObfuscatedName("fq.b")
    public int field1848 = -1;

    @ObfuscatedName("fq.n")
    public int[] field1849;

    @ObfuscatedName("fq.s")
    public short[] field1850;

    @ObfuscatedName("fq.l")
    public short[] field1851;

    @ObfuscatedName("fq.q")
    public short[] field1854;

    @ObfuscatedName("fq.o")
    public short[] field1846;

    @ObfuscatedName("fq.r")
    public int[] field1857 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fq.p")
    public boolean field1845 = false;

    @ObfuscatedName("ho.v(II)Lfq;")
    public static class174 method3940(int arg0) {
        class174 var1 = (class174) field1847.method4644((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1853.method5296(3, arg0);
        class174 var3 = new class174();
        if (var2 != null) {
            var3.method3099(new class438(var2));
        }
        field1847.method4651(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fq.c(Lpi;I)V")
    public void method3099(class438 arg0) {
        while (true) {
            int var2 = arg0.method6971();
            if (var2 == 0) {
                return;
            }
            this.method3092(arg0, var2);
        }
    }

    @ObfuscatedName("fq.i(Lpi;IB)V")
    public void method3092(class438 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1848 = arg0.method6971();
        } else if (arg1 == 2) {
            int var3 = arg0.method6971();
            this.field1849 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1849[var4] = arg0.method7148();
            }
        } else if (arg1 == 3) {
            this.field1845 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method6971();
            this.field1850 = new short[var5];
            this.field1851 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1850[var6] = (short) arg0.method7148();
                this.field1851[var6] = (short) arg0.method7148();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6971();
            this.field1854 = new short[var7];
            this.field1846 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1854[var8] = (short) arg0.method7148();
                this.field1846[var8] = (short) arg0.method7148();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1857[arg1 - 60] = arg0.method7148();
        }
    }

    @ObfuscatedName("fq.f(I)Z")
    public boolean method3093() {
        if (this.field1849 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1849.length; var2++) {
            if (!Statics.field1649.method5359(this.field1849[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fq.b(I)Lhc;")
    public class226 method3094() {
        if (this.field1849 == null) {
            return null;
        }
        class226[] var1 = new class226[this.field1849.length];
        for (int var2 = 0; var2 < this.field1849.length; var2++) {
            var1[var2] = class226.method4089(Statics.field1649, this.field1849[var2], 0);
        }
        class226 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class226(var1, var1.length);
        }
        if (this.field1850 != null) {
            for (int var4 = 0; var4 < this.field1850.length; var4++) {
                var3.method4046(this.field1850[var4], this.field1851[var4]);
            }
        }
        if (this.field1854 != null) {
            for (int var5 = 0; var5 < this.field1854.length; var5++) {
                var3.method4047(this.field1854[var5], this.field1846[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fq.n(I)Z")
    public boolean method3116() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1857[var2] != -1 && !Statics.field1649.method5359(this.field1857[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fq.s(S)Lhc;")
    public class226 method3096() {
        class226[] var1 = new class226[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1857[var3] != -1) {
                var1[var2++] = class226.method4089(Statics.field1649, this.field1857[var3], 0);
            }
        }
        class226 var4 = new class226(var1, var2);
        if (this.field1850 != null) {
            for (int var5 = 0; var5 < this.field1850.length; var5++) {
                var4.method4046(this.field1850[var5], this.field1851[var5]);
            }
        }
        if (this.field1854 != null) {
            for (int var6 = 0; var6 < this.field1854.length; var6++) {
                var4.method4047(this.field1854[var6], this.field1846[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gm.l(I)V")
    public static void method3540() {
        field1847.method4647();
    }
}
