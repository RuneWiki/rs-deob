package deob;

@ObfuscatedName("fy")
public class class152 {

    @ObfuscatedName("fy.ab")
    public long field1691;

    @ObfuscatedName("fy.ay")
    public int field1688 = -1;

    @ObfuscatedName("fy.an")
    public class410 field1689 = new class410();

    public class152(class549 arg0) {
        this.method3189(arg0);
    }

    @ObfuscatedName("fy.ab(Lvg;I)V")
    public void method3189(class549 arg0) {
        this.field1691 = arg0.method8804();
        this.field1688 = arg0.method8803();
        for (int var2 = arg0.method9025(); var2 != 0; var2 = arg0.method9025()) {
            class149 var3;
            if (var2 == 3) {
                var3 = new class171(this);
            } else if (var2 == 1) {
                var3 = new class147(this);
            } else if (var2 == 13) {
                var3 = new class164(this);
            } else if (var2 == 4) {
                var3 = new class156(this);
            } else if (var2 == 6) {
                var3 = new class163(this);
            } else if (var2 == 5) {
                var3 = new class148(this);
            } else if (var2 == 2) {
                var3 = new class153(this);
            } else if (var2 == 7) {
                var3 = new class146(this);
            } else if (var2 == 14) {
                var3 = new class150(this);
            } else if (var2 == 8) {
                var3 = new class167(this);
            } else if (var2 == 9) {
                var3 = new class173(this);
            } else if (var2 == 10) {
                var3 = new class159(this);
            } else if (var2 == 11) {
                var3 = new class154(this);
            } else if (var2 == 12) {
                var3 = new class158(this);
            } else if (var2 == 15) {
                var3 = new class168(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3167(arg0);
            this.field1689.method6940(var3);
        }
    }

    @ObfuscatedName("fy.ay(Lgg;B)V")
    public void method3192(class160 arg0) {
        if (this.field1691 != arg0.field1734 || this.field1688 != arg0.field1735) {
            throw new RuntimeException("");
        }
        for (class149 var2 = (class149) this.field1689.method6951(); var2 != null; var2 = (class149) this.field1689.method6945()) {
            var2.method3166(arg0);
        }
        arg0.field1735++;
    }
}
