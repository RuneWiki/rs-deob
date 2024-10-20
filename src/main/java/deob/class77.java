package deob;

@ObfuscatedName("bx")
public class class77 {

    @ObfuscatedName("bx.w")
    public class61[] field1004 = new class61[100];

    @ObfuscatedName("bx.v")
    public int field1007;

    @ObfuscatedName("bx.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbq;")
    public class61 method2108(int arg0, String arg1, String arg2, String arg3) {
        class61 var5 = this.field1004[99];
        for (int var6 = this.field1007; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1004[var6] = this.field1004[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class61(arg0, arg1, arg3, arg2);
        } else {
            var5.method7431();
            var5.method7429();
            var5.method1091(arg0, arg1, arg3, arg2);
        }
        this.field1004[0] = var5;
        if (this.field1007 < 100) {
            this.field1007++;
        }
        return var5;
    }

    @ObfuscatedName("bx.w(II)Lbq;")
    public class61 method2109(int arg0) {
        return arg0 >= 0 && arg0 < this.field1007 ? this.field1004[arg0] : null;
    }

    @ObfuscatedName("bx.v(B)I")
    public int method2112() {
        return this.field1007;
    }
}
