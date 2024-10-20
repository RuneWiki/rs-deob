package deob;

@ObfuscatedName("cf")
public class class54 extends class474 {

    @ObfuscatedName("cf.aw")
    public class48 field392;

    public class54() {
        this.field392 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field392 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field392 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cf.aw(B)Z")
    public boolean method1022() {
        return this.field392 == null;
    }

    @ObfuscatedName("cf.ay(B)Lbi;")
    public class41 method1020() {
        if (this.field392 == null || !this.field392.field356.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1025();
        } finally {
            this.field392.field356.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cf.ar(B)Lbi;")
    public class41 method1028() {
        if (this.field392 == null) {
            return null;
        }
        this.field392.field356.lock();
        class41 var1;
        try {
            var1 = this.method1025();
        } finally {
            this.field392.field356.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cf.am(I)Lbi;")
    public class41 method1025() {
        if (this.field392.field355 == null) {
            this.field392.field355 = this.field392.field359.method1049((int[]) null);
            this.field392.field359 = null;
        }
        return this.field392.field355;
    }
}
