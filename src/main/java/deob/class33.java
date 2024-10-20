package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("az")
public class class33 {

    @ObfuscatedName("az.t")
    public int field424 = -1;

    @ObfuscatedName("az.q")
    public String field422;

    @ObfuscatedName("az.i")
    public String field426;

    @ObfuscatedName("az.a")
    public int field425 = -1;

    @ObfuscatedName("az.l")
    public int field435 = -1;

    @ObfuscatedName("az.b")
    public class239 field427 = null;

    @ObfuscatedName("az.e")
    public int field430 = Integer.MAX_VALUE;

    @ObfuscatedName("az.x")
    public int field429 = 0;

    @ObfuscatedName("az.p")
    public int field423 = Integer.MAX_VALUE;

    @ObfuscatedName("az.g")
    public int field431 = 0;

    @ObfuscatedName("az.n")
    public boolean field432 = false;

    @ObfuscatedName("az.o")
    public LinkedList field433;

    @ObfuscatedName("az.t(Lgb;II)V")
    public void method252(class195 arg0, int arg1) {
        this.field424 = arg1;
        this.field422 = arg0.method3257();
        this.field426 = arg0.method3257();
        this.field427 = new class239(arg0.method3241());
        this.field425 = arg0.method3241();
        arg0.method3236();
        this.field432 = arg0.method3236() == 1;
        this.field435 = arg0.method3236();
        int var3 = arg0.method3236();
        this.field433 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field433.add(this.method253(arg0));
        }
        this.method258();
    }

    @ObfuscatedName("az.q(Lgb;B)Las;")
    public class44 method253(class195 arg0) {
        int var2 = arg0.method3236();
        class28[] var3 = new class28[] { class28.field369, class28.field376, class28.field371, class28.field367 };
        class28 var4 = (class28) class190.method241(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field370) {
            case 0:
                var6 = new class40();
                break;
            case 1:
                var6 = new class31();
                break;
            case 2:
                var6 = new class50();
                break;
            case 3:
                var6 = new class27();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class44) var6).method194(arg0);
        return (class44) var6;
    }

    @ObfuscatedName("az.i(IIIB)Z")
    public boolean method254(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field433.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class44) var4.next();
        } while (!var5.method189(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("az.a(IIB)Z")
    public boolean method255(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field430 || var3 > this.field429) {
            return false;
        } else if (var4 >= this.field423 && var4 <= this.field431) {
            Iterator var5 = this.field433.iterator();
            class44 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class44) var5.next();
            } while (!var6.method212(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("az.l(IIIB)[I")
    public int[] method260(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field433.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class44) var4.next();
        } while (!var5.method189(arg0, arg1, arg2));
        return var5.method192(arg0, arg1, arg2);
    }

    @ObfuscatedName("az.b(III)Lik;")
    public class239 method257(int arg0, int arg1) {
        Iterator var3 = this.field433.iterator();
        class44 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class44) var3.next();
        } while (!var4.method212(arg0, arg1));
        return var4.method211(arg0, arg1);
    }

    @ObfuscatedName("az.e(I)V")
    public void method258() {
        Iterator var1 = this.field433.iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            var2.method190(this);
        }
    }

    @ObfuscatedName("az.x(I)I")
    public int method305() {
        return this.field424;
    }

    @ObfuscatedName("az.p(I)Z")
    public boolean method312() {
        return this.field432;
    }

    @ObfuscatedName("az.o(I)Ljava/lang/String;")
    public String method261() {
        return this.field422;
    }

    @ObfuscatedName("az.c(I)Ljava/lang/String;")
    public String method262() {
        return this.field426;
    }

    @ObfuscatedName("az.u(I)I")
    public int method263() {
        return this.field425;
    }

    @ObfuscatedName("az.k(I)I")
    public int method328() {
        return this.field435;
    }

    @ObfuscatedName("az.z(B)I")
    public int method264() {
        return this.field430;
    }

    @ObfuscatedName("az.w(S)I")
    public int method265() {
        return this.field429;
    }

    @ObfuscatedName("az.s(I)I")
    public int method266() {
        return this.field423;
    }

    @ObfuscatedName("az.d(B)I")
    public int method267() {
        return this.field431;
    }

    @ObfuscatedName("az.f(I)I")
    public int method268() {
        return this.field427.field2777;
    }

    @ObfuscatedName("az.r(I)I")
    public int method269() {
        return this.field427.field2778;
    }

    @ObfuscatedName("az.y(B)I")
    public int method270() {
        return this.field427.field2776;
    }

    @ObfuscatedName("az.h(B)Lik;")
    public class239 method321() {
        return new class239(this.field427);
    }
}
