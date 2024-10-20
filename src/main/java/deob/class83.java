package deob;

@ObfuscatedName("cd")
public final class class83 extends class140 {

    @ObfuscatedName("cd.d")
    public int field1356;

    @ObfuscatedName("cd.k")
    public int field1349;

    @ObfuscatedName("cd.e")
    public int field1352;

    @ObfuscatedName("cd.p")
    public int field1351;

    @ObfuscatedName("cd.q")
    public int field1357;

    @ObfuscatedName("cd.s")
    public int field1353;

    @ObfuscatedName("cd.r")
    public class261 field1348;

    @ObfuscatedName("cd.g")
    public int field1355 = 0;

    @ObfuscatedName("cd.v")
    public int field1358 = 0;

    @ObfuscatedName("cd.t")
    public boolean field1350 = false;

    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1356 = arg0;
        this.field1352 = arg1;
        this.field1351 = arg2;
        this.field1357 = arg3;
        this.field1353 = arg4;
        this.field1349 = arg5 + arg6;
        int var8 = class246.method2787(this.field1356).field3327;
        if (var8 == -1) {
            this.field1350 = true;
        } else {
            this.field1350 = false;
            this.field1348 = class261.method3613(var8);
        }
    }

    @ObfuscatedName("cd.d(IB)V")
    public final void method1593(int arg0) {
        if (this.field1350) {
            return;
        }
        this.field1358 += arg0;
        while (this.field1358 > this.field1348.field3611[this.field1355]) {
            this.field1358 -= this.field1348.field3611[this.field1355];
            this.field1355++;
            if (this.field1355 >= this.field1348.field3622.length) {
                this.field1350 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cd.e(I)Leb;")
    public final class132 method1070() {
        class246 var1 = class246.method2787(this.field1356);
        class132 var2;
        if (this.field1350) {
            var2 = var1.method4078(-1);
        } else {
            var2 = var1.method4078(this.field1355);
        }
        return var2 == null ? null : var2;
    }
}
