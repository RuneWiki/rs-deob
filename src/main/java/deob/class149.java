package deob;

@ObfuscatedName("ff")
public class class149 {

    @ObfuscatedName("ff.ac")
    public long field1670;

    @ObfuscatedName("ff.al")
    public int field1662 = -1;

    @ObfuscatedName("ff.ak")
    public class395 field1663 = new class395();

    public class149(class530 arg0) {
        this.method2986(arg0);
    }

    @ObfuscatedName("ff.ac(Lul;I)V")
    public void method2986(class530 arg0) {
        this.field1670 = arg0.method8573();
        this.field1662 = arg0.method8371();
        for (int var2 = arg0.method8365(); var2 != 0; var2 = arg0.method8365()) {
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
            var3.method2966(arg0);
            this.field1663.method6593(var3);
        }
    }

    @ObfuscatedName("ff.al(Lgi;I)V")
    public void method2982(class157 arg0) {
        if (this.field1670 != arg0.field1704 || this.field1662 != arg0.field1705) {
            throw new RuntimeException("");
        }
        for (class146 var2 = (class146) this.field1663.method6577(); var2 != null; var2 = (class146) this.field1663.method6623()) {
            var2.method2967(arg0);
        }
        arg0.field1705++;
    }
}
