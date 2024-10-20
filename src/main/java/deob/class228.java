package deob;

import java.util.Iterator;

@ObfuscatedName("hn")
public class class228 implements Iterable {

    @ObfuscatedName("hn.d")
    public class219 field2677 = new class219();

    @ObfuscatedName("hn.z")
    public class219 field2676;

    public class228() {
        this.field2677.field2660 = this.field2677;
        this.field2677.field2658 = this.field2677;
    }

    @ObfuscatedName("hn.d()V")
    public void method3868() {
        while (this.field2677.field2660 != this.field2677) {
            this.field2677.field2660.method3828();
        }
    }

    @ObfuscatedName("hn.z(Lhu;)V")
    public void method3869(class219 arg0) {
        if (arg0.field2658 != null) {
            arg0.method3828();
        }
        arg0.field2658 = this.field2677.field2658;
        arg0.field2660 = this.field2677;
        arg0.field2658.field2660 = arg0;
        arg0.field2660.field2658 = arg0;
    }

    @ObfuscatedName("hn.n()Lhu;")
    public class219 method3870() {
        class219 var1 = this.field2677.field2660;
        if (this.field2677 == var1) {
            return null;
        } else {
            var1.method3828();
            return var1;
        }
    }

    @ObfuscatedName("hn.r()Lhu;")
    public class219 method3876() {
        return this.method3874((class219) null);
    }

    @ObfuscatedName("hn.e(Lhu;)Lhu;")
    public class219 method3874(class219 arg0) {
        class219 var2;
        if (arg0 == null) {
            var2 = this.field2677.field2660;
        } else {
            var2 = arg0;
        }
        if (this.field2677 == var2) {
            this.field2676 = null;
            return null;
        } else {
            this.field2676 = var2.field2660;
            return var2;
        }
    }

    @ObfuscatedName("hn.y()Lhu;")
    public class219 method3873() {
        class219 var1 = this.field2676;
        if (this.field2677 == var1) {
            this.field2676 = null;
            return null;
        } else {
            this.field2676 = var1.field2660;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class227(this);
    }
}
