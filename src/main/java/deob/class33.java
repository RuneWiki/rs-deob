package deob;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("ab")
public class class33 {

    @ObfuscatedName("ab.j")
    public int field467 = -1;

    @ObfuscatedName("ab.h")
    public String field460;

    @ObfuscatedName("ab.f")
    public String field459;

    @ObfuscatedName("ab.p")
    public int field470 = -1;

    @ObfuscatedName("ab.x")
    public int field463 = -1;

    @ObfuscatedName("ab.g")
    public class214 field464 = null;

    @ObfuscatedName("ab.c")
    public int field465 = Integer.MAX_VALUE;

    @ObfuscatedName("ab.l")
    public int field466 = 0;

    @ObfuscatedName("ab.w")
    public int field461 = Integer.MAX_VALUE;

    @ObfuscatedName("ab.b")
    public int field468 = 0;

    @ObfuscatedName("ab.o")
    public boolean field469 = false;

    @ObfuscatedName("ab.m")
    public LinkedList field471;

    @ObfuscatedName("ab.j(Lfb;IB)V")
    public void method258(class175 arg0, int arg1) {
        this.field467 = arg1;
        this.field460 = arg0.method2911();
        this.field459 = arg0.method2911();
        this.field464 = new class214(arg0.method2908());
        this.field470 = arg0.method2908();
        arg0.method2903();
        this.field469 = arg0.method2903() == 1;
        this.field463 = arg0.method2903();
        int var3 = arg0.method2903();
        this.field471 = new LinkedList();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field471.add(this.method259(arg0));
        }
        this.method264();
    }

    @ObfuscatedName("ab.h(Lfb;B)Lah;")
    public class43 method259(class175 arg0) {
        int var2 = arg0.method2903();
        class28[] var3 = new class28[] { class28.field403, class28.field404, class28.field405, class28.field409 };
        class28 var4 = (class28) class170.method3644(var3, var2);
        Object var5 = null;
        Object var6;
        switch(var4.field406) {
            case 0:
                var6 = new class27();
                break;
            case 1:
                var6 = new class31();
                break;
            case 2:
                var6 = new class39();
                break;
            case 3:
                var6 = new class49();
                break;
            default:
                throw new IllegalStateException("");
        }
        ((class43) var6).method187(arg0);
        return (class43) var6;
    }

    @ObfuscatedName("ab.f(IIII)Z")
    public boolean method260(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field471.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }
            var5 = (class43) var4.next();
        } while (!var5.method189(arg0, arg1, arg2));
        return true;
    }

    @ObfuscatedName("ab.p(III)Z")
    public boolean method261(int arg0, int arg1) {
        int var3 = arg0 / 64;
        int var4 = arg1 / 64;
        if (var3 < this.field465 || var3 > this.field466) {
            return false;
        } else if (var4 >= this.field461 && var4 <= this.field468) {
            Iterator var5 = this.field471.iterator();
            class43 var6;
            do {
                if (!var5.hasNext()) {
                    return false;
                }
                var6 = (class43) var5.next();
            } while (!var6.method190(arg0, arg1));
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ab.x(IIII)[I")
    public int[] method329(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field471.iterator();
        class43 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class43) var4.next();
        } while (!var5.method189(arg0, arg1, arg2));
        return var5.method194(arg0, arg1, arg2);
    }

    @ObfuscatedName("ab.g(III)Lhh;")
    public class214 method263(int arg0, int arg1) {
        Iterator var3 = this.field471.iterator();
        class43 var4;
        do {
            if (!var3.hasNext()) {
                return null;
            }
            var4 = (class43) var3.next();
        } while (!var4.method190(arg0, arg1));
        return var4.method192(arg0, arg1);
    }

    @ObfuscatedName("ab.c(I)V")
    public void method264() {
        Iterator var1 = this.field471.iterator();
        while (var1.hasNext()) {
            class43 var2 = (class43) var1.next();
            var2.method188(this);
        }
    }

    @ObfuscatedName("ab.l(B)I")
    public int method272() {
        return this.field467;
    }

    @ObfuscatedName("ab.w(B)Z")
    public boolean method266() {
        return this.field469;
    }

    @ObfuscatedName("ab.b(I)Ljava/lang/String;")
    public String method267() {
        return this.field460;
    }

    @ObfuscatedName("ab.o(I)Ljava/lang/String;")
    public String method283() {
        return this.field459;
    }

    @ObfuscatedName("ab.m(I)I")
    public int method269() {
        return this.field470;
    }

    @ObfuscatedName("ab.e(I)I")
    public int method270() {
        return this.field463;
    }

    @ObfuscatedName("ab.a(B)I")
    public int method271() {
        return this.field465;
    }

    @ObfuscatedName("ab.v(B)I")
    public int method315() {
        return this.field466;
    }

    @ObfuscatedName("ab.t(B)I")
    public int method288() {
        return this.field461;
    }

    @ObfuscatedName("ab.y(I)I")
    public int method317() {
        return this.field468;
    }

    @ObfuscatedName("ab.u(I)I")
    public int method286() {
        return this.field464.field2609;
    }

    @ObfuscatedName("ab.n(I)I")
    public int method276() {
        return this.field464.field2610;
    }

    @ObfuscatedName("ab.d(I)I")
    public int method277() {
        return this.field464.field2611;
    }

    @ObfuscatedName("ab.ax(I)Lhh;")
    public class214 method278() {
        return new class214(this.field464);
    }
}
