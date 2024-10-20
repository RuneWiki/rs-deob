package deob;

@ObfuscatedName("fv")
public class class148 {

    @ObfuscatedName("fv.at")
    public long field1651;

    @ObfuscatedName("fv.ah")
    public int field1656 = -1;

    @ObfuscatedName("fv.ar")
    public class392 field1652 = new class392();

    public class148(class527 arg0) {
        this.method3057(arg0);
    }

    @ObfuscatedName("fv.at(Luj;I)V")
    public void method3057(class527 arg0) {
        this.field1651 = arg0.method8417();
        this.field1656 = arg0.method8416();
        for (int var2 = arg0.method8410(); var2 != 0; var2 = arg0.method8410()) {
            class145 var3;
            if (var2 == 3) {
                var3 = new class167(this);
            } else if (var2 == 1) {
                var3 = new class143(this);
            } else if (var2 == 13) {
                var3 = new class160(this);
            } else if (var2 == 4) {
                var3 = new class152(this);
            } else if (var2 == 6) {
                var3 = new class159(this);
            } else if (var2 == 5) {
                var3 = new class144(this);
            } else if (var2 == 2) {
                var3 = new class149(this);
            } else if (var2 == 7) {
                var3 = new class142(this);
            } else if (var2 == 14) {
                var3 = new class146(this);
            } else if (var2 == 8) {
                var3 = new class163(this);
            } else if (var2 == 9) {
                var3 = new class169(this);
            } else if (var2 == 10) {
                var3 = new class155(this);
            } else if (var2 == 11) {
                var3 = new class150(this);
            } else if (var2 == 12) {
                var3 = new class154(this);
            } else if (var2 == 15) {
                var3 = new class164(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3042(arg0);
            this.field1652.method6601(var3);
        }
    }

    @ObfuscatedName("fv.ah(Lfc;B)V")
    public void method3059(class156 arg0) {
        if (this.field1651 != arg0.field1723 || this.field1656 != arg0.field1702) {
            throw new RuntimeException("");
        }
        for (class145 var2 = (class145) this.field1652.method6604(); var2 != null; var2 = (class145) this.field1652.method6606()) {
            var2.method3043(arg0);
        }
        arg0.field1702++;
    }
}
