package deob;

@ObfuscatedName("gc")
public class class193 extends class130 {

    @ObfuscatedName("gc.h")
    public static class125 field2822 = new class125(64);

    @ObfuscatedName("gc.w")
    public int field2823 = -1;

    @ObfuscatedName("gc.r")
    public int[] field2820;

    @ObfuscatedName("gc.c")
    public short[] field2825;

    @ObfuscatedName("gc.p")
    public short[] field2826;

    @ObfuscatedName("gc.g")
    public short[] field2827;

    @ObfuscatedName("gc.z")
    public short[] field2828;

    @ObfuscatedName("gc.q")
    public int[] field2824 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gc.l")
    public boolean field2829 = false;

    @ObfuscatedName("ad.n(IB)Lgc;")
    public static class193 method785(int arg0) {
        class193 var1 = (class193) field2822.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2830.method3093(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3297(new class161(var2));
        }
        field2822.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.d(Lfa;I)V")
    public void method3297(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3298(arg0, var2);
        }
    }

    @ObfuscatedName("gc.m(Lfa;II)V")
    public void method3298(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2823 = arg0.method2823();
        } else if (arg1 == 2) {
            int var3 = arg0.method2823();
            this.field2820 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2820[var4] = arg0.method2887();
            }
        } else if (arg1 == 3) {
            this.field2829 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2823();
            this.field2825 = new short[var5];
            this.field2826 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2825[var6] = (short) arg0.method2887();
                this.field2826[var6] = (short) arg0.method2887();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2823();
            this.field2827 = new short[var7];
            this.field2828 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2827[var8] = (short) arg0.method2887();
                this.field2828[var8] = (short) arg0.method2887();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2824[arg1 - 60] = arg0.method2887();
        }
    }

    @ObfuscatedName("gc.h(B)Z")
    public boolean method3313() {
        if (this.field2820 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2820.length; var2++) {
            if (!Statics.field2821.method3111(this.field2820[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gc.w(S)Lbz;")
    public class77 method3300() {
        if (this.field2820 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2820.length];
        for (int var2 = 0; var2 < this.field2820.length; var2++) {
            var1[var2] = class77.method1401(Statics.field2821, this.field2820[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2825 != null) {
            for (int var4 = 0; var4 < this.field2825.length; var4++) {
                var3.method1400(this.field2825[var4], this.field2826[var4]);
            }
        }
        if (this.field2827 != null) {
            for (int var5 = 0; var5 < this.field2827.length; var5++) {
                var3.method1416(this.field2827[var5], this.field2828[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gc.r(I)Z")
    public boolean method3316() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2824[var2] != -1 && !Statics.field2821.method3111(this.field2824[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gc.c(I)Lbz;")
    public class77 method3309() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2824[var3] != -1) {
                var1[var2++] = class77.method1401(Statics.field2821, this.field2824[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2825 != null) {
            for (int var5 = 0; var5 < this.field2825.length; var5++) {
                var4.method1400(this.field2825[var5], this.field2826[var5]);
            }
        }
        if (this.field2827 != null) {
            for (int var6 = 0; var6 < this.field2827.length; var6++) {
                var4.method1416(this.field2827[var6], this.field2828[var6]);
            }
        }
        return var4;
    }
}
