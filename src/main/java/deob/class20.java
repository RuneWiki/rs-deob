package deob;

@ObfuscatedName("x")
public class class20 {

    @ObfuscatedName("x.v")
    public long field163;

    @ObfuscatedName("x.n")
    public long field161 = -1L;

    @ObfuscatedName("x.f")
    public class296 field164 = new class296();

    public class20(class383 arg0) {
        this.method160(arg0);
    }

    @ObfuscatedName("x.v(Lnd;I)V")
    public void method160(class383 arg0) {
        this.field163 = arg0.method5971();
        this.field161 = arg0.method5971();
        for (int var2 = arg0.method5965(); var2 != 0; var2 = arg0.method5965()) {
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
            var3.method50(arg0);
            this.field164.method4764(var3);
        }
    }

    @ObfuscatedName("x.n(Ly;I)V")
    public void method157(class4 arg0) {
        if (this.field163 != arg0.field3938 || this.field161 != arg0.field30) {
            throw new RuntimeException("");
        }
        for (class17 var2 = (class17) this.field164.method4767(); var2 != null; var2 = (class17) this.field164.method4769()) {
            var2.method44(arg0);
        }
        arg0.field30++;
    }
}
