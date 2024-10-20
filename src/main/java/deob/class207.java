package deob;

@ObfuscatedName("gu")
public class class207 {

    @ObfuscatedName("gu.s")
    public class208 field2591 = new class208();

    @ObfuscatedName("gu.g")
    public class208 field2592;

    public class207() {
        this.field2591.field2594 = this.field2591;
        this.field2591.field2593 = this.field2591;
    }

    @ObfuscatedName("gu.s(Lgr;)V")
    public void method3786(class208 arg0) {
        if (arg0.field2593 != null) {
            arg0.method3797();
        }
        arg0.field2593 = this.field2591.field2593;
        arg0.field2594 = this.field2591;
        arg0.field2593.field2594 = arg0;
        arg0.field2594.field2593 = arg0;
    }

    @ObfuscatedName("gu.g()Lgr;")
    public class208 method3790() {
        class208 var1 = this.field2591.field2594;
        if (this.field2591 == var1) {
            this.field2592 = null;
            return null;
        } else {
            this.field2592 = var1.field2594;
            return var1;
        }
    }

    @ObfuscatedName("gu.m()Lgr;")
    public class208 method3787() {
        class208 var1 = this.field2592;
        if (this.field2591 == var1) {
            this.field2592 = null;
            return null;
        } else {
            this.field2592 = var1.field2594;
            return var1;
        }
    }
}
