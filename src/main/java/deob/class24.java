package deob;

@ObfuscatedName("k")
public class class24 {

    @ObfuscatedName("k.v")
    public class31[] field605 = new class31[100];

    @ObfuscatedName("k.i")
    public int field606;

    @ObfuscatedName("k.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lak;")
    public class31 method496(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field605[99];
        for (int var6 = this.field606; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field605[var6] = this.field605[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3273();
            var5.method3254();
            var5.method559(arg0, arg1, arg3, arg2);
        }
        this.field605[0] = var5;
        if (this.field606 < 100) {
            this.field606++;
        }
        return var5;
    }

    @ObfuscatedName("k.v(II)Lak;")
    public class31 method495(int arg0) {
        return arg0 >= 0 && arg0 < this.field606 ? this.field605[arg0] : null;
    }

    @ObfuscatedName("k.i(B)I")
    public int method498() {
        return this.field606;
    }
}
