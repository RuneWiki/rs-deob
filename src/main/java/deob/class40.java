package deob;

@ObfuscatedName("at")
public class class40 extends class182 {

    @ObfuscatedName("at.g")
    public static class171 field935 = new class171(64);

    @ObfuscatedName("at.x")
    public int field942 = -1;

    @ObfuscatedName("at.b")
    public int[] field944;

    @ObfuscatedName("at.q")
    public short[] field938;

    @ObfuscatedName("at.l")
    public short[] field939;

    @ObfuscatedName("at.m")
    public short[] field932;

    @ObfuscatedName("at.u")
    public short[] field946;

    @ObfuscatedName("at.s")
    public int[] field941 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("at.f")
    public boolean field943 = false;

    @ObfuscatedName("aw.e(Les;Les;B)V")
    public static void method789(class146 arg0, class146 arg1) {
        Statics.field936 = arg0;
        Statics.field933 = arg1;
        Statics.field934 = Statics.field936.method2705(3);
    }

    @ObfuscatedName("cm.v(II)Lat;")
    public static class40 method2048(int arg0) {
        class40 var1 = (class40) field935.method3136((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field936.method2695(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method747(new class107(var2));
        }
        field935.method3127(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.i(Ldk;I)V")
    public void method747(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method748(arg0, var2);
        }
    }

    @ObfuscatedName("at.g(Ldk;II)V")
    public void method748(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field942 = arg0.method2226();
        } else if (arg1 == 2) {
            int var3 = arg0.method2226();
            this.field944 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field944[var4] = arg0.method2152();
            }
        } else if (arg1 == 3) {
            this.field943 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2226();
            this.field938 = new short[var5];
            this.field939 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field938[var6] = (short) arg0.method2152();
                this.field939[var6] = (short) arg0.method2152();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2226();
            this.field932 = new short[var7];
            this.field946 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field932[var8] = (short) arg0.method2152();
                this.field946[var8] = (short) arg0.method2152();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field941[arg1 - 60] = arg0.method2152();
        }
    }

    @ObfuscatedName("at.x(I)Z")
    public boolean method772() {
        if (this.field944 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            if (!Statics.field933.method2697(this.field944[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.b(I)Lcr;")
    public class93 method750() {
        if (this.field944 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field944.length];
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            var1[var2] = class93.method1877(Statics.field933, this.field944[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field938 != null) {
            for (int var4 = 0; var4 < this.field938.length; var4++) {
                var3.method1890(this.field938[var4], this.field939[var4]);
            }
        }
        if (this.field932 != null) {
            for (int var5 = 0; var5 < this.field932.length; var5++) {
                var3.method1883(this.field932[var5], this.field946[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("at.q(I)Z")
    public boolean method751() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field941[var2] != -1 && !Statics.field933.method2697(this.field941[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.l(I)Lcr;")
    public class93 method757() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field941[var3] != -1) {
                var1[var2++] = class93.method1877(Statics.field933, this.field941[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field938 != null) {
            for (int var5 = 0; var5 < this.field938.length; var5++) {
                var4.method1890(this.field938[var5], this.field939[var5]);
            }
        }
        if (this.field932 != null) {
            for (int var6 = 0; var6 < this.field932.length; var6++) {
                var4.method1883(this.field932[var6], this.field946[var6]);
            }
        }
        return var4;
    }
}
