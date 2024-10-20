package deob;

@ObfuscatedName("e")
public class class26 {

    @ObfuscatedName("e.l")
    public class33[] field641 = new class33[100];

    @ObfuscatedName("e.g")
    public int field636;

    @ObfuscatedName("e.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lao;")
    public class33 method571(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field641[99];
        for (int var6 = this.field636; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field641[var6] = this.field641[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3564();
            var5.method3545();
            var5.method630(arg0, arg1, arg3, arg2);
        }
        this.field641[0] = var5;
        if (this.field636 < 100) {
            this.field636++;
        }
        return var5;
    }

    @ObfuscatedName("e.l(IB)Lao;")
    public class33 method573(int arg0) {
        return arg0 >= 0 && arg0 < this.field636 ? this.field641[arg0] : null;
    }

    @ObfuscatedName("e.g(B)I")
    public int method574() {
        return this.field636;
    }
}
