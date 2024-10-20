package deob;

@ObfuscatedName("gi")
public class class162 {

    @ObfuscatedName("gi.at")
    public long field1757;

    @ObfuscatedName("gi.ah")
    public long field1753 = -1L;

    @ObfuscatedName("gi.ar")
    public class392 field1754 = new class392();

    public class162(class527 arg0) {
        this.method3163(arg0);
    }

    @ObfuscatedName("gi.at(Luj;B)V")
    public void method3163(class527 arg0) {
        this.field1757 = arg0.method8417();
        this.field1753 = arg0.method8417();
        for (int var2 = arg0.method8410(); var2 != 0; var2 = arg0.method8410()) {
            class161 var3;
            if (var2 == 1) {
                var3 = new class157(this);
            } else if (var2 == 4) {
                var3 = new class168(this);
            } else if (var2 == 3) {
                var3 = new class153(this);
            } else if (var2 == 2) {
                var3 = new class151(this);
            } else if (var2 == 5) {
                var3 = new class158(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3069(arg0);
            this.field1754.method6601(var3);
        }
    }

    @ObfuscatedName("gi.ah(Lgn;I)V")
    public void method3164(class165 arg0) {
        if (this.field1757 != arg0.field4849 || this.field1753 != arg0.field1773) {
            throw new RuntimeException("");
        }
        for (class161 var2 = (class161) this.field1754.method6604(); var2 != null; var2 = (class161) this.field1754.method6606()) {
            var2.method3070(arg0);
        }
        arg0.field1773++;
    }
}
