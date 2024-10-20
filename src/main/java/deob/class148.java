package deob;

@ObfuscatedName("fh")
public class class148 {

    @ObfuscatedName("fh.az")
    public long field1690;

    @ObfuscatedName("fh.ah")
    public int field1697 = -1;

    @ObfuscatedName("fh.af")
    public class400 field1691 = new class400();

    public class148(class535 arg0) {
        this.method2989(arg0);
    }

    @ObfuscatedName("fh.az(Lur;I)V")
    public void method2989(class535 arg0) {
        this.field1690 = arg0.method8469();
        this.field1697 = arg0.method8682();
        for (int var2 = arg0.method8462(); var2 != 0; var2 = arg0.method8462()) {
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
            var3.method2978(arg0);
            this.field1691.method6647(var3);
        }
    }

    @ObfuscatedName("fh.ah(Lfp;I)V")
    public void method2997(class156 arg0) {
        if (this.field1690 != arg0.field1735 || this.field1697 != arg0.field1745) {
            throw new RuntimeException("");
        }
        for (class145 var2 = (class145) this.field1691.method6649(); var2 != null; var2 = (class145) this.field1691.method6650()) {
            var2.method2980(arg0);
        }
        arg0.field1745++;
    }
}
