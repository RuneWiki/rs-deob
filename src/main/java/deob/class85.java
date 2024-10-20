package deob;

@ObfuscatedName("cd")
public final class class85 extends class142 {

    @ObfuscatedName("cd.e")
    public int field1359;

    @ObfuscatedName("cd.o")
    public int field1358;

    @ObfuscatedName("cd.m")
    public int field1357;

    @ObfuscatedName("cd.g")
    public int field1360;

    @ObfuscatedName("cd.d")
    public int field1361;

    @ObfuscatedName("cd.b")
    public int field1362;

    @ObfuscatedName("cd.k")
    public class261 field1363;

    @ObfuscatedName("cd.f")
    public int field1367 = 0;

    @ObfuscatedName("cd.j")
    public int field1365 = 0;

    @ObfuscatedName("cd.q")
    public boolean field1364 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1359 = arg0;
        this.field1357 = arg1;
        this.field1360 = arg2;
        this.field1361 = arg3;
        this.field1362 = arg4;
        this.field1358 = arg5 + arg6;
        int var8 = class246.method707(this.field1359).field3304;
        if (var8 == -1) {
            this.field1364 = true;
        } else {
            this.field1364 = false;
            this.field1363 = class261.method2746(var8);
        }
    }

    @ObfuscatedName("cd.e(II)V")
    public final void method1519(int arg0) {
        if (this.field1364) {
            return;
        }
        this.field1365 += arg0;
        while (this.field1365 > this.field1363.field3588[this.field1367]) {
            this.field1365 -= this.field1363.field3588[this.field1367];
            this.field1367++;
            if (this.field1367 >= this.field1363.field3587.length) {
                this.field1364 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cd.m(B)Leo;")
    public final class134 method1018() {
        class246 var1 = class246.method707(this.field1359);
        class134 var2;
        if (this.field1364) {
            var2 = var1.method3957(-1);
        } else {
            var2 = var1.method3957(this.field1367);
        }
        return var2 == null ? null : var2;
    }
}
