package deob;

@ObfuscatedName("ff")
public final class class173 {

    @ObfuscatedName("ff.l")
    public class175 field2820 = new class175();

    public class173() {
        this.field2820.field2823 = this.field2820;
        this.field2820.field2824 = this.field2820;
    }

    @ObfuscatedName("ff.l(Lfi;)V")
    public void method3265(class175 arg0) {
        if (arg0.field2824 != null) {
            arg0.method3298();
        }
        arg0.field2824 = this.field2820.field2824;
        arg0.field2823 = this.field2820;
        arg0.field2824.field2823 = arg0;
        arg0.field2823.field2824 = arg0;
    }

    @ObfuscatedName("ff.b(Lfi;)V")
    public void method3264(class175 arg0) {
        if (arg0.field2824 != null) {
            arg0.method3298();
        }
        arg0.field2824 = this.field2820;
        arg0.field2823 = this.field2820.field2823;
        arg0.field2824.field2823 = arg0;
        arg0.field2823.field2824 = arg0;
    }

    @ObfuscatedName("ff.o()Lfi;")
    public class175 method3279() {
        class175 var1 = this.field2820.field2823;
        if (this.field2820 == var1) {
            return null;
        } else {
            var1.method3298();
            return var1;
        }
    }

    @ObfuscatedName("ff.w()Lfi;")
    public class175 method3276() {
        class175 var1 = this.field2820.field2823;
        return this.field2820 == var1 ? null : var1;
    }

    @ObfuscatedName("ff.r()V")
    public void method3275() {
        while (true) {
            class175 var1 = this.field2820.field2823;
            if (this.field2820 == var1) {
                return;
            }
            var1.method3298();
        }
    }
}
