package deob;

@ObfuscatedName("is")
public class class250 extends class176 {

    @ObfuscatedName("is.j")
    public static class146 field3283 = new class146(64);

    @ObfuscatedName("is.i")
    public char field3284;

    @ObfuscatedName("is.k")
    public int field3287;

    @ObfuscatedName("is.u")
    public String field3286;

    @ObfuscatedName("is.n")
    public boolean field3285 = true;

    @ObfuscatedName("ip.s(II)Lis;")
    public static class250 method4003(int arg0) {
        class250 var1 = (class250) field3283.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4042.method3790(11, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4106(new class300(var2));
        }
        var3.method4096();
        field3283.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.j(I)V")
    public void method4096() {
    }

    @ObfuscatedName("is.i(Lky;I)V")
    public void method4106(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4109(arg0, var2);
        }
    }

    @ObfuscatedName("is.k(Lky;II)V")
    public void method4109(class300 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5034();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class288.field3626[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3284 = var6;
        } else if (arg1 == 2) {
            this.field3287 = arg0.method5056();
        } else if (arg1 == 4) {
            this.field3285 = false;
        } else if (arg1 == 5) {
            this.field3286 = arg0.method5150();
        }
    }

    @ObfuscatedName("is.u(B)Z")
    public boolean method4098() {
        return this.field3284 == 's';
    }
}
