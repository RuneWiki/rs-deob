package deob;

@ObfuscatedName("fg")
public class class149 {

    @ObfuscatedName("fg.aq")
    public long field1691;

    @ObfuscatedName("fg.aw")
    public int field1687 = -1;

    @ObfuscatedName("fg.al")
    public class399 field1685 = new class399();

    public class149(class534 arg0) {
        this.method3054(arg0);
    }

    @ObfuscatedName("fg.aq(Luq;I)V")
    public void method3054(class534 arg0) {
        this.field1691 = arg0.method8598();
        this.field1687 = arg0.method8597();
        for (int var2 = arg0.method8591(); var2 != 0; var2 = arg0.method8591()) {
            class146 var3;
            if (var2 == 3) {
                var3 = new class168(this);
            } else if (var2 == 1) {
                var3 = new class144(this);
            } else if (var2 == 13) {
                var3 = new class161(this);
            } else if (var2 == 4) {
                var3 = new class153(this);
            } else if (var2 == 6) {
                var3 = new class160(this);
            } else if (var2 == 5) {
                var3 = new class145(this);
            } else if (var2 == 2) {
                var3 = new class150(this);
            } else if (var2 == 7) {
                var3 = new class143(this);
            } else if (var2 == 14) {
                var3 = new class147(this);
            } else if (var2 == 8) {
                var3 = new class164(this);
            } else if (var2 == 9) {
                var3 = new class170(this);
            } else if (var2 == 10) {
                var3 = new class156(this);
            } else if (var2 == 11) {
                var3 = new class151(this);
            } else if (var2 == 12) {
                var3 = new class155(this);
            } else if (var2 == 15) {
                var3 = new class165(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3033(arg0);
            this.field1685.method6739(var3);
        }
    }

    @ObfuscatedName("fg.aw(Lgt;I)V")
    public void method3049(class157 arg0) {
        if (this.field1691 != arg0.field1745 || this.field1687 != arg0.field1755) {
            throw new RuntimeException("");
        }
        for (class146 var2 = (class146) this.field1685.method6756(); var2 != null; var2 = (class146) this.field1685.method6758()) {
            var2.method3030(arg0);
        }
        arg0.field1755++;
    }
}
