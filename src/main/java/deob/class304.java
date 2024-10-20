package deob;

@ObfuscatedName("lt")
public final class class304 {

    @ObfuscatedName("lt.az")
    public class489 field3187 = new class489();

    @ObfuscatedName("lt.ah")
    public int field3188;

    @ObfuscatedName("lt.af")
    public int field3189;

    @ObfuscatedName("lt.at")
    public class508 field3190;

    @ObfuscatedName("lt.an")
    public class403 field3191 = new class403();

    public class304(int arg0) {
        this.field3188 = arg0;
        this.field3189 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3190 = new class508(var2);
    }

    @ObfuscatedName("lt.az(J)Lst;")
    public class489 method5336(long arg0) {
        class489 var3 = (class489) this.field3190.method8177(arg0);
        if (var3 != null) {
            this.field3191.method6759(var3);
        }
        return var3;
    }

    @ObfuscatedName("lt.ah(J)V")
    public void method5337(long arg0) {
        class489 var3 = (class489) this.field3190.method8177(arg0);
        if (var3 != null) {
            var3.method7855();
            var3.method7853();
            this.field3189++;
        }
    }

    @ObfuscatedName("lt.af(Lst;J)V")
    public void method5346(class489 arg0, long arg1) {
        if (this.field3189 == 0) {
            class489 var4 = this.field3191.method6744();
            var4.method7855();
            var4.method7853();
            if (this.field3187 == var4) {
                class489 var5 = this.field3191.method6744();
                var5.method7855();
                var5.method7853();
            }
        } else {
            this.field3189--;
        }
        this.field3190.method8200(arg0, arg1);
        this.field3191.method6759(arg0);
    }

    @ObfuscatedName("lt.at()V")
    public void method5339() {
        this.field3191.method6741();
        this.field3190.method8180();
        this.field3187 = new class489();
        this.field3189 = this.field3188;
    }
}
