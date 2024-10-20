package deob;

@ObfuscatedName("ax")
public class class28 {

    @ObfuscatedName("ax.u")
    public class36[] field673 = new class36[100];

    @ObfuscatedName("ax.x")
    public int field674;

    @ObfuscatedName("ax.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lam;")
    public class36 method683(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field673[99];
        for (int var6 = this.field674; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field673[var6] = this.field673[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3679();
            var5.method3655();
            var5.method753(arg0, arg1, arg3, arg2);
        }
        this.field673[0] = var5;
        if (this.field674 < 100) {
            this.field674++;
        }
        return var5;
    }

    @ObfuscatedName("ax.u(IB)Lam;")
    public class36 method674(int arg0) {
        return arg0 >= 0 && arg0 < this.field674 ? this.field673[arg0] : null;
    }

    @ObfuscatedName("ax.x(I)I")
    public int method675() {
        return this.field674;
    }
}
