package deob;

@ObfuscatedName("bo")
public final class class65 extends class214 {

    @ObfuscatedName("bo.i")
    public int field809;

    @ObfuscatedName("bo.w")
    public int field804;

    @ObfuscatedName("bo.s")
    public int field806;

    @ObfuscatedName("bo.a")
    public int field807;

    @ObfuscatedName("bo.o")
    public int field817;

    @ObfuscatedName("bo.g")
    public int field808;

    @ObfuscatedName("bo.e")
    public class172 field810;

    @ObfuscatedName("bo.p")
    public int field811 = 0;

    @ObfuscatedName("bo.j")
    public int field812 = 0;

    @ObfuscatedName("bo.b")
    public boolean field813 = false;

    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field809 = arg0;
        this.field806 = arg1;
        this.field807 = arg2;
        this.field817 = arg3;
        this.field808 = arg4;
        this.field804 = arg5 + arg6;
        int var8 = class163.method6452(this.field809).field1751;
        if (var8 == -1) {
            this.field813 = true;
        } else {
            this.field813 = false;
            this.field810 = class172.method589(var8);
        }
    }

    @ObfuscatedName("bo.i(IB)V")
    public final void method1806(int arg0) {
        if (this.field813) {
            return;
        }
        this.field812 += arg0;
        while (this.field812 > this.field810.field1955[this.field811]) {
            this.field812 -= this.field810.field1955[this.field811];
            this.field811++;
            if (this.field811 >= this.field810.field1953.length) {
                this.field813 = true;
                break;
            }
        }
    }

    @ObfuscatedName("bo.w(I)Lhl;")
    public final class220 method1799() {
        class163 var1 = class163.method6452(this.field809);
        class220 var2;
        if (this.field813) {
            var2 = var1.method2844(-1);
        } else {
            var2 = var1.method2844(this.field811);
        }
        return var2 == null ? null : var2;
    }
}
