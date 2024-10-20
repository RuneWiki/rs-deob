package deob;

@ObfuscatedName("fz")
public class class154 {

    @ObfuscatedName("fz.ac")
    public long field1719;

    @ObfuscatedName("fz.ae")
    public int field1716 = -1;

    @ObfuscatedName("fz.ag")
    public class412 field1717 = new class412();

    public class154(class551 arg0) {
        this.method3274(arg0);
    }

    @ObfuscatedName("fz.ac(Lvf;I)V")
    public void method3274(class551 arg0) {
        this.field1719 = arg0.method8980();
        this.field1716 = arg0.method9110();
        for (int var2 = arg0.method8955(); var2 != 0; var2 = arg0.method8955()) {
            class151 var3;
            if (var2 == 3) {
                var3 = new class173(this);
            } else if (var2 == 1) {
                var3 = new class149(this);
            } else if (var2 == 13) {
                var3 = new class166(this);
            } else if (var2 == 4) {
                var3 = new class158(this);
            } else if (var2 == 6) {
                var3 = new class165(this);
            } else if (var2 == 5) {
                var3 = new class150(this);
            } else if (var2 == 2) {
                var3 = new class155(this);
            } else if (var2 == 7) {
                var3 = new class148(this);
            } else if (var2 == 14) {
                var3 = new class152(this);
            } else if (var2 == 8) {
                var3 = new class169(this);
            } else if (var2 == 9) {
                var3 = new class175(this);
            } else if (var2 == 10) {
                var3 = new class161(this);
            } else if (var2 == 11) {
                var3 = new class156(this);
            } else if (var2 == 12) {
                var3 = new class160(this);
            } else if (var2 == 15) {
                var3 = new class170(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3246(arg0);
            this.field1717.method7139(var3);
        }
    }

    @ObfuscatedName("fz.ae(Lgo;B)V")
    public void method3278(class162 arg0) {
        if (this.field1719 != arg0.field1778 || this.field1716 != arg0.field1766) {
            throw new RuntimeException("");
        }
        for (class151 var2 = (class151) this.field1717.method7126(); var2 != null; var2 = (class151) this.field1717.method7084()) {
            var2.method3247(arg0);
        }
        arg0.field1766++;
    }
}
