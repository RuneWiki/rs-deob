package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.d")
    public int field462 = -1;

    @ObfuscatedName("al.z")
    public String field466;

    @ObfuscatedName("al.n")
    public String field456;

    @ObfuscatedName("al.r")
    public int field457 = -1;

    @ObfuscatedName("al.e")
    public int field455 = -1;

    @ObfuscatedName("al.y")
    public class239 field458 = null;

    @ObfuscatedName("al.k")
    public int field460 = Integer.MAX_VALUE;

    @ObfuscatedName("al.s")
    public int field461 = 0;

    @ObfuscatedName("al.p")
    public int field454 = Integer.MAX_VALUE;

    @ObfuscatedName("al.x")
    public int field463 = 0;

    @ObfuscatedName("al.m")
    public boolean field459 = false;

    @ObfuscatedName("al.h")
    public LinkedList field465;

    @ObfuscatedName("al.d(Lgy;II)V")
    public void method265(class195 arg0, int arg1) {
        this.field462 = arg1;
        this.field466 = arg0.method3268();
        this.field456 = arg0.method3268();
        this.field458 = new class239(arg0.method3264());
        this.field457 = arg0.method3264();
        arg0.method3330();
        this.field459 = arg0.method3330() == 1;
        this.field455 = arg0.method3330();
        int var3 = arg0.method3330();
        this.field465 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field465.add(this.method255(arg0));
        }
        this.method317();
    }

    @ObfuscatedName("al.z(Lgy;I)Lan;")
    public class44 method255(class195 arg0) {
        int var2 = arg0.method3330();
        class28[] var3 = new class28[] { class28.field400, class28.field402, class28.field405, class28.field401 };
        class28 var4 = (class28) class190.method500(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field407) {
            case 0:
                var6 = new class31();
                break;
            case 1:
                var6 = new class40();
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
        ((class44) var6).method190(arg0);
        return (class44) var6;
    }

    @ObfuscatedName("al.n(IIIB)Z")
    public boolean method256(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field465.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class44) var4.next();
        } while (!var5.method186(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("al.r(III)Z")
    public boolean method304(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field460 || var3 > this.field461) {
            return false;
        } else if (var4 >= this.field454 && var4 <= this.field463) {
            Iterator var5 = this.field465.iterator();
            class44 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class44) var5.next();
            } while (!var6.method187(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("al.e(IIII)[I")
    public int[] method257(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field465.iterator();
        class44 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class44) var4.next();
        } while (!var5.method186(arg0, arg1, arg2));
        return var5.method207(arg0, arg1, arg2);
    }

    @ObfuscatedName("al.y(IIB)Lic;")
    public class239 method258(int arg0, int arg1) {
        Iterator var3 = this.field465.iterator();
        class44 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class44) var3.next();
        } while (!var4.method187(arg0, arg1));
        return var4.method191(arg0, arg1);
    }

    @ObfuscatedName("al.k(I)V")
    public void method317() {
        Iterator var1 = this.field465.iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            var2.method185(this);
        }
    }

    @ObfuscatedName("al.s(I)I")
    public int method260() {
        return this.field462;
    }

    @ObfuscatedName("al.x(I)Z")
    public boolean method279() {
        return this.field459;
    }

    @ObfuscatedName("al.h(B)Ljava/lang/String;")
    public String method262() {
        return this.field466;
    }

    @ObfuscatedName("al.t(I)Ljava/lang/String;")
    public String method254() {
        return this.field456;
    }

    @ObfuscatedName("al.i(B)I")
    public int method264() {
        return this.field457;
    }

    @ObfuscatedName("al.u(B)I")
    public int method295() {
        return this.field455;
    }

    @ObfuscatedName("al.q(I)I")
    public int method278() {
        return this.field460;
    }

    @ObfuscatedName("al.v(I)I")
    public int method266() {
        return this.field461;
    }

    @ObfuscatedName("al.f(I)I")
    public int method268() {
        return this.field454;
    }

    @ObfuscatedName("al.b(I)I")
    public int method314() {
        return this.field463;
    }

    @ObfuscatedName("al.c(I)I")
    public int method270() {
        return this.field458.field2791;
    }

    @ObfuscatedName("al.w(B)I")
    public int method271() {
        return this.field458.field2790;
    }

    @ObfuscatedName("al.o(I)I")
    public int method272() {
        return this.field458.field2789;
    }

    @ObfuscatedName("al.a(B)Lic;")
    public class239 method273() {
        return new class239(this.field458);
    }
}
