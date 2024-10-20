package deob;

@ObfuscatedName("et")
public class class146 {

    @ObfuscatedName("et.s")
    public long field1653;

    @ObfuscatedName("et.h")
    public long field1649 = -1L;

    @ObfuscatedName("et.w")
    public class337 field1650 = new class337();

    public class146(class444 arg0) {
        this.method2752(arg0);
    }

    @ObfuscatedName("et.s(Lqr;B)V")
    public void method2752(class444 arg0) {
        this.field1653 = arg0.method6935();
        this.field1649 = arg0.method6935();
        for (int var2 = arg0.method6929(); var2 != 0; var2 = arg0.method6929()) {
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
            var3.method2654(arg0);
            this.field1650.method5531(var3);
        }
    }

    @ObfuscatedName("et.h(Lec;I)V")
    public void method2754(class149 arg0) {
        if (this.field1653 != arg0.field4468 || this.field1649 != arg0.field1671) {
            throw new RuntimeException("");
        }
        for (class145 var2 = (class145) this.field1650.method5482(); var2 != null; var2 = (class145) this.field1650.method5484()) {
            var2.method2655(arg0);
        }
        arg0.field1671++;
    }
}
