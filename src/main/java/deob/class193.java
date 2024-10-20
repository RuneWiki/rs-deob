package deob;

@ObfuscatedName("gs")
public class class193 extends class130 {

    @ObfuscatedName("gs.r")
    public static class125 field2809 = new class125(64);

    @ObfuscatedName("gs.w")
    public int field2805 = -1;

    @ObfuscatedName("gs.j")
    public int[] field2806;

    @ObfuscatedName("gs.q")
    public short[] field2807;

    @ObfuscatedName("gs.d")
    public short[] field2808;

    @ObfuscatedName("gs.n")
    public short[] field2810;

    @ObfuscatedName("gs.c")
    public short[] field2814;

    @ObfuscatedName("gs.s")
    public int[] field2802 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gs.g")
    public boolean field2812 = false;

    @ObfuscatedName("fk.k(II)Lgs;")
    public static class193 method3011(int arg0) {
        class193 var1 = (class193) field2809.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2804.method3065(3, arg0);
        class193 var3 = new class193();
        if (var2 != null) {
            var3.method3289(new class161(var2));
        }
        field2809.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.y(Lfm;I)V")
    public void method3289(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3276(arg0, var2);
        }
    }

    @ObfuscatedName("gs.o(Lfm;IB)V")
    public void method3276(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2805 = arg0.method2733();
        } else if (arg1 == 2) {
            int var3 = arg0.method2733();
            this.field2806 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2806[var4] = arg0.method2735();
            }
        } else if (arg1 == 3) {
            this.field2812 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2733();
            this.field2807 = new short[var5];
            this.field2808 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2807[var6] = (short) arg0.method2735();
                this.field2808[var6] = (short) arg0.method2735();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2733();
            this.field2810 = new short[var7];
            this.field2814 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2810[var8] = (short) arg0.method2735();
                this.field2814[var8] = (short) arg0.method2735();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2802[arg1 - 60] = arg0.method2735();
        }
    }

    @ObfuscatedName("gs.r(I)Z")
    public boolean method3274() {
        if (this.field2806 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2806.length; var2++) {
            if (!Statics.field2801.method3067(this.field2806[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gs.w(I)Lbg;")
    public class77 method3275() {
        if (this.field2806 == null) {
            return null;
        }
        class77[] var1 = new class77[this.field2806.length];
        for (int var2 = 0; var2 < this.field2806.length; var2++) {
            var1[var2] = class77.method1384(Statics.field2801, this.field2806[var2], 0);
        }
        class77 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class77(var1, var1.length);
        }
        if (this.field2807 != null) {
            for (int var4 = 0; var4 < this.field2807.length; var4++) {
                var3.method1388(this.field2807[var4], this.field2808[var4]);
            }
        }
        if (this.field2810 != null) {
            for (int var5 = 0; var5 < this.field2810.length; var5++) {
                var3.method1398(this.field2810[var5], this.field2814[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gs.j(I)Z")
    public boolean method3283() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2802[var2] != -1 && !Statics.field2801.method3067(this.field2802[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gs.c(I)Lbg;")
    public class77 method3280() {
        class77[] var1 = new class77[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2802[var3] != -1) {
                var1[var2++] = class77.method1384(Statics.field2801, this.field2802[var3], 0);
            }
        }
        class77 var4 = new class77(var1, var2);
        if (this.field2807 != null) {
            for (int var5 = 0; var5 < this.field2807.length; var5++) {
                var4.method1388(this.field2807[var5], this.field2808[var5]);
            }
        }
        if (this.field2810 != null) {
            for (int var6 = 0; var6 < this.field2810.length; var6++) {
                var4.method1398(this.field2810[var6], this.field2814[var6]);
            }
        }
        return var4;
    }
}
