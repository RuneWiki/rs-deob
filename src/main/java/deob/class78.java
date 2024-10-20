package deob;

@ObfuscatedName("bd")
public class class78 {

    @ObfuscatedName("bd.e")
    public class62[] field1019 = new class62[100];

    @ObfuscatedName("bd.v")
    public int field1017;

    @ObfuscatedName("bd.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbv;")
    public class62 method2029(int arg0, String arg1, String arg2, String arg3) {
        class62 var5 = this.field1019[99];
        for (int var6 = this.field1017; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1019[var6] = this.field1019[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class62(arg0, arg1, arg3, arg2);
        } else {
            var5.method7230();
            var5.method7225();
            var5.method1108(arg0, arg1, arg3, arg2);
        }
        this.field1019[0] = var5;
        if (this.field1017 < 100) {
            this.field1017++;
        }
        return var5;
    }

    @ObfuscatedName("bd.e(II)Lbv;")
    public class62 method2028(int arg0) {
        return arg0 >= 0 && arg0 < this.field1017 ? this.field1019[arg0] : null;
    }

    @ObfuscatedName("bd.v(I)I")
    public int method2030() {
        return this.field1017;
    }
}
