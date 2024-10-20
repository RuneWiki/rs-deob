package deob;

@ObfuscatedName("y")
public class class24 {

    @ObfuscatedName("y.p")
    public class31[] field600 = new class31[100];

    @ObfuscatedName("y.a")
    public int field603;

    @ObfuscatedName("y.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lai;")
    public class31 method512(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field600[99];
        for (int var6 = this.field603; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field600[var6] = this.field600[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3307();
            var5.method3287();
            var5.method586(arg0, arg1, arg3, arg2);
        }
        this.field600[0] = var5;
        if (this.field603 < 100) {
            this.field603++;
        }
        return var5;
    }

    @ObfuscatedName("y.p(II)Lai;")
    public class31 method511(int arg0) {
        return arg0 >= 0 && arg0 < this.field603 ? this.field600[arg0] : null;
    }

    @ObfuscatedName("y.a(I)I")
    public int method514() {
        return this.field603;
    }
}
