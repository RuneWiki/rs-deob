package deob;

@ObfuscatedName("er")
public class class146 {

    @ObfuscatedName("er.v")
    public long field1634;

    @ObfuscatedName("er.c")
    public long field1636 = -1L;

    @ObfuscatedName("er.i")
    public class337 field1633 = new class337();

    public class146(class438 arg0) {
        this.method2820(arg0);
    }

    @ObfuscatedName("er.v(Lpi;I)V")
    public void method2820(class438 arg0) {
        this.field1634 = arg0.method7003();
        this.field1636 = arg0.method7003();
        for (int var2 = arg0.method6971(); var2 != 0; var2 = arg0.method6971()) {
            class145 var3;
            if (var2 == 1) {
                var3 = new class141(this);
            } else if (var2 == 4) {
                var3 = new class152(this);
            } else if (var2 == 3) {
                var3 = new class137(this);
            } else if (var2 == 2) {
                var3 = new class135(this);
            } else if (var2 == 5) {
                var3 = new class142(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2708(arg0);
            this.field1633.method5604(var3);
        }
    }

    @ObfuscatedName("er.c(Lea;I)V")
    public void method2822(class149 arg0) {
        if (this.field1634 != arg0.field4410 || this.field1636 != arg0.field1657) {
            throw new RuntimeException("");
        }
        for (class145 var2 = (class145) this.field1633.method5574(); var2 != null; var2 = (class145) this.field1633.method5619()) {
            var2.method2709(arg0);
        }
        arg0.field1657++;
    }
}
