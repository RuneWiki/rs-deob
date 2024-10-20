package deob;

@ObfuscatedName("gk")
public class class158 {

    @ObfuscatedName("gk.aj")
    public long field1748;

    @ObfuscatedName("gk.al")
    public long field1745 = -1L;

    @ObfuscatedName("gk.ac")
    public class361 field1744 = new class361();

    public class158(class478 arg0) {
        this.method3056(arg0);
    }

    @ObfuscatedName("gk.aj(Lsy;I)V")
    public void method3056(class478 arg0) {
        this.field1748 = arg0.method7949();
        this.field1745 = arg0.method7949();
        for (int var2 = arg0.method7909(); var2 != 0; var2 = arg0.method7909()) {
            class157 var3;
            if (var2 == 1) {
                var3 = new class153(this);
            } else if (var2 == 4) {
                var3 = new class164(this);
            } else if (var2 == 3) {
                var3 = new class149(this);
            } else if (var2 == 2) {
                var3 = new class147(this);
            } else if (var2 == 5) {
                var3 = new class154(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2959(arg0);
            this.field1744.method6158(var3);
        }
    }

    @ObfuscatedName("gk.al(Lgn;I)V")
    public void method3057(class161 arg0) {
        if (this.field1748 != arg0.field4673 || this.field1745 != arg0.field1758) {
            throw new RuntimeException("");
        }
        for (class157 var2 = (class157) this.field1744.method6141(); var2 != null; var2 = (class157) this.field1744.method6147()) {
            var2.method2961(arg0);
        }
        arg0.field1758++;
    }
}
