package deob;

@ObfuscatedName("oj")
public final class class402 {

    @ObfuscatedName("oj.c")
    public int field4440;

    @ObfuscatedName("oj.l")
    public class392[] field4439;

    @ObfuscatedName("oj.s")
    public class392 field4441;

    @ObfuscatedName("oj.e")
    public class392 field4442;

    @ObfuscatedName("oj.r")
    public int field4443 = 0;

    public class402(int arg0) {
        this.field4440 = arg0;
        this.field4439 = new class392[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class392 var3 = this.field4439[var2] = new class392();
            var3.field4300 = var3;
            var3.field4302 = var3;
        }
    }

    @ObfuscatedName("oj.c(J)Loe;")
    public class392 method6456(long arg0) {
        class392 var3 = this.field4439[(int) (arg0 & (long) (this.field4440 - 1))];
        for (this.field4441 = var3.field4300; this.field4441 != var3; this.field4441 = this.field4441.field4300) {
            if (this.field4441.field4301 == arg0) {
                class392 var4 = this.field4441;
                this.field4441 = this.field4441.field4300;
                return var4;
            }
        }
        this.field4441 = null;
        return null;
    }

    @ObfuscatedName("oj.l(Loe;J)V")
    public void method6455(class392 arg0, long arg1) {
        if (arg0.field4302 != null) {
            arg0.method6167();
        }
        class392 var4 = this.field4439[(int) (arg1 & (long) (this.field4440 - 1))];
        arg0.field4302 = var4.field4302;
        arg0.field4300 = var4;
        arg0.field4302.field4300 = arg0;
        arg0.field4300.field4302 = arg0;
        arg0.field4301 = arg1;
    }

    @ObfuscatedName("oj.s()Loe;")
    public class392 method6463() {
        this.field4443 = 0;
        return this.method6457();
    }

    @ObfuscatedName("oj.e()Loe;")
    public class392 method6457() {
        if (this.field4443 > 0 && this.field4439[this.field4443 - 1] != this.field4442) {
            class392 var1 = this.field4442;
            this.field4442 = var1.field4300;
            return var1;
        }
        class392 var2;
        do {
            if (this.field4443 >= this.field4440) {
                return null;
            }
            var2 = this.field4439[this.field4443++].field4300;
        } while (this.field4439[this.field4443 - 1] == var2);
        this.field4442 = var2.field4300;
        return var2;
    }
}
