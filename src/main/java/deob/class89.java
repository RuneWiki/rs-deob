package deob;

@ObfuscatedName("cl")
public class class89 {

    @ObfuscatedName("cl.c")
    public class60[] field1262 = new class60[100];

    @ObfuscatedName("cl.n")
    public int field1263;

    @ObfuscatedName("cl.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbo;")
    public class60 method1893(int arg0, String arg1, String arg2, String arg3) {
        class60 var5 = this.field1262[99];
        for (int var6 = this.field1263; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1262[var6] = this.field1262[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class60(arg0, arg1, arg3, arg2);
        } else {
            var5.method3766();
            var5.method3809();
            var5.method1018(arg0, arg1, arg3, arg2);
        }
        this.field1262[0] = var5;
        if (this.field1263 < 100) {
            this.field1263++;
        }
        return var5;
    }

    @ObfuscatedName("cl.c(IB)Lbo;")
    public class60 method1894(int arg0) {
        return arg0 >= 0 && arg0 < this.field1263 ? this.field1262[arg0] : null;
    }

    @ObfuscatedName("cl.n(I)I")
    public int method1890() {
        return this.field1263;
    }
}
