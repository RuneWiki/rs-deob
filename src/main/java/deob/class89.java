package deob;

@ObfuscatedName("cg")
public class class89 {

    @ObfuscatedName("cg.h")
    public class60[] field1253 = new class60[100];

    @ObfuscatedName("cg.e")
    public int field1255;

    @ObfuscatedName("cg.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbd;")
    public class60 method1873(int arg0, String arg1, String arg2, String arg3) {
        class60 var5 = this.field1253[99];
        for (int var6 = this.field1255; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1253[var6] = this.field1253[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class60(arg0, arg1, arg3, arg2);
        } else {
            var5.method3812();
            var5.method3845();
            var5.method980(arg0, arg1, arg3, arg2);
        }
        this.field1253[0] = var5;
        if (this.field1255 < 100) {
            this.field1255++;
        }
        return var5;
    }

    @ObfuscatedName("cg.h(II)Lbd;")
    public class60 method1875(int arg0) {
        return arg0 >= 0 && arg0 < this.field1255 ? this.field1253[arg0] : null;
    }

    @ObfuscatedName("cg.e(B)I")
    public int method1874() {
        return this.field1255;
    }
}
