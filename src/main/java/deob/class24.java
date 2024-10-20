package deob;

@ObfuscatedName("q")
public class class24 {

    @ObfuscatedName("q.o")
    public class31[] field613 = new class31[100];

    @ObfuscatedName("q.y")
    public int field614;

    @ObfuscatedName("q.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lao;")
    public class31 method507(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field613[99];
        for (int var6 = this.field614; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field613[var6] = this.field613[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3204();
            var5.method3187();
            var5.method575(arg0, arg1, arg3, arg2);
        }
        this.field613[0] = var5;
        if (this.field614 < 100) {
            this.field614++;
        }
        return var5;
    }

    @ObfuscatedName("q.o(II)Lao;")
    public class31 method508(int arg0) {
        return arg0 >= 0 && arg0 < this.field614 ? this.field613[arg0] : null;
    }

    @ObfuscatedName("q.y(B)I")
    public int method509() {
        return this.field614;
    }
}
