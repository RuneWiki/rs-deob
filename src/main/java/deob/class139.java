package deob;

@ObfuscatedName("el")
public class class139 {

    @ObfuscatedName("el.a")
    public long field1602;

    @ObfuscatedName("el.f")
    public int field1601 = -1;

    @ObfuscatedName("el.c")
    public class351 field1611 = new class351();

    public class139(class464 arg0) {
        this.method2845(arg0);
    }

    @ObfuscatedName("el.a(Lqr;B)V")
    public void method2845(class464 arg0) {
        this.field1602 = arg0.method7721();
        this.field1601 = arg0.method7720();
        for (int var2 = arg0.method7735(); var2 != 0; var2 = arg0.method7735()) {
            class136 var3;
            if (var2 == 3) {
                var3 = new class158(this);
            } else if (var2 == 1) {
                var3 = new class134(this);
            } else if (var2 == 13) {
                var3 = new class151(this);
            } else if (var2 == 4) {
                var3 = new class143(this);
            } else if (var2 == 6) {
                var3 = new class150(this);
            } else if (var2 == 5) {
                var3 = new class135(this);
            } else if (var2 == 2) {
                var3 = new class140(this);
            } else if (var2 == 7) {
                var3 = new class133(this);
            } else if (var2 == 14) {
                var3 = new class137(this);
            } else if (var2 == 8) {
                var3 = new class154(this);
            } else if (var2 == 9) {
                var3 = new class160(this);
            } else if (var2 == 10) {
                var3 = new class146(this);
            } else if (var2 == 11) {
                var3 = new class141(this);
            } else if (var2 == 12) {
                var3 = new class145(this);
            } else if (var2 == 15) {
                var3 = new class155(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2828(arg0);
            this.field1611.method6072(var3);
        }
    }

    @ObfuscatedName("el.f(Ler;B)V")
    public void method2846(class147 arg0) {
        if (this.field1602 != arg0.field1664 || this.field1601 != arg0.field1665) {
            throw new RuntimeException("");
        }
        for (class136 var2 = (class136) this.field1611.method6075(); var2 != null; var2 = (class136) this.field1611.method6077()) {
            var2.method2834(arg0);
        }
        arg0.field1665++;
    }
}
