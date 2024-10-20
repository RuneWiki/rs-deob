package deob;

@ObfuscatedName("jr")
public class class278 extends class219 {

    @ObfuscatedName("jr.q")
    public static class213 field3543 = new class213(64);

    @ObfuscatedName("jr.i")
    public int field3541;

    @ObfuscatedName("jr.a")
    public int field3542;

    @ObfuscatedName("jr.l")
    public int field3545;

    @ObfuscatedName("ji.t(II)Ljr;")
    public static class278 method4361(int arg0) {
        class278 var1 = (class278) field3543.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3544.method4265(14, arg0);
        class278 var3 = new class278();
        if (var2 != null) {
            var3.method4487(new class195(var2));
        }
        field3543.method3627(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jr.q(Lgb;I)V")
    public void method4487(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4491(arg0, var2);
        }
    }

    @ObfuscatedName("jr.i(Lgb;IB)V")
    public void method4491(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3541 = arg0.method3238();
            this.field3542 = arg0.method3236();
            this.field3545 = arg0.method3236();
        }
    }

    @ObfuscatedName("gx.a(I)V")
    public static void method3543() {
        field3543.method3632();
    }
}
