package deob;

@ObfuscatedName("fo")
public class class144 {

    @ObfuscatedName("fo.aj")
    public long field1631;

    @ObfuscatedName("fo.al")
    public int field1629 = -1;

    @ObfuscatedName("fo.ac")
    public class361 field1630 = new class361();

    public class144(class478 arg0) {
        this.method2948(arg0);
    }

    @ObfuscatedName("fo.aj(Lsy;I)V")
    public void method2948(class478 arg0) {
        this.field1631 = arg0.method7949();
        this.field1629 = arg0.method7908();
        for (int var2 = arg0.method7909(); var2 != 0; var2 = arg0.method7909()) {
            class141 var3;
            if (var2 == 3) {
                var3 = new class163(this);
            } else if (var2 == 1) {
                var3 = new class139(this);
            } else if (var2 == 13) {
                var3 = new class156(this);
            } else if (var2 == 4) {
                var3 = new class148(this);
            } else if (var2 == 6) {
                var3 = new class155(this);
            } else if (var2 == 5) {
                var3 = new class140(this);
            } else if (var2 == 2) {
                var3 = new class145(this);
            } else if (var2 == 7) {
                var3 = new class138(this);
            } else if (var2 == 14) {
                var3 = new class142(this);
            } else if (var2 == 8) {
                var3 = new class159(this);
            } else if (var2 == 9) {
                var3 = new class165(this);
            } else if (var2 == 10) {
                var3 = new class151(this);
            } else if (var2 == 11) {
                var3 = new class146(this);
            } else if (var2 == 12) {
                var3 = new class150(this);
            } else if (var2 == 15) {
                var3 = new class160(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2930(arg0);
            this.field1630.method6158(var3);
        }
    }

    @ObfuscatedName("fo.al(Lfi;I)V")
    public void method2949(class152 arg0) {
        if (this.field1631 != arg0.field1688 || this.field1629 != arg0.field1710) {
            throw new RuntimeException("");
        }
        for (class141 var2 = (class141) this.field1630.method6141(); var2 != null; var2 = (class141) this.field1630.method6147()) {
            var2.method2932(arg0);
        }
        arg0.field1710++;
    }
}
