package deob;

@ObfuscatedName("be")
public class class74 {

    @ObfuscatedName("be.w")
    public class58[] field951 = new class58[100];

    @ObfuscatedName("be.s")
    public int field952;

    @ObfuscatedName("be.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbf;")
    public class58 method1899(int arg0, String arg1, String arg2, String arg3) {
        class58 var5 = this.field951[99];
        for (int var6 = this.field952; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field951[var6] = this.field951[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class58(arg0, arg1, arg3, arg2);
        } else {
            var5.method5752();
            var5.method5748();
            var5.method1052(arg0, arg1, arg3, arg2);
        }
        this.field951[0] = var5;
        if (this.field952 < 100) {
            this.field952++;
        }
        return var5;
    }

    @ObfuscatedName("be.w(IB)Lbf;")
    public class58 method1898(int arg0) {
        return arg0 >= 0 && arg0 < this.field952 ? this.field951[arg0] : null;
    }

    @ObfuscatedName("be.s(I)I")
    public int method1901() {
        return this.field952;
    }
}
