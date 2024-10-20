package deob;

@ObfuscatedName("iu")
public class class249 extends class195 {

    @ObfuscatedName("iu.m")
    public static class190 field3338 = new class190(64);

    @ObfuscatedName("iu.g")
    public static class190 field3339 = new class190(64);

    @ObfuscatedName("iu.d")
    public int field3340;

    @ObfuscatedName("iu.f")
    public int field3343 = 255;

    @ObfuscatedName("iu.j")
    public int field3344 = 255;

    @ObfuscatedName("iu.q")
    public int field3342 = -1;

    @ObfuscatedName("iu.h")
    public int field3345 = 1;

    @ObfuscatedName("iu.i")
    public int field3346 = 70;

    @ObfuscatedName("iu.s")
    public int field3347 = -1;

    @ObfuscatedName("iu.n")
    public int field3348 = -1;

    @ObfuscatedName("iu.c")
    public int field3341 = 30;

    @ObfuscatedName("iu.v")
    public int field3350 = 0;

    @ObfuscatedName("iu.e(Lfw;B)V")
    public void method4035(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4025(arg0, var2);
        }
    }

    @ObfuscatedName("iu.o(Lfw;IB)V")
    public void method4025(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2930();
        } else if (arg1 == 2) {
            this.field3343 = arg0.method2891();
        } else if (arg1 == 3) {
            this.field3344 = arg0.method2891();
        } else if (arg1 == 4) {
            this.field3342 = 0;
        } else if (arg1 == 5) {
            this.field3346 = arg0.method2930();
        } else if (arg1 == 6) {
            arg0.method2891();
        } else if (arg1 == 7) {
            this.field3347 = arg0.method3012();
        } else if (arg1 == 8) {
            this.field3348 = arg0.method3012();
        } else if (arg1 == 11) {
            this.field3342 = arg0.method2930();
        } else if (arg1 == 14) {
            this.field3341 = arg0.method2891();
        } else if (arg1 == 15) {
            this.field3350 = arg0.method2891();
        }
    }

    @ObfuscatedName("iu.m(I)Lje;")
    public class286 method4026() {
        if (this.field3347 < 0) {
            return null;
        }
        class286 var1 = (class286) field3339.method3248((long) this.field3347);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4552(Statics.field3337, this.field3347, 0);
        if (var2 != null) {
            field3339.method3250(var2, (long) this.field3347);
        }
        return var2;
    }

    @ObfuscatedName("iu.g(I)Lje;")
    public class286 method4028() {
        if (this.field3348 < 0) {
            return null;
        }
        class286 var1 = (class286) field3339.method3248((long) this.field3348);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method4552(Statics.field3337, this.field3348, 0);
        if (var2 != null) {
            field3339.method3250(var2, (long) this.field3348);
        }
        return var2;
    }
}
