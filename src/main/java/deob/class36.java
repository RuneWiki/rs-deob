package deob;

@ObfuscatedName("ac")
public class class36 extends class174 {

    @ObfuscatedName("ac.p")
    public static class170 field920 = new class170(64);

    @ObfuscatedName("ac.e")
    public int field921 = -1;

    @ObfuscatedName("ac.d")
    public int[] field922;

    @ObfuscatedName("ac.y")
    public short[] field923;

    @ObfuscatedName("ac.x")
    public short[] field925;

    @ObfuscatedName("ac.t")
    public short[] field924;

    @ObfuscatedName("ac.i")
    public short[] field926;

    @ObfuscatedName("ac.z")
    public int[] field919 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ac.o")
    public boolean field928 = false;

    @ObfuscatedName("ag.j(Lez;Lez;I)V")
    public static void method889(class152 arg0, class152 arg1) {
        Statics.field930 = arg0;
        Statics.field918 = arg1;
        Statics.field929 = Statics.field930.method2969(3);
    }

    @ObfuscatedName("s.r(II)Lac;")
    public static class36 method239(int arg0) {
        class36 var1 = (class36) field920.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field930.method3016(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method750(new class127(var2));
        }
        field920.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.v(Ldn;I)V")
    public void method750(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method751(arg0, var2);
        }
    }

    @ObfuscatedName("ac.p(Ldn;II)V")
    public void method751(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field921 = arg0.method2441();
        } else if (arg1 == 2) {
            int var3 = arg0.method2441();
            this.field922 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field922[var4] = arg0.method2609();
            }
        } else if (arg1 == 3) {
            this.field928 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2441();
            this.field923 = new short[var5];
            this.field925 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field923[var6] = (short) arg0.method2609();
                this.field925[var6] = (short) arg0.method2609();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2441();
            this.field924 = new short[var7];
            this.field926 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field924[var8] = (short) arg0.method2609();
                this.field926[var8] = (short) arg0.method2609();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field919[arg1 - 60] = arg0.method2609();
        }
    }

    @ObfuscatedName("ac.e(I)Z")
    public boolean method752() {
        if (this.field922 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            if (!Statics.field918.method2959(this.field922[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.d(B)Lco;")
    public class101 method753() {
        if (this.field922 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field922.length];
        for (int var2 = 0; var2 < this.field922.length; var2++) {
            var1[var2] = class101.method2115(Statics.field918, this.field922[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field923 != null) {
            for (int var4 = 0; var4 < this.field923.length; var4++) {
                var3.method2062(this.field923[var4], this.field925[var4]);
            }
        }
        if (this.field924 != null) {
            for (int var5 = 0; var5 < this.field924.length; var5++) {
                var3.method2063(this.field924[var5], this.field926[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ac.y(I)Z")
    public boolean method764() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field919[var2] != -1 && !Statics.field918.method2959(this.field919[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.x(B)Lco;")
    public class101 method755() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field919[var3] != -1) {
                var1[var2++] = class101.method2115(Statics.field918, this.field919[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field923 != null) {
            for (int var5 = 0; var5 < this.field923.length; var5++) {
                var4.method2062(this.field923[var5], this.field925[var5]);
            }
        }
        if (this.field924 != null) {
            for (int var6 = 0; var6 < this.field924.length; var6++) {
                var4.method2063(this.field924[var6], this.field926[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("p.t(I)V")
    public static void method34() {
        field920.method3258();
    }
}
