package deob;

@ObfuscatedName("cl")
public class class94 {

    @ObfuscatedName("cl.h")
    public class65[] field1269 = new class65[100];

    @ObfuscatedName("cl.l")
    public int field1262;

    @ObfuscatedName("cl.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;")
    public class65 method2048(int arg0, String arg1, String arg2, String arg3) {
        class65 var5 = this.field1269[99];
        for (int var6 = this.field1262; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field1269[var6] = this.field1269[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class65(arg0, arg1, arg3, arg2);
        } else {
            var5.method3973();
            var5.method4025();
            var5.method1067(arg0, arg1, arg3, arg2);
        }
        this.field1269[0] = var5;
        if (this.field1262 < 100) {
            this.field1262++;
        }
        return var5;
    }

    @ObfuscatedName("cl.h(II)Lbk;")
    public class65 method2039(int arg0) {
        return arg0 >= 0 && arg0 < this.field1262 ? this.field1269[arg0] : null;
    }

    @ObfuscatedName("cl.l(I)I")
    public int method2047() {
        return this.field1262;
    }
}
