package deob;

@ObfuscatedName("ee")
public class class134 {

    @ObfuscatedName("ee.l")
    public long field1500;

    @ObfuscatedName("ee.q")
    public long field1495 = -1L;

    @ObfuscatedName("ee.f")
    public class311 field1494 = new class311();

    public class134(class401 arg0) {
        this.method2503(arg0);
    }

    @ObfuscatedName("ee.l(Lot;I)V")
    public void method2503(class401 arg0) {
        this.field1500 = arg0.method6275();
        this.field1495 = arg0.method6275();
        for (int var2 = arg0.method6272(); var2 != 0; var2 = arg0.method6272()) {
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
            var3.method2400(arg0);
            this.field1494.method5089(var3);
        }
    }

    @ObfuscatedName("ee.q(Leb;I)V")
    public void method2500(class137 arg0) {
        if (this.field1500 != arg0.field4075 || this.field1495 != arg0.field1516) {
            throw new RuntimeException("");
        }
        for (class133 var2 = (class133) this.field1494.method5074(); var2 != null; var2 = (class133) this.field1494.method5094()) {
            var2.method2396(arg0);
        }
        arg0.field1516++;
    }
}
