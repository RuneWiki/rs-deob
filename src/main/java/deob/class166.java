package deob;

@ObfuscatedName("gl")
public class class166 {

    @ObfuscatedName("gl.ab")
    public long field1788;

    @ObfuscatedName("gl.ay")
    public long field1785 = -1L;

    @ObfuscatedName("gl.an")
    public class410 field1787 = new class410();

    public class166(class549 arg0) {
        this.method3292(arg0);
    }

    @ObfuscatedName("gl.ab(Lvg;I)V")
    public void method3292(class549 arg0) {
        this.field1788 = arg0.method8804();
        this.field1785 = arg0.method8804();
        for (int var2 = arg0.method9025(); var2 != 0; var2 = arg0.method9025()) {
            class165 var3;
            if (var2 == 1) {
                var3 = new class161(this);
            } else if (var2 == 4) {
                var3 = new class172(this);
            } else if (var2 == 3) {
                var3 = new class157(this);
            } else if (var2 == 2) {
                var3 = new class155(this);
            } else if (var2 == 5) {
                var3 = new class162(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method3203(arg0);
            this.field1787.method6940(var3);
        }
    }

    @ObfuscatedName("gl.ay(Lgx;B)V")
    public void method3299(class169 arg0) {
        if (this.field1788 != arg0.field5075 || this.field1785 != arg0.field1804) {
            throw new RuntimeException("");
        }
        for (class165 var2 = (class165) this.field1787.method6951(); var2 != null; var2 = (class165) this.field1787.method6945()) {
            var2.method3207(arg0);
        }
        arg0.field1804++;
    }
}
