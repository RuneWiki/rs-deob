package deob;

@ObfuscatedName("eh")
public class class134 {

    @ObfuscatedName("eh.i")
    public long field1495;

    @ObfuscatedName("eh.w")
    public long field1493 = -1L;

    @ObfuscatedName("eh.s")
    public class311 field1501 = new class311();

    public class134(class401 arg0) {
        this.method2515(arg0);
    }

    @ObfuscatedName("eh.i(Lop;I)V")
    public void method2515(class401 arg0) {
        this.field1495 = arg0.method6249();
        this.field1493 = arg0.method6249();
        for (int var2 = arg0.method6240(); var2 != 0; var2 = arg0.method6240()) {
            class133 var3;
            if (var2 == 1) {
                var3 = new class129(this);
            } else if (var2 == 4) {
                var3 = new class140(this);
            } else if (var2 == 3) {
                var3 = new class125(this);
            } else if (var2 == 2) {
                var3 = new class123(this);
            } else if (var2 == 5) {
                var3 = new class130(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2411(arg0);
            this.field1501.method5023(var3);
        }
    }

    @ObfuscatedName("eh.w(Lea;I)V")
    public void method2522(class137 arg0) {
        if (this.field1495 != arg0.field4075 || this.field1493 != arg0.field1515) {
            throw new RuntimeException("");
        }
        for (class133 var2 = (class133) this.field1501.method5026(); var2 != null; var2 = (class133) this.field1501.method5028()) {
            var2.method2419(arg0);
        }
        arg0.field1515++;
    }
}
