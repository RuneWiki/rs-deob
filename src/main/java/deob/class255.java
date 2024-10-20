package deob;

@ObfuscatedName("im")
public class class255 extends class198 {

    @ObfuscatedName("im.c")
    public static class193 field3403 = new class193(64);

    @ObfuscatedName("im.f")
    public char field3402;

    @ObfuscatedName("im.m")
    public int field3400;

    @ObfuscatedName("im.h")
    public String field3404;

    @ObfuscatedName("im.t")
    public boolean field3405 = true;

    @ObfuscatedName("hl.s(II)Lim;")
    public static class255 method3819(int arg0) {
        class255 var1 = (class255) field3403.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3401.method3840(11, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4156(new class177(var2));
        }
        var3.method4155();
        field3403.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.c(I)V")
    public void method4155() {
    }

    @ObfuscatedName("im.f(Lfs;I)V")
    public void method4156(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4157(arg0, var2);
        }
    }

    @ObfuscatedName("im.m(Lfs;II)V")
    public void method4157(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3402 = class270.method491(arg0.method2966());
        } else if (arg1 == 2) {
            this.field3400 = arg0.method2970();
        } else if (arg1 == 4) {
            this.field3405 = false;
        } else if (arg1 == 5) {
            this.field3404 = arg0.method2973();
        }
    }

    @ObfuscatedName("im.h(I)Z")
    public boolean method4158() {
        return this.field3402 == 's';
    }

    @ObfuscatedName("iz.t(I)V")
    public static void method4049() {
        field3403.method3316();
    }
}
