package deob;

@ObfuscatedName("jv")
public class class262 extends class207 {

    @ObfuscatedName("jv.q")
    public static class201 field3324 = new class201(64);

    @ObfuscatedName("jv.b")
    public static class201 field3325 = new class201(64);

    @ObfuscatedName("jv.f")
    public int field3326;

    @ObfuscatedName("jv.x")
    public int field3327 = 255;

    @ObfuscatedName("jv.j")
    public int field3328 = 255;

    @ObfuscatedName("jv.a")
    public int field3329 = -1;

    @ObfuscatedName("jv.l")
    public int field3322 = 1;

    @ObfuscatedName("jv.d")
    public int field3331 = 70;

    @ObfuscatedName("jv.s")
    public int field3332 = -1;

    @ObfuscatedName("jv.p")
    public int field3333 = -1;

    @ObfuscatedName("jv.g")
    public int field3334 = 30;

    @ObfuscatedName("jv.y")
    public int field3335 = 0;

    @ObfuscatedName("hl.w(II)Ljv;")
    public static class262 method4202(int arg0) {
        class262 var1 = (class262) field3324.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3330.method4250(33, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4539(new class183(var2));
        }
        field3324.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.m(Lgy;I)V")
    public void method4539(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4547(arg0, var2);
        }
    }

    @ObfuscatedName("jv.q(Lgy;II)V")
    public void method4547(class183 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3268();
        } else if (arg1 == 2) {
            this.field3327 = arg0.method3436();
        } else if (arg1 == 3) {
            this.field3328 = arg0.method3436();
        } else if (arg1 == 4) {
            this.field3329 = 0;
        } else if (arg1 == 5) {
            this.field3331 = arg0.method3268();
        } else if (arg1 == 6) {
            arg0.method3436();
        } else if (arg1 == 7) {
            this.field3332 = arg0.method3279();
        } else if (arg1 == 8) {
            this.field3333 = arg0.method3279();
        } else if (arg1 == 11) {
            this.field3329 = arg0.method3268();
        } else if (arg1 == 14) {
            this.field3334 = arg0.method3436();
        } else if (arg1 == 15) {
            this.field3335 = arg0.method3436();
        }
    }

    @ObfuscatedName("jv.x(B)Llc;")
    public class319 method4541() {
        if (this.field3332 < 0) {
            return null;
        }
        class319 var1 = (class319) field3325.method3707((long) this.field3332);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method1871(Statics.field3323, this.field3332, 0);
        if (var2 != null) {
            field3325.method3712(var2, (long) this.field3332);
        }
        return var2;
    }

    @ObfuscatedName("jv.j(I)Llc;")
    public class319 method4542() {
        if (this.field3333 < 0) {
            return null;
        }
        class319 var1 = (class319) field3325.method3707((long) this.field3333);
        if (var1 != null) {
            return var1;
        }
        class319 var2 = class320.method1871(Statics.field3323, this.field3333, 0);
        if (var2 != null) {
            field3325.method3712(var2, (long) this.field3333);
        }
        return var2;
    }
}
