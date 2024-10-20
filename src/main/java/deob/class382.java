package deob;

@ObfuscatedName("om")
public class class382 {

    @ObfuscatedName("om.aw")
    public class469 field4421 = new class469();

    @ObfuscatedName("om.ay")
    public class469 field4420;

    public class382() {
        this.field4421.field4811 = this.field4421;
        this.field4421.field4810 = this.field4421;
    }

    @ObfuscatedName("om.aw(Lsp;)V")
    public void method6489(class469 arg0) {
        if (arg0.field4810 != null) {
            arg0.method7657();
        }
        arg0.field4810 = this.field4421.field4810;
        arg0.field4811 = this.field4421;
        arg0.field4810.field4811 = arg0;
        arg0.field4811.field4810 = arg0;
    }

    @ObfuscatedName("om.ay()Lsp;")
    public class469 method6490() {
        class469 var1 = this.field4421.field4811;
        if (this.field4421 == var1) {
            this.field4420 = null;
            return null;
        } else {
            this.field4420 = var1.field4811;
            return var1;
        }
    }

    @ObfuscatedName("om.ar()Lsp;")
    public class469 method6491() {
        class469 var1 = this.field4420;
        if (this.field4421 == var1) {
            this.field4420 = null;
            return null;
        } else {
            this.field4420 = var1.field4811;
            return var1;
        }
    }
}
