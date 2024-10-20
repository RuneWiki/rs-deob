package deob;

@ObfuscatedName("gi")
public class class165 {

    @ObfuscatedName("gi.aq")
    public long field1812;

    @ObfuscatedName("gi.ad")
    public long field1809 = -1L;

    @ObfuscatedName("gi.ag")
    public class409 field1810 = new class409();

    public class165(class547 arg0) {
        this.method3188(arg0);
    }

    @ObfuscatedName("gi.aq(Lvp;I)V")
    public void method3188(class547 arg0) {
        this.field1812 = arg0.method8735();
        this.field1809 = arg0.method8735();
        for (int var2 = arg0.method8804(); var2 != 0; var2 = arg0.method8804()) {
            class164 var3;
            if (var2 == 1) {
                var3 = new class160(this);
            } else if (var2 == 4) {
                var3 = new class171(this);
            } else if (var2 == 3) {
                var3 = new class156(this);
            } else if (var2 == 2) {
                var3 = new class154(this);
            } else if (var2 == 5) {
                var3 = new class161(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3101(arg0);
            this.field1810.method6890(var3);
        }
    }

    @ObfuscatedName("gi.ad(Lgj;I)V")
    public void method3189(class168 arg0) {
        if (this.field1812 != arg0.field5082 || this.field1809 != arg0.field1822) {
            throw new RuntimeException("");
        }
        for (class164 var2 = (class164) this.field1810.method6842(); var2 != null; var2 = (class164) this.field1810.method6844()) {
            var2.method3102(arg0);
        }
        arg0.field1822++;
    }
}
