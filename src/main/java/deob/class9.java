package deob;

@ObfuscatedName("j")
public class class9 {

    @ObfuscatedName("j.z")
    public static int field153 = 2;

    @ObfuscatedName("j.n")
    public boolean field145;

    @ObfuscatedName("j.u")
    public boolean field146;

    public class9() {
        this.method125(true);
    }

    public class9(class104 arg0) {
        if (arg0 == null || arg0.field1819 == null) {
            this.method125(true);
        } else {
            int var2 = arg0.method2257();
            if (var2 >= 0 && var2 <= field153) {
                if (arg0.method2257() == 1) {
                    this.field145 = true;
                }
                if (var2 > 1) {
                    this.field146 = arg0.method2257() == 1;
                }
            } else {
                this.method125(true);
            }
        }
    }

    @ObfuscatedName("j.z(ZI)V")
    public void method125(boolean arg0) {
    }

    @ObfuscatedName("j.n(I)Lcj;")
    public class104 method126() {
        class104 var1 = new class104(100);
        var1.method2113(field153);
        var1.method2113(this.field145 ? 1 : 0);
        var1.method2113(this.field146 ? 1 : 0);
        return var1;
    }
}
