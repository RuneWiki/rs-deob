package deob;

@ObfuscatedName("io")
public class class250 extends class176 {

    @ObfuscatedName("io.f")
    public static class146 field3304 = new class146(64);

    @ObfuscatedName("io.b")
    public char field3306;

    @ObfuscatedName("io.g")
    public int field3307;

    @ObfuscatedName("io.z")
    public String field3309;

    @ObfuscatedName("io.p")
    public boolean field3305 = true;

    @ObfuscatedName("ge.u(II)Lio;")
    public static class250 method3538(int arg0) {
        class250 var1 = (class250) field3304.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3308.method3928(11, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4190(new class300(var2));
        }
        var3.method4188();
        field3304.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.f(B)V")
    public void method4188() {
    }

    @ObfuscatedName("io.b(Lkg;B)V")
    public void method4190(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4194(arg0, var2);
        }
    }

    @ObfuscatedName("io.g(Lkg;II)V")
    public void method4194(class300 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5139();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class288.field3648[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3306 = var6;
        } else if (arg1 == 2) {
            this.field3307 = arg0.method5277();
        } else if (arg1 == 4) {
            this.field3305 = false;
        } else if (arg1 == 5) {
            this.field3309 = arg0.method5147();
        }
    }

    @ObfuscatedName("io.z(I)Z")
    public boolean method4191() {
        return this.field3306 == 's';
    }

    @ObfuscatedName("g.p(I)V")
    public static void method22() {
        field3304.method3075();
    }
}
