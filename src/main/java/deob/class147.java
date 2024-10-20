package deob;

@ObfuscatedName("fn")
public class class147 {

    @ObfuscatedName("fn.au")
    public long field1691;

    @ObfuscatedName("fn.ae")
    public int field1683 = -1;

    @ObfuscatedName("fn.ao")
    public class380 field1684 = new class380();

    public class147(class515 arg0) {
        this.method2970(arg0);
    }

    @ObfuscatedName("fn.au(Ltm;B)V")
    public void method2970(class515 arg0) {
        this.field1691 = arg0.method8307();
        this.field1683 = arg0.method8306();
        for (int var2 = arg0.method8300(); var2 != 0; var2 = arg0.method8300()) {
            class144 var3;
            if (var2 == 3) {
                var3 = new class166(this);
            } else if (var2 == 1) {
                var3 = new class142(this);
            } else if (var2 == 13) {
                var3 = new class159(this);
            } else if (var2 == 4) {
                var3 = new class151(this);
            } else if (var2 == 6) {
                var3 = new class158(this);
            } else if (var2 == 5) {
                var3 = new class143(this);
            } else if (var2 == 2) {
                var3 = new class148(this);
            } else if (var2 == 7) {
                var3 = new class141(this);
            } else if (var2 == 14) {
                var3 = new class145(this);
            } else if (var2 == 8) {
                var3 = new class162(this);
            } else if (var2 == 9) {
                var3 = new class168(this);
            } else if (var2 == 10) {
                var3 = new class154(this);
            } else if (var2 == 11) {
                var3 = new class149(this);
            } else if (var2 == 12) {
                var3 = new class153(this);
            } else if (var2 == 15) {
                var3 = new class163(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2950(arg0);
            this.field1684.method6439(var3);
        }
    }

    @ObfuscatedName("fn.ae(Lfi;I)V")
    public void method2964(class155 arg0) {
        if (this.field1691 != arg0.field1729 || this.field1683 != arg0.field1746) {
            throw new RuntimeException("");
        }
        for (class144 var2 = (class144) this.field1684.method6457(); var2 != null; var2 = (class144) this.field1684.method6443()) {
            var2.method2949(arg0);
        }
        arg0.field1746++;
    }
}
