package deob;

@ObfuscatedName("ch")
public final class class85 extends class142 {

    @ObfuscatedName("ch.i")
    public int field1382;

    @ObfuscatedName("ch.w")
    public int field1374;

    @ObfuscatedName("ch.a")
    public int field1380;

    @ObfuscatedName("ch.t")
    public int field1375;

    @ObfuscatedName("ch.s")
    public int field1377;

    @ObfuscatedName("ch.r")
    public int field1378;

    @ObfuscatedName("ch.v")
    public class261 field1376;

    @ObfuscatedName("ch.y")
    public int field1379 = 0;

    @ObfuscatedName("ch.j")
    public int field1381 = 0;

    @ObfuscatedName("ch.k")
    public boolean field1373 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1382 = arg0;
        this.field1380 = arg1;
        this.field1375 = arg2;
        this.field1377 = arg3;
        this.field1378 = arg4;
        this.field1374 = arg5 + arg6;
        int var8 = class246.method2634(this.field1382).field3333;
        if (var8 == -1) {
            this.field1373 = true;
        } else {
            this.field1373 = false;
            this.field1376 = class261.method3746(var8);
        }
    }

    @ObfuscatedName("ch.i(II)V")
    public final void method1546(int arg0) {
        if (this.field1373) {
            return;
        }
        this.field1381 += arg0;
        while (this.field1381 > this.field1376.field3613[this.field1379]) {
            this.field1381 -= this.field1376.field3613[this.field1379];
            this.field1379++;
            if (this.field1379 >= this.field1376.field3610.length) {
                this.field1373 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ch.a(I)Let;")
    public final class134 method1044() {
        class246 var1 = class246.method2634(this.field1382);
        class134 var2;
        if (this.field1373) {
            var2 = var1.method3979(-1);
        } else {
            var2 = var1.method3979(this.field1379);
        }
        return var2 == null ? null : var2;
    }
}
