package deob;

@ObfuscatedName("gr")
public class class157 {

    @ObfuscatedName("gr.af")
    public long field1757;

    @ObfuscatedName("gr.an")
    public long field1756 = -1L;

    @ObfuscatedName("gr.aw")
    public class365 field1759 = new class365();

    public class157(class489 arg0) {
        this.method3144(arg0);
    }

    @ObfuscatedName("gr.af(Lsg;I)V")
    public void method3144(class489 arg0) {
        this.field1757 = arg0.method8271();
        this.field1756 = arg0.method8271();
        for (int var2 = arg0.method8248(); var2 != 0; var2 = arg0.method8248()) {
            class156 var3;
            if (var2 == 1) {
                var3 = new class152(this);
            } else if (var2 == 4) {
                var3 = new class163(this);
            } else if (var2 == 3) {
                var3 = new class148(this);
            } else if (var2 == 2) {
                var3 = new class146(this);
            } else if (var2 == 5) {
                var3 = new class153(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3061(arg0);
            this.field1759.method6408(var3);
        }
    }

    @ObfuscatedName("gr.an(Lgj;B)V")
    public void method3145(class160 arg0) {
        if (this.field1757 != arg0.field4745 || this.field1756 != arg0.field1772) {
            throw new RuntimeException("");
        }
        for (class156 var2 = (class156) this.field1759.method6413(); var2 != null; var2 = (class156) this.field1759.method6380()) {
            var2.method3060(arg0);
        }
        arg0.field1772++;
    }
}
