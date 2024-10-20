package deob;

@ObfuscatedName("on")
public final class class397 {

    @ObfuscatedName("on.c")
    public int field4389;

    @ObfuscatedName("on.b")
    public class387[] field4390;

    @ObfuscatedName("on.p")
    public class387 field4391;

    @ObfuscatedName("on.m")
    public class387 field4392;

    @ObfuscatedName("on.t")
    public int field4393 = 0;

    public class397(int arg0) {
        this.field4389 = arg0;
        this.field4390 = new class387[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class387 var3 = this.field4390[var2] = new class387();
            var3.field4258 = var3;
            var3.field4259 = var3;
        }
    }

    @ObfuscatedName("on.c(J)Lnw;")
    public class387 method6446(long arg0) {
        class387 var3 = this.field4390[(int) (arg0 & (long) (this.field4389 - 1))];
        for (this.field4391 = var3.field4258; this.field4391 != var3; this.field4391 = this.field4391.field4258) {
            if (this.field4391.field4257 == arg0) {
                class387 var4 = this.field4391;
                this.field4391 = this.field4391.field4258;
                return var4;
            }
        }
        this.field4391 = null;
        return null;
    }

    @ObfuscatedName("on.b(Lnw;J)V")
    public void method6447(class387 arg0, long arg1) {
        if (arg0.field4259 != null) {
            arg0.method6163();
        }
        class387 var4 = this.field4390[(int) (arg1 & (long) (this.field4389 - 1))];
        arg0.field4259 = var4.field4259;
        arg0.field4258 = var4;
        arg0.field4259.field4258 = arg0;
        arg0.field4258.field4259 = arg0;
        arg0.field4257 = arg1;
    }

    @ObfuscatedName("on.p()Lnw;")
    public class387 method6448() {
        this.field4393 = 0;
        return this.method6445();
    }

    @ObfuscatedName("on.m()Lnw;")
    public class387 method6445() {
        if (this.field4393 > 0 && this.field4390[this.field4393 - 1] != this.field4392) {
            class387 var1 = this.field4392;
            this.field4392 = var1.field4258;
            return var1;
        }
        class387 var2;
        do {
            if (this.field4393 >= this.field4389) {
                return null;
            }
            var2 = this.field4390[this.field4393++].field4258;
        } while (this.field4390[this.field4393 - 1] == var2);
        this.field4392 = var2.field4258;
        return var2;
    }
}
