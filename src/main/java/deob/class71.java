package deob;

@ObfuscatedName("fd")
public class class71 {

    @ObfuscatedName("fd.c")
    public class13 field1032;

    @ObfuscatedName("fd.v")
    public class13 field1033 = new class13();

    @ObfuscatedName("fd.v()V")
    public void method1098() {
        while (true) {
            class13 var1 = this.field1033.field77;
            if (this.field1033 == var1) {
                this.field1032 = null;
                return;
            }
            var1.method76();
        }
    }

    @ObfuscatedName("fd.c(Lfi;)V")
    public void method1099(class13 arg0) {
        if (arg0.field78 != null) {
            arg0.method76();
        }
        arg0.field78 = this.field1033.field78;
        arg0.field77 = this.field1033;
        arg0.field78.field77 = arg0;
        arg0.field77.field78 = arg0;
    }

    @ObfuscatedName("fd.i(Lfi;Lfi;)V")
    public static void method1101(class13 arg0, class13 arg1) {
        if (arg0.field78 != null) {
            arg0.method76();
        }
        arg0.field78 = arg1.field78;
        arg0.field77 = arg1;
        arg0.field78.field77 = arg0;
        arg0.field77.field78 = arg0;
    }

    @ObfuscatedName("fd.m()Lfi;")
    public class13 method1102() {
        class13 var1 = this.field1033.field77;
        if (this.field1033 == var1) {
            return null;
        } else {
            var1.method76();
            return var1;
        }
    }

    @ObfuscatedName("fd.x()Lfi;")
    public class13 method1104() {
        class13 var1 = this.field1033.field77;
        if (this.field1033 == var1) {
            this.field1032 = null;
            return null;
        } else {
            this.field1032 = var1.field77;
            return var1;
        }
    }

    @ObfuscatedName("fd.d()Lfi;")
    public class13 method1105() {
        class13 var1 = this.field1033.field78;
        if (this.field1033 == var1) {
            this.field1032 = null;
            return null;
        } else {
            this.field1032 = var1.field78;
            return var1;
        }
    }

    @ObfuscatedName("fd.j()Lfi;")
    public class13 method1106() {
        class13 var1 = this.field1032;
        if (this.field1033 == var1) {
            this.field1032 = null;
            return null;
        } else {
            this.field1032 = var1.field77;
            return var1;
        }
    }

    @ObfuscatedName("fd.b(Lfi;)V")
    public void method1107(class13 arg0) {
        if (arg0.field78 != null) {
            arg0.method76();
        }
        arg0.field78 = this.field1033;
        arg0.field77 = this.field1033.field77;
        arg0.field78.field77 = arg0;
        arg0.field77.field78 = arg0;
    }

    @ObfuscatedName("fd.g()Lfi;")
    public class13 method1113() {
        class13 var1 = this.field1032;
        if (this.field1033 == var1) {
            this.field1032 = null;
            return null;
        } else {
            this.field1032 = var1.field78;
            return var1;
        }
    }

    public class71() {
        this.field1033.field77 = this.field1033;
        this.field1033.field78 = this.field1033;
    }

    @ObfuscatedName("fd.z()Lfi;")
    public class13 method1137() {
        class13 var1 = this.field1033.field78;
        if (this.field1033 == var1) {
            return null;
        } else {
            var1.method76();
            return var1;
        }
    }
}
