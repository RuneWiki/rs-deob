package deob;

@ObfuscatedName("s")
public class class20 {

    @ObfuscatedName("s.f")
    public long field156;

    @ObfuscatedName("s.e")
    public long field153 = -1L;

    @ObfuscatedName("s.v")
    public class297 field154 = new class297();

    public class20(class384 arg0) {
        this.method173(arg0);
    }

    @ObfuscatedName("s.f(Lnt;I)V")
    public void method173(class384 arg0) {
        this.field156 = arg0.method5896();
        this.field153 = arg0.method5896();
        for (int var2 = arg0.method5902(); var2 != 0; var2 = arg0.method5902()) {
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
            var3.method53(arg0);
            this.field154.method4768(var3);
        }
    }

    @ObfuscatedName("s.e(Ly;I)V")
    public void method174(class4 arg0) {
        if (this.field156 != arg0.field3937 || this.field153 != arg0.field26) {
            throw new RuntimeException("");
        }
        for (class17 var2 = (class17) this.field154.method4771(); var2 != null; var2 = (class17) this.field154.method4773()) {
            var2.method51(arg0);
        }
        arg0.field26++;
    }
}
