package deob;

@ObfuscatedName("cu")
public class class54 extends class461 {

    @ObfuscatedName("cu.at")
    public class48 field372;

    public class54() {
        this.field372 = null;
    }

    public class54(class55 arg0) {
        this.field372 = new class48(arg0, (class41) null);
    }

    public class54(class41 arg0) {
        this.field372 = new class48((class55) null, arg0);
    }

    @ObfuscatedName("cu.at(I)Z")
    public boolean method973() {
        return this.field372 == null;
    }

    @ObfuscatedName("cu.an(I)Lbp;")
    public class41 method971() {
        if (this.field372 != null && this.field372.field332.tryLock()) {
            class41 var1 = this.method972();
            this.field372.field332.unlock();
            return var1;
        } else {
            return null;
        }
    }

    @ObfuscatedName("cu.av(B)Lbp;")
    public class41 method970() {
        if (this.field372 == null) {
            return null;
        } else {
            this.field372.field332.lock();
            class41 var1 = this.method972();
            this.field372.field332.unlock();
            return var1;
        }
    }

    @ObfuscatedName("cu.as(I)Lbp;")
    public class41 method972() {
        if (this.field372.field333 == null) {
            this.field372.field333 = this.field372.field334.method991((int[]) null);
            this.field372.field334 = null;
        }
        return this.field372.field333;
    }
}
