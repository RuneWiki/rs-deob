package deob;

import java.util.Iterator;

@ObfuscatedName("ue")
public class class540 extends class498 implements class312 {

    @ObfuscatedName("ue.aw")
    public final class392 field5373;

    @ObfuscatedName("ue.ak")
    public final class314 field5371 = new class314(64);

    @ObfuscatedName("ue.aj")
    public final int field5369;

    public class540(class378 arg0, int arg1, class407 arg2, class392 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method7004(arg1));
        this.field5373 = arg3;
        this.field5369 = arg1;
    }

    @ObfuscatedName("ue.ap(IB)Ltv;")
    public class500 method8575(int arg0) {
        class314 var2 = this.field5371;
        synchronized (this.field5371) {
            class499 var3 = (class499) this.field5371.method5901((long) arg0);
            if (var3 == null) {
                var3 = this.method9086(arg0);
                this.field5371.method5904(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("ue.ag(II)Ltq;")
    public class499 method9086(int arg0) {
        byte[] var2 = this.field5373.method7009(this.field5369, arg0);
        class499 var3 = new class499(arg0);
        if (var2 != null) {
            var3.method8596(new class558(var2));
        }
        return var3;
    }

    @ObfuscatedName("ue.ad(I)V")
    public void method9087() {
        class314 var1 = this.field5371;
        synchronized (this.field5371) {
            this.field5371.method5907();
        }
    }

    public Iterator iterator() {
        return new class539(this);
    }
}
