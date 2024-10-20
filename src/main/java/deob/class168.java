package deob;

@ObfuscatedName("gj")
public class class168 {

    @ObfuscatedName("gj.ac")
    public long field1819;

    @ObfuscatedName("gj.ae")
    public long field1815 = -1L;

    @ObfuscatedName("gj.ag")
    public class412 field1816 = new class412();

    public class168(class551 arg0) {
        this.method3377(arg0);
    }

    @ObfuscatedName("gj.ac(Lvf;I)V")
    public void method3377(class551 arg0) {
        this.field1819 = arg0.method8980();
        this.field1815 = arg0.method8980();
        for (int var2 = arg0.method8955(); var2 != 0; var2 = arg0.method8955()) {
            class167 var3;
            if (var2 == 1) {
                var3 = new class163(this);
            } else if (var2 == 4) {
                var3 = new class174(this);
            } else if (var2 == 3) {
                var3 = new class159(this);
            } else if (var2 == 2) {
                var3 = new class157(this);
            } else if (var2 == 5) {
                var3 = new class164(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3287(arg0);
            this.field1816.method7139(var3);
        }
    }

    @ObfuscatedName("gj.ae(Lgm;I)V")
    public void method3379(class171 arg0) {
        if (this.field1819 != arg0.field5122 || this.field1815 != arg0.field1838) {
            throw new RuntimeException("");
        }
        for (class167 var2 = (class167) this.field1816.method7126(); var2 != null; var2 = (class167) this.field1816.method7084()) {
            var2.method3286(arg0);
        }
        arg0.field1838++;
    }
}
