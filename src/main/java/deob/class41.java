package deob;

@ObfuscatedName("am")
public class class41 extends class187 {

    @ObfuscatedName("am.j")
    public static class176 field953 = new class176(64);

    @ObfuscatedName("am.l")
    public int field954 = -1;

    @ObfuscatedName("am.g")
    public int[] field951;

    @ObfuscatedName("am.k")
    public short[] field956;

    @ObfuscatedName("am.p")
    public short[] field959;

    @ObfuscatedName("am.y")
    public short[] field957;

    @ObfuscatedName("am.m")
    public short[] field958;

    @ObfuscatedName("am.o")
    public int[] field960 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("am.c")
    public boolean field961 = false;

    @ObfuscatedName("az.v(IB)Lam;")
    public static class41 method711(int arg0) {
        class41 var1 = (class41) field953.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field955.method2852(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method770(new class110(var2));
        }
        field953.method3228(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.t(Ldp;I)V")
    public void method770(class110 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method787(arg0, var2);
        }
    }

    @ObfuscatedName("am.f(Ldp;IS)V")
    public void method787(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field954 = arg0.method2257();
        } else if (arg1 == 2) {
            int var3 = arg0.method2257();
            this.field951 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field951[var4] = arg0.method2194();
            }
        } else if (arg1 == 3) {
            this.field961 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2257();
            this.field956 = new short[var5];
            this.field959 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field956[var6] = (short) arg0.method2194();
                this.field959[var6] = (short) arg0.method2194();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2257();
            this.field957 = new short[var7];
            this.field958 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field957[var8] = (short) arg0.method2194();
                this.field958[var8] = (short) arg0.method2194();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field960[arg1 - 60] = arg0.method2194();
        }
    }

    @ObfuscatedName("am.j(B)Z")
    public boolean method772() {
        if (this.field951 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field951.length; var2++) {
            if (!Statics.field2685.method2786(this.field951[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("am.l(I)Lcu;")
    public class94 method773() {
        if (this.field951 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field951.length];
        for (int var2 = 0; var2 < this.field951.length; var2++) {
            var1[var2] = class94.method1899(Statics.field2685, this.field951[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field956 != null) {
            for (int var4 = 0; var4 < this.field956.length; var4++) {
                var3.method1976(this.field956[var4], this.field959[var4]);
            }
        }
        if (this.field957 != null) {
            for (int var5 = 0; var5 < this.field957.length; var5++) {
                var3.method1981(this.field957[var5], this.field958[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("am.g(I)Z")
    public boolean method774() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field960[var2] != -1 && !Statics.field2685.method2786(this.field960[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("am.k(B)Lcu;")
    public class94 method775() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field960[var3] != -1) {
                var1[var2++] = class94.method1899(Statics.field2685, this.field960[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field956 != null) {
            for (int var5 = 0; var5 < this.field956.length; var5++) {
                var4.method1976(this.field956[var5], this.field959[var5]);
            }
        }
        if (this.field957 != null) {
            for (int var6 = 0; var6 < this.field957.length; var6++) {
                var4.method1981(this.field957[var6], this.field958[var6]);
            }
        }
        return var4;
    }
}
