package deob;

@ObfuscatedName("ee")
public class class146 {

    @ObfuscatedName("ee.o")
    public long field1684;

    @ObfuscatedName("ee.q")
    public long field1689 = -1L;

    @ObfuscatedName("ee.l")
    public class337 field1686 = new class337();

    public class146(class440 arg0) {
        this.method2751(arg0);
    }

    @ObfuscatedName("ee.o(Lpx;B)V")
    public void method2751(class440 arg0) {
        this.field1684 = arg0.method7014();
        this.field1689 = arg0.method7014();
        for (int var2 = arg0.method7071(); var2 != 0; var2 = arg0.method7071()) {
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
            var3.method2673(arg0);
            this.field1686.method5493(var3);
        }
    }

    @ObfuscatedName("ee.q(Let;I)V")
    public void method2753(class149 arg0) {
        if (this.field1684 != arg0.field4468 || this.field1689 != arg0.field1710) {
            throw new RuntimeException("");
        }
        for (class145 var2 = (class145) this.field1686.method5479(); var2 != null; var2 = (class145) this.field1686.method5475()) {
            var2.method2664(arg0);
        }
        arg0.field1710++;
    }
}
