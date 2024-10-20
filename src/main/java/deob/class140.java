package deob;

@ObfuscatedName("em")
public class class140 {

    @ObfuscatedName("em.h")
    public long field1675;

    @ObfuscatedName("em.e")
    public int field1669 = -1;

    @ObfuscatedName("em.v")
    public class354 field1670 = new class354();

    public class140(class467 arg0) {
        this.method2902(arg0);
    }

    @ObfuscatedName("em.h(Lqy;I)V")
    public void method2902(class467 arg0) {
        this.field1675 = arg0.method7958();
        this.field1669 = arg0.method7946();
        for (int var2 = arg0.method7792(); var2 != 0; var2 = arg0.method7792()) {
            class137 var3;
            if (var2 == 3) {
                var3 = new class159(this);
            } else if (var2 == 1) {
                var3 = new class135(this);
            } else if (var2 == 13) {
                var3 = new class152(this);
            } else if (var2 == 4) {
                var3 = new class144(this);
            } else if (var2 == 6) {
                var3 = new class151(this);
            } else if (var2 == 5) {
                var3 = new class136(this);
            } else if (var2 == 2) {
                var3 = new class141(this);
            } else if (var2 == 7) {
                var3 = new class134(this);
            } else if (var2 == 14) {
                var3 = new class138(this);
            } else if (var2 == 8) {
                var3 = new class155(this);
            } else if (var2 == 9) {
                var3 = new class161(this);
            } else if (var2 == 10) {
                var3 = new class147(this);
            } else if (var2 == 11) {
                var3 = new class142(this);
            } else if (var2 == 12) {
                var3 = new class146(this);
            } else if (var2 == 15) {
                var3 = new class156(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2882(arg0);
            this.field1670.method6143(var3);
        }
    }

    @ObfuscatedName("em.e(Lep;I)V")
    public void method2903(class148 arg0) {
        if (this.field1675 != arg0.field1724 || this.field1669 != arg0.field1747) {
            throw new RuntimeException("");
        }
        for (class137 var2 = (class137) this.field1670.method6176(); var2 != null; var2 = (class137) this.field1670.method6136()) {
            var2.method2881(arg0);
        }
        arg0.field1747++;
    }
}
