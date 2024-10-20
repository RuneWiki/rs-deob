package deob;

@ObfuscatedName("cf")
public final class class84 extends class141 {

    @ObfuscatedName("cf.i")
    public int field1372;

    @ObfuscatedName("cf.j")
    public int field1360;

    @ObfuscatedName("cf.a")
    public int field1361;

    @ObfuscatedName("cf.r")
    public int field1359;

    @ObfuscatedName("cf.o")
    public int field1363;

    @ObfuscatedName("cf.n")
    public int field1364;

    @ObfuscatedName("cf.q")
    public class262 field1365;

    @ObfuscatedName("cf.b")
    public int field1366 = 0;

    @ObfuscatedName("cf.k")
    public int field1367 = 0;

    @ObfuscatedName("cf.s")
    public boolean field1368 = false;

    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1372 = arg0;
        this.field1361 = arg1;
        this.field1359 = arg2;
        this.field1363 = arg3;
        this.field1364 = arg4;
        this.field1360 = arg5 + arg6;
        int var8 = class247.method80(this.field1372).field3333;
        if (var8 == -1) {
            this.field1368 = true;
        } else {
            this.field1368 = false;
            this.field1365 = class262.method3737(var8);
        }
    }

    @ObfuscatedName("cf.i(II)V")
    public final void method1545(int arg0) {
        if (this.field1368) {
            return;
        }
        this.field1367 += arg0;
        while (this.field1367 > this.field1365.field3604[this.field1366]) {
            this.field1367 -= this.field1365.field3604[this.field1366];
            this.field1366++;
            if (this.field1366 >= this.field1365.field3614.length) {
                this.field1368 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cf.a(I)Lem;")
    public final class133 method1038() {
        class247 var1 = class247.method80(this.field1372);
        class133 var2;
        if (this.field1368) {
            var2 = var1.method4017(-1);
        } else {
            var2 = var1.method4017(this.field1366);
        }
        return var2 == null ? null : var2;
    }
}
