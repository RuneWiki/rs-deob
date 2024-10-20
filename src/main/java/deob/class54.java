package deob;

@ObfuscatedName("cu")
public class class54 extends class488 {

    @ObfuscatedName("cu.ac")
    public class48 field383;

    public class54() {
        this.field383 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field383 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field383 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cu.ac(I)Z")
    public boolean method1007() {
        return this.field383 == null;
    }

    @ObfuscatedName("cu.al(I)Lbs;")
    public class41 method1008() {
        if (this.field383 == null || !this.field383.field349.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1014();
        } finally {
            this.field383.field349.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cu.ak(I)Lbs;")
    public class41 method1005() {
        if (this.field383 == null) {
            return null;
        }
        this.field383.field349.lock();
        class41 var1;
        try {
            var1 = this.method1014();
        } finally {
            this.field383.field349.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cu.ax(I)Lbs;")
    public class41 method1014() {
        if (this.field383.field345 == null) {
            this.field383.field345 = this.field383.field346.method1025((int[]) null);
            this.field383.field346 = null;
        }
        return this.field383.field345;
    }
}
