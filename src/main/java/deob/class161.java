package deob;

@ObfuscatedName("ay")
public class class161 extends class77 {

    @ObfuscatedName("ay.f")
    public short[] field2407;

    @ObfuscatedName("ay.g")
    public short[] field2405;

    @ObfuscatedName("ay.e")
    public short[] field2401;

    @ObfuscatedName("ay.n")
    public short[] field2399;

    @ObfuscatedName("ay.h")
    public int field2402 = -1;

    @ObfuscatedName("ay.t")
    public static class67 field2412 = new class67(64);

    @ObfuscatedName("ay.r")
    public int[] field2403;

    @ObfuscatedName("ay.z")
    public boolean field2413 = false;

    @ObfuscatedName("ay.x")
    public int[] field2408 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ay.p(Ldy;B)V")
    public void method3043(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3044(arg0, var2);
        }
    }

    @ObfuscatedName("ay.o(Ldy;II)V")
    public void method3044(class31 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2402 = arg0.method512();
        } else if (arg1 == 2) {
            int var3 = arg0.method512();
            this.field2403 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2403[var4] = arg0.method373();
            }
        } else if (arg1 == 3) {
            this.field2413 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method512();
            this.field2399 = new short[var5];
            this.field2405 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2399[var6] = (short) arg0.method373();
                this.field2405[var6] = (short) arg0.method373();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method512();
            this.field2401 = new short[var7];
            this.field2407 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2401[var8] = (short) arg0.method373();
                this.field2407[var8] = (short) arg0.method373();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2408[arg1 - 60] = arg0.method373();
        }
    }

    @ObfuscatedName("ay.t(I)Z")
    public boolean method3045() {
        if (this.field2403 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2403.length; var2++) {
            if (!Statics.field2409.method1085(this.field2403[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.h(I)Lct;")
    public class142 method3046() {
        if (this.field2403 == null) {
            return null;
        }
        class142[] var1 = new class142[this.field2403.length];
        for (int var2 = 0; var2 < this.field2403.length; var2++) {
            var1[var2] = class142.method2529(Statics.field2409, this.field2403[var2], 0);
        }
        class142 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class142(var1, var1.length);
        }
        if (this.field2399 != null) {
            for (int var4 = 0; var4 < this.field2399.length; var4++) {
                var3.method2542(this.field2399[var4], this.field2405[var4]);
            }
        }
        if (this.field2401 != null) {
            for (int var5 = 0; var5 < this.field2401.length; var5++) {
                var3.method2555(this.field2401[var5], this.field2407[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ay.r(B)Z")
    public boolean method3047() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2408[var2] != -1 && !Statics.field2409.method1085(this.field2408[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.n(B)Lct;")
    public class142 method3048() {
        class142[] var1 = new class142[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2408[var3] != -1) {
                var1[var2++] = class142.method2529(Statics.field2409, this.field2408[var3], 0);
            }
        }
        class142 var4 = new class142(var1, var2);
        if (this.field2399 != null) {
            for (int var5 = 0; var5 < this.field2399.length; var5++) {
                var4.method2542(this.field2399[var5], this.field2405[var5]);
            }
        }
        if (this.field2401 != null) {
            for (int var6 = 0; var6 < this.field2401.length; var6++) {
                var4.method2555(this.field2401[var6], this.field2407[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cp.j(II)Lay;")
    public static class161 method2754(int arg0) {
        class161 var1 = (class161) field2412.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2416.method1083(3, arg0);
        class161 var3 = new class161();
        if (var2 != null) {
            var3.method3043(new class31(var2));
        }
        field2412.method907(var3, (long) arg0);
        return var3;
    }
}
