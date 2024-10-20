package deob;

@ObfuscatedName("ed")
public class class154 {

    @ObfuscatedName("ed.h")
    public long field1776;

    @ObfuscatedName("ed.e")
    public long field1772 = -1L;

    @ObfuscatedName("ed.v")
    public class354 field1773 = new class354();

    public class154(class467 arg0) {
        this.method3015(arg0);
    }

    @ObfuscatedName("ed.h(Lqy;I)V")
    public void method3015(class467 arg0) {
        this.field1776 = arg0.method7958();
        this.field1772 = arg0.method7958();
        for (int var2 = arg0.method7792(); var2 != 0; var2 = arg0.method7792()) {
            class153 var3;
            if (var2 == 1) {
                var3 = new class149(this);
            } else if (var2 == 4) {
                var3 = new class160(this);
            } else if (var2 == 3) {
                var3 = new class145(this);
            } else if (var2 == 2) {
                var3 = new class143(this);
            } else if (var2 == 5) {
                var3 = new class150(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2911(arg0);
            this.field1773.method6143(var3);
        }
    }

    @ObfuscatedName("ed.e(Lfn;I)V")
    public void method3008(class157 arg0) {
        if (this.field1776 != arg0.field4686 || this.field1772 != arg0.field1795) {
            throw new RuntimeException("");
        }
        for (class153 var2 = (class153) this.field1773.method6176(); var2 != null; var2 = (class153) this.field1773.method6136()) {
            var2.method2916(arg0);
        }
        arg0.field1795++;
    }
}
