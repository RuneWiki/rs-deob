package deob;

@ObfuscatedName("x")
public class class20 {

    @ObfuscatedName("x.f")
    public long field154;

    @ObfuscatedName("x.o")
    public long field148 = -1L;

    @ObfuscatedName("x.u")
    public class274 field153 = new class274();

    public class20(class382 arg0) {
        this.method177(arg0);
    }

    @ObfuscatedName("x.f(Lnu;B)V")
    public void method177(class382 arg0) {
        this.field154 = arg0.method6069();
        this.field148 = arg0.method6069();
        for (int var2 = arg0.method5856(); var2 != 0; var2 = arg0.method5856()) {
            class17 var3;
            if (var2 == 1) {
                var3 = new class13(this);
            } else if (var2 == 4) {
                var3 = new class8(this);
            } else if (var2 == 3) {
                var3 = new class6(this);
            } else if (var2 == 2) {
                var3 = new class21(this);
            } else if (var2 == 5) {
                var3 = new class26(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method62(arg0);
            this.field153.method4209(var3);
        }
    }

    @ObfuscatedName("x.o(Lp;I)V")
    public void method172(class4 arg0) {
        if (this.field154 != arg0.field3941 || this.field148 != arg0.field30) {
            throw new RuntimeException("");
        }
        for (class17 var2 = (class17) this.field153.method4212(); var2 != null; var2 = (class17) this.field153.method4213()) {
            var2.method61(arg0);
        }
        arg0.field30++;
    }
}
