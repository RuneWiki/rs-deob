package deob;

@ObfuscatedName("ed")
public class class144 {

    @ObfuscatedName("ed.c")
    public long field1641;

    @ObfuscatedName("ed.l")
    public long field1640 = -1L;

    @ObfuscatedName("ed.s")
    public class328 field1643 = new class328();

    public class144(class421 arg0) {
        this.method2704(arg0);
    }

    @ObfuscatedName("ed.c(Lpi;I)V")
    public void method2704(class421 arg0) {
        this.field1641 = arg0.method6670();
        this.field1640 = arg0.method6670();
        for (int var2 = arg0.method6686(); var2 != 0; var2 = arg0.method6686()) {
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
            var3.method2616(arg0);
            this.field1643.method5347(var3);
        }
    }

    @ObfuscatedName("ed.l(Leg;B)V")
    public void method2705(class147 arg0) {
        if (this.field1641 != arg0.field4301 || this.field1640 != arg0.field1661) {
            throw new RuntimeException("");
        }
        for (class143 var2 = (class143) this.field1643.method5311(); var2 != null; var2 = (class143) this.field1643.method5313()) {
            var2.method2621(arg0);
        }
        arg0.field1661++;
    }
}
