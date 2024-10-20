package deob;

@ObfuscatedName("gq")
public class class199 {

    @ObfuscatedName("gq.e")
    public class211 field3134 = new class211();

    @ObfuscatedName("gq.l")
    public class211 field3135;

    public class199() {
        this.field3134.field3160 = this.field3134;
        this.field3134.field3161 = this.field3134;
    }

    @ObfuscatedName("gq.e(Lhm;)V")
    public void method3612(class211 arg0) {
        if (arg0.field3161 != null) {
            arg0.method3752();
        }
        arg0.field3161 = this.field3134.field3161;
        arg0.field3160 = this.field3134;
        arg0.field3161.field3160 = arg0;
        arg0.field3160.field3161 = arg0;
    }

    @ObfuscatedName("gq.l()Lhm;")
    public class211 method3616() {
        class211 var1 = this.field3134.field3160;
        if (this.field3134 == var1) {
            this.field3135 = null;
            return null;
        } else {
            this.field3135 = var1.field3160;
            return var1;
        }
    }

    @ObfuscatedName("gq.c()Lhm;")
    public class211 method3610() {
        class211 var1 = this.field3135;
        if (this.field3134 == var1) {
            this.field3135 = null;
            return null;
        } else {
            this.field3135 = var1.field3160;
            return var1;
        }
    }
}
