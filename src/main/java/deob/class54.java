package deob;

@ObfuscatedName("cb")
public class class54 extends class489 {

    @ObfuscatedName("cb.am")
    public class48 field369;

    public class54() {
        this.field369 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field369 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field369 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cb.am(I)Z")
    public boolean method1049() {
        return this.field369 == null;
    }

    @ObfuscatedName("cb.ap(I)Lbm;")
    public class41 method1039() {
        if (this.field369 == null || !this.field369.field335.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1041();
        } finally {
            this.field369.field335.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cb.af(I)Lbm;")
    public class41 method1040() {
        if (this.field369 == null) {
            return null;
        }
        this.field369.field335.lock();
        class41 var1;
        try {
            var1 = this.method1041();
        } finally {
            this.field369.field335.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cb.aj(B)Lbm;")
    public class41 method1041() {
        if (this.field369.field338 == null) {
            this.field369.field338 = this.field369.field337.method1056((int[]) null);
            this.field369.field337 = null;
        }
        return this.field369.field338;
    }
}
