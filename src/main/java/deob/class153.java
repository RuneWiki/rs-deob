package deob;

@ObfuscatedName("em")
public class class153 {

    @ObfuscatedName("em.a")
    public long field1715;

    @ObfuscatedName("em.f")
    public long field1718 = -1L;

    @ObfuscatedName("em.c")
    public class351 field1717 = new class351();

    public class153(class464 arg0) {
        this.method2949(arg0);
    }

    @ObfuscatedName("em.a(Lqr;I)V")
    public void method2949(class464 arg0) {
        this.field1715 = arg0.method7721();
        this.field1718 = arg0.method7721();
        for (int var2 = arg0.method7735(); var2 != 0; var2 = arg0.method7735()) {
            class152 var3;
            if (var2 == 1) {
                var3 = new class148(this);
            } else if (var2 == 4) {
                var3 = new class159(this);
            } else if (var2 == 3) {
                var3 = new class144(this);
            } else if (var2 == 2) {
                var3 = new class142(this);
            } else if (var2 == 5) {
                var3 = new class149(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2858(arg0);
            this.field1717.method6072(var3);
        }
    }

    @ObfuscatedName("em.f(Leq;I)V")
    public void method2944(class156 arg0) {
        if (this.field1715 != arg0.field4635 || this.field1718 != arg0.field1730) {
            throw new RuntimeException("");
        }
        for (class152 var2 = (class152) this.field1717.method6075(); var2 != null; var2 = (class152) this.field1717.method6077()) {
            var2.method2859(arg0);
        }
        arg0.field1730++;
    }
}
