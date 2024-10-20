package deob;

@ObfuscatedName("ii")
public class class257 extends class185 {

    @ObfuscatedName("ii.m")
    public static class155 field3296 = new class155(64);

    @ObfuscatedName("ii.z")
    public int field3293 = -1;

    @ObfuscatedName("ii.q")
    public int[] field3294;

    @ObfuscatedName("ii.k")
    public short[] field3299;

    @ObfuscatedName("ii.c")
    public short[] field3300;

    @ObfuscatedName("ii.u")
    public short[] field3301;

    @ObfuscatedName("ii.t")
    public short[] field3302;

    @ObfuscatedName("ii.e")
    public int[] field3297 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ii.o")
    public boolean field3304 = false;

    @ObfuscatedName("fn.f(Liw;Liw;I)V")
    public static void method3319(class245 arg0, class245 arg1) {
        Statics.field3303 = arg0;
        Statics.field3305 = arg1;
        Statics.field3295 = Statics.field3303.method3963(3);
    }

    @ObfuscatedName("ac.b(IB)Lii;")
    public static class257 method256(int arg0) {
        class257 var1 = (class257) field3296.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3303.method3905(3, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4201(new class311(var2));
        }
        field3296.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.l(Lkb;I)V")
    public void method4201(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4202(arg0, var2);
        }
    }

    @ObfuscatedName("ii.m(Lkb;IB)V")
    public void method4202(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3293 = arg0.method5276();
        } else if (arg1 == 2) {
            int var3 = arg0.method5276();
            this.field3294 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3294[var4] = arg0.method5163();
            }
        } else if (arg1 == 3) {
            this.field3304 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5276();
            this.field3299 = new short[var5];
            this.field3300 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3299[var6] = (short) arg0.method5163();
                this.field3300[var6] = (short) arg0.method5163();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5276();
            this.field3301 = new short[var7];
            this.field3302 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3301[var8] = (short) arg0.method5163();
                this.field3302[var8] = (short) arg0.method5163();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3297[arg1 - 60] = arg0.method5163();
        }
    }

    @ObfuscatedName("ii.z(I)Z")
    public boolean method4200() {
        if (this.field3294 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3294.length; var2++) {
            if (!Statics.field3305.method3902(this.field3294[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ii.q(B)Len;")
    public class131 method4219() {
        if (this.field3294 == null) {
            return null;
        }
        class131[] var1 = new class131[this.field3294.length];
        for (int var2 = 0; var2 < this.field3294.length; var2++) {
            var1[var2] = class131.method2647(Statics.field3305, this.field3294[var2], 0);
        }
        class131 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class131(var1, var1.length);
        }
        if (this.field3299 != null) {
            for (int var4 = 0; var4 < this.field3299.length; var4++) {
                var3.method2660(this.field3299[var4], this.field3300[var4]);
            }
        }
        if (this.field3301 != null) {
            for (int var5 = 0; var5 < this.field3301.length; var5++) {
                var3.method2661(this.field3301[var5], this.field3302[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ii.k(I)Z")
    public boolean method4211() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3297[var2] != -1 && !Statics.field3305.method3902(this.field3297[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ii.c(I)Len;")
    public class131 method4205() {
        class131[] var1 = new class131[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3297[var3] != -1) {
                var1[var2++] = class131.method2647(Statics.field3305, this.field3297[var3], 0);
            }
        }
        class131 var4 = new class131(var1, var2);
        if (this.field3299 != null) {
            for (int var5 = 0; var5 < this.field3299.length; var5++) {
                var4.method2660(this.field3299[var5], this.field3300[var5]);
            }
        }
        if (this.field3301 != null) {
            for (int var6 = 0; var6 < this.field3301.length; var6++) {
                var4.method2661(this.field3301[var6], this.field3302[var6]);
            }
        }
        return var4;
    }
}
