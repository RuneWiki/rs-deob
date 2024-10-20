package deob;

@ObfuscatedName("ex")
public class class143 {

    @ObfuscatedName("ex.f")
    public long field1665;

    @ObfuscatedName("ex.w")
    public int field1668 = -1;

    @ObfuscatedName("ex.v")
    public class358 field1662 = new class358();

    public class143(class474 arg0) {
        this.method2998(arg0);
    }

    @ObfuscatedName("ex.f(Lrd;B)V")
    public void method2998(class474 arg0) {
        this.field1665 = arg0.method8151();
        this.field1668 = arg0.method7979();
        for (int var2 = arg0.method7964(); var2 != 0; var2 = arg0.method7964()) {
            class140 var3;
            if (var2 == 3) {
                var3 = new class162(this);
            } else if (var2 == 1) {
                var3 = new class138(this);
            } else if (var2 == 13) {
                var3 = new class155(this);
            } else if (var2 == 4) {
                var3 = new class147(this);
            } else if (var2 == 6) {
                var3 = new class154(this);
            } else if (var2 == 5) {
                var3 = new class139(this);
            } else if (var2 == 2) {
                var3 = new class144(this);
            } else if (var2 == 7) {
                var3 = new class137(this);
            } else if (var2 == 14) {
                var3 = new class141(this);
            } else if (var2 == 8) {
                var3 = new class158(this);
            } else if (var2 == 9) {
                var3 = new class164(this);
            } else if (var2 == 10) {
                var3 = new class150(this);
            } else if (var2 == 11) {
                var3 = new class145(this);
            } else if (var2 == 12) {
                var3 = new class149(this);
            } else if (var2 == 15) {
                var3 = new class159(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2984(arg0);
            this.field1662.method6285(var3);
        }
    }

    @ObfuscatedName("ex.w(Leb;B)V")
    public void method2999(class151 arg0) {
        if (this.field1665 != arg0.field1718 || this.field1668 != arg0.field1719) {
            throw new RuntimeException("");
        }
        for (class140 var2 = (class140) this.field1662.method6318(); var2 != null; var2 = (class140) this.field1662.method6290()) {
            var2.method2983(arg0);
        }
        arg0.field1719++;
    }
}
