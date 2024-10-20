package deob;

@ObfuscatedName("ck")
public class class54 extends class504 {

    @ObfuscatedName("ck.ak")
    public class48 field372;

    public class54() {
        this.field372 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field372 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field372 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("ck.ak(B)Z")
    public boolean method1003() {
        return this.field372 == null;
    }

    @ObfuscatedName("ck.al(I)Lbr;")
    public class41 method1004() {
        if (this.field372 == null || !this.field372.field331.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method1006();
        } finally {
            this.field372.field331.unlock();
        }
        return var1;
    }

    @ObfuscatedName("ck.aj(I)Lbr;")
    public class41 method1002() {
        if (this.field372 == null) {
            return null;
        }
        this.field372.field331.lock();
        class41 var1;
        try {
            var1 = this.method1006();
        } finally {
            this.field372.field331.unlock();
        }
        return var1;
    }

    @ObfuscatedName("ck.az(B)Lbr;")
    public class41 method1006() {
        if (this.field372.field336 == null) {
            this.field372.field336 = this.field372.field330.method1034((int[]) null);
            this.field372.field330 = null;
        }
        return this.field372.field336;
    }
}
