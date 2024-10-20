package deob;

@ObfuscatedName("fe")
public final class class174 {

    @ObfuscatedName("fe.i")
    public class176 field2823 = new class176();

    public class174() {
        this.field2823.field2827 = this.field2823;
        this.field2823.field2826 = this.field2823;
    }

    @ObfuscatedName("fe.i(Lfq;)V")
    public void method3302(class176 arg0) {
        if (arg0.field2826 != null) {
            arg0.method3311();
        }
        arg0.field2826 = this.field2823.field2826;
        arg0.field2827 = this.field2823;
        arg0.field2826.field2827 = arg0;
        arg0.field2827.field2826 = arg0;
    }

    @ObfuscatedName("fe.b(Lfq;)V")
    public void method3289(class176 arg0) {
        if (arg0.field2826 != null) {
            arg0.method3311();
        }
        arg0.field2826 = this.field2823;
        arg0.field2827 = this.field2823.field2827;
        arg0.field2826.field2827 = arg0;
        arg0.field2827.field2826 = arg0;
    }

    @ObfuscatedName("fe.r()Lfq;")
    public class176 method3290() {
        class176 var1 = this.field2823.field2827;
        if (this.field2823 == var1) {
            return null;
        } else {
            var1.method3311();
            return var1;
        }
    }

    @ObfuscatedName("fe.l()Lfq;")
    public class176 method3291() {
        class176 var1 = this.field2823.field2827;
        return this.field2823 == var1 ? null : var1;
    }

    @ObfuscatedName("fe.s()V")
    public void method3292() {
        while (true) {
            class176 var1 = this.field2823.field2827;
            if (this.field2823 == var1) {
                return;
            }
            var1.method3311();
        }
    }
}
