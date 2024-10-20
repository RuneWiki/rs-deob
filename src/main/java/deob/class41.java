package deob;

@ObfuscatedName("ap")
public class class41 extends class185 {

    @ObfuscatedName("ap.e")
    public static class174 field953 = new class174(64);

    @ObfuscatedName("ap.h")
    public int field956 = -1;

    @ObfuscatedName("ap.p")
    public int[] field957;

    @ObfuscatedName("ap.j")
    public short[] field958;

    @ObfuscatedName("ap.i")
    public short[] field959;

    @ObfuscatedName("ap.u")
    public short[] field960;

    @ObfuscatedName("ap.l")
    public short[] field961;

    @ObfuscatedName("ap.k")
    public int[] field955 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ap.q")
    public boolean field966 = false;

    @ObfuscatedName("ef.x(IB)Lap;")
    public static class41 method2686(int arg0) {
        class41 var1 = (class41) field953.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field963.method2751(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method789(new class108(var2));
        }
        field953.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.v(Ldm;I)V")
    public void method789(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method803(arg0, var2);
        }
    }

    @ObfuscatedName("ap.m(Ldm;II)V")
    public void method803(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field956 = arg0.method2299();
        } else if (arg1 == 2) {
            int var3 = arg0.method2299();
            this.field957 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field957[var4] = arg0.method2129();
            }
        } else if (arg1 == 3) {
            this.field966 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2299();
            this.field958 = new short[var5];
            this.field959 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field958[var6] = (short) arg0.method2129();
                this.field959[var6] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2299();
            this.field960 = new short[var7];
            this.field961 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field960[var8] = (short) arg0.method2129();
                this.field961[var8] = (short) arg0.method2129();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field955[arg1 - 60] = arg0.method2129();
        }
    }

    @ObfuscatedName("ap.e(I)Z")
    public boolean method795() {
        if (this.field957 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field957.length; var2++) {
            if (!Statics.field2819.method2728(this.field957[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.h(I)Lcs;")
    public class94 method791() {
        if (this.field957 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field957.length];
        for (int var2 = 0; var2 < this.field957.length; var2++) {
            var1[var2] = class94.method1892(Statics.field2819, this.field957[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field958 != null) {
            for (int var4 = 0; var4 < this.field958.length; var4++) {
                var3.method1948(this.field958[var4], this.field959[var4]);
            }
        }
        if (this.field960 != null) {
            for (int var5 = 0; var5 < this.field960.length; var5++) {
                var3.method1906(this.field960[var5], this.field961[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ap.p(I)Z")
    public boolean method790() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field955[var2] != -1 && !Statics.field2819.method2728(this.field955[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ap.j(B)Lcs;")
    public class94 method788() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field955[var3] != -1) {
                var1[var2++] = class94.method1892(Statics.field2819, this.field955[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field958 != null) {
            for (int var5 = 0; var5 < this.field958.length; var5++) {
                var4.method1948(this.field958[var5], this.field959[var5]);
            }
        }
        if (this.field960 != null) {
            for (int var6 = 0; var6 < this.field960.length; var6++) {
                var4.method1906(this.field960[var6], this.field961[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.i(B)V")
    public static void method544() {
        field953.method3181();
    }
}
