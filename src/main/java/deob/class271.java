package deob;

@ObfuscatedName("jq")
public class class271 extends class219 {

    @ObfuscatedName("jq.i")
    public static class213 field3475 = new class213(64);

    @ObfuscatedName("jq.o")
    public boolean field3476 = false;

    @ObfuscatedName("e.c(II)Ljq;")
    public static class271 method71(int arg0) {
        class271 var1 = (class271) field3475.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3474.method4190(19, arg0);
        class271 var3 = new class271();
        if (var2 != null) {
            var3.method4401(new class195(var2));
        }
        field3475.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.i(Lgp;I)V")
    public void method4401(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4400(arg0, var2);
        }
    }

    @ObfuscatedName("jq.o(Lgp;IB)V")
    public void method4400(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3476 = true;
        }
    }
}
