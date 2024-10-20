package deob;

@ObfuscatedName("fr")
public class class147 {

    @ObfuscatedName("fr.aw")
    public long field1662;

    @ObfuscatedName("fr.ay")
    public int field1661 = -1;

    @ObfuscatedName("fr.ar")
    public class381 field1658 = new class381();

    public class147(class514 arg0) {
        this.method2972(arg0);
    }

    @ObfuscatedName("fr.aw(Lty;I)V")
    public void method2972(class514 arg0) {
        this.field1662 = arg0.method8251();
        this.field1661 = arg0.method8496();
        for (int var2 = arg0.method8244(); var2 != 0; var2 = arg0.method8244()) {
            class144 var3;
            if (var2 == 3) {
                var3 = new class166(this);
            } else if (var2 == 1) {
                var3 = new class142(this);
            } else if (var2 == 13) {
                var3 = new class159(this);
            } else if (var2 == 4) {
                var3 = new class151(this);
            } else if (var2 == 6) {
                var3 = new class158(this);
            } else if (var2 == 5) {
                var3 = new class143(this);
            } else if (var2 == 2) {
                var3 = new class148(this);
            } else if (var2 == 7) {
                var3 = new class141(this);
            } else if (var2 == 14) {
                var3 = new class145(this);
            } else if (var2 == 8) {
                var3 = new class162(this);
            } else if (var2 == 9) {
                var3 = new class168(this);
            } else if (var2 == 10) {
                var3 = new class154(this);
            } else if (var2 == 11) {
                var3 = new class149(this);
            } else if (var2 == 12) {
                var3 = new class153(this);
            } else if (var2 == 15) {
                var3 = new class163(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2950(arg0);
            this.field1658.method6446(var3);
        }
    }

    @ObfuscatedName("fr.ay(Lfx;I)V")
    public void method2976(class155 arg0) {
        if (this.field1662 != arg0.field1705 || this.field1661 != arg0.field1708) {
            throw new RuntimeException("");
        }
        for (class144 var2 = (class144) this.field1658.method6419(); var2 != null; var2 = (class144) this.field1658.method6421()) {
            var2.method2951(arg0);
        }
        arg0.field1708++;
    }
}
