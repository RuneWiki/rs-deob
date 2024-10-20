package deob;

@ObfuscatedName("ii")
public class class259 extends class202 {

    @ObfuscatedName("ii.s")
    public static class197 field3436 = new class197(64);

    @ObfuscatedName("ii.r")
    public char field3441;

    @ObfuscatedName("ii.g")
    public int field3437;

    @ObfuscatedName("ii.x")
    public String field3438;

    @ObfuscatedName("ii.f")
    public boolean field3440 = true;

    @ObfuscatedName("ip.b(II)Lii;")
    public static class259 method3957(int arg0) {
        class259 var1 = (class259) field3436.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3439.method3887(11, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4124(new class181(var2));
        }
        var3.method4123();
        field3436.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.s(I)V")
    public void method4123() {
    }

    @ObfuscatedName("ii.r(Lfs;B)V")
    public void method4124(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4127(arg0, var2);
        }
    }

    @ObfuscatedName("ii.g(Lfs;II)V")
    public void method4127(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3441 = class274.method1699(arg0.method2946());
        } else if (arg1 == 2) {
            this.field3437 = arg0.method2996();
        } else if (arg1 == 4) {
            this.field3440 = false;
        } else if (arg1 == 5) {
            this.field3438 = arg0.method2953();
        }
    }

    @ObfuscatedName("ii.x(I)Z")
    public boolean method4126() {
        return this.field3441 == 's';
    }
}
