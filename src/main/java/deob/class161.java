package deob;

@ObfuscatedName("gr")
public class class161 {

    @ObfuscatedName("gr.am")
    public long field1746;

    @ObfuscatedName("gr.ap")
    public long field1745 = -1L;

    @ObfuscatedName("gr.af")
    public class396 field1747 = new class396();

    public class161(class531 arg0) {
        this.method3193(arg0);
    }

    @ObfuscatedName("gr.am(Luk;I)V")
    public void method3193(class531 arg0) {
        this.field1746 = arg0.method8567();
        this.field1745 = arg0.method8567();
        for (int var2 = arg0.method8561(); var2 != 0; var2 = arg0.method8561()) {
            class160 var3;
            if (var2 == 1) {
                var3 = new class156(this);
            } else if (var2 == 4) {
                var3 = new class167(this);
            } else if (var2 == 3) {
                var3 = new class152(this);
            } else if (var2 == 2) {
                var3 = new class150(this);
            } else if (var2 == 5) {
                var3 = new class157(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3093(arg0);
            this.field1747.method6749(var3);
        }
    }

    @ObfuscatedName("gr.ap(Lgt;I)V")
    public void method3194(class164 arg0) {
        if (this.field1746 != arg0.field4889 || this.field1745 != arg0.field1765) {
            throw new RuntimeException("");
        }
        for (class160 var2 = (class160) this.field1747.method6738(); var2 != null; var2 = (class160) this.field1747.method6724()) {
            var2.method3099(arg0);
        }
        arg0.field1765++;
    }
}
