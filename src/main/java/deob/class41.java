package deob;

@ObfuscatedName("az")
public class class41 extends class185 {

    @ObfuscatedName("az.g")
    public static class174 field959 = new class174(64);

    @ObfuscatedName("az.q")
    public int field961 = -1;

    @ObfuscatedName("az.l")
    public int[] field962;

    @ObfuscatedName("az.a")
    public short[] field963;

    @ObfuscatedName("az.b")
    public short[] field964;

    @ObfuscatedName("az.z")
    public short[] field965;

    @ObfuscatedName("az.w")
    public short[] field966;

    @ObfuscatedName("az.j")
    public int[] field957 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("az.p")
    public boolean field968 = false;

    @ObfuscatedName("g.e(II)Laz;")
    public static class41 method30(int arg0) {
        class41 var1 = (class41) field959.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field971.method2721(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method770(new class108(var2));
        }
        field959.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.v(Ldd;I)V")
    public void method770(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method753(arg0, var2);
        }
    }

    @ObfuscatedName("az.k(Ldd;IB)V")
    public void method753(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field961 = arg0.method2122();
        } else if (arg1 == 2) {
            int var3 = arg0.method2122();
            this.field962 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field962[var4] = arg0.method2124();
            }
        } else if (arg1 == 3) {
            this.field968 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2122();
            this.field963 = new short[var5];
            this.field964 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field963[var6] = (short) arg0.method2124();
                this.field964[var6] = (short) arg0.method2124();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2122();
            this.field965 = new short[var7];
            this.field966 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field965[var8] = (short) arg0.method2124();
                this.field966[var8] = (short) arg0.method2124();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field957[arg1 - 60] = arg0.method2124();
        }
    }

    @ObfuscatedName("az.g(I)Z")
    public boolean method768() {
        if (this.field962 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field962.length; var2++) {
            if (!Statics.field958.method2767(this.field962[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("az.q(I)Lcd;")
    public class94 method755() {
        if (this.field962 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field962.length];
        for (int var2 = 0; var2 < this.field962.length; var2++) {
            var1[var2] = class94.method1890(Statics.field958, this.field962[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field963 != null) {
            for (int var4 = 0; var4 < this.field963.length; var4++) {
                var3.method1901(this.field963[var4], this.field964[var4]);
            }
        }
        if (this.field965 != null) {
            for (int var5 = 0; var5 < this.field965.length; var5++) {
                var3.method1902(this.field965[var5], this.field966[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("az.l(B)Z")
    public boolean method769() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field957[var2] != -1 && !Statics.field958.method2767(this.field957[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("az.a(I)Lcd;")
    public class94 method756() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field957[var3] != -1) {
                var1[var2++] = class94.method1890(Statics.field958, this.field957[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field963 != null) {
            for (int var5 = 0; var5 < this.field963.length; var5++) {
                var4.method1901(this.field963[var5], this.field964[var5]);
            }
        }
        if (this.field965 != null) {
            for (int var6 = 0; var6 < this.field965.length; var6++) {
                var4.method1902(this.field965[var6], this.field966[var6]);
            }
        }
        return var4;
    }
}
