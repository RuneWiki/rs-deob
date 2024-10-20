package deob;

@ObfuscatedName("ar")
public class class42 extends class195 {

    @ObfuscatedName("ar.e")
    public static class184 field960 = new class184(64);

    @ObfuscatedName("ar.i")
    public int field959 = -1;

    @ObfuscatedName("ar.o")
    public int[] field963;

    @ObfuscatedName("ar.f")
    public short[] field971;

    @ObfuscatedName("ar.d")
    public short[] field965;

    @ObfuscatedName("ar.j")
    public short[] field966;

    @ObfuscatedName("ar.x")
    public short[] field962;

    @ObfuscatedName("ar.v")
    public int[] field968 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ar.a")
    public boolean field969 = false;

    @ObfuscatedName("k.t(II)Lar;")
    public static class42 method181(int arg0) {
        class42 var1 = (class42) field960.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field964.method2881(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method842(new class111(var2));
        }
        field960.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.b(Ldc;I)V")
    public void method842(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method843(arg0, var2);
        }
    }

    @ObfuscatedName("ar.p(Ldc;IB)V")
    public void method843(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field959 = arg0.method2172();
        } else if (arg1 == 2) {
            int var3 = arg0.method2172();
            this.field963 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field963[var4] = arg0.method2255();
            }
        } else if (arg1 == 3) {
            this.field969 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2172();
            this.field971 = new short[var5];
            this.field965 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field971[var6] = (short) arg0.method2255();
                this.field965[var6] = (short) arg0.method2255();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2172();
            this.field966 = new short[var7];
            this.field962 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field966[var8] = (short) arg0.method2255();
                this.field962[var8] = (short) arg0.method2255();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field968[arg1 - 60] = arg0.method2255();
        }
    }

    @ObfuscatedName("ar.e(I)Z")
    public boolean method844() {
        if (this.field963 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field963.length; var2++) {
            if (!Statics.field958.method2953(this.field963[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ar.i(B)Lcg;")
    public class95 method849() {
        if (this.field963 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field963.length];
        for (int var2 = 0; var2 < this.field963.length; var2++) {
            var1[var2] = class95.method1964(Statics.field958, this.field963[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field971 != null) {
            for (int var4 = 0; var4 < this.field971.length; var4++) {
                var3.method1995(this.field971[var4], this.field965[var4]);
            }
        }
        if (this.field966 != null) {
            for (int var5 = 0; var5 < this.field966.length; var5++) {
                var3.method1943(this.field966[var5], this.field962[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ar.o(I)Z")
    public boolean method874() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field968[var2] != -1 && !Statics.field958.method2953(this.field968[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ar.f(I)Lcg;")
    public class95 method847() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field968[var3] != -1) {
                var1[var2++] = class95.method1964(Statics.field958, this.field968[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field971 != null) {
            for (int var5 = 0; var5 < this.field971.length; var5++) {
                var4.method1995(this.field971[var5], this.field965[var5]);
            }
        }
        if (this.field966 != null) {
            for (int var6 = 0; var6 < this.field966.length; var6++) {
                var4.method1943(this.field966[var6], this.field962[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fn.d(B)V")
    public static void method3332() {
        field960.method3342();
    }
}
