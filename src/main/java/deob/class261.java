package deob;

@ObfuscatedName("ju")
public class class261 extends class185 {

    @ObfuscatedName("ju.b")
    public static class155 field3330 = new class155(64);

    @ObfuscatedName("ju.l")
    public char field3328;

    @ObfuscatedName("ju.m")
    public int field3331;

    @ObfuscatedName("ju.z")
    public String field3332;

    @ObfuscatedName("ju.q")
    public boolean field3333 = true;

    @ObfuscatedName("cb.f(II)Lju;")
    public static class261 method2034(int arg0) {
        class261 var1 = (class261) field3330.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3329.method3905(11, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4260(new class311(var2));
        }
        var3.method4276();
        field3330.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.b(I)V")
    public void method4276() {
    }

    @ObfuscatedName("ju.l(Lkb;I)V")
    public void method4260(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4261(arg0, var2);
        }
    }

    @ObfuscatedName("ju.m(Lkb;II)V")
    public void method4261(class311 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5181();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class299.field3677[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3328 = var6;
        } else if (arg1 == 2) {
            this.field3331 = arg0.method5330();
        } else if (arg1 == 4) {
            this.field3333 = false;
        } else if (arg1 == 5) {
            this.field3332 = arg0.method5189();
        }
    }

    @ObfuscatedName("ju.z(B)Z")
    public boolean method4269() {
        return this.field3328 == 's';
    }
}
