package deob;

@ObfuscatedName("en")
public class class144 {

    @ObfuscatedName("en.c")
    public long field1627;

    @ObfuscatedName("en.b")
    public long field1626 = -1L;

    @ObfuscatedName("en.p")
    public class323 field1619 = new class323();

    public class144(class419 arg0) {
        this.method2719(arg0);
    }

    @ObfuscatedName("en.c(Lpi;I)V")
    public void method2719(class419 arg0) {
        this.field1627 = arg0.method6676();
        this.field1626 = arg0.method6676();
        for (int var2 = arg0.method6781(); var2 != 0; var2 = arg0.method6781()) {
            class143 var3;
            if (var2 == 1) {
                var3 = new class139(this);
            } else if (var2 == 4) {
                var3 = new class150(this);
            } else if (var2 == 3) {
                var3 = new class135(this);
            } else if (var2 == 2) {
                var3 = new class133(this);
            } else if (var2 == 5) {
                var3 = new class140(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2619(arg0);
            this.field1619.method5345(var3);
        }
    }

    @ObfuscatedName("en.b(Lei;B)V")
    public void method2718(class147 arg0) {
        if (this.field1627 != arg0.field4257 || this.field1626 != arg0.field1641) {
            throw new RuntimeException("");
        }
        for (class143 var2 = (class143) this.field1619.method5348(); var2 != null; var2 = (class143) this.field1619.method5350()) {
            var2.method2621(arg0);
        }
        arg0.field1641++;
    }
}
