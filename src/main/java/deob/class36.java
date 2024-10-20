package deob;

@ObfuscatedName("ak")
public class class36 extends class174 {

    @ObfuscatedName("ak.l")
    public static class170 field935 = new class170(64);

    @ObfuscatedName("ak.q")
    public int field941 = -1;

    @ObfuscatedName("ak.b")
    public int[] field933;

    @ObfuscatedName("ak.u")
    public short[] field942;

    @ObfuscatedName("ak.d")
    public short[] field940;

    @ObfuscatedName("ak.m")
    public short[] field936;

    @ObfuscatedName("ak.v")
    public short[] field937;

    @ObfuscatedName("ak.j")
    public int[] field938 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ak.f")
    public boolean field939 = false;

    @ObfuscatedName("y.i(II)Lak;")
    public static class36 method156(int arg0) {
        class36 var1 = (class36) field935.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field931.method2932(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method767(new class127(var2));
        }
        field935.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.p(Ldn;I)V")
    public void method767(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("ak.a(Ldn;II)V")
    public void method747(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field941 = arg0.method2411();
        } else if (arg1 == 2) {
            int var3 = arg0.method2411();
            this.field933 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field933[var4] = arg0.method2413();
            }
        } else if (arg1 == 3) {
            this.field939 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2411();
            this.field942 = new short[var5];
            this.field940 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field942[var6] = (short) arg0.method2413();
                this.field940[var6] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2411();
            this.field936 = new short[var7];
            this.field937 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field936[var8] = (short) arg0.method2413();
                this.field937[var8] = (short) arg0.method2413();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field938[arg1 - 60] = arg0.method2413();
        }
    }

    @ObfuscatedName("ak.l(I)Z")
    public boolean method748() {
        if (this.field933 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field933.length; var2++) {
            if (!Statics.field929.method2937(this.field933[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ak.q(B)Lcm;")
    public class101 method749() {
        if (this.field933 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field933.length];
        for (int var2 = 0; var2 < this.field933.length; var2++) {
            var1[var2] = class101.method2035(Statics.field929, this.field933[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field942 != null) {
            for (int var4 = 0; var4 < this.field942.length; var4++) {
                var3.method1999(this.field942[var4], this.field940[var4]);
            }
        }
        if (this.field936 != null) {
            for (int var5 = 0; var5 < this.field936.length; var5++) {
                var3.method2029(this.field936[var5], this.field937[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ak.b(B)Z")
    public boolean method745() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field938[var2] != -1 && !Statics.field929.method2937(this.field938[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ak.u(I)Lcm;")
    public class101 method751() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field938[var3] != -1) {
                var1[var2++] = class101.method2035(Statics.field929, this.field938[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field942 != null) {
            for (int var5 = 0; var5 < this.field942.length; var5++) {
                var4.method1999(this.field942[var5], this.field940[var5]);
            }
        }
        if (this.field936 != null) {
            for (int var6 = 0; var6 < this.field936.length; var6++) {
                var4.method2029(this.field936[var6], this.field937[var6]);
            }
        }
        return var4;
    }
}
