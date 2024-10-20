package deob;

@ObfuscatedName("ec")
public class class134 {

    @ObfuscatedName("ec.n")
    public long field1502;

    @ObfuscatedName("ec.c")
    public long field1501 = -1L;

    @ObfuscatedName("ec.m")
    public class311 field1500 = new class311();

    public class134(class400 arg0) {
        this.method2467(arg0);
    }

    @ObfuscatedName("ec.n(Lot;I)V")
    public void method2467(class400 arg0) {
        this.field1502 = arg0.method6223();
        this.field1501 = arg0.method6223();
        for (int var2 = arg0.method6217(); var2 != 0; var2 = arg0.method6217()) {
            class133 var3;
            if (var2 == 1) {
                var3 = new class129(this);
            } else if (var2 == 4) {
                var3 = new class140(this);
            } else if (var2 == 3) {
                var3 = new class125(this);
            } else if (var2 == 2) {
                var3 = new class123(this);
            } else if (var2 == 5) {
                var3 = new class130(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2371(arg0);
            this.field1500.method5004(var3);
        }
    }

    @ObfuscatedName("ec.c(Leb;B)V")
    public void method2462(class137 arg0) {
        if (this.field1502 != arg0.field4056 || this.field1501 != arg0.field1517) {
            throw new RuntimeException("");
        }
        for (class133 var2 = (class133) this.field1500.method5007(); var2 != null; var2 = (class133) this.field1500.method5009()) {
            var2.method2372(arg0);
        }
        arg0.field1517++;
    }
}
