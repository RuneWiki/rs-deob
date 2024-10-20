package deob;

@ObfuscatedName("cd")
public final class class82 extends class139 {

    @ObfuscatedName("cd.b")
    public int field1245;

    @ObfuscatedName("cd.q")
    public int field1237;

    @ObfuscatedName("cd.o")
    public int field1240;

    @ObfuscatedName("cd.p")
    public int field1239;

    @ObfuscatedName("cd.a")
    public int field1238;

    @ObfuscatedName("cd.h")
    public int field1241;

    @ObfuscatedName("cd.l")
    public class281 field1242;

    @ObfuscatedName("cd.y")
    public int field1243 = 0;

    @ObfuscatedName("cd.g")
    public int field1236 = 0;

    @ObfuscatedName("cd.c")
    public boolean field1244 = false;

    public class82(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1245 = arg0;
        this.field1240 = arg1;
        this.field1239 = arg2;
        this.field1238 = arg3;
        this.field1241 = arg4;
        this.field1237 = arg5 + arg6;
        int var8 = class266.method3059(this.field1245).field3426;
        if (var8 == -1) {
            this.field1244 = true;
        } else {
            this.field1244 = false;
            this.field1242 = class281.method2838(var8);
        }
    }

    @ObfuscatedName("cd.b(IB)V")
    public final void method1696(int arg0) {
        if (this.field1244) {
            return;
        }
        this.field1236 += arg0;
        while (this.field1236 > this.field1242.field3693[this.field1243]) {
            this.field1236 -= this.field1242.field3693[this.field1243];
            this.field1243++;
            if (this.field1243 >= this.field1242.field3684.length) {
                this.field1244 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cd.g(I)Lee;")
    public final class131 method1092() {
        class266 var1 = class266.method3059(this.field1245);
        class131 var2;
        if (this.field1244) {
            var2 = var1.method4392(-1);
        } else {
            var2 = var1.method4392(this.field1243);
        }
        return var2 == null ? null : var2;
    }
}
