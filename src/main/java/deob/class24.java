package deob;

@ObfuscatedName("y")
public class class24 {

    @ObfuscatedName("y.s")
    public class31[] field600 = new class31[100];

    @ObfuscatedName("y.v")
    public int field601;

    @ObfuscatedName("y.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lax;")
    public class31 method499(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field600[99];
        for (int var6 = this.field601; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field600[var6] = this.field600[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3285();
            var5.method3257();
            var5.method577(arg0, arg1, arg3, arg2);
        }
        this.field600[0] = var5;
        if (this.field601 < 100) {
            this.field601++;
        }
        return var5;
    }

    @ObfuscatedName("y.s(II)Lax;")
    public class31 method506(int arg0) {
        return arg0 >= 0 && arg0 < this.field601 ? this.field600[arg0] : null;
    }

    @ObfuscatedName("y.v(I)I")
    public int method507() {
        return this.field601;
    }
}
