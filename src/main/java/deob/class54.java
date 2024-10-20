package deob;

@ObfuscatedName("cv")
public class class54 extends class505 {

    @ObfuscatedName("cv.aq")
    public class48 field346;

    public class54() {
        this.field346 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field346 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field346 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cv.aq(B)Z")
    public boolean method1024() {
        return this.field346 == null;
    }

    @ObfuscatedName("cv.ad(I)Lbl;")
    public class41 method1029() {
        if (this.field346 == null || !this.field346.field314.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1027();
        } finally {
            this.field346.field314.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cv.ag(B)Lbl;")
    public class41 method1026() {
        if (this.field346 == null) {
            return null;
        }
        this.field346.field314.lock();
        class41 var1;
        try {
            var1 = this.method1027();
        } finally {
            this.field346.field314.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cv.ak(I)Lbl;")
    public class41 method1027() {
        if (this.field346.field312 == null) {
            this.field346.field312 = this.field346.field311.method1040((int[]) null);
            this.field346.field311 = null;
        }
        return this.field346.field312;
    }
}
