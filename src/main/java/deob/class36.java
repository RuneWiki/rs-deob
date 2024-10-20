package deob;

@ObfuscatedName("ai")
public class class36 extends class174 {

    @ObfuscatedName("ai.v")
    public static class170 field940 = new class170(64);

    @ObfuscatedName("ai.g")
    public int field941 = -1;

    @ObfuscatedName("ai.x")
    public int[] field942;

    @ObfuscatedName("ai.u")
    public short[] field949;

    @ObfuscatedName("ai.l")
    public short[] field944;

    @ObfuscatedName("ai.a")
    public short[] field945;

    @ObfuscatedName("ai.h")
    public short[] field946;

    @ObfuscatedName("ai.t")
    public int[] field950 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ai.m")
    public boolean field947 = false;

    @ObfuscatedName("bh.c(II)Lai;")
    public static class36 method1478(int arg0) {
        class36 var1 = (class36) field940.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field948.method2886(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method744(new class127(var2));
        }
        field940.method3092(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.q(Ldg;I)V")
    public void method744(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method734(arg0, var2);
        }
    }

    @ObfuscatedName("ai.y(Ldg;II)V")
    public void method734(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field941 = arg0.method2383();
        } else if (arg1 == 2) {
            int var3 = arg0.method2383();
            this.field942 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field942[var4] = arg0.method2327();
            }
        } else if (arg1 == 3) {
            this.field947 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2383();
            this.field949 = new short[var5];
            this.field944 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field949[var6] = (short) arg0.method2327();
                this.field944[var6] = (short) arg0.method2327();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2383();
            this.field945 = new short[var7];
            this.field946 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field945[var8] = (short) arg0.method2327();
                this.field946[var8] = (short) arg0.method2327();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field950[arg1 - 60] = arg0.method2327();
        }
    }

    @ObfuscatedName("ai.v(I)Z")
    public boolean method755() {
        if (this.field942 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field942.length; var2++) {
            if (!Statics.field938.method2888(this.field942[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.g(I)Lcz;")
    public class101 method735() {
        if (this.field942 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field942.length];
        for (int var2 = 0; var2 < this.field942.length; var2++) {
            var1[var2] = class101.method1979(Statics.field938, this.field942[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field949 != null) {
            for (int var4 = 0; var4 < this.field949.length; var4++) {
                var3.method1976(this.field949[var4], this.field944[var4]);
            }
        }
        if (this.field945 != null) {
            for (int var5 = 0; var5 < this.field945.length; var5++) {
                var3.method1980(this.field945[var5], this.field946[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ai.x(I)Z")
    public boolean method736() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field950[var2] != -1 && !Statics.field938.method2888(this.field950[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.u(B)Lcz;")
    public class101 method737() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field950[var3] != -1) {
                var1[var2++] = class101.method1979(Statics.field938, this.field950[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field949 != null) {
            for (int var5 = 0; var5 < this.field949.length; var5++) {
                var4.method1976(this.field949[var5], this.field944[var5]);
            }
        }
        if (this.field945 != null) {
            for (int var6 = 0; var6 < this.field945.length; var6++) {
                var4.method1980(this.field945[var6], this.field946[var6]);
            }
        }
        return var4;
    }
}
