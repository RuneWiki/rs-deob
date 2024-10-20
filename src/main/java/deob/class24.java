package deob;

@ObfuscatedName("c")
public class class24 {

    @ObfuscatedName("c.v")
    public class31[] field600 = new class31[100];

    @ObfuscatedName("c.z")
    public int field598;

    @ObfuscatedName("c.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laa;")
    public class31 method501(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field600[99];
        for (int var6 = this.field598; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field600[var6] = this.field600[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3322();
            var5.method3299();
            var5.method579(arg0, arg1, arg3, arg2);
        }
        this.field600[0] = var5;
        if (this.field598 < 100) {
            this.field598++;
        }
        return var5;
    }

    @ObfuscatedName("c.v(II)Laa;")
    public class31 method512(int arg0) {
        return arg0 >= 0 && arg0 < this.field598 ? this.field600[arg0] : null;
    }

    @ObfuscatedName("c.z(I)I")
    public int method507() {
        return this.field598;
    }
}
