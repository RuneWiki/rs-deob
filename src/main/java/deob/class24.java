package deob;

@ObfuscatedName("n")
public class class24 {

    @ObfuscatedName("n.c")
    public class31[] field611 = new class31[100];

    @ObfuscatedName("n.h")
    public int field614;

    @ObfuscatedName("n.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laj;")
    public class31 method505(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field611[99];
        for (int var6 = this.field614; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field611[var6] = this.field611[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3334();
            var5.method3305();
            var5.method579(arg0, arg1, arg3, arg2);
        }
        this.field611[0] = var5;
        if (this.field614 < 100) {
            this.field614++;
        }
        return var5;
    }

    @ObfuscatedName("n.c(II)Laj;")
    public class31 method506(int arg0) {
        return arg0 >= 0 && arg0 < this.field614 ? this.field611[arg0] : null;
    }

    @ObfuscatedName("n.h(I)I")
    public int method507() {
        return this.field614;
    }
}
