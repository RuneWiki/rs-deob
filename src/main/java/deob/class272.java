package deob;

@ObfuscatedName("jr")
public class class272 extends class215 {

    @ObfuscatedName("jr.q")
    public static class210 field3475 = new class210(64);

    @ObfuscatedName("jr.o")
    public char field3479;

    @ObfuscatedName("jr.p")
    public int field3478;

    @ObfuscatedName("jr.a")
    public String field3476;

    @ObfuscatedName("jr.h")
    public boolean field3480 = true;

    @ObfuscatedName("aj.b(Lie;I)V")
    public static void method252(class256 arg0) {
        Statics.field3477 = arg0;
    }

    @ObfuscatedName("fl.q(II)Ljr;")
    public static class272 method2932(int arg0) {
        class272 var1 = (class272) field3475.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3477.method4158(11, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4464(new class194(var2));
        }
        var3.method4465();
        field3475.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jr.o(B)V")
    public void method4465() {
    }

    @ObfuscatedName("jr.p(Lgn;B)V")
    public void method4464(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4467(arg0, var2);
        }
    }

    @ObfuscatedName("jr.a(Lgn;IB)V")
    public void method4467(class194 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3479 = class301.method2829(arg0.method3248());
        } else if (arg1 == 2) {
            this.field3478 = arg0.method3261();
        } else if (arg1 == 4) {
            this.field3480 = false;
        } else if (arg1 == 5) {
            this.field3476 = arg0.method3256();
        }
    }

    @ObfuscatedName("jr.h(I)Z")
    public boolean method4480() {
        return this.field3479 == 's';
    }
}
