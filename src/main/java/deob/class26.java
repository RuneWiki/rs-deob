package deob;

@ObfuscatedName("a")
public class class26 {

    @ObfuscatedName("a.k")
    public class33[] field647 = new class33[100];

    @ObfuscatedName("a.e")
    public int field646;

    @ObfuscatedName("a.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lar;")
    public class33 method571(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field647[99];
        for (int var6 = this.field646; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field647[var6] = this.field647[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3533();
            var5.method3519();
            var5.method629(arg0, arg1, arg3, arg2);
        }
        this.field647[0] = var5;
        if (this.field646 < 100) {
            this.field646++;
        }
        return var5;
    }

    @ObfuscatedName("a.k(II)Lar;")
    public class33 method577(int arg0) {
        return arg0 >= 0 && arg0 < this.field646 ? this.field647[arg0] : null;
    }

    @ObfuscatedName("a.e(I)I")
    public int method568() {
        return this.field646;
    }
}
