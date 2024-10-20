package deob;

@ObfuscatedName("gf")
public class class163 {

    @ObfuscatedName("gf.ac")
    public long field1757;

    @ObfuscatedName("gf.al")
    public long field1759 = -1L;

    @ObfuscatedName("gf.ak")
    public class395 field1758 = new class395();

    public class163(class530 arg0) {
        this.method3100(arg0);
    }

    @ObfuscatedName("gf.ac(Lul;B)V")
    public void method3100(class530 arg0) {
        this.field1757 = arg0.method8573();
        this.field1759 = arg0.method8573();
        for (int var2 = arg0.method8365(); var2 != 0; var2 = arg0.method8365()) {
            class162 var3;
            if (var2 == 1) {
                var3 = new class158(this);
            } else if (var2 == 4) {
                var3 = new class169(this);
            } else if (var2 == 3) {
                var3 = new class154(this);
            } else if (var2 == 2) {
                var3 = new class152(this);
            } else if (var2 == 5) {
                var3 = new class159(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3000(arg0);
            this.field1758.method6593(var3);
        }
    }

    @ObfuscatedName("gf.al(Lgb;I)V")
    public void method3101(class166 arg0) {
        if (this.field1757 != arg0.field4857 || this.field1759 != arg0.field1776) {
            throw new RuntimeException("");
        }
        for (class162 var2 = (class162) this.field1758.method6577(); var2 != null; var2 = (class162) this.field1758.method6623()) {
            var2.method3008(arg0);
        }
        arg0.field1776++;
    }
}
