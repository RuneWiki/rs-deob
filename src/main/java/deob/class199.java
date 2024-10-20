package deob;

@ObfuscatedName("gq")
public class class199 extends class151 {

    @ObfuscatedName("gq.c")
    public static class146 field2872 = new class146(64);

    @ObfuscatedName("gq.n")
    public char field2875;

    @ObfuscatedName("gq.q")
    public int field2871;

    @ObfuscatedName("gq.t")
    public String field2877;

    @ObfuscatedName("gq.p")
    public boolean field2876 = true;

    @ObfuscatedName("gq.c(I)V")
    public void method3371() {
    }

    @ObfuscatedName("gq.n(Ldu;I)V")
    public void method3372(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3380(arg0, var2);
        }
    }

    @ObfuscatedName("gq.q(Ldu;IB)V")
    public void method3380(class130 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method2230();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class211.field3135[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field2875 = var6;
        } else if (arg1 == 2) {
            this.field2871 = arg0.method2246();
        } else if (arg1 == 4) {
            this.field2876 = false;
        } else if (arg1 == 5) {
            this.field2877 = arg0.method2314();
        }
    }

    @ObfuscatedName("gq.t(I)Z")
    public boolean method3373() {
        return this.field2875 == 's';
    }

    @ObfuscatedName("z.p(I)V")
    public static void method92() {
        field2872.method2603();
    }
}
