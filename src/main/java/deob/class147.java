package deob;

@ObfuscatedName("fm")
public class class147 {

    @ObfuscatedName("fm.am")
    public long field1647;

    @ObfuscatedName("fm.ap")
    public int field1646 = -1;

    @ObfuscatedName("fm.af")
    public class396 field1648 = new class396();

    public class147(class531 arg0) {
        this.method3080(arg0);
    }

    @ObfuscatedName("fm.am(Luk;I)V")
    public void method3080(class531 arg0) {
        this.field1647 = arg0.method8567();
        this.field1646 = arg0.method8566();
        for (int var2 = arg0.method8561(); var2 != 0; var2 = arg0.method8561()) {
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
            var3.method3060(arg0);
            this.field1648.method6749(var3);
        }
    }

    @ObfuscatedName("fm.ap(Lfn;S)V")
    public void method3081(class155 arg0) {
        if (this.field1647 != arg0.field1695 || this.field1646 != arg0.field1717) {
            throw new RuntimeException("");
        }
        for (class144 var2 = (class144) this.field1648.method6738(); var2 != null; var2 = (class144) this.field1648.method6724()) {
            var2.method3059(arg0);
        }
        arg0.field1717++;
    }
}
