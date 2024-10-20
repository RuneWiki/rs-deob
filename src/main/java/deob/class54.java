package deob;

@ObfuscatedName("cj")
public class class54 extends class493 {

    @ObfuscatedName("cj.az")
    public class48 field359;

    public class54() {
        this.field359 = null;
    }

    public class54(class55 arg0) {
        if (arg0 != null) {
            this.field359 = new class48(arg0, (class41) null);
        }
    }

    public class54(class41 arg0) {
        this.field359 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cj.az(I)Z")
    public boolean method977() {
        return this.field359 == null;
    }

    @ObfuscatedName("cj.ah(I)Lbr;")
    public class41 method978() {
        if (this.field359 == null || !this.field359.field322.tryLock()) {
            return null;
        }
        class41 var1;
        try {
            var1 = this.method986();
        } finally {
            this.field359.field322.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cj.af(S)Lbr;")
    public class41 method979() {
        if (this.field359 == null) {
            return null;
        }
        this.field359.field322.lock();
        class41 var1;
        try {
            var1 = this.method986();
        } finally {
            this.field359.field322.unlock();
        }
        return var1;
    }

    @ObfuscatedName("cj.at(I)Lbr;")
    public class41 method986() {
        if (this.field359.field321 == null) {
            this.field359.field321 = this.field359.field323.method997((int[]) null);
            this.field359.field323 = null;
        }
        return this.field359.field321;
    }
}
