package deob;

@ObfuscatedName("gs")
public class class161 {

    @ObfuscatedName("gs.aw")
    public long field1757;

    @ObfuscatedName("gs.ay")
    public long field1758 = -1L;

    @ObfuscatedName("gs.ar")
    public class381 field1762 = new class381();

    public class161(class514 arg0) {
        this.method3074(arg0);
    }

    @ObfuscatedName("gs.aw(Lty;I)V")
    public void method3074(class514 arg0) {
        this.field1757 = arg0.method8251();
        this.field1758 = arg0.method8251();
        for (int var2 = arg0.method8244(); var2 != 0; var2 = arg0.method8244()) {
            class160 var3;
            if (var2 == 1) {
                var3 = new class156(this);
            } else if (var2 == 4) {
                var3 = new class167(this);
            } else if (var2 == 3) {
                var3 = new class152(this);
            } else if (var2 == 2) {
                var3 = new class150(this);
            } else if (var2 == 5) {
                var3 = new class157(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2988(arg0);
            this.field1762.method6446(var3);
        }
    }

    @ObfuscatedName("gs.ay(Lgh;I)V")
    public void method3075(class164 arg0) {
        if (this.field1757 != arg0.field4819 || this.field1758 != arg0.field1774) {
            throw new RuntimeException("");
        }
        for (class160 var2 = (class160) this.field1762.method6419(); var2 != null; var2 = (class160) this.field1762.method6421()) {
            var2.method2983(arg0);
        }
        arg0.field1774++;
    }
}
