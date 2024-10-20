package deob;

@ObfuscatedName("ah")
public class class35 extends class172 {

    @ObfuscatedName("ah.j")
    public static class168 field905 = new class168(64);

    @ObfuscatedName("ah.i")
    public int field906 = -1;

    @ObfuscatedName("ah.o")
    public int[] field907;

    @ObfuscatedName("ah.l")
    public short[] field903;

    @ObfuscatedName("ah.p")
    public short[] field909;

    @ObfuscatedName("ah.t")
    public short[] field920;

    @ObfuscatedName("ah.w")
    public short[] field911;

    @ObfuscatedName("ah.r")
    public int[] field919 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ah.a")
    public boolean field910 = false;

    @ObfuscatedName("ft.g(II)Lah;")
    public static class35 method3210(int arg0) {
        class35 var1 = (class35) field905.method3311((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1262.method3012(3, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method767(new class126(var2));
        }
        field905.method3314(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.e(Ldu;I)V")
    public void method767(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method768(arg0, var2);
        }
    }

    @ObfuscatedName("ah.n(Ldu;II)V")
    public void method768(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field906 = arg0.method2485();
        } else if (arg1 == 2) {
            int var3 = arg0.method2485();
            this.field907 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field907[var4] = arg0.method2487();
            }
        } else if (arg1 == 3) {
            this.field910 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2485();
            this.field903 = new short[var5];
            this.field909 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field903[var6] = (short) arg0.method2487();
                this.field909[var6] = (short) arg0.method2487();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2485();
            this.field920 = new short[var7];
            this.field911 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field920[var8] = (short) arg0.method2487();
                this.field911[var8] = (short) arg0.method2487();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field919[arg1 - 60] = arg0.method2487();
        }
    }

    @ObfuscatedName("ah.j(I)Z")
    public boolean method791() {
        if (this.field907 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field907.length; var2++) {
            if (!Statics.field912.method3014(this.field907[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.i(I)Lcm;")
    public class100 method770() {
        if (this.field907 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field907.length];
        for (int var2 = 0; var2 < this.field907.length; var2++) {
            var1[var2] = class100.method2068(Statics.field912, this.field907[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field903 != null) {
            for (int var4 = 0; var4 < this.field903.length; var4++) {
                var3.method2100(this.field903[var4], this.field909[var4]);
            }
        }
        if (this.field920 != null) {
            for (int var5 = 0; var5 < this.field920.length; var5++) {
                var3.method2083(this.field920[var5], this.field911[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ah.o(B)Z")
    public boolean method782() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field919[var2] != -1 && !Statics.field912.method3014(this.field919[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ah.l(I)Lcm;")
    public class100 method774() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field919[var3] != -1) {
                var1[var2++] = class100.method2068(Statics.field912, this.field919[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field903 != null) {
            for (int var5 = 0; var5 < this.field903.length; var5++) {
                var4.method2100(this.field903[var5], this.field909[var5]);
            }
        }
        if (this.field920 != null) {
            for (int var6 = 0; var6 < this.field920.length; var6++) {
                var4.method2083(this.field920[var6], this.field911[var6]);
            }
        }
        return var4;
    }
}
