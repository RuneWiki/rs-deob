package deob;

@ObfuscatedName("ji")
public class class264 extends class215 {

    @ObfuscatedName("ji.q")
    public static class210 field3412 = new class210(64);

    @ObfuscatedName("ji.o")
    public boolean field3414 = false;

    @ObfuscatedName("cy.b(Lie;I)V")
    public static void method1751(class256 arg0) {
        Statics.field3413 = arg0;
    }

    @ObfuscatedName("hq.q(IB)Lji;")
    public static class264 method4015(int arg0) {
        class264 var1 = (class264) field3412.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3413.method4158(19, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4368(new class194(var2));
        }
        field3412.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.o(Lgn;I)V")
    public void method4368(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4367(arg0, var2);
        }
    }

    @ObfuscatedName("ji.p(Lgn;II)V")
    public void method4367(class194 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3414 = true;
        }
    }
}
