package deob;

@ObfuscatedName("ah")
public class class42 extends class195 {

    @ObfuscatedName("ah.k")
    public static class184 field955 = new class184(64);

    @ObfuscatedName("ah.p")
    public int field959 = -1;

    @ObfuscatedName("ah.l")
    public int[] field952;

    @ObfuscatedName("ah.u")
    public short[] field957;

    @ObfuscatedName("ah.o")
    public short[] field954;

    @ObfuscatedName("ah.m")
    public short[] field953;

    @ObfuscatedName("ah.q")
    public short[] field961;

    @ObfuscatedName("ah.v")
    public int[] field962 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ah.n")
    public boolean field963 = false;

    @ObfuscatedName("dq.b(IS)Lah;")
    public static class42 method2420(int arg0) {
        class42 var1 = (class42) field955.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field960.method2819(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method782(new class111(var2));
        }
        field955.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.e(Ldj;B)V")
    public void method782(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method804(arg0, var2);
        }
    }

    @ObfuscatedName("ah.a(Ldj;II)V")
    public void method804(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field959 = arg0.method2127();
        } else if (arg1 == 2) {
            int var3 = arg0.method2127();
            this.field952 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field952[var4] = arg0.method2129();
            }
        } else if (arg1 == 3) {
            this.field963 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2127();
            this.field957 = new short[var5];
            this.field954 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field957[var6] = (short) arg0.method2129();
                this.field954[var6] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2127();
            this.field953 = new short[var7];
            this.field961 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field953[var8] = (short) arg0.method2129();
                this.field961[var8] = (short) arg0.method2129();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field962[arg1 - 60] = arg0.method2129();
        }
    }

    @ObfuscatedName("ah.k(I)Z")
    public boolean method793() {
        if (this.field952 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field952.length; var2++) {
            if (!Statics.field956.method2821(this.field952[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.p(B)Lcc;")
    public class95 method781() {
        if (this.field952 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field952.length];
        for (int var2 = 0; var2 < this.field952.length; var2++) {
            var1[var2] = class95.method1878(Statics.field956, this.field952[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field957 != null) {
            for (int var4 = 0; var4 < this.field957.length; var4++) {
                var3.method1877(this.field957[var4], this.field954[var4]);
            }
        }
        if (this.field953 != null) {
            for (int var5 = 0; var5 < this.field953.length; var5++) {
                var3.method1891(this.field953[var5], this.field961[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ah.l(I)Z")
    public boolean method785() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field962[var2] != -1 && !Statics.field956.method2821(this.field962[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.u(S)Lcc;")
    public class95 method786() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field962[var3] != -1) {
                var1[var2++] = class95.method1878(Statics.field956, this.field962[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field957 != null) {
            for (int var5 = 0; var5 < this.field957.length; var5++) {
                var4.method1877(this.field957[var5], this.field954[var5]);
            }
        }
        if (this.field953 != null) {
            for (int var6 = 0; var6 < this.field953.length; var6++) {
                var4.method1891(this.field953[var6], this.field961[var6]);
            }
        }
        return var4;
    }
}
