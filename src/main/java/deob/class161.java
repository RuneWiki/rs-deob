package deob;

@ObfuscatedName("gg")
public class class161 {

    @ObfuscatedName("gg.au")
    public long field1783;

    @ObfuscatedName("gg.ae")
    public long field1782 = -1L;

    @ObfuscatedName("gg.ao")
    public class380 field1781 = new class380();

    public class161(class515 arg0) {
        this.method3059(arg0);
    }

    @ObfuscatedName("gg.au(Ltm;I)V")
    public void method3059(class515 arg0) {
        this.field1783 = arg0.method8307();
        this.field1782 = arg0.method8307();
        for (int var2 = arg0.method8300(); var2 != 0; var2 = arg0.method8300()) {
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
            var3.method2976(arg0);
            this.field1781.method6439(var3);
        }
    }

    @ObfuscatedName("gg.ae(Lgo;B)V")
    public void method3060(class164 arg0) {
        if (this.field1783 != arg0.field4814 || this.field1782 != arg0.field1809) {
            throw new RuntimeException("");
        }
        for (class160 var2 = (class160) this.field1781.method6457(); var2 != null; var2 = (class160) this.field1781.method6443()) {
            var2.method2975(arg0);
        }
        arg0.field1809++;
    }
}
