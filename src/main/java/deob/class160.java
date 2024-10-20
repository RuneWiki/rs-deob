package deob;

@ObfuscatedName("gh")
public class class160 {

    @ObfuscatedName("gh.at")
    public long field1744;

    @ObfuscatedName("gh.an")
    public long field1747 = -1L;

    @ObfuscatedName("gh.av")
    public class378 field1745 = new class378();

    public class160(class501 arg0) {
        this.method3051(arg0);
    }

    @ObfuscatedName("gh.at(Ltz;I)V")
    public void method3051(class501 arg0) {
        this.field1744 = arg0.method8135();
        this.field1747 = arg0.method8135();
        for (int var2 = arg0.method8129(); var2 != 0; var2 = arg0.method8129()) {
            class159 var3;
            if (var2 == 1) {
                var3 = new class155(this);
            } else if (var2 == 4) {
                var3 = new class166(this);
            } else if (var2 == 3) {
                var3 = new class151(this);
            } else if (var2 == 2) {
                var3 = new class149(this);
            } else if (var2 == 5) {
                var3 = new class156(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2959(arg0);
            this.field1745.method6357(var3);
        }
    }

    @ObfuscatedName("gh.an(Lgv;I)V")
    public void method3052(class163 arg0) {
        if (this.field1744 != arg0.field4757 || this.field1747 != arg0.field1765) {
            throw new RuntimeException("");
        }
        for (class159 var2 = (class159) this.field1745.method6360(); var2 != null; var2 = (class159) this.field1745.method6362()) {
            var2.method2960(arg0);
        }
        arg0.field1765++;
    }
}
