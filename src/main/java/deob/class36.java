package deob;

@ObfuscatedName("ar")
public class class36 extends class174 {

    @ObfuscatedName("ar.n")
    public static class170 field926 = new class170(64);

    @ObfuscatedName("ar.l")
    public int field933 = -1;

    @ObfuscatedName("ar.v")
    public int[] field928;

    @ObfuscatedName("ar.g")
    public short[] field929;

    @ObfuscatedName("ar.x")
    public short[] field930;

    @ObfuscatedName("ar.c")
    public short[] field925;

    @ObfuscatedName("ar.f")
    public short[] field932;

    @ObfuscatedName("ar.r")
    public int[] field927 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ar.d")
    public boolean field931 = false;

    @ObfuscatedName("f.p(II)Lar;")
    public static class36 method118(int arg0) {
        class36 var1 = (class36) field926.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field939.method3049(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method794(new class127(var2));
        }
        field926.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.i(Ldt;I)V")
    public void method794(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method795(arg0, var2);
        }
    }

    @ObfuscatedName("ar.o(Ldt;II)V")
    public void method795(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field933 = arg0.method2659();
        } else if (arg1 == 2) {
            int var3 = arg0.method2659();
            this.field928 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field928[var4] = arg0.method2652();
            }
        } else if (arg1 == 3) {
            this.field931 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2659();
            this.field929 = new short[var5];
            this.field930 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field929[var6] = (short) arg0.method2652();
                this.field930[var6] = (short) arg0.method2652();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2659();
            this.field925 = new short[var7];
            this.field932 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field925[var8] = (short) arg0.method2652();
                this.field932[var8] = (short) arg0.method2652();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field927[arg1 - 60] = arg0.method2652();
        }
    }

    @ObfuscatedName("ar.n(B)Z")
    public boolean method796() {
        if (this.field928 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field928.length; var2++) {
            if (!Statics.field1928.method3038(this.field928[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ar.l(I)Lcf;")
    public class101 method797() {
        if (this.field928 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field928.length];
        for (int var2 = 0; var2 < this.field928.length; var2++) {
            var1[var2] = class101.method2078(Statics.field1928, this.field928[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field929 != null) {
            for (int var4 = 0; var4 < this.field929.length; var4++) {
                var3.method2092(this.field929[var4], this.field930[var4]);
            }
        }
        if (this.field925 != null) {
            for (int var5 = 0; var5 < this.field925.length; var5++) {
                var3.method2093(this.field925[var5], this.field932[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ar.v(B)Z")
    public boolean method804() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field927[var2] != -1 && !Statics.field1928.method3038(this.field927[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ar.g(B)Lcf;")
    public class101 method798() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field927[var3] != -1) {
                var1[var2++] = class101.method2078(Statics.field1928, this.field927[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field929 != null) {
            for (int var5 = 0; var5 < this.field929.length; var5++) {
                var4.method2092(this.field929[var5], this.field930[var5]);
            }
        }
        if (this.field925 != null) {
            for (int var6 = 0; var6 < this.field925.length; var6++) {
                var4.method2093(this.field925[var6], this.field932[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("b.x(I)V")
    public static void method170() {
        field926.method3265();
    }
}
