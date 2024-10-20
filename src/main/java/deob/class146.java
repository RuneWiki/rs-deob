package deob;

@ObfuscatedName("fh")
public class class146 {

    @ObfuscatedName("fh.at")
    public long field1636;

    @ObfuscatedName("fh.an")
    public int field1637 = -1;

    @ObfuscatedName("fh.av")
    public class378 field1638 = new class378();

    public class146(class501 arg0) {
        this.method2946(arg0);
    }

    @ObfuscatedName("fh.at(Ltz;B)V")
    public void method2946(class501 arg0) {
        this.field1636 = arg0.method8135();
        this.field1637 = arg0.method8134();
        for (int var2 = arg0.method8129(); var2 != 0; var2 = arg0.method8129()) {
            class143 var3;
            if (var2 == 3) {
                var3 = new class165(this);
            } else if (var2 == 1) {
                var3 = new class141(this);
            } else if (var2 == 13) {
                var3 = new class158(this);
            } else if (var2 == 4) {
                var3 = new class150(this);
            } else if (var2 == 6) {
                var3 = new class157(this);
            } else if (var2 == 5) {
                var3 = new class142(this);
            } else if (var2 == 2) {
                var3 = new class147(this);
            } else if (var2 == 7) {
                var3 = new class140(this);
            } else if (var2 == 14) {
                var3 = new class144(this);
            } else if (var2 == 8) {
                var3 = new class161(this);
            } else if (var2 == 9) {
                var3 = new class167(this);
            } else if (var2 == 10) {
                var3 = new class153(this);
            } else if (var2 == 11) {
                var3 = new class148(this);
            } else if (var2 == 12) {
                var3 = new class152(this);
            } else if (var2 == 15) {
                var3 = new class162(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2929(arg0);
            this.field1638.method6357(var3);
        }
    }

    @ObfuscatedName("fh.an(Lfs;I)V")
    public void method2947(class154 arg0) {
        if (this.field1636 != arg0.field1690 || this.field1637 != arg0.field1700) {
            throw new RuntimeException("");
        }
        for (class143 var2 = (class143) this.field1638.method6360(); var2 != null; var2 = (class143) this.field1638.method6362()) {
            var2.method2928(arg0);
        }
        arg0.field1700++;
    }
}
