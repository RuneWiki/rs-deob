package deob;

@ObfuscatedName("by")
public class class74 {

    @ObfuscatedName("by.b")
    public class58[] field955 = new class58[100];

    @ObfuscatedName("by.p")
    public int field960;

    @ObfuscatedName("by.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbr;")
    public class58 method1951(int arg0, String arg1, String arg2, String arg3) {
        class58 var5 = this.field955[99];
        for (int var6 = this.field960; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field955[var6] = this.field955[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class58(arg0, arg1, arg3, arg2);
        } else {
            var5.method6163();
            var5.method6159();
            var5.method1048(arg0, arg1, arg3, arg2);
        }
        this.field955[0] = var5;
        if (this.field960 < 100) {
            this.field960++;
        }
        return var5;
    }

    @ObfuscatedName("by.b(IB)Lbr;")
    public class58 method1963(int arg0) {
        return arg0 >= 0 && arg0 < this.field960 ? this.field955[arg0] : null;
    }

    @ObfuscatedName("by.p(I)I")
    public int method1953() {
        return this.field960;
    }
}
