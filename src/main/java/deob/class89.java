package deob;

@ObfuscatedName("cz")
public class class89 {

    @ObfuscatedName("cz.s")
    public class60[] field1256 = new class60[100];

    @ObfuscatedName("cz.o")
    public int field1255;

    @ObfuscatedName("cz.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbh;")
    public class60 method1860(int arg0, String arg1, String arg2, String arg3) {
        class60 var5 = this.field1256[99];
        for (int var6 = this.field1255; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1256[var6] = this.field1256[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class60(arg0, arg1, arg3, arg2);
        } else {
            var5.method3787();
            var5.method3826();
            var5.method1019(arg0, arg1, arg3, arg2);
        }
        this.field1256[0] = var5;
        if (this.field1255 < 100) {
            this.field1255++;
        }
        return var5;
    }

    @ObfuscatedName("cz.s(II)Lbh;")
    public class60 method1861(int arg0) {
        return arg0 >= 0 && arg0 < this.field1255 ? this.field1256[arg0] : null;
    }

    @ObfuscatedName("cz.o(I)I")
    public int method1862() {
        return this.field1255;
    }
}
