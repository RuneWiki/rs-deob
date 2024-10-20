package deob;

@ObfuscatedName("fn")
public class class157 {

    @ObfuscatedName("fn.f")
    public long field1776;

    @ObfuscatedName("fn.w")
    public long field1773 = -1L;

    @ObfuscatedName("fn.v")
    public class358 field1774 = new class358();

    public class157(class474 arg0) {
        this.method3107(arg0);
    }

    @ObfuscatedName("fn.f(Lrd;I)V")
    public void method3107(class474 arg0) {
        this.field1776 = arg0.method8151();
        this.field1773 = arg0.method8151();
        for (int var2 = arg0.method7964(); var2 != 0; var2 = arg0.method7964()) {
            class156 var3;
            if (var2 == 1) {
                var3 = new class152(this);
            } else if (var2 == 4) {
                var3 = new class163(this);
            } else if (var2 == 3) {
                var3 = new class148(this);
            } else if (var2 == 2) {
                var3 = new class146(this);
            } else if (var2 == 5) {
                var3 = new class153(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3007(arg0);
            this.field1774.method6285(var3);
        }
    }

    @ObfuscatedName("fn.w(Lfm;B)V")
    public void method3106(class160 arg0) {
        if (this.field1776 != arg0.field4711 || this.field1773 != arg0.field1793) {
            throw new RuntimeException("");
        }
        for (class156 var2 = (class156) this.field1774.method6318(); var2 != null; var2 = (class156) this.field1774.method6290()) {
            var2.method3008(arg0);
        }
        arg0.field1793++;
    }
}
