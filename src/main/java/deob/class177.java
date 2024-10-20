package deob;

@ObfuscatedName("fm")
public class class177 {

    @ObfuscatedName("fm.p")
    public class179 field2816 = new class179();

    @ObfuscatedName("fm.l")
    public class179 field2815;

    public class177() {
        this.field2816.field2820 = this.field2816;
        this.field2816.field2819 = this.field2816;
    }

    @ObfuscatedName("fm.p()V")
    public void method3449() {
        while (true) {
            class179 var1 = this.field2816.field2820;
            if (this.field2816 == var1) {
                this.field2815 = null;
                return;
            }
            var1.method3455();
        }
    }

    @ObfuscatedName("fm.l(Lfn;)V")
    public void method3422(class179 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3455();
        }
        arg0.field2819 = this.field2816.field2819;
        arg0.field2820 = this.field2816;
        arg0.field2819.field2820 = arg0;
        arg0.field2820.field2819 = arg0;
    }

    @ObfuscatedName("fm.d(Lfn;)V")
    public void method3433(class179 arg0) {
        if (arg0.field2819 != null) {
            arg0.method3455();
        }
        arg0.field2819 = this.field2816;
        arg0.field2820 = this.field2816.field2820;
        arg0.field2819.field2820 = arg0;
        arg0.field2820.field2819 = arg0;
    }

    @ObfuscatedName("fm.x(Lfn;Lfn;)V")
    public static void method3436(class179 arg0, class179 arg1) {
        if (arg0.field2819 != null) {
            arg0.method3455();
        }
        arg0.field2819 = arg1.field2819;
        arg0.field2820 = arg1;
        arg0.field2819.field2820 = arg0;
        arg0.field2820.field2819 = arg0;
    }

    @ObfuscatedName("fm.o()Lfn;")
    public class179 method3425() {
        class179 var1 = this.field2816.field2820;
        if (this.field2816 == var1) {
            return null;
        } else {
            var1.method3455();
            return var1;
        }
    }

    @ObfuscatedName("fm.a()Lfn;")
    public class179 method3423() {
        class179 var1 = this.field2816.field2819;
        if (this.field2816 == var1) {
            return null;
        } else {
            var1.method3455();
            return var1;
        }
    }

    @ObfuscatedName("fm.w()Lfn;")
    public class179 method3446() {
        class179 var1 = this.field2816.field2820;
        if (this.field2816 == var1) {
            this.field2815 = null;
            return null;
        } else {
            this.field2815 = var1.field2820;
            return var1;
        }
    }

    @ObfuscatedName("fm.i()Lfn;")
    public class179 method3421() {
        class179 var1 = this.field2816.field2819;
        if (this.field2816 == var1) {
            this.field2815 = null;
            return null;
        } else {
            this.field2815 = var1.field2819;
            return var1;
        }
    }

    @ObfuscatedName("fm.y()Lfn;")
    public class179 method3428() {
        class179 var1 = this.field2815;
        if (this.field2816 == var1) {
            this.field2815 = null;
            return null;
        } else {
            this.field2815 = var1.field2820;
            return var1;
        }
    }

    @ObfuscatedName("fm.m()Lfn;")
    public class179 method3430() {
        class179 var1 = this.field2815;
        if (this.field2816 == var1) {
            this.field2815 = null;
            return null;
        } else {
            this.field2815 = var1.field2819;
            return var1;
        }
    }
}
