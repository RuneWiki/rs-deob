package deob;

@ObfuscatedName("eu")
public class class146 {

    @ObfuscatedName("eu.c")
    public long field1676;

    @ObfuscatedName("eu.v")
    public long field1674 = -1L;

    @ObfuscatedName("eu.q")
    public class336 field1677 = new class336();

    public class146(class443 arg0) {
        this.method2825(arg0);
    }

    @ObfuscatedName("eu.c(Lqt;B)V")
    public void method2825(class443 arg0) {
        this.field1676 = arg0.method7106();
        this.field1674 = arg0.method7106();
        for (int var2 = arg0.method7047(); var2 != 0; var2 = arg0.method7047()) {
            class145 var3;
            if (var2 == 1) {
                var3 = new class141(this);
            } else if (var2 == 4) {
                var3 = new class152(this);
            } else if (var2 == 3) {
                var3 = new class137(this);
            } else if (var2 == 2) {
                var3 = new class135(this);
            } else if (var2 == 5) {
                var3 = new class142(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2716(arg0);
            this.field1677.method5589(var3);
        }
    }

    @ObfuscatedName("eu.v(Lex;B)V")
    public void method2826(class149 arg0) {
        if (this.field1676 != arg0.field4462 || this.field1674 != arg0.field1694) {
            throw new RuntimeException("");
        }
        for (class145 var2 = (class145) this.field1677.method5577(); var2 != null; var2 = (class145) this.field1677.method5579()) {
            var2.method2719(arg0);
        }
        arg0.field1694++;
    }
}
