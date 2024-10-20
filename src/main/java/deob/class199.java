package deob;

@ObfuscatedName("gp")
public class class199 {

    @ObfuscatedName("gp.s")
    public class211 field3139 = new class211();

    @ObfuscatedName("gp.z")
    public class211 field3138;

    public class199() {
        this.field3139.field3165 = this.field3139;
        this.field3139.field3164 = this.field3139;
    }

    @ObfuscatedName("gp.s(Lhe;)V")
    public void method3547(class211 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3696();
        }
        arg0.field3164 = this.field3139.field3164;
        arg0.field3165 = this.field3139;
        arg0.field3164.field3165 = arg0;
        arg0.field3165.field3164 = arg0;
    }

    @ObfuscatedName("gp.z()Lhe;")
    public class211 method3548() {
        class211 var1 = this.field3139.field3165;
        if (this.field3139 == var1) {
            this.field3138 = null;
            return null;
        } else {
            this.field3138 = var1.field3165;
            return var1;
        }
    }

    @ObfuscatedName("gp.t()Lhe;")
    public class211 method3550() {
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
