package deob;

@ObfuscatedName("ib")
public class class256 extends class185 {

    @ObfuscatedName("ib.d")
    public static class155 field3263 = new class155(64);

    @ObfuscatedName("ib.w")
    public int field3264 = -1;

    @ObfuscatedName("ib.v")
    public int[] field3265;

    @ObfuscatedName("ib.q")
    public short[] field3268;

    @ObfuscatedName("ib.z")
    public short[] field3266;

    @ObfuscatedName("ib.t")
    public short[] field3260;

    @ObfuscatedName("ib.e")
    public short[] field3262;

    @ObfuscatedName("ib.s")
    public int[] field3270 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ib.p")
    public boolean field3271 = false;

    @ObfuscatedName("by.x(Liy;Liy;I)V")
    public static void method1163(class244 arg0, class244 arg1) {
        Statics.field3269 = arg0;
        Statics.field3267 = arg1;
        Statics.field3261 = Statics.field3269.method3891(3);
    }

    @ObfuscatedName("io.m(II)Lib;")
    public static class256 method4093(int arg0) {
        class256 var1 = (class256) field3263.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3269.method3869(3, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4127(new class310(var2));
        }
        field3263.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.k(Lkb;I)V")
    public void method4127(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4128(arg0, var2);
        }
    }

    @ObfuscatedName("ib.d(Lkb;IB)V")
    public void method4128(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3264 = arg0.method5137();
        } else if (arg1 == 2) {
            int var3 = arg0.method5137();
            this.field3265 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3265[var4] = arg0.method5139();
            }
        } else if (arg1 == 3) {
            this.field3271 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5137();
            this.field3268 = new short[var5];
            this.field3266 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3268[var6] = (short) arg0.method5139();
                this.field3266[var6] = (short) arg0.method5139();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5137();
            this.field3260 = new short[var7];
            this.field3262 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3260[var8] = (short) arg0.method5139();
                this.field3262[var8] = (short) arg0.method5139();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3270[arg1 - 60] = arg0.method5139();
        }
    }

    @ObfuscatedName("ib.w(B)Z")
    public boolean method4129() {
        if (this.field3265 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3265.length; var2++) {
            if (!Statics.field3267.method3883(this.field3265[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ib.v(I)Lea;")
    public class131 method4130() {
        if (this.field3265 == null) {
            return null;
        }
        class131[] var1 = new class131[this.field3265.length];
        for (int var2 = 0; var2 < this.field3265.length; var2++) {
            var1[var2] = class131.method2615(Statics.field3267, this.field3265[var2], 0);
        }
        class131 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class131(var1, var1.length);
        }
        if (this.field3268 != null) {
            for (int var4 = 0; var4 < this.field3268.length; var4++) {
                var3.method2629(this.field3268[var4], this.field3266[var4]);
            }
        }
        if (this.field3260 != null) {
            for (int var5 = 0; var5 < this.field3260.length; var5++) {
                var3.method2681(this.field3260[var5], this.field3262[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ib.q(I)Z")
    public boolean method4131() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3270[var2] != -1 && !Statics.field3267.method3883(this.field3270[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ib.z(I)Lea;")
    public class131 method4132() {
        class131[] var1 = new class131[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3270[var3] != -1) {
                var1[var2++] = class131.method2615(Statics.field3267, this.field3270[var3], 0);
            }
        }
        class131 var4 = new class131(var1, var2);
        if (this.field3268 != null) {
            for (int var5 = 0; var5 < this.field3268.length; var5++) {
                var4.method2629(this.field3268[var5], this.field3266[var5]);
            }
        }
        if (this.field3260 != null) {
            for (int var6 = 0; var6 < this.field3260.length; var6++) {
                var4.method2681(this.field3260[var6], this.field3262[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fc.t(I)V")
    public static void method3222() {
        field3263.method3141();
    }
}
