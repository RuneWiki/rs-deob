package deob;

@ObfuscatedName("at")
public class class40 extends class181 {

    @ObfuscatedName("at.h")
    public static class171 field946 = new class171(64);

    @ObfuscatedName("at.r")
    public int field949 = -1;

    @ObfuscatedName("at.e")
    public int[] field947;

    @ObfuscatedName("at.k")
    public short[] field943;

    @ObfuscatedName("at.b")
    public short[] field950;

    @ObfuscatedName("at.n")
    public short[] field951;

    @ObfuscatedName("at.a")
    public short[] field952;

    @ObfuscatedName("at.q")
    public int[] field953 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("at.i")
    public boolean field948 = false;

    @ObfuscatedName("client.j(Leg;Leg;I)V")
    public static void method430(class146 arg0, class146 arg1) {
        Statics.field954 = arg0;
        Statics.field944 = arg1;
        Statics.field945 = Statics.field954.method2749(3);
    }

    @ObfuscatedName("z.z(II)Lat;")
    public static class40 method10(int arg0) {
        class40 var1 = (class40) field946.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field954.method2739(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method733(new class107(var2));
        }
        field946.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.y(Lde;B)V")
    public void method733(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method734(arg0, var2);
        }
    }

    @ObfuscatedName("at.h(Lde;II)V")
    public void method734(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field949 = arg0.method2130();
        } else if (arg1 == 2) {
            int var3 = arg0.method2130();
            this.field947 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field947[var4] = arg0.method2132();
            }
        } else if (arg1 == 3) {
            this.field948 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2130();
            this.field943 = new short[var5];
            this.field950 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field943[var6] = (short) arg0.method2132();
                this.field950[var6] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2130();
            this.field951 = new short[var7];
            this.field952 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field951[var8] = (short) arg0.method2132();
                this.field952[var8] = (short) arg0.method2132();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field953[arg1 - 60] = arg0.method2132();
        }
    }

    @ObfuscatedName("at.r(I)Z")
    public boolean method735() {
        if (this.field947 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field947.length; var2++) {
            if (!Statics.field944.method2741(this.field947[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.e(B)Lcx;")
    public class93 method736() {
        if (this.field947 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field947.length];
        for (int var2 = 0; var2 < this.field947.length; var2++) {
            var1[var2] = class93.method1938(Statics.field944, this.field947[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field943 != null) {
            for (int var4 = 0; var4 < this.field943.length; var4++) {
                var3.method1906(this.field943[var4], this.field950[var4]);
            }
        }
        if (this.field951 != null) {
            for (int var5 = 0; var5 < this.field951.length; var5++) {
                var3.method1907(this.field951[var5], this.field952[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("at.k(B)Z")
    public boolean method759() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field953[var2] != -1 && !Statics.field944.method2741(this.field953[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.b(I)Lcx;")
    public class93 method738() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field953[var3] != -1) {
                var1[var2++] = class93.method1938(Statics.field944, this.field953[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field943 != null) {
            for (int var5 = 0; var5 < this.field943.length; var5++) {
                var4.method1906(this.field943[var5], this.field950[var5]);
            }
        }
        if (this.field951 != null) {
            for (int var6 = 0; var6 < this.field951.length; var6++) {
                var4.method1907(this.field951[var6], this.field952[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dd.n(B)V")
    public static void method2419() {
        field946.method3170();
    }
}
