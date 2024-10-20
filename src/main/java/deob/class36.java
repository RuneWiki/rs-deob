package deob;

@ObfuscatedName("ap")
public class class36 extends class174 {

    @ObfuscatedName("ap.r")
    public static class170 field936 = new class170(64);

    @ObfuscatedName("ap.p")
    public int field937 = -1;

    @ObfuscatedName("ap.n")
    public int[] field942;

    @ObfuscatedName("ap.o")
    public short[] field933;

    @ObfuscatedName("ap.l")
    public short[] field948;

    @ObfuscatedName("ap.t")
    public short[] field945;

    @ObfuscatedName("ap.q")
    public short[] field940;

    @ObfuscatedName("ap.c")
    public int[] field943 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ap.z")
    public boolean field944 = false;

    @ObfuscatedName("a.a(II)Lap;")
    public static class36 method3(int arg0) {
        class36 var1 = (class36) field936.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field947.method2961(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method768(new class127(var2));
        }
        field936.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.x(Ldy;I)V")
    public void method768(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method790(arg0, var2);
        }
    }

    @ObfuscatedName("ap.e(Ldy;II)V")
    public void method790(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field937 = arg0.method2411();
        } else if (arg1 == 2) {
            int var3 = arg0.method2411();
            this.field942 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field942[var4] = arg0.method2413();
            }
        } else if (arg1 == 3) {
            this.field944 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2411();
            this.field933 = new short[var5];
            this.field948 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field933[var6] = (short) arg0.method2413();
                this.field948[var6] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2411();
            this.field945 = new short[var7];
            this.field940 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field945[var8] = (short) arg0.method2413();
                this.field940[var8] = (short) arg0.method2413();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field943[arg1 - 60] = arg0.method2413();
        }
    }

    @ObfuscatedName("ap.r(I)Z")
    public boolean method770() {
        if (this.field942 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field942.length; var2++) {
            if (!Statics.field934.method2939(this.field942[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.p(I)Lcc;")
    public class101 method771() {
        if (this.field942 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field942.length];
        for (int var2 = 0; var2 < this.field942.length; var2++) {
            var1[var2] = class101.method1989(Statics.field934, this.field942[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field933 != null) {
            for (int var4 = 0; var4 < this.field933.length; var4++) {
                var3.method2002(this.field933[var4], this.field948[var4]);
            }
        }
        if (this.field945 != null) {
            for (int var5 = 0; var5 < this.field945.length; var5++) {
                var3.method2021(this.field945[var5], this.field940[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ap.n(I)Z")
    public boolean method772() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field943[var2] != -1 && !Statics.field934.method2939(this.field943[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.o(I)Lcc;")
    public class101 method781() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field943[var3] != -1) {
                var1[var2++] = class101.method1989(Statics.field934, this.field943[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field933 != null) {
            for (int var5 = 0; var5 < this.field933.length; var5++) {
                var4.method2002(this.field933[var5], this.field948[var5]);
            }
        }
        if (this.field945 != null) {
            for (int var6 = 0; var6 < this.field945.length; var6++) {
                var4.method2021(this.field945[var6], this.field940[var6]);
            }
        }
        return var4;
    }
}
