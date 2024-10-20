package deob;

@ObfuscatedName("fn")
public class class151 {

    @ObfuscatedName("fn.aq")
    public long field1710;

    @ObfuscatedName("fn.ad")
    public int field1708 = -1;

    @ObfuscatedName("fn.ag")
    public class409 field1709 = new class409();

    public class151(class547 arg0) {
        this.method3092(arg0);
    }

    @ObfuscatedName("fn.aq(Lvp;I)V")
    public void method3092(class547 arg0) {
        this.field1710 = arg0.method8735();
        this.field1708 = arg0.method8734();
        for (int var2 = arg0.method8804(); var2 != 0; var2 = arg0.method8804()) {
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
            var3.method3076(arg0);
            this.field1709.method6890(var3);
        }
    }

    @ObfuscatedName("fn.ad(Lgk;B)V")
    public void method3095(class159 arg0) {
        if (this.field1710 != arg0.field1762 || this.field1708 != arg0.field1763) {
            throw new RuntimeException("");
        }
        for (class148 var2 = (class148) this.field1709.method6842(); var2 != null; var2 = (class148) this.field1709.method6844()) {
            var2.method3075(arg0);
        }
        arg0.field1763++;
    }
}
