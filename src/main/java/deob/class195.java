package deob;

@ObfuscatedName("gb")
public class class195 {

    @ObfuscatedName("gb.o")
    public class207 field3071 = new class207();

    @ObfuscatedName("gb.f")
    public class207 field3070;

    public class195() {
        this.field3071.field3095 = this.field3071;
        this.field3071.field3096 = this.field3071;
    }

    @ObfuscatedName("gb.o(Lgg;)V")
    public void method3473(class207 arg0) {
        if (arg0.field3096 != null) {
            arg0.method3602();
        }
        arg0.field3096 = this.field3071.field3096;
        arg0.field3095 = this.field3071;
        arg0.field3096.field3095 = arg0;
        arg0.field3095.field3096 = arg0;
    }

    @ObfuscatedName("gb.f()Lgg;")
    public class207 method3474() {
        class207 var1 = this.field3071.field3095;
        if (this.field3071 == var1) {
            this.field3070 = null;
            return null;
        } else {
            this.field3070 = var1.field3095;
            return var1;
        }
    }

    @ObfuscatedName("gb.i()Lgg;")
    public class207 method3475() {
        class207 var1 = this.field3070;
        if (this.field3071 == var1) {
            this.field3070 = null;
            return null;
        } else {
            this.field3070 = var1.field3095;
            return var1;
        }
    }
}
