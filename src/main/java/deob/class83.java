package deob;

@ObfuscatedName("cd")
public final class class83 extends class140 {

    @ObfuscatedName("cd.c")
    public int field1283;

    @ObfuscatedName("cd.i")
    public int field1288;

    @ObfuscatedName("cd.o")
    public int field1285;

    @ObfuscatedName("cd.j")
    public int field1286;

    @ObfuscatedName("cd.k")
    public int field1287;

    @ObfuscatedName("cd.x")
    public int field1294;

    @ObfuscatedName("cd.z")
    public class288 field1289;

    @ObfuscatedName("cd.p")
    public int field1290 = 0;

    @ObfuscatedName("cd.w")
    public int field1291 = 0;

    @ObfuscatedName("cd.r")
    public boolean field1284 = false;

    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1283 = arg0;
        this.field1285 = arg1;
        this.field1286 = arg2;
        this.field1287 = arg3;
        this.field1294 = arg4;
        this.field1288 = arg5 + arg6;
        int var8 = class273.method4166(this.field1283).field3495;
        if (var8 == -1) {
            this.field1284 = true;
        } else {
            this.field1284 = false;
            this.field1289 = class288.method3535(var8);
        }
    }

    @ObfuscatedName("cd.c(IB)V")
    public final void method1666(int arg0) {
        if (this.field1284) {
            return;
        }
        this.field1291 += arg0;
        while (this.field1291 > this.field1289.field3764[this.field1290]) {
            this.field1291 -= this.field1289.field3764[this.field1290];
            this.field1290++;
            if (this.field1290 >= this.field1289.field3751.length) {
                this.field1284 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cd.w(B)Led;")
    public final class132 method1043() {
        class273 var1 = class273.method4166(this.field1283);
        class132 var2;
        if (this.field1284) {
            var2 = var1.method4422(-1);
        } else {
            var2 = var1.method4422(this.field1290);
        }
        return var2 == null ? null : var2;
    }
}
