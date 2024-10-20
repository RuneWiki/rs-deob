package deob;

@ObfuscatedName("gc")
public class class199 {

    @ObfuscatedName("gc.f")
    public class211 field3139 = new class211();

    @ObfuscatedName("gc.e")
    public class211 field3138;

    public class199() {
        this.field3139.field3165 = this.field3139;
        this.field3139.field3164 = this.field3139;
    }

    @ObfuscatedName("gc.f(Lhh;)V")
    public void method3593(class211 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3740();
        }
        arg0.field3164 = this.field3139.field3164;
        arg0.field3165 = this.field3139;
        arg0.field3164.field3165 = arg0;
        arg0.field3165.field3164 = arg0;
    }

    @ObfuscatedName("gc.e()Lhh;")
    public class211 method3602() {
        class211 var1 = this.field3139.field3165;
        if (this.field3139 == var1) {
            this.field3138 = null;
            return null;
        } else {
            this.field3138 = var1.field3165;
            return var1;
        }
    }

    @ObfuscatedName("gc.n()Lhh;")
    public class211 method3595() {
        class211 var1 = this.field3138;
        if (this.field3139 == var1) {
            this.field3138 = null;
            return null;
        } else {
            this.field3138 = var1.field3165;
            return var1;
        }
    }
}
