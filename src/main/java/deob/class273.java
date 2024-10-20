package deob;

@ObfuscatedName("jp")
public class class273 {

    @ObfuscatedName("jp.h")
    public class190 field3569 = new class190();

    @ObfuscatedName("jp.v")
    public class190 field3570;

    public class273() {
        this.field3569.field2137 = this.field3569;
        this.field3569.field2139 = this.field3569;
    }

    @ObfuscatedName("jp.h()V")
    public void method4537() {
        while (true) {
            class190 var1 = this.field3569.field2137;
            if (this.field3569 == var1) {
                this.field3570 = null;
                return;
            }
            var1.method3359();
        }
    }

    @ObfuscatedName("jp.v(Lgu;)V")
    public void method4549(class190 arg0) {
        if (arg0.field2139 != null) {
            arg0.method3359();
        }
        arg0.field2139 = this.field3569.field2139;
        arg0.field2137 = this.field3569;
        arg0.field2139.field2137 = arg0;
        arg0.field2137.field2139 = arg0;
    }

    @ObfuscatedName("jp.x(Lgu;)V")
    public void method4539(class190 arg0) {
        if (arg0.field2139 != null) {
            arg0.method3359();
        }
        arg0.field2139 = this.field3569;
        arg0.field2137 = this.field3569.field2137;
        arg0.field2139.field2137 = arg0;
        arg0.field2137.field2139 = arg0;
    }

    @ObfuscatedName("jp.w(Lgu;Lgu;)V")
    public static void method4546(class190 arg0, class190 arg1) {
        if (arg0.field2139 != null) {
            arg0.method3359();
        }
        arg0.field2139 = arg1.field2139;
        arg0.field2137 = arg1;
        arg0.field2139.field2137 = arg0;
        arg0.field2137.field2139 = arg0;
    }

    @ObfuscatedName("jp.t()Lgu;")
    public class190 method4541() {
        class190 var1 = this.field3569.field2137;
        if (this.field3569 == var1) {
            return null;
        } else {
            var1.method3359();
            return var1;
        }
    }

    @ObfuscatedName("jp.j()Lgu;")
    public class190 method4542() {
        class190 var1 = this.field3569.field2139;
        if (this.field3569 == var1) {
            return null;
        } else {
            var1.method3359();
            return var1;
        }
    }

    @ObfuscatedName("jp.n()Lgu;")
    public class190 method4540() {
        class190 var1 = this.field3569.field2137;
        if (this.field3569 == var1) {
            this.field3570 = null;
            return null;
        } else {
            this.field3570 = var1.field2137;
            return var1;
        }
    }

    @ObfuscatedName("jp.p()Lgu;")
    public class190 method4544() {
        class190 var1 = this.field3569.field2139;
        if (this.field3569 == var1) {
            this.field3570 = null;
            return null;
        } else {
            this.field3570 = var1.field2139;
            return var1;
        }
    }

    @ObfuscatedName("jp.l()Lgu;")
    public class190 method4545() {
        class190 var1 = this.field3570;
        if (this.field3569 == var1) {
            this.field3570 = null;
            return null;
        } else {
            this.field3570 = var1.field2137;
            return var1;
        }
    }

    @ObfuscatedName("jp.z()Lgu;")
    public class190 method4554() {
        class190 var1 = this.field3570;
        if (this.field3569 == var1) {
            this.field3570 = null;
            return null;
        } else {
            this.field3570 = var1.field2139;
            return var1;
        }
    }
}
