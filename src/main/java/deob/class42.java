package deob;

@ObfuscatedName("az")
public class class42 extends class195 {

    @ObfuscatedName("az.u")
    public static class184 field969 = new class184(64);

    @ObfuscatedName("az.q")
    public int field970 = -1;

    @ObfuscatedName("az.r")
    public int[] field971;

    @ObfuscatedName("az.v")
    public short[] field972;

    @ObfuscatedName("az.y")
    public short[] field975;

    @ObfuscatedName("az.k")
    public short[] field974;

    @ObfuscatedName("az.c")
    public short[] field966;

    @ObfuscatedName("az.j")
    public int[] field978 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("az.m")
    public boolean field977 = false;

    @ObfuscatedName("u.o(II)Laz;")
    public static class42 method28(int arg0) {
        class42 var1 = (class42) field969.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field976.method2940(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method835(new class111(var2));
        }
        field969.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.l(Ldk;I)V")
    public void method835(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method853(arg0, var2);
        }
    }

    @ObfuscatedName("az.g(Ldk;IB)V")
    public void method853(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field970 = arg0.method2219();
        } else if (arg1 == 2) {
            int var3 = arg0.method2219();
            this.field971 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field971[var4] = arg0.method2397();
            }
        } else if (arg1 == 3) {
            this.field977 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2219();
            this.field972 = new short[var5];
            this.field975 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field972[var6] = (short) arg0.method2397();
                this.field975[var6] = (short) arg0.method2397();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2219();
            this.field974 = new short[var7];
            this.field966 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field974[var8] = (short) arg0.method2397();
                this.field966[var8] = (short) arg0.method2397();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field978[arg1 - 60] = arg0.method2397();
        }
    }

    @ObfuscatedName("az.u(I)Z")
    public boolean method837() {
        if (this.field971 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field971.length; var2++) {
            if (!Statics.field967.method2978(this.field971[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("az.q(S)Lcl;")
    public class95 method834() {
        if (this.field971 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field971.length];
        for (int var2 = 0; var2 < this.field971.length; var2++) {
            var1[var2] = class95.method1967(Statics.field967, this.field971[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field972 != null) {
            for (int var4 = 0; var4 < this.field972.length; var4++) {
                var3.method1971(this.field972[var4], this.field975[var4]);
            }
        }
        if (this.field974 != null) {
            for (int var5 = 0; var5 < this.field974.length; var5++) {
                var3.method1979(this.field974[var5], this.field966[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("az.r(B)Z")
    public boolean method839() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field978[var2] != -1 && !Statics.field967.method2978(this.field978[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("az.v(I)Lcl;")
    public class95 method840() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field978[var3] != -1) {
                var1[var2++] = class95.method1967(Statics.field967, this.field978[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field972 != null) {
            for (int var5 = 0; var5 < this.field972.length; var5++) {
                var4.method1971(this.field972[var5], this.field975[var5]);
            }
        }
        if (this.field974 != null) {
            for (int var6 = 0; var6 < this.field974.length; var6++) {
                var4.method1979(this.field974[var6], this.field966[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ao.y(I)V")
    public static void method633() {
        field969.method3404();
    }
}
