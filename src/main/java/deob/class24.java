package deob;

@ObfuscatedName("i")
public class class24 {

    @ObfuscatedName("i.s")
    public class31[] field595 = new class31[100];

    @ObfuscatedName("i.f")
    public int field599;

    @ObfuscatedName("i.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lao;")
    public class31 method491(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field595[99];
        for (int var6 = this.field599; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field595[var6] = this.field595[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3316();
            var5.method3299();
            var5.method555(arg0, arg1, arg3, arg2);
        }
        this.field595[0] = var5;
        if (this.field599 < 100) {
            this.field599++;
        }
        return var5;
    }

    @ObfuscatedName("i.s(II)Lao;")
    public class31 method492(int arg0) {
        return arg0 >= 0 && arg0 < this.field599 ? this.field595[arg0] : null;
    }

    @ObfuscatedName("i.f(I)I")
    public int method493() {
        return this.field599;
    }
}
