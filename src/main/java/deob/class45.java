package deob;

@ObfuscatedName("az")
public class class45 extends class204 {

    @ObfuscatedName("az.b")
    public static class193 field1025 = new class193(64);

    @ObfuscatedName("az.p")
    public int field1022 = -1;

    @ObfuscatedName("az.s")
    public int[] field1024;

    @ObfuscatedName("az.y")
    public short[] field1026;

    @ObfuscatedName("az.t")
    public short[] field1028;

    @ObfuscatedName("az.w")
    public short[] field1030;

    @ObfuscatedName("az.h")
    public short[] field1021;

    @ObfuscatedName("az.d")
    public int[] field1029 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("az.l")
    public boolean field1020 = false;

    @ObfuscatedName("az.e(Ldi;I)V")
    public void method897(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method919(arg0, var2);
        }
    }

    @ObfuscatedName("az.u(Ldi;II)V")
    public void method919(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1022 = arg0.method2427();
        } else if (arg1 == 2) {
            int var3 = arg0.method2427();
            this.field1024 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1024[var4] = arg0.method2339();
            }
        } else if (arg1 == 3) {
            this.field1020 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2427();
            this.field1026 = new short[var5];
            this.field1028 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1026[var6] = (short) arg0.method2339();
                this.field1028[var6] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2427();
            this.field1030 = new short[var7];
            this.field1021 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1030[var8] = (short) arg0.method2339();
                this.field1021[var8] = (short) arg0.method2339();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1029[arg1 - 60] = arg0.method2339();
        }
    }

    @ObfuscatedName("az.b(I)Z")
    public boolean method901() {
        if (this.field1024 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1024.length; var2++) {
            if (!Statics.field1023.method3122(this.field1024[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("az.p(I)Lcf;")
    public class100 method903() {
        if (this.field1024 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1024.length];
        for (int var2 = 0; var2 < this.field1024.length; var2++) {
            var1[var2] = class100.method2040(Statics.field1023, this.field1024[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1026 != null) {
            for (int var4 = 0; var4 < this.field1026.length; var4++) {
                var3.method2062(this.field1026[var4], this.field1028[var4]);
            }
        }
        if (this.field1030 != null) {
            for (int var5 = 0; var5 < this.field1030.length; var5++) {
                var3.method2052(this.field1030[var5], this.field1021[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("az.s(B)Z")
    public boolean method900() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1029[var2] != -1 && !Statics.field1023.method3122(this.field1029[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("az.y(I)Lcf;")
    public class100 method920() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1029[var3] != -1) {
                var1[var2++] = class100.method2040(Statics.field1023, this.field1029[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1026 != null) {
            for (int var5 = 0; var5 < this.field1026.length; var5++) {
                var4.method2062(this.field1026[var5], this.field1028[var5]);
            }
        }
        if (this.field1030 != null) {
            for (int var6 = 0; var6 < this.field1030.length; var6++) {
                var4.method2052(this.field1030[var6], this.field1021[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cv.t(I)V")
    public static void method1934() {
        field1025.method3522();
    }
}
