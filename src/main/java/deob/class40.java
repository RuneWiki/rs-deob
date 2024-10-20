package deob;

@ObfuscatedName("aq")
public class class40 extends class182 {

    @ObfuscatedName("aq.v")
    public static class171 field947 = new class171(64);

    @ObfuscatedName("aq.q")
    public int field952 = -1;

    @ObfuscatedName("aq.s")
    public int[] field948;

    @ObfuscatedName("aq.g")
    public short[] field950;

    @ObfuscatedName("aq.u")
    public short[] field951;

    @ObfuscatedName("aq.d")
    public short[] field949;

    @ObfuscatedName("aq.y")
    public short[] field953;

    @ObfuscatedName("aq.e")
    public int[] field954 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.l")
    public boolean field955 = false;

    @ObfuscatedName("aq.c(Ldm;I)V")
    public void method772(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method773(arg0, var2);
        }
    }

    @ObfuscatedName("aq.h(Ldm;II)V")
    public void method773(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field952 = arg0.method2151();
        } else if (arg1 == 2) {
            int var3 = arg0.method2151();
            this.field948 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field948[var4] = arg0.method2313();
            }
        } else if (arg1 == 3) {
            this.field955 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2151();
            this.field950 = new short[var5];
            this.field951 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field950[var6] = (short) arg0.method2313();
                this.field951[var6] = (short) arg0.method2313();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2151();
            this.field949 = new short[var7];
            this.field953 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field949[var8] = (short) arg0.method2313();
                this.field953[var8] = (short) arg0.method2313();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field954[arg1 - 60] = arg0.method2313();
        }
    }

    @ObfuscatedName("aq.v(I)Z")
    public boolean method774() {
        if (this.field948 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field948.length; var2++) {
            if (!Statics.field945.method2742(this.field948[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.q(I)Lcx;")
    public class93 method775() {
        if (this.field948 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field948.length];
        for (int var2 = 0; var2 < this.field948.length; var2++) {
            var1[var2] = class93.method1903(Statics.field945, this.field948[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field950 != null) {
            for (int var4 = 0; var4 < this.field950.length; var4++) {
                var3.method1915(this.field950[var4], this.field951[var4]);
            }
        }
        if (this.field949 != null) {
            for (int var5 = 0; var5 < this.field949.length; var5++) {
                var3.method1916(this.field949[var5], this.field953[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.s(B)Z")
    public boolean method776() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field954[var2] != -1 && !Statics.field945.method2742(this.field954[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.g(I)Lcx;")
    public class93 method771() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field954[var3] != -1) {
                var1[var2++] = class93.method1903(Statics.field945, this.field954[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field950 != null) {
            for (int var5 = 0; var5 < this.field950.length; var5++) {
                var4.method1915(this.field950[var5], this.field951[var5]);
            }
        }
        if (this.field949 != null) {
            for (int var6 = 0; var6 < this.field949.length; var6++) {
                var4.method1916(this.field949[var6], this.field953[var6]);
            }
        }
        return var4;
    }
}
