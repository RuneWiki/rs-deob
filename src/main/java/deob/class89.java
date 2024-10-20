package deob;

@ObfuscatedName("cm")
public class class89 {

    @ObfuscatedName("cm.q")
    public class60[] field1270 = new class60[100];

    @ObfuscatedName("cm.m")
    public int field1271;

    @ObfuscatedName("cm.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbq;")
    public class60 method1830(int arg0, String arg1, String arg2, String arg3) {
        class60 var5 = this.field1270[99];
        for (int var6 = this.field1271; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1270[var6] = this.field1270[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class60(arg0, arg1, arg3, arg2);
        } else {
            var5.method3733();
            var5.method3765();
            var5.method1001(arg0, arg1, arg3, arg2);
        }
        this.field1270[0] = var5;
        if (this.field1271 < 100) {
            this.field1271++;
        }
        return var5;
    }

    @ObfuscatedName("cm.q(II)Lbq;")
    public class60 method1843(int arg0) {
        return arg0 >= 0 && arg0 < this.field1271 ? this.field1270[arg0] : null;
    }

    @ObfuscatedName("cm.m(I)I")
    public int method1832() {
        return this.field1271;
    }
}
