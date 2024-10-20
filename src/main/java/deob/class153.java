package deob;

@ObfuscatedName("ex")
public class class153 extends class365 {

    @ObfuscatedName("ex.f")
    public static class236 field1617 = new class236(64);

    @ObfuscatedName("ex.j")
    public int field1618 = 0;

    @ObfuscatedName("bx.l(II)Lex;")
    public static class153 method1031(int arg0) {
        class153 var1 = (class153) field1617.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4032.method4756(16, arg0);
        class153 var3 = new class153();
        if (var2 != null) {
            var3.method2642(new class401(var2));
        }
        field1617.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ex.q(Lot;B)V")
    public void method2642(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2640(arg0, var2);
        }
    }

    @ObfuscatedName("ex.f(Lot;II)V")
    public void method2640(class401 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1618 = arg0.method6284();
        }
    }

    @ObfuscatedName("ck.j(B)V")
    public static void method2288() {
        field1617.method4226();
    }
}
