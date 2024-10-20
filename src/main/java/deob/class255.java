package deob;

@ObfuscatedName("iz")
public class class255 extends class196 {

    @ObfuscatedName("iz.h")
    public static class191 field3389 = new class191(64);

    @ObfuscatedName("iz.f")
    public char field3388;

    @ObfuscatedName("iz.p")
    public char field3391;

    @ObfuscatedName("iz.x")
    public String field3392 = "null";

    @ObfuscatedName("iz.g")
    public int field3393;

    @ObfuscatedName("iz.c")
    public int field3394 = 0;

    @ObfuscatedName("iz.l")
    public int[] field3395;

    @ObfuscatedName("iz.w")
    public int[] field3390;

    @ObfuscatedName("iz.b")
    public String[] field3396;

    @ObfuscatedName("ew.j(Lia;I)V")
    public static void method2684(class237 arg0) {
        Statics.field3397 = arg0;
    }

    @ObfuscatedName("hu.h(II)Liz;")
    public static class255 method3758(int arg0) {
        class255 var1 = (class255) field3389.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3397.method3773(8, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4143(new class175(var2));
        }
        field3389.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.f(Lfb;I)V")
    public void method4143(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4142(arg0, var2);
        }
    }

    @ObfuscatedName("iz.p(Lfb;II)V")
    public void method4142(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3388 = (char) arg0.method2903();
        } else if (arg1 == 2) {
            this.field3391 = (char) arg0.method2903();
        } else if (arg1 == 3) {
            this.field3392 = arg0.method2911();
        } else if (arg1 == 4) {
            this.field3393 = arg0.method2908();
        } else if (arg1 == 5) {
            this.field3394 = arg0.method3023();
            this.field3395 = new int[this.field3394];
            this.field3396 = new String[this.field3394];
            for (int var3 = 0; var3 < this.field3394; var3++) {
                this.field3395[var3] = arg0.method2908();
                this.field3396[var3] = arg0.method2911();
            }
        } else if (arg1 == 6) {
            this.field3394 = arg0.method3023();
            this.field3395 = new int[this.field3394];
            this.field3390 = new int[this.field3394];
            for (int var4 = 0; var4 < this.field3394; var4++) {
                this.field3395[var4] = arg0.method2908();
                this.field3390[var4] = arg0.method2908();
            }
        }
    }
}
