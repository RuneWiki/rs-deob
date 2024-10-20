package deob;

import java.util.Iterator;

@ObfuscatedName("qf")
public class class449 extends class413 implements class262 {

    @ObfuscatedName("qf.f")
    public final class330 field4820;

    @ObfuscatedName("qf.c")
    public final class264 field4819 = new class264(64);

    @ObfuscatedName("qf.x")
    public final int field4818;

    public class449(class319 arg0, int arg1, class345 arg2, class330 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5793(arg1));
        this.field4820 = arg3;
        this.field4818 = arg1;
    }

    @ObfuscatedName("qf.a(II)Loz;")
    public class415 method7113(int arg0) {
        class264 var2 = this.field4819;
        synchronized (this.field4819) {
            class414 var3 = (class414) this.field4819.method4812((long) arg0);
            if (var3 == null) {
                var3 = this.method7550(arg0);
                this.field4819.method4809(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("qf.u(IS)Loa;")
    public class414 method7550(int arg0) {
        byte[] var2 = this.field4820.method5859(this.field4818, arg0);
        class414 var3 = new class414(arg0);
        if (var2 != null) {
            var3.method7126(new class464(var2));
        }
        return var3;
    }

    @ObfuscatedName("qf.z(I)V")
    public void method7549() {
        class264 var1 = this.field4819;
        synchronized (this.field4819) {
            this.field4819.method4820();
        }
    }

    public Iterator iterator() {
        return new class448(this);
    }
}
