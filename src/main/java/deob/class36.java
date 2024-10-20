package deob;

@ObfuscatedName("aq")
public class class36 extends class174 {

    @ObfuscatedName("aq.j")
    public static class170 field932 = new class170(64);

    @ObfuscatedName("aq.o")
    public int field942 = -1;

    @ObfuscatedName("aq.l")
    public int[] field938;

    @ObfuscatedName("aq.g")
    public short[] field935;

    @ObfuscatedName("aq.w")
    public short[] field936;

    @ObfuscatedName("aq.c")
    public short[] field937;

    @ObfuscatedName("aq.z")
    public short[] field933;

    @ObfuscatedName("aq.f")
    public int[] field939 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.a")
    public boolean field934 = false;

    @ObfuscatedName("l.i(Ler;Ler;B)V")
    public static void method35(class152 arg0, class152 arg1) {
        Statics.field940 = arg0;
        Statics.field2467 = arg1;
        Statics.field931 = Statics.field940.method3088(3);
    }

    @ObfuscatedName("cn.v(II)Laq;")
    public static class36 method1887(int arg0) {
        class36 var1 = (class36) field932.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field940.method3032(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method796(new class127(var2));
        }
        field932.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.m(Lda;B)V")
    public void method796(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method769(arg0, var2);
        }
    }

    @ObfuscatedName("aq.j(Lda;II)V")
    public void method769(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field942 = arg0.method2491();
        } else if (arg1 == 2) {
            int var3 = arg0.method2491();
            this.field938 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field938[var4] = arg0.method2493();
            }
        } else if (arg1 == 3) {
            this.field934 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2491();
            this.field935 = new short[var5];
            this.field936 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field935[var6] = (short) arg0.method2493();
                this.field936[var6] = (short) arg0.method2493();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2491();
            this.field937 = new short[var7];
            this.field933 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field937[var8] = (short) arg0.method2493();
                this.field933[var8] = (short) arg0.method2493();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field939[arg1 - 60] = arg0.method2493();
        }
    }

    @ObfuscatedName("aq.o(B)Z")
    public boolean method784() {
        if (this.field938 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field938.length; var2++) {
            if (!Statics.field2467.method3105(this.field938[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.l(I)Lcw;")
    public class101 method771() {
        if (this.field938 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field938.length];
        for (int var2 = 0; var2 < this.field938.length; var2++) {
            var1[var2] = class101.method2081(Statics.field2467, this.field938[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field935 != null) {
            for (int var4 = 0; var4 < this.field935.length; var4++) {
                var3.method2095(this.field935[var4], this.field936[var4]);
            }
        }
        if (this.field937 != null) {
            for (int var5 = 0; var5 < this.field937.length; var5++) {
                var3.method2152(this.field937[var5], this.field933[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.g(I)Z")
    public boolean method772() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field939[var2] != -1 && !Statics.field2467.method3105(this.field939[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.w(I)Lcw;")
    public class101 method777() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field939[var3] != -1) {
                var1[var2++] = class101.method2081(Statics.field2467, this.field939[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field935 != null) {
            for (int var5 = 0; var5 < this.field935.length; var5++) {
                var4.method2095(this.field935[var5], this.field936[var5]);
            }
        }
        if (this.field937 != null) {
            for (int var6 = 0; var6 < this.field937.length; var6++) {
                var4.method2152(this.field937[var6], this.field933[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("b.c(B)V")
    public static void method168() {
        field932.method3311();
    }
}
