package deob;

@ObfuscatedName("jp")
public final class class271 {

    @ObfuscatedName("jp.m")
    public class181 field3601 = new class181();

    public class271() {
        this.field3601.field2132 = this.field3601;
        this.field3601.field2131 = this.field3601;
    }

    @ObfuscatedName("jp.m(Lfn;)V")
    public void method4815(class181 arg0) {
        if (arg0.field2131 != null) {
            arg0.method3294();
        }
        arg0.field2131 = this.field3601.field2131;
        arg0.field2132 = this.field3601;
        arg0.field2131.field2132 = arg0;
        arg0.field2132.field2131 = arg0;
    }

    @ObfuscatedName("jp.f(Lfn;)V")
    public void method4810(class181 arg0) {
        if (arg0.field2131 != null) {
            arg0.method3294();
        }
        arg0.field2131 = this.field3601;
        arg0.field2132 = this.field3601.field2132;
        arg0.field2131.field2132 = arg0;
        arg0.field2132.field2131 = arg0;
    }

    @ObfuscatedName("jp.q(Lfn;Lfn;)V")
    public static void method4803(class181 arg0, class181 arg1) {
        if (arg0.field2131 != null) {
            arg0.method3294();
        }
        arg0.field2131 = arg1;
        arg0.field2132 = arg1.field2132;
        arg0.field2131.field2132 = arg0;
        arg0.field2132.field2131 = arg0;
    }

    @ObfuscatedName("jp.w()Lfn;")
    public class181 method4801() {
        class181 var1 = this.field3601.field2132;
        if (this.field3601 == var1) {
            return null;
        } else {
            var1.method3294();
            return var1;
        }
    }

    @ObfuscatedName("jp.o()Lfn;")
    public class181 method4802() {
        class181 var1 = this.field3601.field2132;
        return this.field3601 == var1 ? null : var1;
    }

    @ObfuscatedName("jp.u()V")
    public void method4804() {
        while (true) {
            class181 var1 = this.field3601.field2132;
            if (this.field3601 == var1) {
                return;
            }
            var1.method3294();
        }
    }
}
