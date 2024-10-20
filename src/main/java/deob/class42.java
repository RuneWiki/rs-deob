package deob;

@ObfuscatedName("ai")
public class class42 extends class195 {

    @ObfuscatedName("ai.y")
    public static class184 field974 = new class184(64);

    @ObfuscatedName("ai.e")
    public int field975 = -1;

    @ObfuscatedName("ai.g")
    public int[] field976;

    @ObfuscatedName("ai.f")
    public short[] field982;

    @ObfuscatedName("ai.m")
    public short[] field979;

    @ObfuscatedName("ai.a")
    public short[] field978;

    @ObfuscatedName("ai.h")
    public short[] field977;

    @ObfuscatedName("ai.l")
    public int[] field981 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ai.u")
    public boolean field971 = false;

    @ObfuscatedName("ey.n(Lfs;Lfs;I)V")
    public static void method2852(class158 arg0, class158 arg1) {
        Statics.field990 = arg0;
        Statics.field972 = arg1;
        Statics.field973 = Statics.field990.method2978(3);
    }

    @ObfuscatedName("c.d(II)Lai;")
    public static class42 method522(int arg0) {
        class42 var1 = (class42) field974.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field990.method2948(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method830(new class111(var2));
        }
        field974.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.z(Ldl;B)V")
    public void method830(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("ai.y(Ldl;II)V")
    public void method816(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field975 = arg0.method2228();
        } else if (arg1 == 2) {
            int var3 = arg0.method2228();
            this.field976 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field976[var4] = arg0.method2231();
            }
        } else if (arg1 == 3) {
            this.field971 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2228();
            this.field982 = new short[var5];
            this.field979 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field982[var6] = (short) arg0.method2231();
                this.field979[var6] = (short) arg0.method2231();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2228();
            this.field978 = new short[var7];
            this.field977 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field978[var8] = (short) arg0.method2231();
                this.field977[var8] = (short) arg0.method2231();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field981[arg1 - 60] = arg0.method2231();
        }
    }

    @ObfuscatedName("ai.e(I)Z")
    public boolean method819() {
        if (this.field976 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field976.length; var2++) {
            if (!Statics.field972.method2950(this.field976[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.g(I)Lcy;")
    public class95 method820() {
        if (this.field976 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field976.length];
        for (int var2 = 0; var2 < this.field976.length; var2++) {
            var1[var2] = class95.method1969(Statics.field972, this.field976[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field982 != null) {
            for (int var4 = 0; var4 < this.field982.length; var4++) {
                var3.method2001(this.field982[var4], this.field979[var4]);
            }
        }
        if (this.field978 != null) {
            for (int var5 = 0; var5 < this.field978.length; var5++) {
                var3.method2000(this.field978[var5], this.field977[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ai.f(B)Z")
    public boolean method821() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field981[var2] != -1 && !Statics.field972.method2950(this.field981[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.m(I)Lcy;")
    public class95 method817() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field981[var3] != -1) {
                var1[var2++] = class95.method1969(Statics.field972, this.field981[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field982 != null) {
            for (int var5 = 0; var5 < this.field982.length; var5++) {
                var4.method2001(this.field982[var5], this.field979[var5]);
            }
        }
        if (this.field978 != null) {
            for (int var6 = 0; var6 < this.field978.length; var6++) {
                var4.method2000(this.field978[var6], this.field977[var6]);
            }
        }
        return var4;
    }
}
