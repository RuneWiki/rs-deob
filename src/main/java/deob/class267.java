package deob;

@ObfuscatedName("je")
public class class267 extends class209 {

    @ObfuscatedName("je.h")
    public static class203 field3383 = new class203(64);

    @ObfuscatedName("je.e")
    public char field3387;

    @ObfuscatedName("je.b")
    public int field3385;

    @ObfuscatedName("je.l")
    public String field3384;

    @ObfuscatedName("je.w")
    public boolean field3382 = true;

    @ObfuscatedName("ee.f(Lie;I)V")
    public static void method2878(class250 arg0) {
        Statics.field3386 = arg0;
    }

    @ObfuscatedName("bj.h(IB)Lje;")
    public static class267 method1645(int arg0) {
        class267 var1 = (class267) field3383.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3386.method4267(11, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4586(new class185(var2));
        }
        var3.method4587();
        field3383.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.e(I)V")
    public void method4587() {
    }

    @ObfuscatedName("je.b(Lgx;I)V")
    public void method4586(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4588(arg0, var2);
        }
    }

    @ObfuscatedName("je.l(Lgx;II)V")
    public void method4588(class185 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3324();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class304.field3778[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3387 = var6;
        } else if (arg1 == 2) {
            this.field3385 = arg0.method3328();
        } else if (arg1 == 4) {
            this.field3382 = false;
        } else if (arg1 == 5) {
            this.field3384 = arg0.method3435();
        }
    }

    @ObfuscatedName("je.w(B)Z")
    public boolean method4590() {
        return this.field3387 == 's';
    }
}
