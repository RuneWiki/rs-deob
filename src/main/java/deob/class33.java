package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ae")
public class class33 {

    @ObfuscatedName("ae.e")
    public int field469 = -1;

    @ObfuscatedName("ae.n")
    public String field455;

    @ObfuscatedName("ae.g")
    public String field456;

    @ObfuscatedName("ae.y")
    public int field460 = -1;

    @ObfuscatedName("ae.w")
    public int field464 = -1;

    @ObfuscatedName("ae.k")
    public class214 field459 = null;

    @ObfuscatedName("ae.v")
    public int field458 = Integer.MAX_VALUE;

    @ObfuscatedName("ae.z")
    public int field461 = 0;

    @ObfuscatedName("ae.r")
    public int field454 = Integer.MAX_VALUE;

    @ObfuscatedName("ae.u")
    public int field463 = 0;

    @ObfuscatedName("ae.d")
    public boolean field457 = false;

    @ObfuscatedName("ae.o")
    public LinkedList field465;

    @ObfuscatedName("ae.e(Lfh;II)V")
    public void method286(class175 arg0, int arg1) {
        this.field469 = arg1;
        this.field455 = arg0.method3113();
        this.field456 = arg0.method3113();
        this.field459 = new class214(arg0.method2933());
        this.field460 = arg0.method2933();
        arg0.method2928();
        this.field457 = arg0.method2928() == 1;
        this.field464 = arg0.method2928();
        int var3 = arg0.method2928();
        this.field465 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field465.add(this.method314(arg0));
        }
        this.method260();
    }

    @ObfuscatedName("ae.n(Lfh;I)Lam;")
    public class43 method314(class175 arg0) {
        int var2 = arg0.method2928();
        class28 var3 = (class28) class170.method2298(class28.method210(), var2);
        Object var4 = null;
        Object var5;
        switch(var3.field398) {
            case 0:
                var5 = new class49();
                break;
            case 1:
                var5 = new class27();
                break;
            case 2:
                var5 = new class31();
                break;
            case 3:
                var5 = new class39();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var5).method186(arg0);
        return (class43) var5;
    }

    @ObfuscatedName("ae.g(IIII)Z")
    public boolean method256(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field465.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method209(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ae.y(III)Z")
    public boolean method253(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field458 || var3 > this.field461) {
            return false;
        } else if (var4 >= this.field454 && var4 <= this.field463) {
            Iterator var5 = this.field465.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method183(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ae.w(IIII)[I")
    public int[] method258(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field465.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method209(arg0, arg1, arg2));
        return var5.method184(arg0, arg1, arg2);
    }

    @ObfuscatedName("ae.k(III)Lhq;")
    public class214 method259(int arg0, int arg1) {
        Iterator var3 = this.field465.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method183(arg0, arg1));
        return var4.method198(arg0, arg1);
    }

    @ObfuscatedName("ae.v(I)V")
    public void method260() {
        Iterator var1 = this.field465.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method181(this);
        }
    }

    @ObfuscatedName("ae.z(I)I")
    public int method318() {
        return this.field469;
    }

    @ObfuscatedName("ae.r(I)Z")
    public boolean method262() {
        return this.field457;
    }

    @ObfuscatedName("ae.u(I)Ljava/lang/String;")
    public String method320() {
        return this.field455;
    }

    @ObfuscatedName("ae.d(B)Ljava/lang/String;")
    public String method264() {
        return this.field456;
    }

    @ObfuscatedName("ae.o(I)I")
    public int method265() {
        return this.field460;
    }

    @ObfuscatedName("ae.s(I)I")
    public int method266() {
        return this.field464;
    }

    @ObfuscatedName("ae.c(I)I")
    public int method267() {
        return this.field458;
    }

    @ObfuscatedName("ae.m(S)I")
    public int method268() {
        return this.field461;
    }

    @ObfuscatedName("ae.a(B)I")
    public int method269() {
        return this.field454;
    }

    @ObfuscatedName("ae.t(B)I")
    public int method315() {
        return this.field463;
    }

    @ObfuscatedName("ae.p(I)I")
    public int method271() {
        return this.field459.field2588;
    }

    @ObfuscatedName("ae.f(I)I")
    public int method272() {
        return this.field459.field2589;
    }

    @ObfuscatedName("ae.x(B)I")
    public int method316() {
        return this.field459.field2591;
    }

    @ObfuscatedName("ae.q(B)Lhq;")
    public class214 method281() {
        return new class214(this.field459);
    }
}
