package deob;

@ObfuscatedName("fd")
public final class class172 {

    @ObfuscatedName("fd.i")
    public class176 field2817 = new class176();

    @ObfuscatedName("fd.b")
    public int field2818;

    @ObfuscatedName("fd.r")
    public int field2821;

    @ObfuscatedName("fd.l")
    public class177 field2820;

    @ObfuscatedName("fd.s")
    public class174 field2819 = new class174();

    public class172(int arg0) {
        this.field2818 = arg0;
        this.field2821 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2820 = new class177(var2);
    }

    @ObfuscatedName("fd.i(J)Lfq;")
    public class176 method3277(long arg0) {
        class176 var3 = (class176) this.field2820.method3315(arg0);
        if (var3 != null) {
            this.field2819.method3302(var3);
        }
        return var3;
    }

    @ObfuscatedName("fd.b(J)V")
    public void method3278(long arg0) {
        class176 var3 = (class176) this.field2820.method3315(arg0);
        if (var3 != null) {
            var3.method3363();
            var3.method3311();
            this.field2821++;
        }
    }

    @ObfuscatedName("fd.r(Lfq;J)V")
    public void method3281(class176 arg0, long arg1) {
        if (this.field2821 == 0) {
            class176 var4 = this.field2819.method3290();
            var4.method3363();
            var4.method3311();
            if (this.field2817 == var4) {
                class176 var5 = this.field2819.method3290();
                var5.method3363();
                var5.method3311();
            }
        } else {
            this.field2821--;
        }
        this.field2820.method3329(arg0, arg1);
        this.field2819.method3302(arg0);
    }

    @ObfuscatedName("fd.l()V")
    public void method3279() {
        this.field2819.method3292();
        this.field2820.method3317();
        this.field2817 = new class176();
        this.field2821 = this.field2818;
    }
}
