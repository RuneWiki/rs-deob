package deob;

@ObfuscatedName("an")
public class class36 extends class174 {

    @ObfuscatedName("an.z")
    public static class170 field921 = new class170(64);

    @ObfuscatedName("an.m")
    public int field931 = -1;

    @ObfuscatedName("an.k")
    public int[] field923;

    @ObfuscatedName("an.v")
    public short[] field922;

    @ObfuscatedName("an.y")
    public short[] field925;

    @ObfuscatedName("an.d")
    public short[] field926;

    @ObfuscatedName("an.l")
    public short[] field927;

    @ObfuscatedName("an.h")
    public int[] field928 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.b")
    public boolean field929 = false;

    @ObfuscatedName("am.q(Ley;Ley;B)V")
    public static void method532(class153 arg0, class153 arg1) {
        Statics.field2474 = arg0;
        Statics.field1757 = arg1;
        Statics.field169 = Statics.field2474.method2962(3);
    }

    @ObfuscatedName("cs.c(IS)Lan;")
    public static class36 method1851(int arg0) {
        class36 var1 = (class36) field921.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2474.method2952(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method761(new class127(var2));
        }
        field921.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.p(Ldo;I)V")
    public void method761(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method769(arg0, var2);
        }
    }

    @ObfuscatedName("an.z(Ldo;II)V")
    public void method769(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field931 = arg0.method2534();
        } else if (arg1 == 2) {
            int var3 = arg0.method2534();
            this.field923 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field923[var4] = arg0.method2427();
            }
        } else if (arg1 == 3) {
            this.field929 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2534();
            this.field922 = new short[var5];
            this.field925 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field922[var6] = (short) arg0.method2427();
                this.field925[var6] = (short) arg0.method2427();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2534();
            this.field926 = new short[var7];
            this.field927 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field926[var8] = (short) arg0.method2427();
                this.field927[var8] = (short) arg0.method2427();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field928[arg1 - 60] = arg0.method2427();
        }
    }

    @ObfuscatedName("an.m(I)Z")
    public boolean method763() {
        if (this.field923 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field923.length; var2++) {
            if (!Statics.field1757.method2971(this.field923[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.k(I)Lcy;")
    public class101 method764() {
        if (this.field923 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field923.length];
        for (int var2 = 0; var2 < this.field923.length; var2++) {
            var1[var2] = class101.method2039(Statics.field1757, this.field923[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field922 != null) {
            for (int var4 = 0; var4 < this.field922.length; var4++) {
                var3.method2072(this.field922[var4], this.field925[var4]);
            }
        }
        if (this.field926 != null) {
            for (int var5 = 0; var5 < this.field926.length; var5++) {
                var3.method2042(this.field926[var5], this.field927[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.v(B)Z")
    public boolean method766() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field928[var2] != -1 && !Statics.field1757.method2971(this.field928[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.y(I)Lcy;")
    public class101 method777() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field928[var3] != -1) {
                var1[var2++] = class101.method2039(Statics.field1757, this.field928[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field922 != null) {
            for (int var5 = 0; var5 < this.field922.length; var5++) {
                var4.method2072(this.field922[var5], this.field925[var5]);
            }
        }
        if (this.field926 != null) {
            for (int var6 = 0; var6 < this.field926.length; var6++) {
                var4.method2042(this.field926[var6], this.field927[var6]);
            }
        }
        return var4;
    }
}
