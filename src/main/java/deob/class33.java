package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("am")
public class class33 {

    @ObfuscatedName("am.i")
    public int field460 = -1;

    @ObfuscatedName("am.j")
    public String field458;

    @ObfuscatedName("am.a")
    public String field459;

    @ObfuscatedName("am.r")
    public int field464 = -1;

    @ObfuscatedName("am.o")
    public int field468 = -1;

    @ObfuscatedName("am.n")
    public class214 field462 = null;

    @ObfuscatedName("am.q")
    public int field463 = Integer.MAX_VALUE;

    @ObfuscatedName("am.b")
    public int field469 = 0;

    @ObfuscatedName("am.k")
    public int field457 = Integer.MAX_VALUE;

    @ObfuscatedName("am.s")
    public int field466 = 0;

    @ObfuscatedName("am.d")
    public boolean field467 = false;

    @ObfuscatedName("am.l")
    public LinkedList field465;

    @ObfuscatedName("am.i(Lfp;II)V")
    public void method276(class175 arg0, int arg1) {
        this.field460 = arg1;
        this.field458 = arg0.method3002();
        this.field459 = arg0.method3002();
        this.field462 = new class214(arg0.method2998());
        this.field464 = arg0.method2998();
        arg0.method2999();
        this.field467 = arg0.method2999() == 1;
        this.field468 = arg0.method2999();
        int var3 = arg0.method2999();
        this.field465 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field465.add(this.method266(arg0));
        }
        this.method271();
    }

    @ObfuscatedName("am.j(Lfp;I)Law;")
    public class43 method266(class175 arg0) {
        int var2 = arg0.method2999();
        class28 var3 = (class28) class170.method1570(class28.method228(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field406) {
            case 0:
                var5 = new class49();
                break;
            case 1:
                var5 = new class27();
                break;
            case 2:
                var5 = new class39();
                break;
            case 3:
                var5 = new class31();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method204(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("am.a(IIII)Z")
    public boolean method267(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field465.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method225(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("am.r(III)Z")
    public boolean method268(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field463 || var3 > this.field469) {
            return false;
        } else if (var4 >= this.field457 && var4 <= this.field466) {
            Iterator var5 = this.field465.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method201(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.o(IIII)[I")
    public int[] method269(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field465.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method225(arg0, arg1, arg2));
        return var5.method202(arg0, arg1, arg2);
    }

    @ObfuscatedName("am.n(III)Lhs;")
    public class214 method270(int arg0, int arg1) {
        Iterator var3 = this.field465.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method201(arg0, arg1));
        return var4.method203(arg0, arg1);
    }

    @ObfuscatedName("am.q(S)V")
    public void method271() {
        Iterator var1 = this.field465.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method199(this);
        }
    }

    @ObfuscatedName("am.b(I)I")
    public int method272() {
        return this.field460;
    }

    @ObfuscatedName("am.k(I)Z")
    public boolean method273() {
        return this.field467;
    }

    @ObfuscatedName("am.s(I)Ljava/lang/String;")
    public String method299() {
        return this.field458;
    }

    @ObfuscatedName("am.d(B)Ljava/lang/String;")
    public String method282() {
        return this.field459;
    }

    @ObfuscatedName("am.l(I)I")
    public int method321() {
        return this.field464;
    }

    @ObfuscatedName("am.c(I)I")
    public int method277() {
        return this.field468;
    }

    @ObfuscatedName("am.u(I)I")
    public int method319() {
        return this.field463;
    }

    @ObfuscatedName("am.e(B)I")
    public int method279() {
        return this.field469;
    }

    @ObfuscatedName("am.p(I)I")
    public int method332() {
        return this.field457;
    }

    @ObfuscatedName("am.m(I)I")
    public int method281() {
        return this.field466;
    }

    @ObfuscatedName("am.x(I)I")
    public int method333() {
        return this.field462.field2617;
    }

    @ObfuscatedName("am.g(B)I")
    public int method283() {
        return this.field462.field2618;
    }

    @ObfuscatedName("am.w(I)I")
    public int method284() {
        return this.field462.field2619;
    }

    @ObfuscatedName("am.ar(B)Lhs;")
    public class214 method265() {
        return new class214(this.field462);
    }
}
