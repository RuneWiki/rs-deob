package deob;

@ObfuscatedName("ig")
public class class249 extends class196 {

    @ObfuscatedName("ig.p")
    public static class191 field3337 = new class191(64);

    @ObfuscatedName("ig.x")
    public int field3339 = -1;

    @ObfuscatedName("ig.g")
    public int[] field3340;

    @ObfuscatedName("ig.c")
    public short[] field3341;

    @ObfuscatedName("ig.l")
    public short[] field3336;

    @ObfuscatedName("ig.w")
    public short[] field3343;

    @ObfuscatedName("ig.b")
    public short[] field3344;

    @ObfuscatedName("ig.o")
    public int[] field3345 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ig.m")
    public boolean field3346 = false;

    @ObfuscatedName("ie.j(IB)Lig;")
    public static class249 method3951(int arg0) {
        class249 var1 = (class249) field3337.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3335.method3773(3, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4045(new class175(var2));
        }
        field3337.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.h(Lfb;I)V")
    public void method4045(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4046(arg0, var2);
        }
    }

    @ObfuscatedName("ig.f(Lfb;IB)V")
    public void method4046(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3339 = arg0.method2903();
        } else if (arg1 == 2) {
            int var3 = arg0.method2903();
            this.field3340 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3340[var4] = arg0.method3023();
            }
        } else if (arg1 == 3) {
            this.field3346 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2903();
            this.field3341 = new short[var5];
            this.field3336 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3341[var6] = (short) arg0.method3023();
                this.field3336[var6] = (short) arg0.method3023();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2903();
            this.field3343 = new short[var7];
            this.field3344 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3343[var8] = (short) arg0.method3023();
                this.field3344[var8] = (short) arg0.method3023();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3345[arg1 - 60] = arg0.method3023();
        }
    }

    @ObfuscatedName("ig.p(I)Z")
    public boolean method4047() {
        if (this.field3340 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3340.length; var2++) {
            if (!Statics.field3342.method3775(this.field3340[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ig.x(B)Ldi;")
    public class129 method4048() {
        if (this.field3340 == null) {
            return null;
        }
        class129[] var1 = new class129[this.field3340.length];
        for (int var2 = 0; var2 < this.field3340.length; var2++) {
            var1[var2] = class129.method2208(Statics.field3342, this.field3340[var2], 0);
        }
        class129 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class129(var1, var1.length);
        }
        if (this.field3341 != null) {
            for (int var4 = 0; var4 < this.field3341.length; var4++) {
                var3.method2241(this.field3341[var4], this.field3336[var4]);
            }
        }
        if (this.field3343 != null) {
            for (int var5 = 0; var5 < this.field3343.length; var5++) {
                var3.method2223(this.field3343[var5], this.field3344[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ig.g(I)Z")
    public boolean method4061() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3345[var2] != -1 && !Statics.field3342.method3775(this.field3345[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ig.c(B)Ldi;")
    public class129 method4049() {
        class129[] var1 = new class129[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3345[var3] != -1) {
                var1[var2++] = class129.method2208(Statics.field3342, this.field3345[var3], 0);
            }
        }
        class129 var4 = new class129(var1, var2);
        if (this.field3341 != null) {
            for (int var5 = 0; var5 < this.field3341.length; var5++) {
                var4.method2241(this.field3341[var5], this.field3336[var5]);
            }
        }
        if (this.field3343 != null) {
            for (int var6 = 0; var6 < this.field3343.length; var6++) {
                var4.method2223(this.field3343[var6], this.field3344[var6]);
            }
        }
        return var4;
    }
}
