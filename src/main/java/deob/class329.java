package deob;

@ObfuscatedName("lp")
public class class329 {

    @ObfuscatedName("lp.c")
    public class386 field4017 = new class386();

    @ObfuscatedName("lp.l")
    public class386 field4018;

    public class329() {
        this.field4017.field4292 = this.field4017;
        this.field4017.field4291 = this.field4017;
    }

    @ObfuscatedName("lp.c(Lnf;)V")
    public void method5383(class386 arg0) {
        if (arg0.field4291 != null) {
            arg0.method6161();
        }
        arg0.field4291 = this.field4017.field4291;
        arg0.field4292 = this.field4017;
        arg0.field4291.field4292 = arg0;
        arg0.field4292.field4291 = arg0;
    }

    @ObfuscatedName("lp.l()Lnf;")
    public class386 method5384() {
        class386 var1 = this.field4017.field4292;
        if (this.field4017 == var1) {
            this.field4018 = null;
            return null;
        } else {
            this.field4018 = var1.field4292;
            return var1;
        }
    }

    @ObfuscatedName("lp.s()Lnf;")
    public class386 method5388() {
        class386 var1 = this.field4018;
        if (this.field4017 == var1) {
            this.field4018 = null;
            return null;
        } else {
            this.field4018 = var1.field4292;
            return var1;
        }
    }
}
