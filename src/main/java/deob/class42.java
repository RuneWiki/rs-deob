package deob;

@ObfuscatedName("aw")
public class class42 extends class195 {

    @ObfuscatedName("aw.n")
    public static class184 field980 = new class184(64);

    @ObfuscatedName("aw.t")
    public int field977 = -1;

    @ObfuscatedName("aw.e")
    public int[] field982;

    @ObfuscatedName("aw.q")
    public short[] field983;

    @ObfuscatedName("aw.z")
    public short[] field989;

    @ObfuscatedName("aw.v")
    public short[] field985;

    @ObfuscatedName("aw.b")
    public short[] field986;

    @ObfuscatedName("aw.f")
    public int[] field987 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aw.i")
    public boolean field984 = false;

    @ObfuscatedName("co.y(Lfd;Lfd;I)V")
    public static void method1990(class158 arg0, class158 arg1) {
        Statics.field981 = arg0;
        Statics.field978 = arg1;
        Statics.field979 = Statics.field981.method2883(3);
    }

    @ObfuscatedName("do.k(II)Law;")
    public static class42 method2586(int arg0) {
        class42 var1 = (class42) field980.method3327((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field981.method2874(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method815(new class111(var2));
        }
        field980.method3340(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.g(Ldw;I)V")
    public void method815(class111 arg0) {
        while (true) {
            int var2 = arg0.method2205();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("aw.n(Ldw;IB)V")
    public void method816(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field977 = arg0.method2205();
        } else if (arg1 == 2) {
            int var3 = arg0.method2205();
            this.field982 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field982[var4] = arg0.method2339();
            }
        } else if (arg1 == 3) {
            this.field984 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2205();
            this.field983 = new short[var5];
            this.field989 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field983[var6] = (short) arg0.method2339();
                this.field989[var6] = (short) arg0.method2339();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2205();
            this.field985 = new short[var7];
            this.field986 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field985[var8] = (short) arg0.method2339();
                this.field986[var8] = (short) arg0.method2339();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field987[arg1 - 60] = arg0.method2339();
        }
    }

    @ObfuscatedName("aw.t(B)Z")
    public boolean method828() {
        if (this.field982 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field982.length; var2++) {
            if (!Statics.field978.method2876(this.field982[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.e(I)Lcc;")
    public class95 method818() {
        if (this.field982 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field982.length];
        for (int var2 = 0; var2 < this.field982.length; var2++) {
            var1[var2] = class95.method1900(Statics.field978, this.field982[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field983 != null) {
            for (int var4 = 0; var4 < this.field983.length; var4++) {
                var3.method1922(this.field983[var4], this.field989[var4]);
            }
        }
        if (this.field985 != null) {
            for (int var5 = 0; var5 < this.field985.length; var5++) {
                var3.method1915(this.field985[var5], this.field986[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aw.q(I)Z")
    public boolean method819() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field987[var2] != -1 && !Statics.field978.method2876(this.field987[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.z(B)Lcc;")
    public class95 method820() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field987[var3] != -1) {
                var1[var2++] = class95.method1900(Statics.field978, this.field987[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field983 != null) {
            for (int var5 = 0; var5 < this.field983.length; var5++) {
                var4.method1922(this.field983[var5], this.field989[var5]);
            }
        }
        if (this.field985 != null) {
            for (int var6 = 0; var6 < this.field985.length; var6++) {
                var4.method1915(this.field985[var6], this.field986[var6]);
            }
        }
        return var4;
    }
}
