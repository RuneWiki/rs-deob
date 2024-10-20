package deob;

@ObfuscatedName("ay")
public class class40 extends class182 {

    @ObfuscatedName("ay.i")
    public static class171 field945 = new class171(64);

    @ObfuscatedName("ay.t")
    public int field949 = -1;

    @ObfuscatedName("ay.z")
    public int[] field952;

    @ObfuscatedName("ay.g")
    public short[] field951;

    @ObfuscatedName("ay.c")
    public short[] field948;

    @ObfuscatedName("ay.o")
    public short[] field953;

    @ObfuscatedName("ay.q")
    public short[] field954;

    @ObfuscatedName("ay.w")
    public int[] field950 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ay.y")
    public boolean field956 = false;

    @ObfuscatedName("au.k(II)Lay;")
    public static class40 method555(int arg0) {
        class40 var1 = (class40) field945.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field955.method2759(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method767(new class107(var2));
        }
        field945.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.b(Ldi;B)V")
    public void method767(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method764(arg0, var2);
        }
    }

    @ObfuscatedName("ay.e(Ldi;II)V")
    public void method764(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field949 = arg0.method2115();
        } else if (arg1 == 2) {
            int var3 = arg0.method2115();
            this.field952 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field952[var4] = arg0.method2117();
            }
        } else if (arg1 == 3) {
            this.field956 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2115();
            this.field951 = new short[var5];
            this.field948 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field951[var6] = (short) arg0.method2117();
                this.field948[var6] = (short) arg0.method2117();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2115();
            this.field953 = new short[var7];
            this.field954 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field953[var8] = (short) arg0.method2117();
                this.field954[var8] = (short) arg0.method2117();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field950[arg1 - 60] = arg0.method2117();
        }
    }

    @ObfuscatedName("ay.i(I)Z")
    public boolean method765() {
        if (this.field952 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field952.length; var2++) {
            if (!Statics.field946.method2700(this.field952[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.t(I)Lcv;")
    public class93 method779() {
        if (this.field952 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field952.length];
        for (int var2 = 0; var2 < this.field952.length; var2++) {
            var1[var2] = class93.method1881(Statics.field946, this.field952[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field951 != null) {
            for (int var4 = 0; var4 < this.field951.length; var4++) {
                var3.method1895(this.field951[var4], this.field948[var4]);
            }
        }
        if (this.field953 != null) {
            for (int var5 = 0; var5 < this.field953.length; var5++) {
                var3.method1924(this.field953[var5], this.field954[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ay.z(B)Z")
    public boolean method769() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field950[var2] != -1 && !Statics.field946.method2700(this.field950[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.g(I)Lcv;")
    public class93 method768() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field950[var3] != -1) {
                var1[var2++] = class93.method1881(Statics.field946, this.field950[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field951 != null) {
            for (int var5 = 0; var5 < this.field951.length; var5++) {
                var4.method1895(this.field951[var5], this.field948[var5]);
            }
        }
        if (this.field953 != null) {
            for (int var6 = 0; var6 < this.field953.length; var6++) {
                var4.method1924(this.field953[var6], this.field954[var6]);
            }
        }
        return var4;
    }
}
