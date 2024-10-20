package deob;

@ObfuscatedName("if")
public class class257 extends class185 {

    @ObfuscatedName("if.w")
    public static class155 field3295 = new class155(64);

    @ObfuscatedName("if.t")
    public int field3302 = -1;

    @ObfuscatedName("if.j")
    public int[] field3299;

    @ObfuscatedName("if.n")
    public short[] field3298;

    @ObfuscatedName("if.p")
    public short[] field3301;

    @ObfuscatedName("if.l")
    public short[] field3307;

    @ObfuscatedName("if.z")
    public short[] field3303;

    @ObfuscatedName("if.u")
    public int[] field3304 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("if.e")
    public boolean field3305 = false;

    @ObfuscatedName("af.h(II)Lif;")
    public static class257 method660(int arg0) {
        class257 var1 = (class257) field3295.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3300.method3834(3, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4093(new class311(var2));
        }
        field3295.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.v(Lkj;S)V")
    public void method4093(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4110(arg0, var2);
        }
    }

    @ObfuscatedName("if.x(Lkj;IB)V")
    public void method4110(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3302 = arg0.method5274();
        } else if (arg1 == 2) {
            int var3 = arg0.method5274();
            this.field3299 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3299[var4] = arg0.method5342();
            }
        } else if (arg1 == 3) {
            this.field3305 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5274();
            this.field3298 = new short[var5];
            this.field3301 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3298[var6] = (short) arg0.method5342();
                this.field3301[var6] = (short) arg0.method5342();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5274();
            this.field3307 = new short[var7];
            this.field3303 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3307[var8] = (short) arg0.method5342();
                this.field3303[var8] = (short) arg0.method5342();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3304[arg1 - 60] = arg0.method5342();
        }
    }

    @ObfuscatedName("if.w(I)Z")
    public boolean method4095() {
        if (this.field3299 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3299.length; var2++) {
            if (!Statics.field2733.method3836(this.field3299[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("if.t(I)Les;")
    public class131 method4096() {
        if (this.field3299 == null) {
            return null;
        }
        class131[] var1 = new class131[this.field3299.length];
        for (int var2 = 0; var2 < this.field3299.length; var2++) {
            var1[var2] = class131.method2622(Statics.field2733, this.field3299[var2], 0);
        }
        class131 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class131(var1, var1.length);
        }
        if (this.field3298 != null) {
            for (int var4 = 0; var4 < this.field3298.length; var4++) {
                var3.method2635(this.field3298[var4], this.field3301[var4]);
            }
        }
        if (this.field3307 != null) {
            for (int var5 = 0; var5 < this.field3307.length; var5++) {
                var3.method2631(this.field3307[var5], this.field3303[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("if.j(I)Z")
    public boolean method4119() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3304[var2] != -1 && !Statics.field2733.method3836(this.field3304[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("if.n(I)Les;")
    public class131 method4098() {
        class131[] var1 = new class131[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3304[var3] != -1) {
                var1[var2++] = class131.method2622(Statics.field2733, this.field3304[var3], 0);
            }
        }
        class131 var4 = new class131(var1, var2);
        if (this.field3298 != null) {
            for (int var5 = 0; var5 < this.field3298.length; var5++) {
                var4.method2635(this.field3298[var5], this.field3301[var5]);
            }
        }
        if (this.field3307 != null) {
            for (int var6 = 0; var6 < this.field3307.length; var6++) {
                var4.method2631(this.field3307[var6], this.field3303[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("lv.p(I)V")
    public static void method5491() {
        field3295.method3146();
    }
}
