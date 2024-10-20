package deob;

@ObfuscatedName("aj")
public class class36 extends class174 {

    @ObfuscatedName("aj.o")
    public static class170 field930 = new class170(64);

    @ObfuscatedName("aj.p")
    public int field932 = -1;

    @ObfuscatedName("aj.x")
    public int[] field938;

    @ObfuscatedName("aj.k")
    public short[] field934;

    @ObfuscatedName("aj.r")
    public short[] field931;

    @ObfuscatedName("aj.z")
    public short[] field933;

    @ObfuscatedName("aj.n")
    public short[] field937;

    @ObfuscatedName("aj.j")
    public int[] field936 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aj.b")
    public boolean field939 = false;

    @ObfuscatedName("c.g(IB)Laj;")
    public static class36 method250(int arg0) {
        class36 var1 = (class36) field930.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field935.method3080(3, arg0);
        class36 var3 = new class36();
        if (var2 != null) {
            var3.method764(new class127(var2));
        }
        field930.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.h(Ldw;B)V")
    public void method764(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method771(arg0, var2);
        }
    }

    @ObfuscatedName("aj.s(Ldw;II)V")
    public void method771(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field932 = arg0.method2499();
        } else if (arg1 == 2) {
            int var3 = arg0.method2499();
            this.field938 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field938[var4] = arg0.method2501();
            }
        } else if (arg1 == 3) {
            this.field939 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2499();
            this.field934 = new short[var5];
            this.field931 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field934[var6] = (short) arg0.method2501();
                this.field931[var6] = (short) arg0.method2501();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2499();
            this.field933 = new short[var7];
            this.field937 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field933[var8] = (short) arg0.method2501();
                this.field937[var8] = (short) arg0.method2501();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field936[arg1 - 60] = arg0.method2501();
        }
    }

    @ObfuscatedName("aj.o(I)Z")
    public boolean method766() {
        if (this.field938 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field938.length; var2++) {
            if (!Statics.field2748.method3084(this.field938[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.p(I)Lcz;")
    public class101 method767() {
        if (this.field938 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field938.length];
        for (int var2 = 0; var2 < this.field938.length; var2++) {
            var1[var2] = class101.method2085(Statics.field2748, this.field938[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field934 != null) {
            for (int var4 = 0; var4 < this.field934.length; var4++) {
                var3.method2097(this.field934[var4], this.field931[var4]);
            }
        }
        if (this.field933 != null) {
            for (int var5 = 0; var5 < this.field933.length; var5++) {
                var3.method2167(this.field933[var5], this.field937[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aj.x(S)Z")
    public boolean method775() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field936[var2] != -1 && !Statics.field2748.method3084(this.field936[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.k(I)Lcz;")
    public class101 method773() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field936[var3] != -1) {
                var1[var2++] = class101.method2085(Statics.field2748, this.field936[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field934 != null) {
            for (int var5 = 0; var5 < this.field934.length; var5++) {
                var4.method2097(this.field934[var5], this.field931[var5]);
            }
        }
        if (this.field933 != null) {
            for (int var6 = 0; var6 < this.field933.length; var6++) {
                var4.method2167(this.field933[var6], this.field937[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("c.r(I)V")
    public static void method238() {
        field930.method3306();
    }
}
