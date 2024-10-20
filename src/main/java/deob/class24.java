package deob;

@ObfuscatedName("o")
public class class24 {

    @ObfuscatedName("o.y")
    public class31[] field596 = new class31[100];

    @ObfuscatedName("o.s")
    public int field595;

    @ObfuscatedName("o.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lar;")
    public class31 method467(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field596[99];
        for (int var6 = this.field595; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field596[var6] = this.field596[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3365();
            var5.method3346();
            var5.method537(arg0, arg1, arg3, arg2);
        }
        this.field596[0] = var5;
        if (this.field595 < 100) {
            this.field595++;
        }
        return var5;
    }

    @ObfuscatedName("o.y(IB)Lar;")
    public class31 method468(int arg0) {
        return arg0 >= 0 && arg0 < this.field595 ? this.field596[arg0] : null;
    }

    @ObfuscatedName("o.s(I)I")
    public int method478() {
        return this.field595;
    }
}
