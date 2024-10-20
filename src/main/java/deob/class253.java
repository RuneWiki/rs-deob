package deob;

@ObfuscatedName("il")
public class class253 extends class196 {

    @ObfuscatedName("il.j")
    public static class191 field3390 = new class191(64);

    @ObfuscatedName("il.a")
    public char field3394;

    @ObfuscatedName("il.r")
    public int field3391;

    @ObfuscatedName("il.o")
    public String field3393;

    @ObfuscatedName("il.n")
    public boolean field3392 = true;

    @ObfuscatedName("il.j(B)V")
    public void method4119() {
    }

    @ObfuscatedName("il.a(Lfp;I)V")
    public void method4120(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4121(arg0, var2);
        }
    }

    @ObfuscatedName("il.r(Lfp;II)V")
    public void method4121(class175 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3172();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class268.field3661[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3394 = var6;
        } else if (arg1 == 2) {
            this.field3391 = arg0.method2998();
        } else if (arg1 == 4) {
            this.field3392 = false;
        } else if (arg1 == 5) {
            this.field3393 = arg0.method3002();
        }
    }

    @ObfuscatedName("il.o(I)Z")
    public boolean method4122() {
        return this.field3394 == 's';
    }
}
