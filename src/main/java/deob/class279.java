package deob;

@ObfuscatedName("jp")
public class class279 extends class219 {

    @ObfuscatedName("jp.k")
    public static class213 field3547 = new class213(64);

    @ObfuscatedName("jp.t")
    public char field3549;

    @ObfuscatedName("jp.d")
    public int field3546;

    @ObfuscatedName("jp.h")
    public String field3550;

    @ObfuscatedName("jp.m")
    public boolean field3551 = true;

    @ObfuscatedName("jj.o(IB)Ljp;")
    public static class279 method4491(int arg0) {
        class279 var1 = (class279) field3547.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3548.method4241(11, arg0);
        class279 var3 = new class279();
        if (var2 != null) {
            var3.method4515(new class195(var2));
        }
        var3.method4514();
        field3547.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.k(I)V")
    public void method4514() {
    }

    @ObfuscatedName("jp.t(Lgc;I)V")
    public void method4515(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4516(arg0, var2);
        }
    }

    @ObfuscatedName("jp.d(Lgc;II)V")
    public void method4516(class195 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3210();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class315.field3920[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3549 = var6;
        } else if (arg1 == 2) {
            this.field3546 = arg0.method3254();
        } else if (arg1 == 4) {
            this.field3551 = false;
        } else if (arg1 == 5) {
            this.field3550 = arg0.method3284();
        }
    }

    @ObfuscatedName("jp.h(B)Z")
    public boolean method4530() {
        return this.field3549 == 's';
    }

    @ObfuscatedName("ch.m(I)V")
    public static void method1827() {
        field3547.method3604();
    }
}
