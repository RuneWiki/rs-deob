package deob;

@ObfuscatedName("f")
public class class24 {

    @ObfuscatedName("f.o")
    public class31[] field591 = new class31[100];

    @ObfuscatedName("f.i")
    public int field590;

    @ObfuscatedName("f.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lak;")
    public class31 method508(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field591[99];
        for (int var6 = this.field590; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field591[var6] = this.field591[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3261();
            var5.method3242();
            var5.method573(arg0, arg1, arg3, arg2);
        }
        this.field591[0] = var5;
        if (this.field590 < 100) {
            this.field590++;
        }
        return var5;
    }

    @ObfuscatedName("f.o(IB)Lak;")
    public class31 method513(int arg0) {
        return arg0 >= 0 && arg0 < this.field590 ? this.field591[arg0] : null;
    }

    @ObfuscatedName("f.i(I)I")
    public int method503() {
        return this.field590;
    }
}
