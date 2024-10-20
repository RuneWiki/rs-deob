package deob;

@ObfuscatedName("s")
public class class26 {

    @ObfuscatedName("s.b")
    public class33[] field629 = new class33[100];

    @ObfuscatedName("s.p")
    public int field621;

    @ObfuscatedName("s.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Las;")
    public class33 method595(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field629[99];
        for (int var6 = this.field621; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field629[var6] = this.field629[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3506();
            var5.method3484();
            var5.method648(arg0, arg1, arg3, arg2);
        }
        this.field629[0] = var5;
        if (this.field621 < 100) {
            this.field621++;
        }
        return var5;
    }

    @ObfuscatedName("s.b(II)Las;")
    public class33 method596(int arg0) {
        return arg0 >= 0 && arg0 < this.field621 ? this.field629[arg0] : null;
    }

    @ObfuscatedName("s.p(I)I")
    public int method594() {
        return this.field621;
    }
}
