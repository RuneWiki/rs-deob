package deob;

@ObfuscatedName("x")
public class class25 {

    @ObfuscatedName("x.v")
    public class32[] field611 = new class32[100];

    @ObfuscatedName("x.k")
    public int field608;

    @ObfuscatedName("x.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lar;")
    public class32 method488(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field611[99];
        for (int var6 = this.field608; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field611[var6] = this.field611[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3324();
            var5.method3299();
            var5.method555(arg0, arg1, arg3, arg2);
        }
        this.field611[0] = var5;
        if (this.field608 < 100) {
            this.field608++;
        }
        return var5;
    }

    @ObfuscatedName("x.v(IB)Lar;")
    public class32 method498(int arg0) {
        return arg0 >= 0 && arg0 < this.field608 ? this.field611[arg0] : null;
    }

    @ObfuscatedName("x.k(I)I")
    public int method496() {
        return this.field608;
    }
}
