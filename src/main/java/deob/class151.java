package deob;

@ObfuscatedName("fu")
public class class151 {

    @ObfuscatedName("fu.ak")
    public long field1711;

    @ObfuscatedName("fu.al")
    public int field1707 = -1;

    @ObfuscatedName("fu.aj")
    public class408 field1712 = new class408();

    public class151(class546 arg0) {
        this.method3075(arg0);
    }

    @ObfuscatedName("fu.ak(Lua;I)V")
    public void method3075(class546 arg0) {
        this.field1711 = arg0.method8802();
        this.field1707 = arg0.method8801();
        for (int var2 = arg0.method8796(); var2 != 0; var2 = arg0.method8796()) {
            class148 var3;
            if (var2 == 3) {
                var3 = new class170(this);
            } else if (var2 == 1) {
                var3 = new class146(this);
            } else if (var2 == 13) {
                var3 = new class163(this);
            } else if (var2 == 4) {
                var3 = new class155(this);
            } else if (var2 == 6) {
                var3 = new class162(this);
            } else if (var2 == 5) {
                var3 = new class147(this);
            } else if (var2 == 2) {
                var3 = new class152(this);
            } else if (var2 == 7) {
                var3 = new class145(this);
            } else if (var2 == 14) {
                var3 = new class149(this);
            } else if (var2 == 8) {
                var3 = new class166(this);
            } else if (var2 == 9) {
                var3 = new class172(this);
            } else if (var2 == 10) {
                var3 = new class158(this);
            } else if (var2 == 11) {
                var3 = new class153(this);
            } else if (var2 == 12) {
                var3 = new class157(this);
            } else if (var2 == 15) {
                var3 = new class167(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3050(arg0);
            this.field1712.method6886(var3);
        }
    }

    @ObfuscatedName("fu.al(Lgc;I)V")
    public void method3084(class159 arg0) {
        if (this.field1711 != arg0.field1785 || this.field1707 != arg0.field1764) {
            throw new RuntimeException("");
        }
        for (class148 var2 = (class148) this.field1712.method6889(); var2 != null; var2 = (class148) this.field1712.method6926()) {
            var2.method3051(arg0);
        }
        arg0.field1764++;
    }
}
