package deob;

@ObfuscatedName("jy")
public class class279 extends class219 {

    @ObfuscatedName("jy.i")
    public static class213 field3546 = new class213(64);

    @ObfuscatedName("jy.o")
    public char field3545;

    @ObfuscatedName("jy.j")
    public int field3544;

    @ObfuscatedName("jy.k")
    public String field3547;

    @ObfuscatedName("jy.x")
    public boolean field3548 = true;

    @ObfuscatedName("client.c(IB)Ljy;")
    public static class279 method1444(int arg0) {
        class279 var1 = (class279) field3546.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3543.method4190(11, arg0);
        class279 var3 = new class279();
        if (var2 != null) {
            var3.method4532(new class195(var2));
        }
        var3.method4530();
        field3546.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.i(I)V")
    public void method4530() {
    }

    @ObfuscatedName("jy.o(Lgp;I)V")
    public void method4532(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4536(arg0, var2);
        }
    }

    @ObfuscatedName("jy.j(Lgp;IB)V")
    public void method4536(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3545 = class315.method1695(arg0.method3226());
        } else if (arg1 == 2) {
            this.field3544 = arg0.method3230();
        } else if (arg1 == 4) {
            this.field3548 = false;
        } else if (arg1 == 5) {
            this.field3547 = arg0.method3427();
        }
    }

    @ObfuscatedName("jy.k(I)Z")
    public boolean method4534() {
        return this.field3545 == 's';
    }

    @ObfuscatedName("ai.x(I)V")
    public static void method259() {
        field3546.method3629();
    }
}
