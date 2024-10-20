package deob;

@ObfuscatedName("fa")
public class class143 {

    @ObfuscatedName("fa.af")
    public long field1662;

    @ObfuscatedName("fa.an")
    public int field1658 = -1;

    @ObfuscatedName("fa.aw")
    public class365 field1659 = new class365();

    public class143(class489 arg0) {
        this.method3046(arg0);
    }

    @ObfuscatedName("fa.af(Lsg;I)V")
    public void method3046(class489 arg0) {
        this.field1662 = arg0.method8271();
        this.field1658 = arg0.method8254();
        for (int var2 = arg0.method8248(); var2 != 0; var2 = arg0.method8248()) {
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
            var3.method3021(arg0);
            this.field1659.method6408(var3);
        }
    }

    @ObfuscatedName("fa.an(Lfj;B)V")
    public void method3037(class151 arg0) {
        if (this.field1662 != arg0.field1730 || this.field1658 != arg0.field1713) {
            throw new RuntimeException("");
        }
        for (class140 var2 = (class140) this.field1659.method6413(); var2 != null; var2 = (class140) this.field1659.method6380()) {
            var2.method3022(arg0);
        }
        arg0.field1713++;
    }
}
