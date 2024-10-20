package deob;

@ObfuscatedName("eo")
public class class133 {

    @ObfuscatedName("eo.c")
    public long field1582;

    @ObfuscatedName("eo.p")
    public int field1577 = -1;

    @ObfuscatedName("eo.f")
    public class338 field1578 = new class338();

    public class133(class445 arg0) {
        this.method2855(arg0);
    }

    @ObfuscatedName("eo.c(Lqq;I)V")
    public void method2855(class445 arg0) {
        this.field1582 = arg0.method7319();
        this.field1577 = arg0.method7201();
        for (int var2 = arg0.method7196(); var2 != 0; var2 = arg0.method7196()) {
            class130 var3;
            if (var2 == 3) {
                var3 = new class152(this);
            } else if (var2 == 1) {
                var3 = new class128(this);
            } else if (var2 == 13) {
                var3 = new class145(this);
            } else if (var2 == 4) {
                var3 = new class137(this);
            } else if (var2 == 6) {
                var3 = new class144(this);
            } else if (var2 == 5) {
                var3 = new class129(this);
            } else if (var2 == 2) {
                var3 = new class134(this);
            } else if (var2 == 7) {
                var3 = new class127(this);
            } else if (var2 == 14) {
                var3 = new class131(this);
            } else if (var2 == 8) {
                var3 = new class148(this);
            } else if (var2 == 9) {
                var3 = new class154(this);
            } else if (var2 == 10) {
                var3 = new class140(this);
            } else if (var2 == 11) {
                var3 = new class135(this);
            } else if (var2 == 12) {
                var3 = new class139(this);
            } else if (var2 == 15) {
                var3 = new class149(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2833(arg0);
            this.field1578.method5704(var3);
        }
    }

    @ObfuscatedName("eo.p(Led;B)V")
    public void method2853(class141 arg0) {
        if (this.field1582 != arg0.field1627 || this.field1577 != arg0.field1631) {
            throw new RuntimeException("");
        }
        for (class130 var2 = (class130) this.field1578.method5708(); var2 != null; var2 = (class130) this.field1578.method5695()) {
            var2.method2837(arg0);
        }
        arg0.field1631++;
    }
}
