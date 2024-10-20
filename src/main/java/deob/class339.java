package deob;

@ObfuscatedName("mx")
public class class339 {

    @ObfuscatedName("mx.c")
    public class406 field4175 = new class406();

    @ObfuscatedName("mx.p")
    public class406 field4174;

    public class339() {
        this.field4175.field4496 = this.field4175;
        this.field4175.field4495 = this.field4175;
    }

    @ObfuscatedName("mx.c(Loy;)V")
    public void method5772(class406 arg0) {
        if (arg0.field4495 != null) {
            arg0.method6649();
        }
        arg0.field4495 = this.field4175.field4495;
        arg0.field4496 = this.field4175;
        arg0.field4495.field4496 = arg0;
        arg0.field4496.field4495 = arg0;
    }

    @ObfuscatedName("mx.p()Loy;")
    public class406 method5774() {
        class406 var1 = this.field4175.field4496;
        if (this.field4175 == var1) {
            this.field4174 = null;
            return null;
        } else {
            this.field4174 = var1.field4496;
            return var1;
        }
    }

    @ObfuscatedName("mx.f()Loy;")
    public class406 method5781() {
        class406 var1 = this.field4174;
        if (this.field4175 == var1) {
            this.field4174 = null;
            return null;
        } else {
            this.field4174 = var1.field4496;
            return var1;
        }
    }
}
