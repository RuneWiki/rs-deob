package deob;

@ObfuscatedName("aq")
public class class36 extends class174 {

    @ObfuscatedName("aq.h")
    public static class170 field928 = new class170(64);

    @ObfuscatedName("aq.y")
    public int field913 = -1;

    @ObfuscatedName("aq.j")
    public int[] field916;

    @ObfuscatedName("aq.l")
    public short[] field917;

    @ObfuscatedName("aq.f")
    public short[] field918;

    @ObfuscatedName("aq.n")
    public short[] field919;

    @ObfuscatedName("aq.k")
    public short[] field920;

    @ObfuscatedName("aq.q")
    public int[] field922 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.w")
    public boolean field911 = false;

    @ObfuscatedName("cz.p(IB)Laq;")
    public static class36 method2151(int arg0) {
        class36 var1 = (class36) field928.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field921.method3048(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method766(new class127(var2));
        }
        field928.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.e(Ldj;I)V")
    public void method766(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method767(arg0, var2);
        }
    }

    @ObfuscatedName("aq.a(Ldj;II)V")
    public void method767(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field913 = arg0.method2494();
        } else if (arg1 == 2) {
            int var3 = arg0.method2494();
            this.field916 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field916[var4] = arg0.method2496();
            }
        } else if (arg1 == 3) {
            this.field911 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2494();
            this.field917 = new short[var5];
            this.field918 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field917[var6] = (short) arg0.method2496();
                this.field918[var6] = (short) arg0.method2496();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2494();
            this.field919 = new short[var7];
            this.field920 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field919[var8] = (short) arg0.method2496();
                this.field920[var8] = (short) arg0.method2496();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field922[arg1 - 60] = arg0.method2496();
        }
    }

    @ObfuscatedName("aq.h(I)Z")
    public boolean method768() {
        if (this.field916 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field916.length; var2++) {
            if (!Statics.field912.method3050(this.field916[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.y(I)Lch;")
    public class101 method790() {
        if (this.field916 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field916.length];
        for (int var2 = 0; var2 < this.field916.length; var2++) {
            var1[var2] = class101.method2070(Statics.field912, this.field916[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field917 != null) {
            for (int var4 = 0; var4 < this.field917.length; var4++) {
                var3.method2083(this.field917[var4], this.field918[var4]);
            }
        }
        if (this.field919 != null) {
            for (int var5 = 0; var5 < this.field919.length; var5++) {
                var3.method2084(this.field919[var5], this.field920[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.j(I)Z")
    public boolean method770() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field922[var2] != -1 && !Statics.field912.method3050(this.field922[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.l(I)Lch;")
    public class101 method765() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field922[var3] != -1) {
                var1[var2++] = class101.method2070(Statics.field912, this.field922[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field917 != null) {
            for (int var5 = 0; var5 < this.field917.length; var5++) {
                var4.method2083(this.field917[var5], this.field918[var5]);
            }
        }
        if (this.field919 != null) {
            for (int var6 = 0; var6 < this.field919.length; var6++) {
                var4.method2084(this.field919[var6], this.field920[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("e.f(I)V")
    public static void method12() {
        field928.method3269();
    }
}
